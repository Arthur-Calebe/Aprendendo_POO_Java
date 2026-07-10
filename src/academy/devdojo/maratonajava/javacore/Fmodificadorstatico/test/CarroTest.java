package academy.devdojo.maratonajava.javacore.Fmodificadorstatico.test;

import academy.devdojo.maratonajava.javacore.Fmodificadorstatico.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro1 = new Carro("BMW", 220);
        Carro carro2 = new Carro("Mercedes", 225);
        Carro carro3 = new Carro("Chevrolet", 275);

        Carro.setVelocidadeLimite(180);

        carro1.imprime();
        carro2.imprime();
        carro3.imprime();
    }
}
