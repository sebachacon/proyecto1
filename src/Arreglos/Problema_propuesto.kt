package Arreglos

fun main() {
    val elementos = IntArray(8)

    for (i in elementos.indices) {
        print("Ingrese el elemento ${i + 1}: ")
        elementos[i] = readLine()!!.toInt()
    }

    var valorAcumulado = 0
    var valorAcumuladoMayor36 = 0
    var cantidadMayores50 = 0

    for (elemento in elementos) {
        valorAcumulado += elemento
        if (elemento > 36) {
            valorAcumuladoMayor36 += elemento
        }
        if (elemento > 50) {
            cantidadMayores50++
        }
    }
    println("Valor acumulado de todos los elementos: $valorAcumulado")
    println("Valor acumulado de los elementos mayores a 36: $valorAcumuladoMayor36")
    println("Cantidad de valores mayores a 50: $cantidadMayores50")
}