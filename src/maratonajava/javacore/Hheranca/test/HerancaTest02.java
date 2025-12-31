package maratonajava.javacore.Hheranca.test;

import maratonajava.javacore.Hheranca.domain.Funcionario;

public class HerancaTest02 {
    // 0 - Bloco de inicialização estático da super classe é executado quando a JVM  carregar classe pai
    // 1 - Bloco de inicialização estático da subclasse é executado quando a JVM  carregar classe filha
    // 2 - Alocado espaco em memória pro objeto da superclasse
    // 3 - Cada atributo de superclasse é criado e inicializado com valores default ou o que for passado
    // 4 - Bloco de inicialização da superclasse é executado na ordem em que aparece
    // 5 - Construtor é executado da superclasse
    // 6 - Alocado espaco em memória pro objeto da subclasse
    // 7 - Cada atributo de subclasse é criado e inicializado com valores default ou o que for passado
    // 8 - Bloco de inicialização da subclasse é executado na ordem em que aparece
    // 9 - Construtor é executado da subclasse
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Vinícius");
    }
}
