package com.example.filmsinfo

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.filmsinfo.data.models.Films
import com.example.filmsinfo.data.network.ApiRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val repository: ApiRepository): ViewModel()  {

    private val _allFilms = MutableLiveData<List<Films>>()
    val allFilms: LiveData<List<Films>> get() = _allFilms


    fun getAllFilms() {
        viewModelScope.launch() {
            repository.getAllFilms().let {
                if (it.isSuccessful) {
                    _allFilms.postValue(it.body())
                } else {
                    Log.d("checkData", "Failed to load movies: ${it.errorBody()}")
                }
            }
        }
    }
}