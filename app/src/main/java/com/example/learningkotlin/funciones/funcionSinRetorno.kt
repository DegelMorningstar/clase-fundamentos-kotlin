package com.example.learningkotlin.funciones

fun saludos(nombre:String){
    println("Hola, bienvenido al curso $nombre")
}

fun main() {

    val saludo = saludos("Yael")
    println(saludo)
    //Hola, bienvenido al curso Yael

}