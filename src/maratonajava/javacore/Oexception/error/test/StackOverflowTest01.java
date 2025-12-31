package maratonajava.javacore.Oexception.error.test;

public class StackOverflowTest01 {
    static void main() {
        recursividade();
    }

    public static void recursividade(){
        recursividade();
    }
}
