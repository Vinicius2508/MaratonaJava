package maratonajava.javacore.Aintroducaoclasses.test;

import maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante.nome = "João";
        System.out.println("Nome: " + estudante.nome);
        System.out.println("Idade: " + estudante.idade + " anos");
        System.out.println("Sexo: " + estudante.sexo);

        System.out.println("---------------------");

        System.out.println("Nome: " + estudante2.nome);
        System.out.println("Idade: " + estudante2.idade + " anos");
        System.out.println("Sexo: " + estudante2.sexo);
    }
}
