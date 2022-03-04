package com.concesionario.model

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity(tableName = "concesionario")
data class Concesionario(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    @ColumnInfo(name = "modelo")
    val modelo: String?,
    @ColumnInfo(name = "año")
    val año: Int?,
    @ColumnInfo(name = "marca")
    val marca: String?,
    @ColumnInfo(name = "motor")
    val motor: String?,
    @ColumnInfo(name = "precio")
    val precio: Double?,
    @ColumnInfo(name = "cantidadAsientos")
    val cantidadAsientos: Int?,
    @ColumnInfo(name = "tipoCajaCambios")
    val tipoCajaCambios: String?,
    @ColumnInfo(name = "rutaImagen")
    val rutaImagen: String?,
) : Parcelable
