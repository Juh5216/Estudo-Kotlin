import java.util.Scanner;

fun main() {

    //Objeto Scanner
    val scanner=Scanner(System.`in`)

    // Entrada de dados
    print("Digite 'Sim' ou 'Não': ")
    val resposta = scanner.next().lowercase()

    // conversão de sim/nao para boolean
    val valorBooleano = resposta == "sim"

    // Exibição do contrário
    val contrario = !valorBooleano

    println("Valor original: $valorBooleano")
    println("Valor contrário: $contrario")

}