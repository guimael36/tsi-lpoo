package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Funcionario {
    private Long id;
    private String cpf;
    private String nome;
    private String sobrenome;
    private LocalDate dataDeNascimento;

    public Funcionario() {
    }

    public Funcionario(Long id, String cpf, String nome, String sobrenome, LocalDate dataDeNascimento) {
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataDeNascimento = dataDeNascimento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    @Override
    public String toString() {
        return "\nFuncionario{" +
                "id=" + id +
                ", cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", dataDeNascimento=" + DateTimeFormatter.ofPattern("dd/MM/yyyy").format(dataDeNascimento) +
                '}';
    }
}
