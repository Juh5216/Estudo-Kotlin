import java.util.Scanner;

fun main() {

    //Objeto Scanner
    val scanner=Scanner(System.`in`)

    //Entrada de dados
    print("Insira um número: ")
    var num = scanner.nextDouble()

    // +=5
    num +=5
    println("Após somar 5: $num")

    // -=3
    num -=3
    println("Após subtrair 3: $num")

    // *=2
    num *=2
    println("Após multiplicar por 2: $num")

    // /=2
    num/=2
    println("Após dividir por 2: $num")

    // %4
    num%=4
    println("Resto da divisão por 4: $num")

}