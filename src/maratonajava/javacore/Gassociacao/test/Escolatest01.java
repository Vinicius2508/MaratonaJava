package maratonajava.javacore.Gassociacao.test;

import maratonajava.javacore.Gassociacao.domain.Escola;
import maratonajava.javacore.Gassociacao.domain.Professor;

public class Escolatest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Flávio");
        Professor professor2 = new Professor("Alex");
        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("Placidina", professores);

        escola.imprime();
    }
}
