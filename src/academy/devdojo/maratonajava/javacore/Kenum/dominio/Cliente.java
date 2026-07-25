package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public class Cliente {
    //Não é a melhor das coisas, mas da para fazer dentro da classe
    public enum TipoPagamento{
        DEBITO, CREDITO
    }

    private String nome;
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;

    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {

        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome = '" + nome + '\'' +
                ", tipoCliente = " + tipoCliente +
                ", tipoClienteInt = " + tipoCliente.VALOR +
                ", tipoPagamento = " + tipoPagamento +
                '}';
    }
}