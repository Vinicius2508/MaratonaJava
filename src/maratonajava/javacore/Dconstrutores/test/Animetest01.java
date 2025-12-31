package maratonajava.javacore.Dconstrutores.test;

import maratonajava.javacore.Dconstrutores.dominio.Anime;

public class Animetest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("One Piece", "Shonen", 1122, "Ação", "Production IG");
        anime.imprime();
    }
}
