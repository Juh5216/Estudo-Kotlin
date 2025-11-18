// Leia um número decimal digitado pelo usuário e calcule a metade dele

import java.util.Scanner;
fun main() {
    var num:Double;
    var resultado:Double;
    // Recebimento do número
    print("Insira um número: ")
    val scanner=Scanner(System.`in`)
    num = scanner.nextDouble();
    // Cálculo do número
    resultado=num/2
    // Exibição do número
    println("A metade do número $num é $resultado")
}