package model;

public class Palestrante extends Pessoa{
    private String tema;
    private String horario;

    public Palestrante(String nome, String email, String telefone, String tema, String horario) {
        super(nome, email, telefone);
        this.tema = tema;
        this.horario = horario;
    }

    public String getTema() {
        return tema;
    }

    public String getHorario() {
        return horario;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    
    
}
