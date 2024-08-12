package Funciones_tipo_arreglo

fun main() {

    print("Ingrese la cantidad de elementos del arreglo: ")
    val n = readLine()?.toIntOrNull() ?: return

    val array = IntArray(n)
    for (i in 0 until n) {
        print("Ingrese el elemento en la posición $i: ")
        array[i] = readLine()?.toIntOrNull() ?: 0
    }

    val menorElemento = array.minOrNull() ?: return
    val frecuencia = array.count { it == menorElemento }
    println("El menor elemento es: $menorElemento")
    if (frecuencia > 1) {
        println("El menor elemento se repite $frecuencia veces en el arreglo.")

    } else {
        println("El menor elemento no se repite en el arreglo.")
    }
}