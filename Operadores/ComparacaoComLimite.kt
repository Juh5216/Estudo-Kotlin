import java.util.Scanner;

fun main() {

    //Objeto Scanner
    val scanner=Scanner(System.`in`)

    // Entrada de dados
    print("Insira um número: ")
    val num = scanner.nextInt()

    // Comparação
    if (num >= 18 && num <= 100) {
        println("O número $num é maior/igual a 18 ou menor/igual a 100 ")

    } else {
        println("Está fora do intervalo de números!")
    }
}