import java.util.Scanner;

public class Salario_Mensal_PE {
    public static void main(String[] args) {
        //declarando as variaveis
        String nomeFuncionario;
        double qntHorasTrabalhadas;
        double valorHora, salarioMensal;

        //Capturando dados digitados
        Scanner nome = new Scanner(System.in);
        System.out.println("Digite o nome do funcionário");
        nomeFuncionario = nome.nextLine();

        Scanner horas = new Scanner(System.in);
        System.out.println("Infome a quantidade de horas trabalhadas:");
        qntHorasTrabalhadas = horas.nextDouble();

        Scanner valor = new Scanner(System.in);
        System.out.println("Infome o custo da hora trabalhada: ");
        valorHora = valor.nextDouble();

        //executando a operação de salarioMensal
        salarioMensal = qntHorasTrabalhadas * valorHora;

        //exibindo o resultado na tela
        System.out.println("O funcionário, "+nomeFuncionario + ", recebe um salário mensal de R$ "+salarioMensal);

    }
}
