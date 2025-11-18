// Peça ao usuário para digitar uma única letra e exiba se ela é vogal ou consoante.

import java.util.Scanner

fun main() {

    val scanner = Scanner(System.`in`)

    print("Digite uma letra: ")
    val letra = scanner.next()[0]   // lê o primeiro caractere digitado
    val letraMin = letra.lowercaseChar()   // transforma em minúscula

    // Verificação simples de vogal
    if (letraMin == 'a' || letraMin == 'e' || letraMin == 'i' || letraMin == 'o' || letraMin == 'u') {
        println("É vogal")
    } else {
        println("É consoante")
    }
}