package academy.devdojo.maratonajava.javacore.Oexception.Exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    public static void main(String[] args) throws IOException {
        criarNovoArquivo();
    }

    private static void criarNovoArquivo() throws IOException{
        File file = new File("arquivo\\arquivo.txt");
            boolean isCreated = file.createNewFile();
            System.out.println("Arquivo criado " + isCreated);
        }
}
