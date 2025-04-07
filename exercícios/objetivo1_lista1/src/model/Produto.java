package model;

public class Produto {
    private String nome;
    private String descricao;
    private double valor;
    private int estoque;

    // Construtor padrão
    public Produto(){
    }

    // Construtor Parametrizado
    public Produto (String nome, String descricao, double valor, int estoque){
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.estoque = estoque;
    }

    // Construtor Parametrizado sem alguns itens
    public Produto (String nome, int estoque){
        this.nome = nome;
        this.estoque = estoque;
    }

    // Converte o objeto em string
    @Override
    public String toString(){
        return ", nome='" + nome + ", descricao='" + descricao + ", valor=" + valor + ", estoque=" + estoque + '}';
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
}
