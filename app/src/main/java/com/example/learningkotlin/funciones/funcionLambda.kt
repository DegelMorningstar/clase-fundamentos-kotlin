package com.example.learningkotlin.funciones


val multiplicar: (Int,Int) -> Int = { x,y -> x * y }

val saludo: (String) -> String = { nombre -> "Hola $nombre" }

fun funcionGeneraCumple(fecha: String, accion: (String) -> Unit ){
    //generar evento
    //enviar invitaciones
    //comprar refrescos
    //rentar salon
    accion(fecha)
}

fun cumple(fecha: String) {
    println("El cumpleaños de Yael se festeja en la fecha $fecha")
}

fun main() {
    val name = "Fernando"
    val resultado = multiplicar(2,3)
    val saludo = saludo("yael")
    funcionGeneraCumple(
        fecha = "10 de noviembre",
        accion = { fecha ->
            println("El cumpleaños de $name se festeja en la fecha $fecha")
        }
    )
    cumple(fecha = "15 de noviembre")
    //6
    println(resultado)
    println(saludo)

}