package maratonajava.javacore.Jmodificadorfinal.test;

import maratonajava.javacore.Jmodificadorfinal.domain.Carro;
import maratonajava.javacore.Jmodificadorfinal.domain.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Jeep");
        System.out.println(carro.COMPRADOR);

        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Vinicius");
        ferrari.imprime();
    }
}
