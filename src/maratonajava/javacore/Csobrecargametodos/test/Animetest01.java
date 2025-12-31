package maratonajava.javacore.Csobrecargametodos.test;

import maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class Animetest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("One Piece", "Shonen", 1122, "Ação");
        anime.setNome("One Piece");
        anime.setTipo("Shonen");
        anime.setEpisodios(1122);
        anime.imprime();
    }
}
