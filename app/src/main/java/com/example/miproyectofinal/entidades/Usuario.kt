package com.example.miproyectofinal.entidades

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class Usuario (
    @PrimaryKey(autoGenerate = true) val Iduser:Int =0,
    @ColumnInfo(name = "Nombre") val nombre:String ?,
    @ColumnInfo(name = "email") val email: String ?,
    @ColumnInfo(name ="edad") val edad: Int ?,
    @ColumnInfo(name = "token") val token:String ?


    )


