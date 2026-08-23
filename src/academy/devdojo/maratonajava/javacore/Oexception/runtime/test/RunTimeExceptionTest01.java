package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RunTimeExceptionTest01 {
    public static void main(String[] args) {
        // RunTimeException costuma ser um erro de desenvolvimento
        //Checked e Unchecked
        // Unchecked você não precisa obrigatoriamente fazer um tratamento já as checked é obrigatório

        int[] nums = {1, 2};
        System.out.println(nums[2]);
        // Exemplo de um erro de desenvolvimento
    }
}
