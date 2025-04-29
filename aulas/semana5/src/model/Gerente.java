package model;

public class Gerente extends Funcionario implements Investidor {
    private String ticker;
    private int quantidade;

    public Gerente() {
    }

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    // 1f
    public double getBonus(){
        return getSalario() * 0.2;
    }


    @Override
    public String getTicker() {
        return this.ticker;
    }

    @Override
    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    @Override
    public int getQuantidade() {
        this.quantidade = quantidade;
    }

    @Override
    public void setQuantidade(int quantidade) {

    }

    @Override
    public String toString() {
        return "Gerente{" +
                "ticker='" + ticker + '\'' +
                ", quantidade=" + quantidade +
                ", nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
