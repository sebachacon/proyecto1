package Arreglos

fun main(){
    val sueldos: IntArray
    sueldos = IntArray(5)
    //carga de sus elementos por teclado
    for (i in 0..4){
        print("Ingrese sueldo: ")
        sueldos[i] = readln().toInt()
    }
    //impresion de sus elementos
    for (i in 0..4){
        println(sueldos[i])
    }
}