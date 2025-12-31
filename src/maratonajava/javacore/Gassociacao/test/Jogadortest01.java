package maratonajava.javacore.Gassociacao.test;

import maratonajava.javacore.Gassociacao.domain.Jogador;

public class Jogadortest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Ronaldo");
        Jogador jogador2 = new Jogador("Romário");
        Jogador jogador3 = new Jogador("Cafu");

        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        for(Jogador jogador : jogadores){
            jogador.imprime();
        }
    }
}
