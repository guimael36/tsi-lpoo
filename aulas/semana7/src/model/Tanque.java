package model;

public class Tanque extends Personagem {
    public Tanque() {
    }

    public Tanque(double y, double x) {
        super(y, x);
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhou um tanque.");
    }

    @Override
    public String toString() {
        return "\nTanque{" +
                "y=" + y +
                ", x=" + x +
                '}';
    }
}
