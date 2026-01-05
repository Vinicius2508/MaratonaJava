package maratonajava.javacore.Oexception.runtime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.concurrent.ExecutionException;

public class RuntimeExceptionTest04 {
    static void main() {
        try{
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e){
            System.out.println("Dentro do ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException");
        } catch (IndexOutOfBoundsException e){
            System.out.println("Dentro do IndexOutOfBoundsException");
        } catch (RuntimeException e) {
            System.out.println("Dentro do RuntimeException");
        }

        try {
            talvezLanceException();
        } catch (SQLException | FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private static void talvezLanceException() throws SQLException, FileNotFoundException {

    }
}
