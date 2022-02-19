import java.util.Scanner;

public class Funcionario {

    Scanner nome = new Scanner(System.in);
    String nomeFuncioario;

    void dado(){

        System.out.println("Digite o nome do funcionário:");
        nomeFuncioario = nome.nextLine();
        //System.out.println(nomeFuncioario);
    }

    void imprimeNome(){
        System.out.print(nomeFuncioario);
    }

}
