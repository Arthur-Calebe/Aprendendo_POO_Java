package academy.devdojo.maratonajava.javacore.Mintefaces.dominio;

    // Criado para ser implementado | na classe 'interface' todos os métodos são 'public' e 'abstract'
public interface DataLoader {
    void load();

    default void checarPermissao(){
        System.out.println("Fazendo checagens de permissões");
    }
}
