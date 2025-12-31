package maratonajava.javacore.Npolimorfismo.test;

import maratonajava.javacore.Npolimorfismo.domain.Computador;
import maratonajava.javacore.Npolimorfismo.domain.Produto;
import maratonajava.javacore.Npolimorfismo.domain.Tomate;


public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Vaio Corei5", 7000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());
        System.out.println("------------------------");

        Produto produto2 = new Tomate("Tomate Italiano", 10);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());


    }
}
