import java.util.Scanner;

fun main() {

    var num1: Double
    var num2: Double
    var num3: Double

    // Leitura de 3 números
    print("Digite 3 números: ")
    val scanner=Scanner(System.`in`)
    num1 = scanner.nextDouble();
    num2 = scanner.nextDouble();
    num3 = scanner.nextDouble();

    // Exibição dos 3 números
    println("o primeiro número é: $num1")
    println("o segundo número é: $num2")
    println("o terceiro número é: $num3")
    
}