package Metodos_set_y_get

class Personaa(var nombre: String, sueldo: Int){
    var sueldo: Int = 0
        set(valor) {
            if (valor >= 0)
                field = valor
            else
                field = 0
        }
    init {
        this.sueldo = sueldo
    }
    fun imprimir(){
        println("Nombre del empleado: $nombre")
        println("El sueldo del empleado: $sueldo ")
    }
}
fun main() {
    val persona1 = Personaa("sebas",10000)
    persona1.imprimir()
}