package com.concesionario.viewmodel

import android.app.Application
import androidx.lifecycle.*
import com.concesionario.data.ConcesionarioDatabase
import com.concesionario.model.Concesionario
import com.concesionario.repository.ConcesionarioRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ConcesionarioViewModel(application: Application) : AndroidViewModel(application) {
    val getAllData : LiveData<List<Concesionario>>
    private val repository: ConcesionarioRepository

    init {
        val concesionarioDao = ConcesionarioDatabase.getDatabase(application).concesionarioDao()
        repository = ConcesionarioRepository(concesionarioDao)
        getAllData = repository.getAllData
    }

     fun addConcesionario(concesionario: Concesionario) {
        viewModelScope.launch(Dispatchers.IO) {repository.addConcesionario(concesionario)}
    }

     fun updateConcesionario(concesionario: Concesionario) {
         viewModelScope.launch(Dispatchers.IO) {repository.updateConcesionario(concesionario)}
    }

     fun deleteConcesionario(concesionario: Concesionario) {
         viewModelScope.launch(Dispatchers.IO) {repository.deleteConcesionario(concesionario)}
    }
}