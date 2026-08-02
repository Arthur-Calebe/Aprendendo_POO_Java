package academy.devdojo.maratonajava.javacore.LclassesAbstratas.test;

import academy.devdojo.maratonajava.javacore.LclassesAbstratas.dominio.Analista;
import academy.devdojo.maratonajava.javacore.LclassesAbstratas.dominio.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.LclassesAbstratas.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.LclassesAbstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        /* Como a classe é abstrata, não pode gerar um objeto a partir dela
        Funcionario funcionario = new Funcionario("Arthur Calebe", 2500);*/

        Gerente gerente = new Gerente("Cauê Calebe", 7500, "T.I");
        Desenvolvedor desenvolvedor = new Desenvolvedor("Arthur Calebe", 6000);
        Analista analista = new Analista("Angélica", 5800);

        System.out.println(gerente);
        System.out.println(desenvolvedor);
        System.out.println(analista);
    }
}
