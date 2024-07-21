package Funciones_parametros

    fun claves(clave1: String, clave2: String) {
        if (clave1 == clave2) {
            println("Las claves ingresadas son iguales.")
        } else {
            println("Las claves ingresadas son distintas.")}
        }
fun main(){
    print("Ingrese la clave: ")
    val clave1 = readln()
    print("Ingrese otra clave: ")
    val clave2 = readln()
    claves(clave1, clave2)
    }







