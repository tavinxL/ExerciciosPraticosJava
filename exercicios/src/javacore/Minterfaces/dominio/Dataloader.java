package javacore.Minterfaces.dominio;

public interface Dataloader {
    public static final int MAX_DATA_SIZE = 10;
    // O atributo sempre vai ser constante na interface


    void load();

    default void checkPermission() {
        System.out.println("Fazendo checagem de permissão");
    }

    static void retrieveMaxDataSize() {
        System.out.println("Dentro do RetrieveMaxDataSize na interface");
    }
}
