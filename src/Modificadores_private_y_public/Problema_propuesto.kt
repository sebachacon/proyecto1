package Modificadores_private_y_public

class clase {
    private val arre = IntArray(5)
    init {
        cargar()
    }

    private fun cargar() {
        for(i in arre.indices)
            arre[i] = ((Math.random() * 11)).toInt()
    }

    fun imprimir() {
        println("Lista del arreglo")
        for(i in arre.indices)
            println("${arre[i]}")
    }

    fun mayor() {
        var mayor = arre[0]
        for(i in arre.indices)
            if (arre[i] > mayor)
                mayor = arre[i]
        println("El mayor del arreglo es $mayor")
    }

    fun menor() {
        var menor = arre[0]
        for(i in arre.indices)
            if (arre[i] < menor)
                menor = arre[i]
        println("El menor del arreglo es $menor")
    }
}

fun main() {
    val arreglo = clase()
    arreglo.imprimir()
    arreglo.mayor()
    arreglo.menor()
}
