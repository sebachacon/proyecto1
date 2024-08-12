package Funciones_tipo_arreglo

fun main() {

    print("Ingrese la cantidad de elementos del arreglo: ")
    val n = readLine()?.toIntOrNull() ?: return


    val array = crearYcargarArreglo(n)


    val suma = sumarElementos(array)


    println("La suma de los elementos del arreglo es: $suma")
}


fun crearYcargarArreglo(n: Int): IntArray {
    val array = IntArray(n)
    for (i in 0 until n) {
        print("Ingrese el elemento $i: ")
        array[i] = readLine()?.toIntOrNull() ?: 0
    }
    return array
}


fun sumarElementos(array: IntArray): Int {
    var suma = 0
    for (elemento in array) {
        suma += elemento
    }
    return suma
}