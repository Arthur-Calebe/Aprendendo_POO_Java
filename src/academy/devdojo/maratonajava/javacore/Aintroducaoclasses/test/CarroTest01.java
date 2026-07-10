package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        System.out.println("=================================");
        System.out.println("Possuimos dois modelos de carros disponíveis em nossa loja:\n");

        // Primeiro objeto e os seus valores
        carro1.nome = "Mercedes";
        carro1.modelo = "Sedan";
        carro1.ano = 2019;

        System.out.println("Marca: " + carro1.nome + ", modelo: " + carro1.modelo + ", ano de: " + carro1.ano);

        // Segundo objeto e seus valores
        carro2.nome = "Audi";
        carro2.modelo = "Sedan";
        carro2.ano = 2024;


        System.out.println("Marca: " + carro2.nome + ", modelo: " + carro2.modelo + ", ano de: " + carro2.ano);
        System.out.println("=================================");

        /* Se eu quiser que ambos tenham a mesma referência eu posso fazer:

            carro1 = carro2; assim o carro1 vai ter a mesma característica que o carro2
            carro1 = carro2; assim o carro2 vai ter a mesma característica que o carro1

            Só posso fazer isso com objetos do mesmo tipo na mesma linha de herança.
         */

    }
}
