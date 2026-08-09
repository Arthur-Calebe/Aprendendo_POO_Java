package academy.devdojo.maratonajava.javacore.Mintefaces.dominio;

public class DatabaseLoader implements DataLoader{

    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados!");
    }
}
