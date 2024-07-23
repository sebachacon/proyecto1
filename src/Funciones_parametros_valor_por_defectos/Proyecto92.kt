package Funciones_parametros_valor_por_defectos

fun tituloSUbrayado(titulo: String, caracter: String = "*"){
    println(titulo)
    for (i in 1..titulo.length)
        print(caracter)
    println()
}
fun main(){
    tituloSUbrayado("Sistema de Administrador")
    tituloSUbrayado("Ventas", "-")
}