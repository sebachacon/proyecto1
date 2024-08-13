package Constructores

class Persona constructor(nombre: String, edad: Int){
    var nombre: String = nombre
    var edad: Int = edad

    init {
        if (this.edad < 0)
            this.edad = 0
    }
    fun imprimir(){
        println("Nombre: $nombre y tiene una edad de $edad")
    }
    fun esMayorEdad(){
        if (edad >= 18)
            println("Es mayor de edad $nombre")
        else
            println("No es mayor de edad $nombre")
    }
}
fun main(){
    val persona1 = Persona("Juan", 12)
    persona1.imprimir()
    persona1.esMayorEdad()
}