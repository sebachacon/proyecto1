package Concepto_funnciones

fun menor(){
    print("Ingrese el primer valor: ")
    val valo = readln().toInt()
    print("Ingrese el segundo valr: ")
    val valor = readln().toInt()
    print("Ingrese un tercer valor: ")
    val valor3 = readln().toInt()
    when{
        valo < valor && valo < valor3 -> print("El numero menor es: $valo")
        valor < valo && valor < valor3 -> print("El numero menor es: $valor")
        else -> println("El numero menor es $valor3")
    }
    }
    fun main(){
        menor()
        menor()
    }
