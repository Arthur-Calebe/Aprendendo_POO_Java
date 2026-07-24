package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.test;

import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio.Carro;

public class carroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();

        System.out.println(carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Satoru Gojo");
        System.out.println(carro.COMPRADOR);

    }
}
