package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.impressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        impressoraEstudante impressora = new impressoraEstudante();

        estudante01.nome = "Arthur";
        estudante01.idade = 18;
        estudante01.sexo = 'M';

        estudante02.nome = "Cauê";
        estudante02.idade = 21;
        estudante02.sexo = 'M';

        /*
        System.out.println("_____________________");
        System.out.println(estudante1.idade);
        System.out.println(estudante1.sexo);
        System.out.println(estudante1.nome);
        */

        /*
        System.out.println("_____________________");
        System.out.println(estudante2.idade);
        System.out.println(estudante2.sexo);
        System.out.println(estudante2.nome);
        */

        /*===============================*/

        /* no lugar do sout você pode substituir por isso
         assim você esta fazendo referência as infomações que você adicionou
         sem precisar imprimir 1 por 1.
        */

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);

    }
}
