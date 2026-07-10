package academy.devdojo.maratonajava.javacore.Csobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Naruto","TV",12, "Ação");
        // Pra não precisar usar o set para cada caracteristica, você utiliza o init

//        anime.setNome("Naruto Shipuden");
//        anime.setTipo("TV");
//        anime.setEpisodeos(12);
        anime.imprime();
    }
}
