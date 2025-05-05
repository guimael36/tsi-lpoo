package model;

public class Peixe extends Animal {
    private double z;

    public Peixe() { // Polimorfismo Ad Hoc, sobrecarga

    }

    public Peixe(double x, double y) { // Polimorfismo Ad Hoc, sobrecarga
        super(x, y);
    }

    public Peixe(double x, double y, double z) { // Polimorfismo Ad Hoc, sobrecarga
        super(x, y);
        this.z = z;
    }

    @Override // Polimorfismo Universal - Paramétrico (sobreescrita)
    public void desenhar() {
        System.out.println("\nDesenhou um peixe.");
    }

    public void mover3D (double x, double y, double z){ // Polimorfismo Ad Hoc, sobrecarga
        super.mover(x, y);
        this.z = z;
    };

    @Override // Polimorfismo Universal, sobreescrita
    public String toString() {
        return "Peixe{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
