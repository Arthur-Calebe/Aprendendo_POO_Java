package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio;

public class Carro {
    private String nome;
    public static final double VELOCIDADE_LIMITE = 150;
    // usando o "final", uma vez executado mesmos sendo "private" ou "public" não pode ser mais modificado
    // uma constante tem que ser escrita toda em MAIÚSCULA e caso seja composta tem que ser separada por "_"

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
