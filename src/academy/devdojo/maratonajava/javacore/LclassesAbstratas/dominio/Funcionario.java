package academy.devdojo.maratonajava.javacore.LclassesAbstratas.dominio;

    // Uma classe *abstract* é uma classe que serve como modelo/base para outras classes, não pode criar objeto a partir dessa classe " new funcionario (...)"
public abstract class Funcionario {
    protected String nome;
    protected double salario;

    // continua tendo um construtor, pois a classe vai dar origem a outras por meio do "extends"
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
}
