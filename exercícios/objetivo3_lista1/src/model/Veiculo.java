package model;

public class Veiculo {
    private Long id;
    private String placa;
    private String modelo;
    private String fabricante;
    private String renavam;
    private Integer anoDeFabricacao;
    private Motorista motorista;

    public Veiculo() {
    }

    public Veiculo(Long id, String placa, String modelo, String fabricante, String renavam, Integer anoDeFabricacao, Motorista motorista) {
        this.id = id;
        this.placa = placa;
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.renavam = renavam;
        this.anoDeFabricacao = anoDeFabricacao;
        this.motorista = motorista;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getRenavam() {
        return renavam;
    }

    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }

    public Integer getAnoDeFabricacao() {
        return anoDeFabricacao;
    }

    public void setAnoDeFabricacao(Integer anoDeFabricacao) {
        this.anoDeFabricacao = anoDeFabricacao;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    @Override
    public String toString() {
        return "\nVeiculo{" +
                "id=" + id +
                ", placa='" + placa + '\'' +
                ", modelo='" + modelo + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", renavam='" + renavam + '\'' +
                ", anoDeFabricacao=" + anoDeFabricacao +
                ", motorista=" + motorista +
                '}';
    }
}
