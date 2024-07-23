package Funciones_con_unica_expresion

fun perimetro(lado: Int) = lado*4
fun main(){
    print("Ingrese la medida del lado del cuadrado: ")
    val lado = readln().toInt()
    print("El perimetro del cuadrado es: " +
            "${perimetro(lado)}")
}