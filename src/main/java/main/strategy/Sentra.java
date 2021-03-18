package main.strategy;

public class Sentra extends Carro implements IPossuiTetoSolar {

    private boolean temTetoSolar = false;

    protected Sentra() {
        super(new Acelerar20());
    }

    @Override
    public void abrirTetoSolar() {
        if (temTetoSolar) {
            System.out.println("Teto solar aberto com sucesso.");
        } else {
            System.out.println("Esse carro não possui teto solar.");
        }
    }

    @Override
    public void fecharTetoSolar() {
        if (temTetoSolar) {
            System.out.println("Teto solar fechado com sucesso.");
        } else {
            System.out.println("Esse carro não possui teto solar.");
        }
    }

    public boolean isTemTetoSolar() {
        return temTetoSolar;
    }

    public void setTemTetoSolar(boolean temTetoSolar) {
        this.temTetoSolar = temTetoSolar;
    }
}
