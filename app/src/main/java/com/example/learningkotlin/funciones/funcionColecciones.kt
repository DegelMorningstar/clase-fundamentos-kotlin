package com.example.learningkotlin.funciones

fun sumarElementos(lista: List<Int>) : Int {
    return lista.sumaTotal()
}

fun filtrarPares(lista: List<Int>) : List<Int> {
    return lista.filter { numero : Int ->
        numero.esPar()
    }
}

fun main(){

    val numeros = listOf(1,2,3,4)
    val total = sumarElementos(numeros)
    println(total)

    val pares = filtrarPares(listOf(1,2,3,5,7,10,23,40))
    println(pares)

    val palabra = "ese"
    println(palabra.esPalindromo())

}