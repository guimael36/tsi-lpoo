package model;

public class Cliente implements Associado {
    private String nome;
    private int qdeCotas; // recebe por implementar Associado

    public Cliente() {
    }

    public Cliente(String nome, int qdeCotas) {
        this.nome = nome;
        this.qdeCotas = qdeCotas;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public int getQdeCotas() {
        return this.qdeCotas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQdeCotas(int qdeCotas) {
        this.qdeCotas = qdeCotas;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", qdeCotas=" + qdeCotas +
                '}';
    }
}
