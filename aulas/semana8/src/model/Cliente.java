package model;

public abstract class Cliente implements Socio {
    protected String nome;
    protected String sobrenome;
    protected String email;
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

    public Cliente() {
    }

    public Cliente(String nome, String sobrenome, String email, int quantidadeDeAcoes, double valorDaAcao) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        QuantidadeDeAcoes = quantidadeDeAcoes;
        ValorDaAcao = valorDaAcao;
    }

    public void setValorDaAcao(int valorDaAcao) {
        ValorDaAcao = valorDaAcao;
    }

    public void setQuantidadeDeAcoes(int quantidadeDeAcoes) {
        QuantidadeDeAcoes = quantidadeDeAcoes;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", email='" + email + '\'' +
                ", QuantidadeDeAcoes=" + QuantidadeDeAcoes +
                ", ValorDaAcao=" + ValorDaAcao +
                '}';
    }
}
