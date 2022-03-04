package com.concesionario.data

import androidx.lifecycle.LiveData
import androidx.room.*
import com.concesionario.model.Concesionario

@Dao
interface ConcesionarioDao {

    @Query("select * from CONCESIONARIO")
    fun getAllData() : LiveData<List<Concesionario>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addConcesionario(concesionario: Concesionario)

    @Update(onConflict = OnConflictStrategy.IGNORE)
    suspend fun updateConcesionario(concesionario: Concesionario)

    @Delete
    suspend fun deleteConcesionario(concesionario: Concesionario)
}