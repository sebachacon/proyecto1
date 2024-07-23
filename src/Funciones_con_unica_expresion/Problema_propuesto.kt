package Funciones_con_unica_expresion

fun promedio(val1: Int, val2: Int, val3: Int) = (val1+val2+val3)/3
fun main(){
    print("Ingrese el primer numero: ")
    val numero = readln().toInt()
    print("Ingrese un segundo numero: ")
    val numeroo = readln().toInt()
    print("Ingrese un tercer numero: ")
    val numerooo = readln().toInt()
    println("El promedio de estos numeros es:" +
            "${promedio(numero, numeroo, numerooo)}")
}