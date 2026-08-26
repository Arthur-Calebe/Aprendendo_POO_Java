package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

// Um exemplo de lançar uma exceção do tipo unchecked
public class RunTimeExceptionTest02 {
    public static void main(String[] args) {
        divisao(1, 0);
    }
    private static int divisao (int a, int b) {
        if (b == 0){
            throw new IllegalArgumentException("Divisão ilegal, não pode ser 0");
        }
        return a/b;
    }
     /*   try {
            return a/b;
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        return 0;
    }*/
}
// exceções do tipo RunTime o tratamento deles são opcionais
// Dois modos de lançar uma exceção
// isso vai dar uma exceção, pois divisão por 0 não existe
