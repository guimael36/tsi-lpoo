package model;

import java.time.LocalDateTime;

public class Locacao {
    private LocalDateTime dataHoraLocacao;
    private LocalDateTime dataHoraDevolucao;
    private int quilometragem;
    private double valor_caucao;
    private double valor_locacao;
    private boolean devolucao;

    // Construtor padrão
    public Locacao() {
    }

    // Construtor parametrizado
    public Locacao(LocalDateTime dataHoraLocacao, LocalDateTime dataHoraDevolucao, int quilometragem, double valor_caucao, double valor_locacao, boolean devolucao) {
        this.dataHoraLocacao = dataHoraLocacao;
        this.dataHoraDevolucao = dataHoraDevolucao;
        this.quilometragem = quilometragem;
        this.valor_caucao = valor_caucao;
        this.valor_locacao = valor_locacao;
        this.devolucao = devolucao;
    }

    // Construtor parametrizado com alterações
    public Locacao(LocalDateTime dataHoraLocacao, LocalDateTime dataHoraDevolucao) {
        this.dataHoraLocacao = dataHoraLocacao;
        this.dataHoraDevolucao = dataHoraDevolucao;
    }

    // Metodo toString()
    @Override
    public String toString() {
        return "\nLocacao{" +
                "dataHoraLocacao=" + dataHoraLocacao +
                ", dataHoraDevolucao=" + dataHoraDevolucao +
                ", quilometragem=" + quilometragem +
                ", valor_caucao=" + valor_caucao +
                ", valor_locacao=" + valor_locacao +
                ", devolucao=" + devolucao +
                '}';
    }

    // Getters e Setters
    public LocalDateTime getDataHoraLocacao() {
        return dataHoraLocacao;
    }

    public void setDataHoraLocacao(LocalDateTime dataHoraLocacao) {
        this.dataHoraLocacao = dataHoraLocacao;
    }

    public LocalDateTime getDataHoraDevolucao() {
        return dataHoraDevolucao;
    }

    public void setDataHoraDevolucao(LocalDateTime dataHoraDevolucao) {
        this.dataHoraDevolucao = dataHoraDevolucao;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    public double getValor_caucao() {
        return valor_caucao;
    }

    public void setValor_caucao(double valor_caucao) {
        this.valor_caucao = valor_caucao;
    }

    public double getValor_locacao() {
        return valor_locacao;
    }

    public void setValor_locacao(double valor_locacao) {
        this.valor_locacao = valor_locacao;
    }

    public boolean getDevolucao() {
        return devolucao;
    }

    public void setDevolucao(boolean devolucao) {
        this.devolucao = devolucao;
    }
}
