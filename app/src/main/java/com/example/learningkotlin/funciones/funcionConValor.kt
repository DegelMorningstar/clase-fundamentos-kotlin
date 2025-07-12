package com.example.learningkotlin.funciones

fun saludosConValor(nombre:String = "Estudiante"){
    println("Hola, bienvenido al curso $nombre")
}

fun main(){
    val saludo = saludosConValor()
    println(saludo)
    //Hola, bienvenido al curso Estudiante
}