package maratonajava.javacore.Minterfaces.domain;

public interface DataLoader {
    public static final int MAX_DATA_SIZE = 10;
    void load();

    default void checkPermission(){
        System.out.println("Fazendo checagem de permissões");
    }

    public static void retrieveMaxDatabaseSize(){
        System.out.println("Dentro do retrieveMaxDataBaseSize na interface");
    }
}
