package com.example.learningkotlin.variables

fun main() {

    val nombre : String = "YAEL"

    val apellidoPaterno = "Montes"

    val apellidoMaterno = "Camacho"

    val nombreCompleto = nombre + apellidoPaterno + apellidoMaterno
    //YAELMontesCamacho

    val nombreCompleto2 = "$nombre $apellidoPaterno $apellidoMaterno"
    //YAEL Montes Camacho

    val nombreCompleto3 = "${nombre.lowercase()} $apellidoPaterno $apellidoMaterno"
    //yael Montes Camacho

    println(nombreCompleto)
    println(nombreCompleto2)
    println(nombreCompleto3)

}