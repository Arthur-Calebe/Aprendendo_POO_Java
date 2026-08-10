package academy.devdojo.maratonajava.javacore.Mintefaces.test;

import academy.devdojo.maratonajava.javacore.Mintefaces.dominio.DatabaseLoader;
import academy.devdojo.maratonajava.javacore.Mintefaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        fileLoader.load();


        databaseLoader.remove();
        fileLoader.remove();
    }
}
