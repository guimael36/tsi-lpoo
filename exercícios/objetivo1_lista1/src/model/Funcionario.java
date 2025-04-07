package model;

public class Funcionario {
    private String nome;
    private double salario;

    // Construtor padrão
    public Funcionario(){
    }

    // Construtor Parametrizado
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    // Construtor Parametrizado sem alguns itens
    public Funcionario(String nome) {
        this.nome = nome;
    }

    // Converte o objeto em string
    @Override
    public String toString() {
        return "Funcionario [nome=" + nome + ", salario=" + salario + "]";
    }

    // Getters e Setters
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
