package model;

public class Submarino extends Personagem {
    @Override
    public void desenhar() {
        System.out.println("Desenhou um submarino.");
    }

    public Submarino() {
    }

    public Submarino(double y, double x) {
        super(y, x);
    }

    @Override
    public String toString() {
        return "\nSubmarino{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
