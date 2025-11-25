import java.util.Scanner;

fun main() {

    //Objeto Scanner
    val scanner=Scanner(System.`in`)

    // Entrada de dados
    print("Insira a sua idade: ")
    val idade = scanner.nextInt()

    print("Possui autorização? Digite 'Sim' ou 'Não' : ")
    val autorizacao = scanner.next()

    //Verificação da idade e exibição da autorização
    if (idade >=18 && autorizacao.lowercase() == "sim") { //.lowercase() tranforma o dado recebido em minúscula
        println("Entrada permitida!")

    } else {
        println("Entrada negada!")
    }