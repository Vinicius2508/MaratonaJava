package maratonajava.javacore.Oexception.exception.test;

import maratonajava.javacore.Oexception.exception.domain.Leitor1;
import maratonajava.javacore.Oexception.exception.domain.Leitor2;

import java.io.*;

public class TryWithResourcesTest01 {
    static void main() {
        lerArquivo();
    }
    public static void lerArquivo(){
        try (Leitor1 leitor1 = new Leitor1();
             Leitor2 leitor2 = new Leitor2()) {

        } catch (IOException e){

        }
    }

    public static void lerArquivo2(){
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null){
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
