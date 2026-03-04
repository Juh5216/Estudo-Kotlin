/* Peça ao usuário que informe sua idade.

Regras de classificação:
0 a 12 → Criança
13 a 17 → Adolescente
18 a 59 → Adulto
60 a 120 → Idoso
Qualquer outro valor → “Idade fora do limite”

Verifique se o valor digitado é válido:
Não pode ser negativo
Não pode ser maior que 120
Caso o usuário digite um valor inválido (ex: texto, número negativo ou maior que 120), exiba uma mensagem de erro apropriada.
Após classificar a idade, pergunte se o usuário deseja informar outra idade.

Se sim, repita o processo.
Se não, finalize o programa com uma mensagem de encerramento. */

fun main () {

    do {
        print("Insira a idade: ")
        var idade = readLine()!!.toInt()

        if (idade < 0 || idade > 120) {
            println("Valor inválido!")

        } else {
            val classificacao = when (idade) {
                in 0..12 -> "Criança"
                in 13..17 -> "Adolescente"
                in 18..59 -> "Adulto"
                in 60..120 -> "Idoso"
                else -> "Idade inválida!"
            }

            println(classificacao)
        }
            println("Gostaria de informar outra idade? (sim/não) ")
            val resposta = readLine()!!.lowercase()


     } while (resposta == "sim")

    println("Encerrando o programa!")

}