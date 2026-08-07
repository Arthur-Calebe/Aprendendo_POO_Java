package academy.devdojo.maratonajava.javacore.LclassesAbstratas.dominio;

public class Analista extends Funcionario{

    public Analista(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void bonusSalarial() {
        this.salario = this.salario + this.salario * 0.2;
    }

    @Override
    public String toString() {
        return "Analista{" +
                " nome ='" + nome + '\'' +
                ", salario =" + salario +
                '}';
    }
}
