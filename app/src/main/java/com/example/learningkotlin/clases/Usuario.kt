package com.example.learningkotlin.clases

data class Usuario(
    val nombre: String,
    val email: String
)

fun main(){
    val usuario1 = Usuario("Yael","Yael@email.com")
    val usuario2 = Usuario("Yael","Yael@email.com")
    val usuario3 = Usuario("Luis","Luis@email.com")

    println(usuario1)

    println(usuario1 == usuario2)

    println(usuario1 == usuario3)
}
