package academy.devdojo.maratonajava.javacore.Mintefaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemover{

    // Mais restritivo para o menos restritivo: modificador de acesso
    // private -> default -> protect -> public
    // Quando você sobrescrever um deles sempre tem que ser com um menos restritivo, nunca mais restritivo
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
