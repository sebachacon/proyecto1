package Estructura_condicional_when

fun main(parametro: Array<String>){
    var cant1 = 0
    var cant2 = 0
    var cant3 = 0
    do{
        print("Ingrese el peso de la pieza (0 para finalizar):")
        val peso = readln().toDouble()
        when{
            peso > 10.2 -> cant1++
            peso > 9.8 && peso <= 10.2 -> cant2++
            peso > 9.8 && peso > 0 -> cant3++
        }
    } while (peso != 0.0)
    println("Pieza aptas: $cant2")
    println("Piezas con un peso superior a 10.2: $cant1")
    println("Piezas con un peso inferior a 9.8: $cant3")
    val suma = cant1 + cant2 + cant3
    println("Cantidad total de piezas procesadas: $suma")
}
