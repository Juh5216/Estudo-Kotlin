fun main () {

    print("Escolha uma opção! \n")
    println("1 - Cadastrar usuário\n" +
            "2 - Editar cadastro\n" +
            "3 - Excluir conta\n" +
            "4 - Sair do sistema ")
    val opcao = readLine()!!.toInt()

    when (opcao) {
        1 -> println ("Cadastro de usuário")
        2 -> println ("Edição de usuário")
        3 -> println ("Exclusão de usuário")
        4 -> println ("Encerrando o sistema")
        else -> println ("Opção inválida")
    }

}