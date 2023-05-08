package com.example.miproyectofinal.entidades

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Rama (

    @PrimaryKey(autoGenerate = true) val IdRama:Int =0,
    @ColumnInfo(name = "nombre") val nombre:String ?,
    @ColumnInfo(name = "branch") val branch: String ?,

    )
