package Constructores

class Punto(val x: Int,val y: Int){
    
    fun cuadrante(): String{
        return when{
            x > 0 && y > 0 -> "1° cuadrante"
            x < 0 && y > 0 -> "2° cuadrante"
            x < 0 && y < 0 -> "3° cuadrante"
            x > 0 && y < 0 -> "4° cuadrante"
            x == 0 && y != 0 -> "En el eje y"
            y == 0 && x != 0 -> "En el eje x"
            else -> "Se encuentra en el origen"
        }
    }
}
fun main(){
    val punto1 = Punto(3,-6)
    val punto2 = Punto(7,2)
    val punto3 = Punto(-8,-1)
    val punto4 = Punto(9,-10)
    val punto5 = Punto(0,0)

    println("Punto1: ${punto1.cuadrante()}")
    println("Punto2: ${punto2.cuadrante()}")
    println("Punto3: ${punto3.cuadrante()}")
    println("Punto4: ${punto4.cuadrante()}")
    println("Punto5: ${punto5.cuadrante()}")

}