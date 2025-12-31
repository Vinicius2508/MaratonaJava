package maratonajava.javacore.Eblocosinicializacao.test;

import maratonajava.javacore.Eblocosinicializacao.domain.Anime;

public class Animetest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        for (int episodio : anime.getEpisodio()) {
            System.out.print(episodio + " ");
        }
    }
}
