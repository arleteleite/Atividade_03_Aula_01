import java.util.Scanner;

public class SalarioMensal {

    double qntHorasTrabalhadas, valorHora;

    void hora(){
        Scanner horas = new Scanner(System.in);
        System.out.println("Infome a quantidade de horas trabalhadas:");
        qntHorasTrabalhadas = horas.nextDouble();
    }

    void valor(){
        Scanner custo = new Scanner(System.in);
        System.out.println("Infome o custo da hora trabalhada: ");
        valorHora = custo.nextDouble();
    }

    void salarioReal(){
        //executando a operação de salarioMensal
        double salarioMensal = qntHorasTrabalhadas * valorHora;
        System.out.println(" recebe um salário de R$ "+salarioMensal);
    }
}
