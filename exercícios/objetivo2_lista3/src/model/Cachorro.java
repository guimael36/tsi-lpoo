package model;

public class Cachorro extends Animal { // Polimorfismo Ad Hoc, sobrecarga
    public Cachorro() {
    }

    public Cachorro(double x, double y) { // Polimorfismo Ad Hoc, sobrecarga
        super(x, y);
    }

    @Override // Polimorfismo Universal, sobreescrita
    public void desenhar() {
        System.out.println("\nDesenhou um cachorro.");
    }

    @Override // Polimorfismo Universal, sobreescrita
    public String toString() {
        return "Cachorro{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
