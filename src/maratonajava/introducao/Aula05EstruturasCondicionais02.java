package maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        // idade < 15 - Categoria Infantil
        // idade >= 15 && idade < 18 - Categoria Juvenil
        // idade >= 18 - Categoria Adulto
        int idade = 16;
        String categoria;
        if (idade < 15) {
            categoria = "Categoria Infantil";
        }else if(idade >= 15 && idade < 18){
            categoria = "Categoria Juvenil";
        }else{
            categoria = "Categoria Adulto";
        }
        System.out.println(categoria);
    }
}
