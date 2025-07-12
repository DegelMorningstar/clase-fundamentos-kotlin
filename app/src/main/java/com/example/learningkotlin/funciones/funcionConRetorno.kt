package com.example.learningkotlin.funciones

fun suma( a:Int,b:Int ) : Int {
    return a + b
}

fun main () {

    val resultado : Int = suma(10,25)
    //35
    println(resultado)
}