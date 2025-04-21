package model;

public class Desenvolvedor extends Funcionario {
    public Desenvolvedor() {
    }

    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    // 1f
    public double getBonus(){
        return getSalario() * 0.05;
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
