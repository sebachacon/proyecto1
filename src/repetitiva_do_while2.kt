fun main() {
    /*
    var valorAcumulado = 0
    var entrada: Int

    println("Ingrese los valores para acumular(Ingrese 9999 para finalizar)")

    do {
        print("Ingrese un valor: ")
        entrada = readln().toInt()

        if (entrada != 9999) {
            valorAcumulado += entrada
        }
    } while (entrada != 9999)

    println("El valor acumulado es: $valorAcumulado")

    if(valorAcumulado == 0) {
        println("El valor acumulado es cero.")
        (valorAcumulado > 0)
        println("El valor acumulado es mayor a cero.")
    }else{
        println("El valor acumulado es menor a cero.")
    }

     */

    //Problema 2

    var saldos = 0.0

    println("Ingrese los datos de las cuentas corrientes. Ingrese un número de cuenta negativo para finalizar.")

    do {
        print("Ingrese el número de cuenta: ")
        val cuenta = readln().toInt()
        if (cuenta >= 0){
            print("Ingrese el saldo actual: ")
        val saldo = readln().toDouble()
        if
                (saldo > 0.0) {
            println("Estado de la cuenta: Acreedor")
            saldos += saldo
        }else
        if (saldo < 0.0) {
            println("Estado de la cuenta: Deudor")
        }else
            if (saldo == 0.0)
                println("Estado de la cuenta: Nulo")}
    }while (cuenta >= 0)
            println("La suma total de los saldos acreedores es: $saldos")
}



