// Leia um valor digitado pelo usuário (ex: "sim" ou "não") e guarde em uma variável booleana.
Depois, mostre na tela se o valor é verdadeiro ou falso.



import java.util.Scanner;
fun main(){
    // Objeto do Scanner
    val scanner=Scanner(System.`in`)
    // Leitura do valor digitado (Sim ou não) e conversão para o tipo boolean
    print("Digite 'Sim' ou 'Não' : ")
    var resposta= scanner.nextLine()
    //Conversão
    val valorBooleano = resposta.equals("sim",ignoreCase=true)
    // Exibição do valor V ou F
    println("Valor booleano: $valorBooleano")
}