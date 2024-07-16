package Concepto_funnciones

fun cargaSuma(){
    print("Ingrese el primer valor.")
    val valor1 = readln().toInt()
    print("Ingrese el segundo valor.")
    val valor2 = readln().toInt()
    val suma = valor1 + valor2
    println("La suma de los valores es: $suma")
}
fun separacion(){
    println("***********************")
}
fun main(parametro: Array<String>){
    for(i in 1..5){
        cargaSuma()
        separacion()
    }
}