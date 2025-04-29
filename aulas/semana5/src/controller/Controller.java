package controller;

public class Controller {
    public static void main(String[] args) {
        Gerente g1 = new Gerente("A", 1000);
        Cliente c1 = new Cliente("Joaõ", "Zinho", "SICR3", 1000);
        g1.setTicker("SICR3");
        g1.setQuantidade(1000);
        c1.setTicker("SICR3");
        c1.setQuantidade(1000);

    }
}
