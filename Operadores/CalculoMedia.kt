import java.util.Scanner;

fun main() {

    //Objeto Scanner
    val scanner=Scanner(System.`in`)

    // Entrada de dados
    print("Insira a primeira nota: ")
    val nota1 = scanner.nextDouble();

    print("Insira a primeira nota: ")
    val nota2 = scanner.nextDouble();

    print("Insira a primeira nota: ")
    val nota3 = scanner.nextDouble();

    // Cáculo da média
    val media = (nota1 + nota2 + nota3) / 3


    // Exibição da nota
    println("A média das 3 notas é: $media")


}