package model;

public class Funcionario {
    private int id;
    private String nome;
    private double salario;

    // Construtor padrão
    public Funcionario(){
    }

    // Construtor Parametrizado
    public Funcionario(int id, String nome, double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    // Construtor Parametrizado sem alguns itens
    public Funcionario(String nome) {
        this.nome = nome;
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

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    // Converte o objeto em string
    @Override
    public String toString() {
        return "Funcionario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
