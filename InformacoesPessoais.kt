import java.util.Scanner;

fun main(){

    var nome:String;
    var idade:Int;
    var cidade:String;


    // Nome
    print ("Digite o seu nome: ");
    val scanner = Scanner(System.`in`)
    nome = scanner.next();

    // Idade
    print ("Digite a sua idade: ");
    idade = scanner.nextInt();

    // Cidade
    print ("Digite a sua cidade: ");
    scanner.nextLine(); // Utilizado para consumir o enter do nextInt()
    cidade = scanner.nextLine();


    //Exibição das informações
    println("O seu nome é: $nome")
    println("A sua idade é: $idade")
    println("A cidade onde mora é: $cidade")

}