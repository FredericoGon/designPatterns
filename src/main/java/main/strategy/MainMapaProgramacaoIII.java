package main.strategy;

public class MainMapaProgramacaoIII {

    public static void main(String[] args) {
        March march = new March();
        Versa versa = new Versa();
        Kicks kicks = new Kicks();
        Sentra sentra = new Sentra();

        march.setNumeroPortas(4);
        System.out.println("O March possui " + march.getNumeroPortas() + " portas.");
        march.setCor("Azul");
        System.out.println("A cor do March é " + march.getCor() + ".");
        march.setModelo("2020");
        System.out.println("O modelos do March é " + march.getModelo() + ".");
        march.acelerar();

        versa.setNumeroPortas(5);
        System.out.println("O Versa possui " + versa.getNumeroPortas() + " portas.");
        versa.setCor("Verde");
        System.out.println("A cor do Versa é " + versa.getCor() + ".");
        versa.setTemMultimidia(true);
        versa.ligarMultimidia();
        versa.desligarMultimidia();
        versa.setTemMultimidia(false);
        versa.ligarMultimidia();
        versa.acelerar();

        kicks.setNumeroPortas(3);
        System.out.println("O Kicks possui " + kicks.getNumeroPortas() + " portas.");
        kicks.setCor("Verde");
        System.out.println("A cor do Kicks é " + kicks.getCor() + ".");
        kicks.setTemFarolDeMilha(true);
        kicks.ligarFarolDeMilha();
        kicks.desligarFarolDeMilha();
        kicks.acelerar();

        sentra.setNumeroPortas(4);
        System.out.println("O Sentra possui " + sentra.getNumeroPortas() + " portas.");
        sentra.setCor("Verde");
        System.out.println("A cor do Sentra é " + sentra.getCor() + ".");
        sentra.setTemTetoSolar(true);
        sentra.abrirTetoSolar();
        sentra.fecharTetoSolar();
        sentra.acelerar();
    }
}
