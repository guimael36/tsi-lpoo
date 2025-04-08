package model;

public class Modelo {
    private int id;
    private String descricao;

    // Construtor padrão
    public Modelo() {
    }

    // Construtor parametrizado
    public Modelo(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    // Construtor parametrizado sem alguns atributos
    public Modelo(String descricao) {
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
        return "Modelo{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
