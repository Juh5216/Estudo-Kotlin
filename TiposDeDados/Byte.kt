// Leia um número pequeno entre -128 e 127 e incremente +1 utilizando uma variável Byte.

import java.util.Scanner;

fun main () {

    //Objeto para entrada de dados
    val scanner=Scanner(System.`in`)

    //Recebimento do número
    print("Digite um número: ")
    var numero: Byte = scanner.nextByte();

    //Incremento
    numero = (numero + 1).toByte()

    //Exibição
    println("Resultado: $numero")

}