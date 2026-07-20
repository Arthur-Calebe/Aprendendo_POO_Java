package academy.devdojo.maratonajava.javacore.Fmodificadorstatico.dominio;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 250;
    // static: faz a mudança ocorrer para todos os "carros".

    // um construtor para facilitar
    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    // para simplificar
    public void imprime() {
        System.out.println("-------------");
        System.out.println("Nome: "+ this.nome);
        System.out.println("Velocidade Maxima: "+ this.velocidadeMaxima);
        System.out.println("Velocidade Límite: "+ Carro.velocidadeLimite);
    }

    public static void setVelocidadeLimite(double velocidadeLimite){
    Carro.velocidadeLimite = velocidadeLimite;
    }

    public static double getVelocidadeLimite(){
        return Carro.velocidadeLimite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }


}
