package academy.devdojo.maratonajava.javacore.Hheranca.Test;

import academy.devdojo.maratonajava.javacore.Hheranca.Dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.Dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.Dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();

        endereco.setRua("Rua Vila da Folha");
        endereco.setCep("22222-022");

        Pessoa pessoa = new Pessoa("Naruto");

        System.out.println("--- PESSOA ---");
        pessoa.setCpf("111.111.011.11");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Chikamaru");


        funcionario.setCpf("212121");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(2000000);

        System.out.println("___________________");
        System.out.println("--- FUNCIONARIO ---");

        funcionario.imprime();
    }
}
