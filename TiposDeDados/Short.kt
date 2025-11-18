// Guarde a idade de uma pessoa como Short e exiba se a pessoa é maior de idade.

import java.util.Scanner;

fun main () {

    //Objeto para entrada de dados
    val scanner=Scanner(System.`in`)

    //Recebimento do dado: Idade
    print("Digite a sua idade: ")
    val idade=scanner.nextShort();

    //Lógica e exibição da informação : A pessoas é maior de idade?
    if (idade >= 18) {
        println("Você é maior de idade!")

    } else {
        println("Você é menor de idade!")
    }
}