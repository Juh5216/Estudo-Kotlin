import java.util.Scanner;

fun main() {

    var temperaturaC: Double
    var temperaturaF: Double
    
    // Pedir para informar temperatura em ºC
    print("Digite a temperatura a ser convertida de ºC para ºF: ")
    val scanner=Scanner(System.`in`)
    temperaturaC = scanner.nextDouble()

    // Conversão de temperatura (F = C × 9/5 + 32)
    temperaturaF = temperaturaC * 9/5 + 32

    // Exibir mensagem com o valor convertido em ºF
    println("A temperatura $temperaturaC ºC foi convertida para $temperaturaF ºF")

}