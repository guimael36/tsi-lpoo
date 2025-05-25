package model;

public class ClientePessoaFisica extends Cliente {
    private String cpf;

    public ClientePessoaFisica(String cpf) {
        this.cpf = cpf;
    }

    public ClientePessoaFisica(String nome, String sobrenome, String email, String cpf, int quantidadeDeAcoes, double valorDaAcao) {
        super(nome, sobrenome, email, quantidadeDeAcoes, valorDaAcao);
        this.cpf = cpf;
    }


}
