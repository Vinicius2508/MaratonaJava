package maratonajava.javacore.Npolimorfismo.test;

import maratonajava.javacore.Npolimorfismo.domain.Computador;
import maratonajava.javacore.Npolimorfismo.domain.Produto;
import maratonajava.javacore.Npolimorfismo.domain.Tomate;
import maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;


public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Vaio Corei5", 7000);
        Tomate tomate = new Tomate("Tomate Italiano", 10);
        tomate.setDataValidade("10/11/2025");

        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("---------------------");
        CalculadoraImposto.calcularImposto(produto);
    }
}
