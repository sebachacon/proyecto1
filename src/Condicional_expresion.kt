fun main(){
    /*
    //Problema 1
    println("Ingrese primer valor:")
    val valor1 = readln().toInt()
    print("Ingrese segundo valor")
    val valor2 = readln().toInt()
    val mayor = if (valor1 > valor2) valor1 else valor2
    println("El mayor entre $valor1 y $valor2 es $mayor")
    */
    /*
    //Problema 2
    println("Ingrese un numero entero")
    val valor = readln().toInt()
    val resultado = if (valor % 2 == 0){
        print("Cuadrado:")
        valor * valor
    }else{
        print("Cubo:")
        valor * valor * valor
    }
    print(resultado)
    */
    //Problema 3
    print("Ingrese numero entre 1-99")
 val num: Int = readln().toInt()
    val cant = if (num >= 10) println("$num tiene 2 digitos") else println("$num tiene 1 digito")
}