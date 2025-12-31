package maratonajava.javacore.Hheranca.test;

import maratonajava.javacore.Hheranca.domain.Endereco;
import maratonajava.javacore.Hheranca.domain.Funcionario;
import maratonajava.javacore.Hheranca.domain.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua Francisco");
        endereco.setCep("07818-036");

        Pessoa pessoa = new Pessoa("Lincoln");
        pessoa.setCpf("43104175686");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Vinícius");
        funcionario.setCpf("43209312309");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(1750.50);
        System.out.println("---------------");
        funcionario.imprime();
    }
}
