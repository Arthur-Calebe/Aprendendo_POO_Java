package model;

public class Visitante extends Pessoa{
    private int idade;


    public Visitante(String nome, String email, String telefone, int idade) {
        super(nome, email, telefone);
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
}
