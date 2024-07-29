package Arreglos

fun main() {
    val arreglo1 = IntArray(4)
    val arreglo2 = IntArray(4)
    val sumaArreglos = IntArray(4)

    println("Ingrese los elementos del primer arreglo:")
    for (i in arreglo1.indices) {
        print("Elemento ${i + 1}: ")
        arreglo1[i] = readLine()!!.toInt()
    }
    println("Ingrese los elementos del segundo arreglo:")
    for (i in arreglo2.indices) {
        print("Elemento ${i + 1}: ")
        arreglo2[i] = readLine()!!.toInt()
    }
    for (i in sumaArreglos.indices) {
        sumaArreglos[i] = arreglo1[i] + arreglo2[i]
    }
    println("La suma de los dos arreglos es:")
    for (i in sumaArreglos.indices) {
        println("Elemento ${i + 1}: ${sumaArreglos[i]}")
    }
}