package Metodos_set_y_get

class Dado(valor: Int){
    var valor: Int = 1
        set(valor){
            if (valor <= 6)
                field = valor
            else
                field = 1
        }
    init {
        this.valor = valor
    }
    fun tirar(){
        valor = ((Math.random()*6)+1).toInt()
        imprimir()
    }
    fun imprimir(){
        println("El numero es $valor")
    }
}
fun main(){
    val dado = Dado(7)
    dado.imprimir()
    dado.tirar()
}