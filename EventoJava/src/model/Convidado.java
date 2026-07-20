package model;

public class Convidado extends Pessoa{
    private String funcao;

    
    public Convidado(String nome, String email, String telefone, String funcao) {
        super(nome, email, telefone);
        this.funcao = funcao;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    
}
