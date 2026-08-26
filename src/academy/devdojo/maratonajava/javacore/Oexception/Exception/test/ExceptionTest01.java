package academy.devdojo.maratonajava.javacore.Oexception.Exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        criarNovoArquivo();
    }

    private static void criarNovoArquivo(){
        File file = new File("arquivo\\arquivo.txt");
        try{
            boolean isCreated = file.createNewFile();
            System.out.println("Arquivo criado " + isCreated);
        }catch (IOException e) {
            // nunca deixe o bloco catch em branco, pq você está ignorando a exceção
            e.printStackTrace();
        }
    }
}
