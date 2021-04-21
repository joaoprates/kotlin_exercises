package one

class Pessoa {
    var name: String = "Joao"
    var cpf: String = "47709322867"

    private set

    constructor()
    fun pessoaInfo() = "$name e $cpf"
}

fun main() {
    val joao = Pessoa()

    println(joao.pessoaInfo())
}