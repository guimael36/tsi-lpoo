package model;

public class Carro {
    private String marca;
    private String modelo;
    private int anoFabricacao;

    // Construtor padrão
    public Carro(){
    }

    // Construtor Parametrizado
    public Carro(String marca, String modelo, int anoFabricacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
    }

    // Construtor Parametrizado sem alguns atributos
    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Getters e Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    // Converte o objeto em string
    @Override
    public String toString() {
        return "Carro{marca='" + marca + "', modelo='" + modelo + "', ano=" + anoFabricacao + "}";
    }
}
