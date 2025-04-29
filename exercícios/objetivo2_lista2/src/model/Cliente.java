package model;

public class Cliente implements Investidor {
    private String nome;
    private String sobrenome;
    private String ticker;
    private int QdeCotas;

    public Cliente(){}

    public Cliente(String nome, String sobrenome, String ticker, int QdeCotas) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.ticker = ticker;
        this.QdeCotas = QdeCotas;
    }

    @Override
    public String getTicker() {
        return ticker;
    }

    @Override
    public void setTicker(String ticker) {

    }

    @Override
    public int getQdeCotas() {
        return QdeCotas;
    }

    @Override
    public void setQdeCotas(int QdeCotas) {

    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", ticker='" + ticker + '\'' +
                ", QdeCotas=" + QdeCotas +
                '}' + "\n";
    }
}
