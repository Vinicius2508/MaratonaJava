package maratonajava.javacore.Aintroducaoclasses.test;

import maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class Carrotest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();

        carro.nome = "Fusca";
        carro.ano = 2005;
        carro.modelo = "Sport";

        carro2.nome = "Peugeot";
        carro2.ano = 2012;
        carro2.modelo = "Boxer";

        System.out.println(carro2.nome);
        System.out.println(carro.nome);
    }
}
