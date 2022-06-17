package one.digitalinnovation.collections
fun main() {
    val Joao = funcionario("Joao", 2000.0)
    val Pedro = funcionario("Pedro", 2900.0)
    val Maria = funcionario("Maria", 6000.0)

    val funcionarios = mutableListOf(Joao, Maria)
    funcionarios.forEach{println(it)}

    print("---------------------")

    funcionarios.add(Pedro)
    funcionarios.forEach{println(it)}


}