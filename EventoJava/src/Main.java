import model.Palestrante;
import model.Convidado;
import model.Empresas;
import model.Visitante;
import service.Evento;

public class Main {
    public static void main(String[] args) {

        Evento evento = new Evento("Semana de Tecnologia 2026");

        Palestrante p1 = new Palestrante(
            "Ana Silva", "ana@email.com", "11999999999", "Inteligência Artificial", "14h"
        );

        Convidado c1 = new Convidado(
            "Carlos Souza", "carlos@email.com", "11988888888", "VIP"
        );

        Visitante v1 = new Visitante(
            "Fernanda Lima", "fernanda@email.com", "11977777777", 23
        );

        Empresas empresa1 = new Empresas("xxxxxxx", 23, "Itáu");

        evento.cadastrarPalestrante(p1);
        evento.cadastrarConvidado(c1);
        evento.cadastrarVisitante(v1);
        evento.cadastrarEmpresa(empresa1);

        evento.listarPalestrantes();

        System.out.println("Total de participantes: " + evento.totalParticipantes());
    }
}