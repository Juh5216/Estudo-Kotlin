/* Além de identificar o combustível, agora o programa deve:

Aceitar entrada em qualquer formato

A, a

Álcool, alcool

G, g, Gasolina

E, e, Etanol

Usar when como expressão (retornando valor)

Separar lógica de exibição

Primeiro decide

Depois imprime */

fun main () {

    print("Insira o tipo de combustível que deseja: ")
    val combustivel = readLine()


    val comb = when (combustivel) {
                "a", "A", "álcool", "Álcool" -> "Álcool.\nMenor impacto ambiental."
                "g", "G", "gasolina", "Gasolina" -> "Gasolina. \nMaior emissão de poluentes."
                "e", "E", "etanol", "Etanol"-> "Etanol. \nOrigem vegetal."
                else -> "Tipo de combustível inválido!"
    }
    println(comb)


}