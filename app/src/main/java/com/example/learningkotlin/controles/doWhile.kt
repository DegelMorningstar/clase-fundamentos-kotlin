package com.example.learningkotlin.controles

//Ejecuta un bloque de codigo mientras se cumpla una condicion
fun main(){

    var contandor = 0
    while (contandor < 10){
        println("Contador en while ==> $contandor")
        contandor++
    }
    do {
        println("Contador en do While ==> $contandor")
        contandor--
    }while (contandor > 0 )

}