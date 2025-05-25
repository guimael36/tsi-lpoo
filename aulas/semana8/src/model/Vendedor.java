package model;

public class Vendedor extends Funcionario {
    private double taxaDeComissao;

    public Vendedor(){
    }

    public Vendedor(double taxaDeComissao) {
        this.taxaDeComissao = taxaDeComissao;
    }

    public Vendedor(String nome, String sobrenome, double salario, double taxaDeComissao, int quantidadeDeAcoes, double valorDaAcao) {
        super(nome, sobrenome, salario, quantidadeDeAcoes, valorDaAcao);
        this.taxaDeComissao = taxaDeComissao;
    }

    public double getTaxaDeComissao() {
        return taxaDeComissao;
    }

    public void setTaxaDeComissao(double taxaDeComissao) {
        this.taxaDeComissao = taxaDeComissao;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "taxaDeComissao=" + taxaDeComissao +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
