package maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest03 {
    static void main() {
        abreConexao2();
    }

    private static String abreConexao(){
        try{
            System.out.println("Abrindo Arquivo");
            System.out.println("Escrevendo dados no arquivo");
            return "Conexão aberta";
        }catch (Exception e){
            e.printStackTrace();
        } finally {
            System.out.println("Fechando rescurso liberado no SO");
        }
        return null;
    }
    private static void abreConexao2(){
        try{
            System.out.println("Abrindo Arquivo");
            System.out.println("Escrevendo dados no arquivo");
            throw new RuntimeException();
        } finally {
            System.out.println("Fechando rescurso liberado no SO");
        }
    }

}
