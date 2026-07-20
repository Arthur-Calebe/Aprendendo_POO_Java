package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        // uma variavel de referencia do tipo estudante e um objeto do tipo estudande
        Estudante estudante = new Estudante();

        // adicionando caracteristicas ao "estudante"
        estudante.nome = "Arthur";
        estudante.idade = 18;
        estudante.sexo = 'M';

        // vai pegar a referência que for pedido e vai imprimir essas caracteristicas:
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
