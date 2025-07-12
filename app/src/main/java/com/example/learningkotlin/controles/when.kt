package com.example.learningkotlin.controles

//SIMILAR A SWITCH EN OTROS LENGUAJES, PERO MAS FLEXIBLE

fun getDiaDeLaSemana(dia:Int) : String {

    val nombreDelDia = when (dia) {
        1 -> "Lunes"
        2 -> "Martes"
        3 -> "Miercoles"
        4 -> "Jueves"
        5 -> "Viernes"
        6 -> "Sabado"
        7 -> "Domingo"
        else -> {
            "No existe ese dia"
        }
    }
    return nombreDelDia
}

fun main() {
    println(getDiaDeLaSemana(0))
}