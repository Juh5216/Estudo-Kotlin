// Solicite um número de telefone (somente números) e armazene como Long. Depois exiba quantos dígitos ele tem

import java.util.Scanner;

fun main () {

    //Objeto para entrada de dados
    val scanner=Scanner(System.`in`)

    //Recebimento do número
    print("Digite um número de telefone (Sem caracteres especiais) ")
    val numero=scanner.nextLong();

    //Coversão : O número recebido foi convertido para string para poder utilizar o .length, que realiza a contagem dos números....
    val quantidade = numero.toString().length

    //Exibição
    println("O número tem $quantidade digítos")

}