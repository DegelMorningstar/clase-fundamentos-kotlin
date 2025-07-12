package com.example.learningkotlin.controles

fun esMayorDeEdad(edad:Int): Boolean {
    if(edad > 18) {
        println("es mayor de edad")
        return true
    } else if (edad == 18) {
        println("acabas de cumplir 18 no abuses")
        return true
    } else if (edad > 0) {
        println("es menor de edad")
        return false
    } else {
        println("tu ni haz nacido")
        return false
    }
}

fun main() {
    println(esMayorDeEdad(18))
}