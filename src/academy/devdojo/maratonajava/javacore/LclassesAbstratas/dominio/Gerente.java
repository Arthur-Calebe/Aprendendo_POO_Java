package academy.devdojo.maratonajava.javacore.LclassesAbstratas.dominio;

public class Gerente extends Funcionario{
    protected String expecializacao;

    public Gerente(String nome, double salario, String expecializacao) {
        super(nome, salario);
        this.expecializacao = expecializacao;
    }

    @Override
    public String toString() {
        return "Gerente {" +
                "expecialização = '" + expecializacao + '\'' +
                ", nome = '" + nome + '\'' +
                ", salario = " + salario +
                '}';
    }
}
