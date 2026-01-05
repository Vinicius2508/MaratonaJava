package maratonajava.javacore.Oexception.exception.test;

import maratonajava.javacore.Oexception.exception.domain.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoTest01 {
    static void main() {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            throw new RuntimeException(e);
        }
    }

    private static void logar() throws LoginInvalidoException {
        Scanner scanner = new Scanner(System.in);
        String usernameDB = "Vinicius";
        String passwordDB = "Senha123";
        System.out.println("Usuário");
        String usuarioDigitado = scanner.nextLine();
        System.out.println("Senha");
        String senhaDigitada = scanner.nextLine();
        if (!usuarioDigitado.equals(usernameDB) || !senhaDigitada.equals(passwordDB)){
            throw new LoginInvalidoException("Login ou senha Inválidos");
        }
        System.out.println("Login Efetuado");
    }
}
