/*  Mostre o seguinte menu:

1 - Cadastrar usuário
2 - Editar cadastro
3 - Excluir conta
4 - Sair do sistema

Use when para indicar o que o usuário escolheu.
Se escolher 4, mostre: "Encerrando o sistema..."

Se digitar algo que não está no menu, mostre: "Opção inválida!"*/


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