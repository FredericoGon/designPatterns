package main.strategy;

public class Kicks extends Carro implements IPossuiFarol {

    private boolean temFarolDeMilha = false;

    protected Kicks() {
        super(new Acelerar16());
    }

    @Override
    public void ligarFarolDeMilha() {
        if (temFarolDeMilha) {
            System.out.println("Farol de milha ligada com sucesso.");
        } else {
            System.out.println("Esse carro não possui farol de milha.");
        }
    }

    @Override
    public void desligarFarolDeMilha() {
        if (temFarolDeMilha) {
            System.out.println("Farol de milha desligada com sucesso.");
        } else {
            System.out.println("Esse carro não possui farol de milha.");
        }
    }

    public boolean isTemFarolDeMilha() {
        return temFarolDeMilha;
    }

    public void setTemFarolDeMilha(boolean temFarolDeMilha) {
        this.temFarolDeMilha = temFarolDeMilha;
    }
}
