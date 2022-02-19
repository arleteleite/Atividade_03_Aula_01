public class Principal_POO {
    public static void main(String[] args) {
        Funcionario nomeFunc = new Funcionario();
        //System.out.println(nomeFunc);//apenas mostra o end de memoria do objeto.

        SalarioMensal salario = new SalarioMensal();
        //System.out.println(salario);

        nomeFunc.dado();
        salario.valor();
        salario.hora();
        nomeFunc.imprimeNome();
        salario.salarioReal();
    }
}
