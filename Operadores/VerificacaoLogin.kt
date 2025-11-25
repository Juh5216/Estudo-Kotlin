import java.util.Scanner;

fun main() {

    //Objeto Scanner
    val scanner=Scanner(System.`in`)

    println("Cadastro!")

    // Entrada de dados : Email
    print("Digita o e-mail: ")
    val email = scanner.nextLine()

    // Entrada de dados: Nome do usuário
    print("Digite o usuário: ")
    val usuario = scanner.nextLine()

    // Entrada de dados: Senha
    print("Digite a senha: ")
    val senha = scanner.nextLine()

    // Login
    println("Login!")

    print("Email: ")
    val validacaoEmail = scanner.nextLine()

    print("Usuário: ")
    val validacaoUsuario = scanner.nextLine()

    print("Senha: ")
    val validacaoSenha = scanner.nextLine()

    //verificação
    if ((email==validacaoEmail || usuario==validacaoUsuario) && senha==validacaoSenha) {
        println("Acesso permitido!")

    } else {
        println("Acesso negado!")
    }
}