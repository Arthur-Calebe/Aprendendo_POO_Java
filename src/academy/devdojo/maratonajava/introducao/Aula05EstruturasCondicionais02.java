package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        int idade = 18;
        String categoria;

        System.out.println("---CATEGORIAS DE BASE---");
        if (idade < 15){
            categoria = "Categoria Infantil";
        }
        else if (idade >=15 && idade < 18){
            categoria = "Categoria Juvenil";
        }else {
            categoria = "Categoria profissional";
        }
        System.out.println(categoria);
    }
}
