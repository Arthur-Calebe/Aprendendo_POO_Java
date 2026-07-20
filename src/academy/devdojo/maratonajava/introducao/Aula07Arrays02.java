package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // PADRÕES DE INICIALIZAÇÃO: byte, short, int, long, float e double = 0
        // char '\u0000' ' '
        // boolean false
        // String null

        String[] nomes = new String[4];
        nomes[0] = "Satoru";
        nomes[1] = "Saitama";
        nomes[2] = "Naruto";
        nomes[3] = "Kakashi";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
