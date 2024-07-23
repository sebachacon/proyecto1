package Funciones_internas

fun mayor(){
    fun mayor(v1: Int, v2:Int) = if (v1 > v2) v1 else v2
    for (i in 1..5){
        println("Ingrese el primer valor: ")
        val valor1 = readln().toInt()
        println("Ingrese el segundo valor: ")
        val valor2 = readln().toInt()
        println("El mayor entre $valor1 y $valor2 es ${mayor(valor1, valor2)}")
    }
}
fun main(){
    mayor()
}