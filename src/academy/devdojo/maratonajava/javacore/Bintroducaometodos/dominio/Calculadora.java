package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {

    public void soma() {
        System.out.println(10 + 10);
    }

    public void subtracao() {
        System.out.println(21 - 10);
    }

    public void multiplicacao(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double dividir(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        }
        // return não é usado quando for void, justamente pq o void é = a vazio
        return num1 / num2;
    }

    public void alteraNumeros (int num1, int num2){
        num1 = 99;
        num2 = 64;
        System.out.println("Dentro do altera numeros");
        System.out.println("Num1 "+num1 );
        System.out.println("Num2 "+num2 );
    }

    public void somaArray(int[] numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs (int... numeros){
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }
}
