package javacore.Eblocosinicializacao.test;

import javacore.Eblocosinicializacao.domain.Anime;

public class AnimeTest {
    static void main(String[] args) {
        Anime anime = new Anime();

        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio + " ");


        }
    }
}
