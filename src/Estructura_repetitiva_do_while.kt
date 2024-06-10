fun main() {
    /*
do {
   print("Ingrese un valor comprendido entre 0 y 999:")
    val valor = readln().toInt()
    if(valor < 10)
        println("El valor ingresado tiene un digito")
    else
        if(valor < 100)
            println("El valor ingresado tiene dos digitos")
    else
        println("El valor ingresado tiene tres digitos")
}while(valor != 0)
*/
/*
    var cant = 0
    var suma = 0
    do {
        print("Ingrese un valor (0 para finalizar):")
        val valor = readln().toInt()
        if (valor != 0) {
            suma += valor
            cant++
        }


    } while (valor != 0)
    if (cant != 0) {
        val promedio = suma / cant
        print("El promedio de los valores ingresados es: $promedio")
    } else {
        print("No se ingresaron datos")
    }
*/

    var cantidad_inferior = 0 // por debajo de 9.8
    var cantidad_superior = 0 // por debajo de 10.2
    var cantidad_adecuada = 0 // por debajo de 10.2

    do{
        print("Ingrese el peso de la pieza(0 para finalizar):")
        val peso = readln().toDouble()
        if(peso > 10.2)
            cantidad_superior++
        else
            if(peso >= 9.8 && peso <= 10.2)
                cantidad_adecuada++
        else
            cantidad_inferior++
    }while (peso != 0.0)
println("Piezas aptas: $cantidad_adecuada")
println("Piezas peso superior a 10.2: $cantidad_superior")
println("Piezas peso inferior: $cantidad_inferior")
    val suma = cantidad_adecuada + cantidad_inferior + cantidad_superior
    println("Cantidad total de piezas procesadas: $suma")


}


