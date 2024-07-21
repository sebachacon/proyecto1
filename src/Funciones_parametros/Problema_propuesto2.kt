package Funciones_parametros

fun menoromayor(num1: Int, num2: Int, num3: Int) {
    when {
        num1 < num2 && num1 < num3 -> {
            if (num2 < num3)
                println("El orden de numeros de menor a mayor es: $num1 - $num2 - $num3")
            else
                println("El orden de numeros de menor a mayor es: $num1 - $num3 - $num2")
        }
        num2 < num1 && num2 < num3 -> {
            if (num1 < num3)
                println("El orden de numeros de menor a mayor es: $num2 - $num1 - $num3")
            else
                println("El orden de numeros de menor a mayor es: $num2 - $num3 - $num1")
        }
        else -> {
            if (num1 < num2)
                println("El orden de numeros de menor a mayor es: $num3 - $num1 - $num2")
            else
                println("El orden de numeros de menor a mayor es: $num3 - $num2 - $num1")
        }
    }
}

fun main() {
    print("Ingrese primer valor: ")
    val num1 = readln().toInt()
    print("Ingrese segundo valor: ")
    val num2 = readln().toInt()
    print("Ingrese tercer valor: ")
    val num3 = readln().toInt()
    menoromayor(num1, num2, num3)
}