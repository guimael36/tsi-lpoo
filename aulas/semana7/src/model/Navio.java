package model;

public class Navio extends Personagem {
    @Override
    public void desenhar() {
        System.out.println("Desenhou um navio.");
    }

    public Navio() {
    }

    public Navio(double y, double x) {
        super(y, x);
    }

    @Override
    public String toString() {
        return "\nNavio{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
