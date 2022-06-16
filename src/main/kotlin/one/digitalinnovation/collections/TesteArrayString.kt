package one.digitalinnovation.collections

fun main () {
    val nomes = Array<String>(size = 3) { "" }

    nomes[0] = "Henrique"
    nomes[1] = "Leticia"
    nomes[2] = "Laura"

    for (nome in nomes) {
        println(nome)
    }

}