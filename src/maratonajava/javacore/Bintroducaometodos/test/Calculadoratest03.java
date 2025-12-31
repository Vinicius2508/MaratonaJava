package maratonajava.javacore.Bintroducaometodos.test;

import maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class Calculadoratest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(20,10);
        System.out.println(result);
        System.out.println(calculadora.divideDoisNumeros(20,10));
        System.out.println("-------------");
        calculadora.imprimeDivisaoDeDoisNumeros(80,20);
    }
}
