package Funciones_con_retorno

fun mostrarpromedios(v1: Int, v2: Int, v3: Int): Int{
    val promedio = (v1 + v2 + v3)/3
    return promedio
}
fun main(){
    print("Ingrese el primer valor: ")
    val valor1 = readln().toInt()
    print("Ingrese un segundo valor: ")
    val valor2 = readln().toInt()
    print("Ingrese un tercer valor: ")
    val valor3 = readln().toInt()
    print("El valor promedio de los valor es:" +
            "${mostrarpromedios(valor1, valor2, valor3)}")

}