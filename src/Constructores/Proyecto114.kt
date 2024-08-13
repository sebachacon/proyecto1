package Constructores


class Triangulo2(var lado1: Int, var lado2: Int, var lado3: Int){

    constructor():this(0,0,0){
        print("Ingrese primer lado: ")
        lado1 = readln().toInt()
        print("Ingrese segundo lado: ")
        lado2 = readln().toInt()
        print("Ingrese tercer lado: ")
        lado3 = readln().toInt()
    }
    fun ladoMayor(){
        print("Lado mayor: ")
        when{
            lado1 > lado2 && lado1 > lado3 -> println(lado1)
            lado2 > lado3 -> println(lado2)
            else -> println(lado3)
        }
    }
    fun esEquilatero(){
        if (lado1 == lado2 && lado1 == lado3)
            print("Es un triangulo equilatero")
        else
            print("No es un triangulo equilatero")
    }
}
fun main(){
    val triangulo1 = Triangulo2()
    triangulo1.ladoMayor()
    triangulo1.esEquilatero()
    val triangulo2 = Triangulo(6, 6,6)
    triangulo2.ladoMayor()
    triangulo2.esEquilatero()
}