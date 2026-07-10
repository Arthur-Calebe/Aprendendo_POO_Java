package dominio;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private boolean disponibilidade;

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.disponibilidade = true;

        if (anoPublicacao > 2026) {
            System.out.println("Ano de publicação inválido!");
            this.anoPublicacao = 0;
        } else {
            this.anoPublicacao = anoPublicacao;
        }
    }

    public void emprestar(){
        if (disponibilidade){
            disponibilidade = false;
            System.out.println("Livro " + titulo + " emprestado com sucesso!!");
        }else {
            System.out.println("Livro " + titulo + " não esta disponivel");
        }
    }

    public void devolver(){
        disponibilidade = true;
        System.out.println("Livro " + titulo + " devolvido com sucesso");
    }


    public void imprime(){
        System.out.println(this.titulo);
        System.out.println(this.autor);
        System.out.println(this.anoPublicacao);
        System.out.println(this.disponibilidade);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

}
