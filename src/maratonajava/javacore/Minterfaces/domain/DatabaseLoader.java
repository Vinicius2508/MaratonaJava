package maratonajava.javacore.Minterfaces.domain;

public class DatabaseLoader implements DataLoader, DataRemover {
    @Override
    public void load() {
        System.out.println("Carregando dados do Banco de Dados");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do Banco de Dados");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checking permission in database");
    }

    public static void retrieveMaxDatabaseSize(){
        System.out.println("Dentro do retrieveMaxDatabaseSize na classe DatabaseLoader");
    }
}
