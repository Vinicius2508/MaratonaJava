package maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest02 {
    static void main() {
        divisao(1,0);
        System.out.println("Código finalizado");
    }

    /**
     *
     * @param a
     * @param b não pode ser zero
     * @return a/b
     * @throws IllegalArgumentException Caso b seja zero
     */
    private static int divisao(int a, int b){
        if (b == 0){
            throw new IllegalArgumentException("Argumento Inválido, Não existe divisão por zero.");
        }
        return a/b;
    }
}
