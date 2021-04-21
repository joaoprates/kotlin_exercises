package one.testes

import one.Banco

fun main() {
    val digibank = Banco(nome = "DigiBank", numero = 1)

    val bank2 = digibank.copy(nome = "bank2")
}