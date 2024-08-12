package Conceptos_POO

class Persona {
    var nombre: String = ""
    var edad: Int = 0

    fun inicializar(nombre: String, edad: Int) {
        this.nombre = nombre
        this.edad = edad
    }

    fun imprimiendo() {
        println("Nombre: $nombre y tiene una edad de $edad")
    }

    fun esMayorEdad() {
        if (edad >= 18)
            println("Es mayor de edad $nombre")
        else
            println("No es mayor de edad $nombre")
    }
}
    fun main(){
        val persona1: Persona
        persona1 = Persona()
        persona1.inicializar("Pedro", 16)
        persona1.imprimiendo()
        persona1.esMayorEdad()

        val persona2: Persona
        persona2 = Persona()
        persona2.inicializar("Ana", 50)
        persona2.imprimiendo()
        persona2.esMayorEdad()
    }

