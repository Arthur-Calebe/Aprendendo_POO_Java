package academy.devdojo.maratonajava.javacore.Kenum.test;

import academy.devdojo.maratonajava.javacore.Kenum.dominio.Cliente;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.Cliente.TipoPagamento;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoCliente;

public class ClienteTest01 {
    public static void main(String[] args) {
        //Com a classe ENUM você não passa uma String, só oque estiver na classe ENUM
        Cliente cliente = new Cliente("Calebe", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Carlos", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);
        // Você "força" a pessoa a passar um dos tipos já definidos, tendo um controle e segurança maior

        System.out.println(cliente);
        System.out.println(cliente2);

    }
}
