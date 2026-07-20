package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTeclado02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("O software que prever o campeão brasileiro de 2026");
        System.out.println("Digite o seu time e eu digo sim ou não");

        String pergunta = input.nextLine();
        if (pergunta == "fluminense"){
            System.out.println("Sim o fluminense será campeão do campeonato brasileiro de 2026");
        }else {
            System.out.println("Não, o seu time não será campeão :/");
        }
    }
}
