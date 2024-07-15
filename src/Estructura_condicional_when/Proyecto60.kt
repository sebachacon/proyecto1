package Estructura_condicional_when

fun main(parametros: Array<String>){
    print("Ingrese primer nota:")
    val nota1 = readln().toInt()
    print("Ingrese segunda nota:")
    val nota2 = readln().toInt()
    print("Ingrese tercera nota:")
    val nota3 = readln().toInt()
    val promedio = (nota1 + nota2 + nota3) / 3
    when{

        promedio >= 7 -> print("Promocionado")
        promedio >= 4 -> print("Regular")
        else -> print("Libre")
    }
}
