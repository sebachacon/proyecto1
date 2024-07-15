package Estructura_condicional_when

fun main(){
    print("Ingrese un numero entero:")
    val num = readln().toInt()
    when{
        num > 0 -> println("Es positivo")
        num < 0 -> println("Es negativo")
        else -> println("Nulo")
    }
}