package model;

public class Empresas {
    private String cnpj;
    private String nomeEmpresa;
    private int numStand;
    
    public Empresas(String cnpj, int numStand, String nomeEmpresa) {
        this.cnpj = cnpj;
        this.numStand = numStand;
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public int getNumStand() {
        return numStand;
    }

    public void setNumStand(int numStand) {
        this.numStand = numStand;
    }

    
}
