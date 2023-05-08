package com.example.miproyectofinal.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.miproyectofinal.entidades.Rama

@Dao
interface Usuario {
    @Query("SELECT * From Usuario")
    fun obtnerUsuario(): List<Usuario>

    @Insert()
    fun insertarUsuario(user:Usuario)

    @Query("DELETE FROM Usuario Where idUser = :id")
    fun eliminarUsuario(id:Int)

    @Query("UPDATE Usuario set nombre = :nombre, email = :email, edad =:edad, token = :token  WHERE iduser = :id")
    fun updateUsuario(id: Int, nombre: String, email:String, edad: Int, token :String)





    //Segunda tabla
    @Query("SELECT * From Usuario")
    fun obtnerRama(): List<Rama>

    @Insert()
    fun insertarRAma(rama:Rama)

    @Query("DELETE FROM Rama Where idUser = :id")
    fun eliminarRama(id:Int)

    @Query("UPDATE Usuario set nombre = :nombre, branch = :branh  WHERE idRama = :id")
    fun updateRama(id: Int, nombre: String, branch: String)
}