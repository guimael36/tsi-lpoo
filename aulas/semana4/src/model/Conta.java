package model;

public abstract class Conta { // marcar como abstrato impede que se criem objetos dessa classe
    protected double saldo;

    public Conta(){
    }

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposita(double valor){
        this.saldo += saldo;
    }

    public void saca(double valor){
        this.saldo -= saldo;
    }

    public void atualizaSaldo (double taxa){
        this.saldo += this.saldo * (taxa/100);
    }

    // Não necessita toString, pois a classe é abstrata
}
