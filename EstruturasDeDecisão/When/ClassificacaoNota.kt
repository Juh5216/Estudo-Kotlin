/* Peça duas notas entre 0 e 10 e calcule a média final.

Depois, usando when com múltiplos valores no mesmo caso, classifique a média:

Classificação:
0, 1, 2, 3 → Ruim

4, 5, 6 → Média

7, 8, 9, 10 → Ótima

Regras adicionais (para aumentar a dificuldade):
Se o usuário digitar uma nota fora do intervalo 0–10, você deve interromper o programa e exibir:

"Nota inválida! Digite valores entre 0 e 10."

A média deve ser arredondada para o inteiro mais próximo antes de ser classificada.
(Exemplo: média 6.7 deve ser classificada dentro do grupo 7 → Ótima).

Após classificar, mostre:

A média real

A média arredondada

A classificação final */

import kotlin.math.roundToInt

fun main () {

    // Entrada de dados: Notas (As notas poderão ser inseridas no tipo float, ou seja, com casas decimais e serão convertidas posteriormente para o tipo inteiro
    println("Insira a 1ª nota: ")
    val nota1 = readLine()!!.toFloat()

    println("Insira a 2ª nota: ")
    val nota2 = readLine()!!.toFloat()


    // Média das notas
    val media = (nota1+nota2) /2


    // Arredondamento da média para inteiro
    val arredondamentoMedia = media.roundToInt()

    val classificacaoFinal =
        when(arredondamentoMedia) {
            0,1,2,3 -> "Nota ruim!"
            4,5,6 -> "Nota média!"
            7,8,9,10 -> "Nota ótima! Parabéns!"
            else -> "Nota inválida!Digite valores entre 0 e 10"
        }

    println("Média real : $media ")
    println("Média arredondada : $arredondamentoMedia ")
    println("Classificação final : $classificacaoFinal ")

}