package Estructura_condicional_when

fun main(){
    var equilatero = 0
    var isosceles = 0
    var escaleno = 0
print("Ingrese la cantidad de triangulos que desea ingresar con los datos de sus lados: ")
val n = readln().toInt()
    for (i in 1..n){
        print("Ingrese el primer lado del triangulo: ")
        val l1 = readln().toInt()
        print("Ingrese el segundo lado del triangulo: ")
        val l2 = readln().toInt()
        print("Ingrese el tercer lado del triangulo: ")
        val l3 = readln().toInt()
        when {
            l1 == l2 && l1 == l3 -> {
                println("El tipo de triangulo es equilatero")
                equilatero++
            }

            l1 == l2 || l2 == l3 || l1 == l3 -> {
                println("El tipo de triangulo es isosceles")
                isosceles++
            }

            else -> {
                println("El tipo de triangulo es escaleno")
                escaleno++
            }
        }
    }
    println("La cantidad de triangulos equilateros es: $equilatero")
    println("La cantidad de triangulos isosceles es: $isosceles")
    println("La cantidad de triangulos escaleno es: $escaleno")




}