package maratonajava.javacore.Aintroducaoclasses.test;

import maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Flávio";
        professor.idade = 32;
        professor.sexo = 'M';

        System.out.println("Nome:"+professor.nome+" Idade:"+professor.idade+" Sexo:"+professor.sexo);
    }
}
