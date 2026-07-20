package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Cauê");
        funcionario.setIdade(21);
        funcionario.setSalarios(new double[]{1200, 1587, 1650});

        funcionario.imprime();
        System.out.println("Média = "+funcionario.getMedia());
        //funcionario.calculaMediaSalarial();
    }
}
