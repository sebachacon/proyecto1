package Concepto_funnciones

fun cuadrado(){
    print("Ingrese un numero entero: ")
    val num = readln().toInt()
    val cuadrado = num*num
    println("El cuadradoo del $num es $cuadrado")
    println("******************************")
}
fun producto(){
    print("Ingrese el primer numero entero: ")
    val num1 = readln().toInt()
    print("Ingrese el segundo numero entero: ")
    val num2 = readln().toInt()
    val producto = num1* num2
    println("El producto de los numero es $producto")
}
fun main(){
    cuadrado()
    producto()
}