package com.example.learningkotlin.controles

//PERMITE RECORRER RANGOS, LISTAS O ARREGLOS

fun main(){

    for (aux in 1..5) {
        println(aux) //imprime los numeros del 1 al 5
    }

    val nombres = listOf("Fernando","Luis","Jesus","Yael","Ruben")
    for (nombre in nombres){
        println(nombre)
    }

}