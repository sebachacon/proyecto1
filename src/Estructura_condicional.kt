fun main() {
    /*
    print("Ingrese el sueldo del empleado")
    val sueldo: Double = readln().toDouble()

    // condicional if, si sueldo es mayor 3000,
    // imprimir "Debe pagar impuestos
    if(sueldo > 3000){
        println("Debe pagar impuestos")
    }
    */
    /*
        //Problema 2
        print("Ingrese primer valor:")
        val valor1 = readln().toInt()
        print("Ingrese segundo valor")
        val valor2 = readln().toInt()
        // condicional con if / else
        if(valor1 > valor2){
            print("El mayor valor es $valor1")
        }else{
        print("El mayor valor es $valor2")
        }
    */
    /*
    //Problema 3
    print("Ingrese el primer valor:")
    val valor1: Int = readln().toInt()
    print("Ingrese el segundo valor:")
    val valor2: Int = readln().toInt()
    if(valor1 < valor2){
        val suma: Int = valor1 + valor2
        val resta: Int = valor1 - valor2
        print("La suma de los dos valores es: $suma")
        print("La resta de los dos valores es: $resta")
    }else{
        val producto: Int = valor1 * valor2
        val division: Int = valor1 / valor2
        print("El producto de los dos valores es: $producto")
        print("La division de los dos valores es: $division")
    }
*/
    /*
        //Porblema 4
        print("Ingrese primera nota:")
        val nota1: Int = readln().toInt()
        print("Ingrese segunda nota:")
        val nota2: Int = readln().toInt()
        print("Ingrese tercera nota:")
        val nota3: Int = readln().toInt()
        if ((nota1 + nota2 + nota3)/3 >=7){
            val promedio = (nota1 + nota2 +nota3)/3
            println("Nota promedio es $promedio")
            println("Promocionado")

        }
    */
//Problema 5
    println("Ingrese nota del 1-99")
    val valor1: Int = readln().toInt()
    if (valor1 >= 10){
        println("El numero tiene 2 digitos")
    } else {
        println("El numero tiene 1 digito")
    }

}
