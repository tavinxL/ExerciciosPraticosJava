package javacore.Minterfaces.dominio;

public class DatabaseLoader implements Dataloader, DataRemover {

    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do banco de dados");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissões no banco de dados");
    }

    public static void retrieveMaxDataSize() {
        System.out.println("Dentro do RetrieveMaxDataSize na classe DatabaseLoader");
        // Não é possivel sobrescrever um metodo estatico
    }
}
