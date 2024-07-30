package Arreglos

fun main() {
    val arreglo1: IntArray
    arreglo1 = IntArray(4)
    val arreglo2: IntArray
    arreglo2 = IntArray(4)
    val arreglo3: IntArray
    arreglo3 = IntArray(4)

    for (i in 0..arreglo1.size - 1) {
        print("Ingrese un valor entero del primer arreglo: ")
        arreglo1[i] = readln().toInt()
    }
    for (i in 0..arreglo2.size - 1) {
        print("Ingrese un valor entero del segundo arreglo: ")
        arreglo2[i] = readln().toInt()
    }
    for (i in 0..arreglo3.size - 1) {
        arreglo3[i] = arreglo1[i] + arreglo2[i]
        println("Los resultados de ${arreglo1[i]} + ${arreglo2[i]}: ${arreglo3[i]} ")
    }
}