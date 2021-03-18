package main.strategy;

public class March extends Carro {

    private String modelo;

    protected March() {
        super(new Acelerar10());
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
