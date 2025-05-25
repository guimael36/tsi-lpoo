package model;

public class ClientePessoaJuridica extends Cliente {
    private String cnpj;

    public ClientePessoaJuridica(){
    }

    public ClientePessoaJuridica(String cnpj) {
        this.cnpj = cnpj;
    }

    public ClientePessoaJuridica(String nome, String sobrenome, String email, String cnpj, int quantidadeDeAcoes, double valorDaAcao) {
        super(nome, sobrenome, email, quantidadeDeAcoes, valorDaAcao);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "ClientePessoaJuridica{" +
                "cnpj='" + cnpj + '\'' +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
