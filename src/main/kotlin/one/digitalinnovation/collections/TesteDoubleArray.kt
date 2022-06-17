package one.digitalinnovation.collections

fun main(){
 val salarios = DoubleArray (size = 3)

    salarios[0] = 1000.0
    salarios[1] = 3000.0
    salarios[2] = 500.0

    salarios.forEach { println(it) }

    println("--------------------------------")

    salarios.forEachIndexed { Index, salario ->
        salarios[Index] = salario * 1.1

    }
    salarios.forEach { println(it) }
    }