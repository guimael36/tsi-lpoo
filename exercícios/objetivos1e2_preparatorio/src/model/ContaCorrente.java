package model;
import java.text.NumberFormat;

public class ContaCorrente extends Conta implements Associado {
    private int qdeCotas; // recebe por implementar Associado

    public ContaCorrente() {
    }

    public ContaCorrente(double saldo, int qdeCotas) {
        super(saldo);
        this.qdeCotas = qdeCotas;
    }


    @Override
    public void atualiza(double taxa) {
        this.saldo += this.saldo * (taxa/100);
    }

    @Override
    public int getQdeCotas() {
        return this.qdeCotas;
    }

    public void setQdeCotas(int qdeCotas) {
        this.qdeCotas = qdeCotas;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "qdeCotas=" + NumberFormat.getNumberInstance().format(this.qdeCotas) +
                ", saldo=" + NumberFormat.getCurrencyInstance().format(this.saldo) +
                '}';
    }
}
