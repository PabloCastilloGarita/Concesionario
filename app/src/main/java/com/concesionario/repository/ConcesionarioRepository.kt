package com.concesionario.repository

import androidx.lifecycle.LiveData
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Update
import com.concesionario.data.ConcesionarioDao
import com.concesionario.model.Concesionario

class ConcesionarioRepository(private val concesionarioDao: ConcesionarioDao) {
    val getAllData : LiveData<List<Concesionario>> = concesionarioDao.getAllData()

    suspend fun addConcesionario(concesionario: Concesionario) {
        concesionarioDao.addConcesionario(concesionario)
    }

    suspend fun updateConcesionario(concesionario: Concesionario) {
        concesionarioDao.updateConcesionario(concesionario)
    }

    suspend fun deleteConcesionario(concesionario: Concesionario) {
        concesionarioDao.deleteConcesionario(concesionario)
    }
}