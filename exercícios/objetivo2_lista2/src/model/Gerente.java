package model;

public class Gerente extends Funcionario implements Investidor {
    private String ticker;
    private int QdeCotas;

    public Gerente() {
        super();
    }

    public Gerente(String nome, double salario, String ticker, int QdeCotas) {
        super(nome, salario);
        this.QdeCotas = QdeCotas;
        this.ticker = ticker;
    }

    @Override
    public double getBonus() {
        return 0;
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
    public int getQdeCotas() {
        return this.QdeCotas;
    }

    @Override
    public void setQdeCotas(int qdeCotas) {
        this.QdeCotas = qdeCotas;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                ", ticker='" + ticker + '\'' +
                ", QdeCotas=" + QdeCotas +
                '}' + "\n";
    }
}
