package model;

public class Conta {
    private int id;
    private double saldo;

    // Construtor padrão
    public Conta(){
    }

    // Construtor Parametrizado
    public Conta(int id, double saldo){
        this.id = id;
        this.saldo = saldo;
    }

    // Construtor parametrizado sem alguns atributos
    public Conta(double saldo){
        this.saldo = saldo;
    }

    // Métodos
    public void deposita(double valor){
        this.saldo += valor;
    }

    public void saca(double valor) {
        double valorTemp = this.saldo - valor;
        if(valorTemp < 0) {
            System.out.println("Não há saldo suficiente para esse saque. Saldo= " + this.saldo);
            return;
        }
        this.saldo -= valor;
        System.out.println("Saque realizado com sucesso. Saldo atual= " + this.saldo);
    }

    public void atualiza(double taxa) {
        this.saldo += this.saldo * (taxa/100);
        System.out.println("Saldo atualizado pela taxa. Saldo atual=" + this.saldo);
    }

    // Getters e Setters
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Converte o objeto em string
    @Override
    public String toString() {
        return "Conta{" +
                "id=" + id +
                ", saldo=" + saldo +
                '}';
    }
}
