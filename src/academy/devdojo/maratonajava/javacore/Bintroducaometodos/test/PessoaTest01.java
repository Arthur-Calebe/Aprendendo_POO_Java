package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Calebe");
        pessoa.setIdade(18);

        //pessoa.imprime();
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());

        // private protege o atributo para que ele só possa ser acessado dentro da própria classe
        // e os métodos get e set permitem ler e modificar esse valor de forma controlada, garantindo o encapsulamento.
    }
}
