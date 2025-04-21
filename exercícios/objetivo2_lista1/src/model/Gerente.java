package model;

public class Gerente extends Funcionario {
    public Gerente() {
    }

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    // 1f
    public double getBonus(){
        return getSalario() * 0.2;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
