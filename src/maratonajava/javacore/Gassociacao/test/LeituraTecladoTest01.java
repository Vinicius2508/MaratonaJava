package maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraTecladoTest01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome abaixo:");
        String nome = scanner.nextLine();
        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();
        System.out.println("Digite seu sexo:[M / F]");
        char sexo = scanner.next().charAt(0);
        System.out.println("-----------------------");
        System.out.println("NOME: "+ nome);
        System.out.println("IDADE: "+ idade);
        System.out.println("SEXO: "+ sexo);

    }
}
