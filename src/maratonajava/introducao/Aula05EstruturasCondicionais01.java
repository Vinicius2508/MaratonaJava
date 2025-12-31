package maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizado = idade >= 18;
        if (isAutorizado) {
            System.out.println("Autorizado a comprar bebida");
        }else {
            System.out.println("Não autorizado a comprar bebida");
        }
    }
}
