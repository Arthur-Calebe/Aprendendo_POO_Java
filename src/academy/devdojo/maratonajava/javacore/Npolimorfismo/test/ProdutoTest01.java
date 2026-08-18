package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Monitor;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("MacBook", 12000);
        Monitor monitor = new Monitor("Dell", 1000);

        CalculadoraImposto.calcularImpostoMonitor(monitor);
        System.out.println("--------------------");
        CalculadoraImposto.calcularImpostoComputador(computador);
    }
}
