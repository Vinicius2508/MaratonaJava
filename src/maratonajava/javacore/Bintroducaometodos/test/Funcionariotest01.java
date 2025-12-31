package maratonajava.javacore.Bintroducaometodos.test;

import maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class Funcionariotest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Vinícius");
        funcionario.setIdade(19);
        funcionario.setSalarios(new double[]{1200, 1750.50, 2000});
        funcionario.imprime();
        System.out.println("Média: " + funcionario.getMedia());
    }
}
