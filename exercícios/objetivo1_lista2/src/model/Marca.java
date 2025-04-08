package model;

public class Marca {
    private int id;
    private String descricao;

    // Construtor padrão
    public Marca() {
    }

    // Construtor parametrizado
    public Marca(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    // Construtor parametrizado sem alguns dos atributos
    public Marca(String descricao) {
        this.descricao = descricao;
    }

    // Getters e Setters
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Metodo toString()
    @Override
    public String toString() {
        return "Marca{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
