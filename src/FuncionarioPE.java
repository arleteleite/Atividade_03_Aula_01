
    import java.util.Scanner;

    public class FuncionarioPE {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("digite o nome");
            String nome = sc.next();
            System.out.println("digite a quantidade de horas");
            double horas = Double.parseDouble(sc.next());
            System.out.println("digite o valor de horas");
            double valor_hora = Double.parseDouble(sc.next());
            double salario = horas*valor_hora*30;
            System.out.printf("nome: %s \n salário mensal: %.2f",nome, salario);

        }//main

    }//class
