package main.strategy;

public abstract class Carro {

    private final IAcelerarStrategy acelerador;
    private int numeroPortas;
    private String cor;

    protected Carro(IAcelerarStrategy acelerador) {
        this.acelerador = acelerador;
    }

    public void acelerar() {
        this.acelerador.acelerar();
    }

    public void parar() {
        System.out.println("O carro freou bruscamente.");
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
