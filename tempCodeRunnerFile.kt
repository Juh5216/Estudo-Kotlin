import java.util.Scanner;

fun main() {

    //Nome
    print("Digite o se nome: ")
    var scanner = Scanner(System.`in`);
    var nome = scanner.next();

    //Sobrenome
    print("Agora, digite o seu sobrenome: ")
    var sobrenome = scanner.next();

    //Exibição do nome
    print("Bem-vindo(a)" + nome + " " + sobrenome + "!");

}