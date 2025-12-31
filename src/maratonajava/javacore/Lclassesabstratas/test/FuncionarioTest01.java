package maratonajava.javacore.Lclassesabstratas.test;

import maratonajava.javacore.Lclassesabstratas.domain.Desenvolvedor;
import maratonajava.javacore.Lclassesabstratas.domain.Funcionario;
import maratonajava.javacore.Lclassesabstratas.domain.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nami", 7000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Sanji", 10000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
        gerente.imprime();
        desenvolvedor.imprime();
    }
}
