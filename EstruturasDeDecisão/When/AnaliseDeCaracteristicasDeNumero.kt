/* Peça um número e:

Use when { } para testar:
num < 0 → “Número negativo”
num % 2 == 0 → “Número par”
num % 5 == 0 → “Múltiplo de 5”
Caso nenhuma condição seja atendida → “Número comum”

Cada caso deve ser independente. */

fun main () {

    println("Digite um número: ")
    val numero = readLine()!!.toInt()

    when  {
        numero < 0 -> println("Número negativo")
        numero % 2 == 0 -> println("O número é par!")
        numero % 5 == 0 -> println("O número é ímpar!")
        else -> println("Número comum!")
    }

}