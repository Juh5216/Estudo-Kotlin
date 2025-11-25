import java.util.Scanner;

fun main () {

    //Objeto para entrada de dados
    val scanner=Scanner(System.`in`)

    //Recebimento dos números
    print("Insira o primeiro número: ")
    var num1 = scanner.nextDouble()

    print("Insira o segundo número: ")
    var num2 = scanner.nextDouble();

    // Soma
    val resultadoSoma = num1 + num2
    println("A soma de $num1 e $num2 é $resultadoSoma")

    // Subtração
    val resultadoSubtracao = num1 - num2
    println("A subtração de $num1 e $num2 é $resultadoSubtracao")

    // Multiplicação
    val resultadoMultiplicacao = num1 * num2
    println("A multiplicação de $num1 e $num2 é $resultadoMultiplicacao")

    // Divisão
    val resultadoDivisao = num1 / num2
    println("A divisão de $num1 e $num2 é $resultadoDivisao")

    // Resto da divisão
    val resultadoResto = num1 % num2
    println("O resto da divisão entre $num1 e $num2 é $resultadoResto")

}