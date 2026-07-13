package model;

public class Empresas {
    private String cnpj;
    private int numStand;
    

    public Empresas(String cnpj, int numStand) {
        this.cnpj = cnpj;
        this.numStand = numStand;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    
}
