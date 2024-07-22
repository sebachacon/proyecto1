package Funciones_con_retorno

fun Perimetro(ladop: Int): Int {
    val perimetro = ladop * 4
    return perimetro
}
fun main() {
    print("Ingrese el lado del cuadrado: ")
    val lado = readln().toInt()
    print("El perimetro del es: " +
            "${Perimetro(lado)}")
}