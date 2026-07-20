package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - * /
        double numero01 = 10;
        double numero02 = 20;
        double resultado01 = numero01 + numero02;
        double resultado02 = numero01 - numero02;
        double resultado03 = numero01 * numero02;
        double resultado04 = numero01 / numero02;

        System.out.println(resultado01);
        System.out.println(resultado02);
        System.out.println(resultado03);
        System.out.println(resultado04);

        // < > <= >= == !=
        boolean isDezMaior = 10 > 20;
        System.out.println(isDezMaior);

        // && (AND) || (OR) !
        int idade = 35;
        float salario = 15000;
        boolean isDentroDaleiMaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println(isDentroDaleiMaiorQueTrinta);
        System.out.println(isDentroDaLeiMenorQueTrinta);

        // = += -= *= /= %=

        //

        int contador = 0;
        contador += 1;
        contador++;

        System.out.println(contador);
    }
}
