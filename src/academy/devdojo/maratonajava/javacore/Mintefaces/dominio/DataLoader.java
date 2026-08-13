package academy.devdojo.maratonajava.javacore.Mintefaces.dominio;

    // Criado para ser implementado | na classe 'interface' todos os métodos são 'public' e 'abstract'
public interface DataLoader {

    // Todos os atributos em uma inteface são constantes
    public static final int MAX_SIZE = 10;
    void load();

    // por ser "Default" é necessário fazer uma implementação
    default void checarPermissao(){
        System.out.println("Fazendo checagens de permissões");
    }
}
