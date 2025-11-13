import java.util.Scanner;

fun main() {

    print("Insira o primeiro número: ")
    val scanner = Scanner(System.`in`);
    val num1 = scanner.nextInt();

    print("Insira o segundo número: ")
    val num2 = scanner.nextInt();

    val resultado = num1 + num2;

    println("A soma dos dois números é: $resultado ");

}
