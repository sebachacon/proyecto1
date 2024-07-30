package Arreglos

fun main() {
val enteros: IntArray
enteros = IntArray(8)
    var suma = 0
    for (i in 0..enteros.size-1){
        print("Ingrese un valor entero: ")
        enteros[i] = readln().toInt()
        suma += enteros[i]
    }
    var may36 = 0
    var may50 = 0
    for (i in 0..enteros.size-1){
        if (enteros[i] > 50)
            may50++
        if (enteros[i] > 36)
            may36 += enteros[i]
    }
println("El valor acumulado es: $suma")
    println("El valor acumulado de los mayores a 36 es: $may36")
    println("La cantidad de valores mayores a 50 es: $may50")
}