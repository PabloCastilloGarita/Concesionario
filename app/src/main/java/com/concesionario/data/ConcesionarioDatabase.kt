package com.concesionario.data

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.concesionario.model.Concesionario

@Database(entities = [Concesionario::class], version = 1, exportSchema = false)
abstract class ConcesionarioDatabase : RoomDatabase() {

    abstract fun concesionarioDao() : ConcesionarioDao

    companion object {

        @Volatile
        private var INSTANCE: ConcesionarioDatabase? = null

        fun getDatabase(context: android.content.Context) : ConcesionarioDatabase {
            var instance = INSTANCE
            if (instance != null) {
                return instance
            }
            synchronized(this) {
                val basedatos = Room.databaseBuilder(
                    context.applicationContext,
                    ConcesionarioDatabase::class.java,
                    "concesionario_database"
                ).build()
                INSTANCE = basedatos
                return basedatos
            }
        }
    }
}