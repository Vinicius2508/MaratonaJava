package maratonajava.javacore.Bintroducaometodos.test;

import maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class Estudantetest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Maria";
        estudante01.idade = 18;
        estudante01.sexo = 'F';

        estudante02.nome = "Vinícius";
        estudante02.idade = 19;
        estudante02.sexo = 'M';

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);

        System.out.println("---------------------");

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);
    }
}
