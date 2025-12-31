package maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraTecladoTest02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Previsão do Futuro");
        System.out.println("Digite a pergunta e responderei sim ou não!");
        String pergunta = input.nextLine();
        if (pergunta.charAt(0) == 'S'){
            System.out.println("SIM");
        } else {
            System.out.println("NÃO");
        }
    }
}
