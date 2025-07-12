package com.example.learningkotlin.variables

fun main() {

    val list : List<Int> = listOf(1,2,3)

    val mutableList : MutableList<String> = mutableListOf("Yael","Fernando","Luis","Jesus")
    mutableList.add("Ruben")

    val conjuntos : Set<Int> = setOf(1,2,3)

    val mapa : Map<String,Int> = mapOf("llave1" to 1,"llave2" to 2)

}