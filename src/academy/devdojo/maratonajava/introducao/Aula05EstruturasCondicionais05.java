package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dígite um número de 1 a 7: ");

        // imprima o dia da semana, considerando 1 como domingo
        byte dia = scanner.nextByte();
        // char, int, byte, short, enum, String
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("ERRO, número inválido");
                break;
        }
        System.out.println("Digite seu sexo, sendo F/f feminino e M/m masculino");

        char sexo = scanner.next().charAt(0);
        switch (sexo){
            case 'M':
            case 'm':
                System.out.println("Homem");
                break;

            case 'F':
            case 'f':
                System.out.println("Feminino");
                break;

            default:
                System.out.println("Opção inválida");
                break;
        }
        scanner.close();
    }
}

//Utilizei algumas coisas que eu estou aprendendo!!
