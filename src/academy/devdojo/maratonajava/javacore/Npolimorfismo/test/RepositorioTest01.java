package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioBancoDeDados;

public class RepositorioTest01 {
    public static void main(String[] args) {

        // Em programação orientada a interface ao invés de colocar o tipo mais específico você coloca um mais genérico
        // ao invés de ser RepositorioBancoDeDados repositoriobancodedados = new ... você chama a interfacce
        Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();
    }
}
