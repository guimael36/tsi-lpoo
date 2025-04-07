package model;

public class Modelo {
    private String descricao;

    // Construtor padrão
    public Modelo() {
    }

    // Construtor parametrizado
    public Modelo(String descricao) {
        this.descricao = descricao;
    }

    // Metodo toString()
    @Override
    public String toString() {
        return "Modelo{" +
                "descricao='" + descricao + '\'' +
                '}';
    }

    // Getters e Setters
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
