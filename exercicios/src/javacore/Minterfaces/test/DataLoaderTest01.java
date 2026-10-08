package javacore.Minterfaces.test;

import javacore.Minterfaces.dominio.DatabaseLoader;
import javacore.Minterfaces.dominio.Dataloader;
import javacore.Minterfaces.dominio.Fileloader;

public class DataLoaderTest01 {
     static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        Fileloader fileloader = new Fileloader();

        databaseLoader.load();
        fileloader.load();

        System.out.println();

        databaseLoader.remove();
        fileloader.remove();

        System.out.println();

        databaseLoader.checkPermission();
        fileloader.checkPermission();

        System.out.println();

        DatabaseLoader.retrieveMaxDataSize();
        Dataloader.retrieveMaxDataSize();
    }
}
