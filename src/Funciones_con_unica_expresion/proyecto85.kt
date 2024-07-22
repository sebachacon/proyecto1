package Funciones_con_unica_expresion

fun retornarSupercifie(lado: Int) = lado * lado
fun main(){
    print("Ingrese el valor del lado del cuadrado: ")
    val la = readln().toInt()
    println("La superficie del cuadrado es ${retornarSupercifie(la)}")
}