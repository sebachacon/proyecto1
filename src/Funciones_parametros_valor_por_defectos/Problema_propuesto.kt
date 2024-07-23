package Funciones_parametros_valor_por_defectos

fun sum(v1: Int, v2: Int, v3: Int = 0, v4: Int = 0, v5:Int = 0): Int {
   return v1 + v2 + v3 + v4 + v5

}

fun main(){
    println(sum (2, 3))
    println(sum(1, 2, 3))
    print(sum(1, 1, 1, 1, 1))
}