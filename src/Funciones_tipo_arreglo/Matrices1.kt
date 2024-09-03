package Funciones_tipo_arreglo

fun main(){
    var matriz = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6),
        intArrayOf(7, 8, 9),
        intArrayOf(10, 11, 12, 13, 14),
    )
    println(matriz[0][0])// 1
    println(matriz[0][2])// 3
    //println(matriz[0][3])//ERROR

    //recorreMatriz1(matriz)
}
fun recorreMatriz(matriz: Array<IntArray>){
    for(fila in (0 until matriz.size)){
        println()
        for (columna in(0 until matriz[fila].size))
            println("Posicion[$fila][$columna] :" +
                    "${matriz[fila][columna]}")
    }
    fun recorreMatriz2(matriz: Array<IntArray>){
        for (i in matriz.indices){
            println()
            for (j in matriz[i].indices)
                println("Posicion[$i][$j] : ${matriz[i][j]}")
        }
    }
}