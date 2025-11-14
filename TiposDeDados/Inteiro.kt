// Peça ao usuário um número inteiro e mostre o dobro desse número

import java.util.Scanner;

fun main() {

    var num: Int
    var resultado: Int

    // Recebimento e leitura do número
    print("Digite um número: ")
    val scanner = Scanner(System.`in`);
    num = scanner.nextInt();

    // Dobrar o número
    resultado = num * 2


    // Exibição do número com valor atualizado
    println("O dobro do número $num é $resultado")


}