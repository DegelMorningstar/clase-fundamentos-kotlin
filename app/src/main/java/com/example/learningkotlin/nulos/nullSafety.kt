package com.example.learningkotlin.nulos

fun getName(): String? {
    /** POR DEFECTO LAS VARIABLES NO PUEDEN SER NULAS */
    //Admitir nulos
    var nombre : String? = null
    nombre = "Enrique"
    //nombre = null //VALIDO
    return nombre
}

fun main(){
    val name = getName()
    /** ACCESO SEGURO A LOS NULOS */
    //SAFE CALL
    //Ejecuta la operacion solo si la variable no es nula
    println(name?.length)
    //Elvis operator (?:) - Proporciona un valor alternativo si es nulo
    val longitud = name?.length ?: 0
    println(longitud)
    val aux = name ?: "no hay ningun nombre"
    println(aux)
    //Not-Null Assertion (!!) - Fuerza el acceso a los null
    val aux2 : String = getName()!!
    println(aux2)
}