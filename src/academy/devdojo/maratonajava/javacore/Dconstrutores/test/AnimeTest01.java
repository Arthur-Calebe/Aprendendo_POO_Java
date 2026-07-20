package academy.devdojo.maratonajava.javacore.Dconstrutores.test;


import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Saitama","TV",12, "Ação", "SLA");
        // Aqui estou sobrepondo o nome de cima, inicializando outro.

        anime.imprime();

    }
}
