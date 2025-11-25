import java.util.Scanner;

fun main () {

    //Objeto para entrada de dados
    val scanner=Scanner(System.`in`)

    // Leitura do número
    print("Insira um número: ")
    var num = scanner.nextInt();

    // Exibição do número
    println("O número é $num")

    // Incremento +1
    num++

    // Exibição do número com valor alterado com incremento
    println("O valor alterado (Incremento) é $num")

    // Decremento -1
    num--

    // Exibição do número com valor alterado com decremento
    println("O valor alterado (Decremento) é $num")

}