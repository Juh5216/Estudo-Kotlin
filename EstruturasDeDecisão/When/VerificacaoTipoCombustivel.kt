/* Peça ao usuário que digite uma letra representando o tipo de combustível.

Tipos válidos:
A ou a → Álcool

G ou g → Gasolina

E ou e → Etanol

Regras :
A entrada deve considerar apenas o primeiro caractere digitado
(caso o usuário digite mais de uma letra).

Use when com vários valores no mesmo caso, exatamente assim:



'A', 'a' -> ...
Além de mostrar o nome do combustível, exiba uma mensagem complementar:

Álcool → “Menor impacto ambiental”

Gasolina → “Maior emissão de poluentes”

Etanol → “Origem vegetal”

Se a letra não corresponder a nenhuma opção válida, mostrar:

"Tipo desconhecido." */

fun main () {

    print("Insira o tipo de combustível que deseja: ")
    val combustivel = readLine()!![0]


    when (combustivel) {
        'a', 'A' -> println("Álcool.\n Menor impacto ambiental.")
        'g', 'G' -> println("Gasolina. \n Maior emissão de poluentes.")
        'e', 'E' -> println("Etanol. \n Origem vegetal.")
        else -> println("Tipo de combustível inválido!")
    }