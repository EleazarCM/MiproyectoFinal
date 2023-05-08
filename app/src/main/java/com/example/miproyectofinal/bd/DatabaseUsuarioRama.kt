package com.example.miproyectofinal.bd

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.miproyectofinal.dao.Usuario
import com.example.miproyectofinal.entidades.Rama

@Database(entities =[Usuario::class, Rama::class], version = 1 )
abstract class DatabaseUsuarioRama:RoomDatabase() {

    abstract fun usuarioDB():Usuario


}