/* Identificar o dia da semana (melhorado)
Peça ao usuário um número entre 1 e 7.
Use when para mostrar o nome do dia e uma mensagem extra, por exemplo:

1 → "Segunda-feira — início da semana!"

7 → "Domingo — dia de descanso!"

Se o número for fora do intervalo, mostre: "Dia inválido!" */

fun main () {

    print("Escolha um número entre 1 e 7 para escolher o dia da semana:")
    val dia = readLine()!!.toInt()

    when (dia) {
        1 -> println ("Domingo")
        2 -> println ("Segunda")
        3 -> println ("Terça")
        4 -> println ("Quarta")
        5 -> println ("Quinta")
        6 -> println ("Sexta")
        7 -> println ("Sábado")
        else -> println ("Número inválido")
    }

}