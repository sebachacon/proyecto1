fun main(){
    /*
    print("Ingrese primera nota:")
    val nota1: Int = readln().toInt()
    print("Ingrese segunda nota:")
    val nota2: Int = readln().toInt()
    print("Ingrese tercer nota:")
    val nota3: Int = readln().toInt()

    val promedio = (nota1+ nota2 + nota3) / 3
    if(promedio >= 7)
        print("Promocionado")
    else
        if(promedio >= 4)
            print("Regular")
    else
        print("Reprobado")
*/
    //Problema 2
    /*
    print("Ingrese primera nota:")
    val nota1: Int = readln().toInt()
    print("Ingrese segunda nota:")
    val nota2: Int = readln().toInt()
    print("Ingrese tercer nota:")
    val nota3: Int = readln().toInt()

    val promedio = (nota1+ nota2 + nota3) / 3
    val estado = if (promedio >= 7)"Promocionado" else if (promedio >= 4)"Regular" else "Reprobado"
print("Estado del alumno $estado")
*/
    //Problema 1
    print("Ingrese primer valor:")
    val valor1 = readln().toInt()
    print("Ingrese segundo valor:")
    val valor2 = readln().toInt()
    print("Ingrese tercer valor:")
    val valor3 = readln().toInt()
    if (valor1 > valor2)
        print("El mayor valor es $valor1")
    else
    if (valor2 > valor3)
        print("El mayor valor es $valor2")
    else
    print("El mayor valor es $valor3")

    //Problema 3
    print("Ingrese un numero:")
    val num = readln().toInt()
    if(num >= 100)
        print("Tiene 3 digitos")
    else
        if(num >= 10)
            print("Tiene 2 digitos")
        else
            if(num <= 9)
            print("Tiene 1 digito")

}
