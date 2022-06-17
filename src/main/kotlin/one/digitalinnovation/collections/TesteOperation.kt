package one.digitalinnovation.collections

fun main (){
    val salarios= doubleArrayOf(1000.0,3200.0,4000.0)

    for (salario in salarios) {
        println(salario)
    }
    println("---------------------------")
    println("Maior salario: ${salarios.max()}")
    println("Menor salario: ${salarios.min()}")
    println("Media salarial: ${salarios.average()}")

    val salariosMaiorque2500 = salarios.filter { it > 2500.0}

    println("----------------------------------")
  println(salarios.count {it in 2000.0..5000.0})
    println("----------------------------------")
    println(salarios.find{ it == 2250.0})
    println("----------------------------------")
    println(salarios.any{ it == 1000.0})
}