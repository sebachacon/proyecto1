package Funciones_tipo_arreglo

fun cargar(): IntArray {
    print("Cuantos sueldo quiere cargar: ")
    val cantidad = readln().toInt()
    val sueldos = IntArray(cantidad)
    for (i in sueldos.indices) {
        print("Ingrese un elemento: ")
        sueldos[i] = readln().toInt()
    }
    return sueldos
}

fun imprimirr(sueldos: IntArray){
    println("Listado de todos los sueldos")
    for (sueldo in sueldos)
        println(sueldo)
}
fun main() {
    val sueldos = cargar()
    imprimir(sueldos)
}