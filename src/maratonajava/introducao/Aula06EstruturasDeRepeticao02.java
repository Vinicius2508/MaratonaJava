package maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        // Imprima todos os números pares de 0 até 1000000
        int count = 0;
        for (count=0;count<=100;count++) {
            if (count%2==0) {
                System.out.println(count);
            }
        }
    }
}
