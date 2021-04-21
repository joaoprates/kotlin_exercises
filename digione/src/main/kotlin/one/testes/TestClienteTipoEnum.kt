package one.testes

import one.ClienteTipo

fun main(){
    ClienteTipo.values().forEach { element ->
        println("${element.name} - ${element.description}")
    }
    ClienteTipo.values().forEach {
        println("${it.name} - ${it.description}")
    }
    
    val pf = ClienteTipo.PF
    println("${pf.name} - ${pf.description}")

    val pj = ClienteTipo.PJ
    println("${pj.name} - ${pj.description}")
}