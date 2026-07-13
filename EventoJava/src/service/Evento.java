package service;

import model.Palestrante;
import model.Empresas;
import model.Convidado;
import model.Visitante;

import java.util.ArrayList;
import java.util.List;

public class Evento {
    private String nomeEvento;
    private List<Palestrante> palestrantes;
    private List<Empresas> empresas;
    private List<Convidado> convidados;
    private List<Visitante> visitantes;

    public Evento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
        this.palestrantes = new ArrayList<>();
        this.empresas = new ArrayList<>();
        this.convidados = new ArrayList<>();
        this.visitantes = new ArrayList<>();
    }

    public void cadastrarPalestrante(Palestrante palestrante) {
        palestrantes.add(palestrante);
        System.out.println("Palestrante " + palestrante.getNome() + " cadastrado no evento.");
    }

    public void cadastrarEmpresa(Empresas empresa) {
        empresas.add(empresa);
        System.out.println("Empresa cadastrada no evento.");
    }

    public void cadastrarConvidado(Convidado convidado) {
        convidados.add(convidado);
        System.out.println("Convidado " + convidado.getNome() + " cadastrado no evento.");
    }

    public void cadastrarVisitante(Visitante visitante) {
        visitantes.add(visitante);
        System.out.println("Visitante " + visitante.getNome() + " cadastrado no evento.");
    }

    public void listarPalestrantes() {
        System.out.println("Palestrantes do evento " + nomeEvento + ":");
        for (int i = 0; i < palestrantes.size(); i++) {
            System.out.println("- " + palestrantes.get(i).getNome() + " (" + palestrantes.get(i).getTema() + ")");
        }
    }

    public int totalParticipantes() {
        return palestrantes.size() + convidados.size() + visitantes.size();
    }

    public String getNomeEvento() {
        return nomeEvento;
    }
}