package maratonajava.javacore.Npolimorfismo.test;

import maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
import maratonajava.javacore.Npolimorfismo.servico.RepositorioBancoDeDados;

import java.util.LinkedList;
import java.util.List;

public class RepositorioTest {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();

        List<String> list = new LinkedList<>();
        list.add("Entidade");
        list.add("Chave Primária");
        list.add("Chave Estrangeira");
        System.out.println(list);
    }
}
