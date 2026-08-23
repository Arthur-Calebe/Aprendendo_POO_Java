package academy.devdojo.maratonajava.javacore.Oexception.error.test;

public class StackOverFlowTest01 {
    // .StackOverflowError - erro causado por ter estourado o limite da memória
    // Error é algo que acontece na JVM e você não vai conseguir arrumar em tempo de execução
    public static void main(String[] args) {
        recursividade();
    }

    public static void recursividade(){
        recursividade();
    }
}
