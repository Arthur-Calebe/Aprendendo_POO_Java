package academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio;

public class Monitor extends Produto{
    public static final double IMPOSTO_PO_CENTO = 0.06;
    public Monitor(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do Monitor");
        return this.valor * IMPOSTO_PO_CENTO;
    }
}
