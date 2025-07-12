package com.example.learningkotlin.clases

interface Humano {
    fun saludar()
    fun comer()
    fun dormir()
}

class Persona(
   val usuario: Usuario
) : Humano {

    override fun saludar(){
        println(
            "Hola, soy ${usuario.nombre} y tengo el correo ${usuario.email}."
        )
    }

    override fun comer() {
        TODO("Not yet implemented")
    }

    override fun dormir() {
        TODO("Not yet implemented")
    }

}

fun main(){

    val yael = Persona(Usuario("Yael","Yael@email.com"))
    yael.saludar()

}