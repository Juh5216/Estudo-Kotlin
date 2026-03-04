/* Peça ao usuário uma nota de 0 a 10.
Enquanto a nota digitada for inválida, continue pedindo uma nova nota.

Quando a nota for válida, exiba a classificação:
0 a 4 → Reprovado
5 a 7 → Recuperação
8 a 10 → Aprovado

Se a nota estiver fora do intervalo, exiba:
"Nota inválida! Digite um valor entre 0 e 10." */

fun main () {

    do {
        print("Insira uma nota (0 à 10):")
        val nota = readLine()!!.toInt()

        when (nota) {
            in 0..4 -> println("Reprovado!")
            in 5..7 -> println("Recuperação!")
            in 8..10 -> println("Aprovado!")
            else -> println("Nota inválida!")

        }
    } while (nota <0 || nota >10)

}