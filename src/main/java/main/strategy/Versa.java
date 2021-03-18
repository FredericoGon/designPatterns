package main.strategy;

public class Versa extends Carro implements IPossuiMultimidia {

    private boolean temMultimidia = false;

    protected Versa() {
        super(new Acelerar16());
    }

    @Override
    public void ligarMultimidia() {
        if (temMultimidia) {
            System.out.println("Multimidia ligada com sucesso.");
        } else {
            System.out.println("Esse carro não possui Multimidia.");
        }
    }

    @Override
    public void desligarMultimidia() {
        if (temMultimidia) {
            System.out.println("Multimidia desligada com sucesso.");
        } else {
            System.out.println("Esse carro não possui Multimidia.");
        }
    }

    public boolean isTemMultimidia() {
        return temMultimidia;
    }

    public void setTemMultimidia(boolean temMultimidia) {
        this.temMultimidia = temMultimidia;
    }
}
