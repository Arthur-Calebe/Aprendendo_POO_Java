package academy.devdojo.maratonajava.javacore.Gassociacao.test;


import java.util.Scanner;

public class LeituraDoTeclado01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escreve seu nome na próxima linha:");
        String nome = entrada.nextLine();

        System.out.println("Digite a sua idade abaixo:");
        int idade = entrada.nextInt();

        System.out.println("Seu nome é: " + nome);
        System.out.println("Sua idade é: " + idade);
    }


}
