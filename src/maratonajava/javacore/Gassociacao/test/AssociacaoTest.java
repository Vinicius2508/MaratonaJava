package maratonajava.javacore.Gassociacao.test;

import maratonajava.javacore.Gassociacao.domain.Aluno;
import maratonajava.javacore.Gassociacao.domain.Local;
import maratonajava.javacore.Gassociacao.domain.Professor;
import maratonajava.javacore.Gassociacao.domain.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        Local local = new Local("Rua das Laranjeiras");
        Aluno aluno = new Aluno("Higor", 17);
        Professor professor = new Professor("Terigi", "Banco de Dados");
        Aluno[] alunosParaSeminario = {aluno};
        Seminario seminario = new Seminario("Tipos de chaves no Banco", alunosParaSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }
}
