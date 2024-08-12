package Conceptos_POO

class Alumno {
    var nombre: String = ""
    var nota: Int = 0

    fun inicializar(nombre: String, nota: Int) {
        this.nombre = nombre
        this.nota = nota
    }

    fun regular() {
        if (nota >= 40)
            println("La nota es regular")
    }
}

fun main() {
    print("Ingrese el nombre: ")
    var nombre = readln().toString()
    print("Ingrese la nota: ")
    var nota = readln().toInt()
    val alumno1 = Alumno()
    alumno1.inicializar(nombre, nota)
    alumno1.regular()

    print("Ingrese el nombre: ")
    var nombree = readln().toString()
    print("Ingrese la nota: ")
    var notaa = readln().toInt()
    val alumno2 = Alumno()
    alumno2.inicializar(nombree, notaa)
    alumno2.regular()
}
