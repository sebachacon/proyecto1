package Estructura_condicional_when_argumento

fun main(){
    var cant1 = 0
    var cant2 = 0
    var cant3 = 0
    var cant4 = 0
    for (i in 1..10){
        print("Ingrese la cantidad de hijos: ")
        val valor = readln().toInt()
       when (valor){
           0 -> cant1++
           1 -> cant2++
           2 -> cant3++
           else -> cant4++
       }
    }
    println("Cantidad de familias con 0 hijos es de: $cant1")
    println("Cantidad de familias con 1 hijos es de: $cant1")
    println("Cantidad de familias con 2 hijos es de: $cant3")
    println("Cantidad de familias con 3 hijos es de: $cant4")

}