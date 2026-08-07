package academy.devdojo.maratonajava.javacore.LclassesAbstratas.dominio;

// Uma classe *abstract* é uma classe que serve como modelo/base para outras classes, não pode criar objeto a partir dessa classe " new funcionario (...)"
public abstract class Funcionario {
    protected String nome;
    protected double salario;

    // continua tendo um construtor, pois a classe vai dar origem a outras por meio do "extends"
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        bonusSalarial();
    }

    // implementando um Método Abstrato, e chamando em uma classe você tem que chamar nas outras que estão extendendo também
    // Métodos abstratos só podem existir dentro de classes abstratas e não tem "corpo"
    public abstract void bonusSalarial();
}
