package model;

public class Aviao extends Personagem {
    private double z;

    public Aviao(){}

    public Aviao(double z, double y) {
        super(z, y);
    }

    public Aviao(double y, double x, double z) {
        super(y, x);
        this.z = z;
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhou um avião.");
    }

    public void mover3D (double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return "\nAviao{" +
                "z=" + z +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
