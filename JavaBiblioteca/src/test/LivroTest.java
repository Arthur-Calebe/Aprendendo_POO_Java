package test;

import dominio.Livro;

public class LivroTest {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Harry Potter", "Arthur", 2027);
        Livro livro2 = new Livro("Biblia", "Jesus", 1950);
        Livro livro3 = new Livro("Deus que destrói sonhos", "C.S Lewis", 2013);

        System.out.println("_________________");

        livro1.emprestar();
        livro2.emprestar();
        livro3.emprestar();
        System.out.println("_________________");

        livro1.devolver();
        livro2.emprestar();
        System.out.println("__________________");

        Livro[] livros = {livro1, livro2, livro3};

        System.out.println("Consultando disponíbilidade dos livros:");
        for (int i = 0; i < livros.length; i++) {
            System.out.println(livros[i].getTitulo() + " - Disponível: " + livros[i].isDisponibilidade());
        }
    }
}
