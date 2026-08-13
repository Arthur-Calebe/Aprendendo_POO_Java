package academy.devdojo.maratonajava.javacore.Mintefaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemover{

    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados!");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do banco de dados!");
    }

    @Override
    public void checarPermissao() {
        System.out.println("Checando permissões no banco de dados!!");
    }
}
