package model;

public class Marca {
    private String descricao;

    // Construtor padrão
    public Marca() {
    }

    // Construtor parametrizado
    public Marca(String descricao) {
        this.descricao = descricao;
    }

    // Metodo toString()
    @Override
    public String toString() {
        return "Marca{" +
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
