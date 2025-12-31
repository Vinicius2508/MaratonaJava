package maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int age = (int) 10000000000L;
        long numeroGrande = 100000;
        double salaryDouble = 2000.0;
        float salaryFloat = 2500.0F;
        byte ageByte = -128;
        short ageShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'M';
        String name = "Vinícius";
        System.out.println("A idade é "+age+" anos");
        System.out.println(verdadeiro);
        System.out.println(salaryFloat);
        System.out.println("Oi meu nome é "+name);
    }
}
