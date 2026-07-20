package academy.devdojo.maratonajava.javacore.Dconstrutores.dominio;

public class Anime {
    private String tipo;
    private int episodeos;
    private String nome;
    private String genero;
    private String estudio;

    // um construtor não pode ter void
    public Anime(String nome, String tipo, int episodeos, String genero) {
        // Para criar um objeto eu obrigatóriamente preciso passar um argumento
        this(); //chama diretamente o construtor da linha 21
        this.nome = nome;
        this.tipo = tipo;
        this.episodeos = episodeos;
        this.genero = genero;
    }

    public Anime(String nome, String tipo, int episodeos, String genero, String estudio) {
        // Para criar um objeto eu obrigatóriamente preciso passar um argumento
        this(nome, tipo, episodeos, genero); //chama diretamente o construtor da linha 11 e só pode ser usado dentro de um construtor
        this.estudio = estudio;
    }

    public Anime() {
        System.out.println("Dentro do construtor sem argumentos");
    }

    public String getGenero() {

        return genero;
    }

    public void setGenero(String genero) {

        this.genero = genero;
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodeos);
        System.out.println(this.genero);
        System.out.println(this.estudio);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setEpisodeos(int episodeos) {
        this.episodeos = episodeos;
    }

    public int getEpisodeos() {
        return episodeos;
    }
}
