// Leia o primeiro nome e o sobrenome do usuário e mostre o nome completo concatenado.

import java.util.Scanner

fun main() {
    // Objeto scanner
    val scanner=Scanner(System.`in`)

    //Variáveis
    val nome : String;
    val sobrenome : String;

    // Recebimento de dados
    print("Digite o seu nome: ")
    nome = scanner.nextLine()

    print("Agora digite o seu sobrenome: ")
    sobrenome = scanner.next()

    //Exibição
    println("O seu nome é $nome $sobrenome")

}