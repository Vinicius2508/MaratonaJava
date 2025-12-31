package maratonajava.javacore.Gassociacao.test;

import maratonajava.javacore.Gassociacao.domain.Jogador;
import maratonajava.javacore.Gassociacao.domain.Time;

public class Jogadortest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Yuri Alberto");
        Time time = new Time("Corinthians");

        jogador1.setTime(time);
        
        jogador1.imprime();
    }
}
