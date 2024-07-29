package Arreglos

fun main(){
    val arreglo = IntArray(10)
    for (i in arreglo.indices){
        print("Ingrese elemento: ")
        arreglo[i] = readln().toInt()
    }
    for (i in arreglo)
        println(i)
}