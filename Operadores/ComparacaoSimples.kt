import java.util.Scanner;

fun main() {

    //Objeto Scanner
    val scanner=Scanner(System.`in`)

    //Entrada de dados
    print("Insira o primeiro número: ")
    val num1 = scanner.nextInt()

    print("Agora, insira o segundo número: ")
    val num2 = scanner.nextInt()

    // Se o primeiro é maior que o segundo
    if (num1>num2) {
        println("O primeiro número é maior que o segundo número ")

    } else if (num2 > num1) {
        println("O segundo número é maior que o primeiro número ")

    } else {
        println("Os números são iguais")

    }


}