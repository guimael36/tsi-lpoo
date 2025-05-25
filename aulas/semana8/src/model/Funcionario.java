package model;

public abstract class Funcionario implements Socio {
    protected String nome;
    protected String sobrenome;
    protected double salario;
    private int QuantidadeDeAcoes;
    private double ValorDaAcao;

    @Override
    public int getQuantidadeDeAcoes() {
        return 0;
    }

    @Override
    public double getValorDaAcao() {
        return 0;
    }

    public Funcionario() {
    }

    public Funcionario(String nome, String sobrenome, double salario, int quantidadeDeAcoes, double valorDaAcao) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
        QuantidadeDeAcoes = quantidadeDeAcoes;
        ValorDaAcao = valorDaAcao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setQuantidadeDeAcoes(int quantidadeDeAcoes) {
        QuantidadeDeAcoes = quantidadeDeAcoes;
    }

    public void setValorDaAcao(double valorDaAcao) {
        ValorDaAcao = valorDaAcao;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", salario=" + salario +
                ", QuantidadeDeAcoes=" + QuantidadeDeAcoes +
                ", ValorDaAcao=" + ValorDaAcao +
                '}';
    }
}
