package Arreglos

fun main(){
    val arreglo = IntArray(5)
    for (i in arreglo.indices){
        print("Ingrese elemento: ")
        arreglo[i] = readln().toInt()
    }
    println("Primera componente del arreglo ${arreglo[0]}")
    println("Ultima componente del arreglo" +
            " ${arreglo[arreglo.lastIndex]}")
}