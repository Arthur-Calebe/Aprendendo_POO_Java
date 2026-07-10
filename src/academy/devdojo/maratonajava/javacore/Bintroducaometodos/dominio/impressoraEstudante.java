package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class impressoraEstudante {
    public void imprime(Estudante estudante){
        System.out.println("==================");

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

        /* se eu definir um nome aqui dentro, tudo a partir
           daqui terá esse nome.  */
    }
}
