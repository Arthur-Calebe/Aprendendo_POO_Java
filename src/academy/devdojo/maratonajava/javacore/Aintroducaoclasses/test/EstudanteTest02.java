package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();

        // estou adicionando um nome localmente pra ele
        estudante.nome = "Cauê";

        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println(estudante.nome);

        /* como nada foi iniciado neles, eles iram apresentar os seus valores de inicialização padrão:
            vazio do int = 0
            vazio do char = nada, ()
            vazio de String = null
         */

        System.out.println("_____________________");
        System.out.println(estudante2.idade);
        System.out.println(estudante2.sexo);
        System.out.println(estudante2.nome);

    }
}
