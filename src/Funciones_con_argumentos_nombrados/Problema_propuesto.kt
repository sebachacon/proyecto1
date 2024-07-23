package Funciones_con_argumentos_nombrados

fun tablaMultiplicar(numero: Int, termino: Int = 10){
    for ( i in 1..termino){
        println("$numero x $i = ${numero * i}")
    }
}
fun main(){
    tablaMultiplicar(numero = 5, termino = 10)
    println()
    tablaMultiplicar(numero = 3)
}