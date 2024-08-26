package Colaboracion_de_clases

import Funciones_tipo_arreglo.imprimir

class Dado (var valor: Int){
    fun tirar() {
        valor = ((Math.random() * 6) + 1).toInt()
        imprimir()
    }
    fun imprimir() {
        println("Valor del dado: $valor")
    }
}
class JuegoDeDados {
    val dado1 = Dado(1)
    val dado2 = Dado(1)
    val dado3 = Dado(1)
    var intentos = 0

    fun jugar() {
        do {
            dado1.tirar()
            dado2.tirar()
            dado3.tirar()
            intentos++
            if (dado1.valor == dado2.valor && dado2.valor == dado3.valor)
                println("Gano en $intentos")
            else {
                println("Perdió")
            }
        } while (!(dado1.valor == dado2.valor && dado2.valor == dado3.valor))
    }
}
fun main(parametro: Array<String>) {
    val juego1 = JuegoDeDados()
    juego1.jugar()
}
