package one.digitalinnovation.collections

fun main(){
    val Joao = funcionario(  "Joao", 2000.0)
    val Pedro= funcionario("Pedro", 2900.0)
    val Maria = funcionario("Maria", 6000.0)

  val funcionarios = listOf(Joao,Pedro,Maria)
    funcionarios.forEach{println(it)}

    println("------------------------------")
    println(funcionarios.find{it.nome == "Ronaldo"})


}

data class  funcionario(
    val nome: String,
    val salario: Double
)
{
    override fun toString(): String =
        """
        
        Nome: $nome
        Salario: $salario
        """.trimIndent()
    }
