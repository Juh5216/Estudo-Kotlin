import java.util.Scanner;

fun main() {

    //Objeto Scanner
    val scanner=Scanner(System.`in`)

    // Entrada de dado: Primeiro número
    print("Digite um número: ")
    val num1 = scanner.nextFloat()

    // Entrada de dado: Operador matemático
    print("Escolha um operador aritmético: ")
    val operador = scanner.next()

    //Entrada de dado: Segundo número
    print("Digite um número: ")
    val num2 = scanner.nextFloat()

    // Cálculo
    if (operador == "+") {
        val resultadoSoma = num1 + num2
        println("A soma dos número é : $resultadoSoma")

    } else if (operador == "-") {
        val resultadoSubtracao = num1 - num2
        println("A subtração dos número é : $resultadoSubtracao")

    } else if (operador == "*") {
        val resultadoMultiplicacao = num1 * num2
        println("A multiplicação entre os dois números é : $resultadoMultiplicacao")

    } else if (operador == "/") {
        val resultadoDivisao = num1 / num2
        println("A divisão entre os dois números é : $resultadoDivisao")

    } else {
        val resultadoResto = num1 % num2
        println("O resto da divisão entre os dois números é : $resultadoResto")

    }
}