package com.example.learningkotlin.funciones

fun String.esPalindromo(): Boolean {
    return this == this.reversed()
}