package academy.devdojo.maratonajava.javacore.Npolimorfismo.servico;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Monitor;

public class CalculadoraImposto {
    public static void calcularImpostoComputador(Computador computador){
        System.out.println("relatório de imposto do computador");
        double imposto = computador.calcularImposto();

        System.out.println("Computador "+ computador.getNome());
        System.out.println("Valor: "+ computador.getValor());
        System.out.println("Imposto a ser pago: "+ imposto);
    }

    public static void calcularImpostoMonitor(Monitor monitor){
            System.out.println("relatório de imposto do monitor");
            double imposto = monitor.calcularImposto();

            System.out.println("Monitor "+ monitor.getNome());
            System.out.println("Valor: "+ monitor.getValor());
            System.out.println("Imposto a ser pago: "+ imposto);
    }
}

