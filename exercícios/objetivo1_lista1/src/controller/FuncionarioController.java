package controller;

import model.Funcionario;

public class FuncionarioController {
    public static void main(String[] args) {
        // Crie duas instâncias de cada classe utilizando um construtor padrão;
        Funcionario funcionario = new Funcionario();
        Funcionario funcionario2 = new Funcionario();

        // Crie duas instâncias de cada classe utilizando um construtor parametrizado com todos os atributos
        Funcionario funcionario3 = new Funcionario("João", 3000.00);
        Funcionario funcionario4 = new Funcionario("Maria", 5000.00);

        // Crie duas instâncias de cada classe utilizando uma variação do construtor parametrizado;
        Funcionario funcionario5 = new Funcionario("José");
        Funcionario funcionario6 = new Funcionario("Ana");

        // Imprima todos os objetos criados com os construtores utilizando o metodo toString();
        System.out.println(funcionario);
        System.out.println(funcionario2);
        System.out.println(funcionario3);
        System.out.println(funcionario4);
        System.out.println(funcionario5);
        System.out.println(funcionario6);

        // Setters para alterar o estado de cada objeto
        funcionario.setNome("Matheus");
        funcionario.setSalario(2500.00);

        funcionario2.setNome("Bruna");
        funcionario2.setSalario(3500.00);

        funcionario3.setNome("Renato");
        funcionario3.setSalario(4500.00);

        funcionario4.setNome("Carla");
        funcionario4.setSalario(5500.00);

        funcionario5.setNome("Flávio");

        funcionario6.setNome("Gustavo");

        // Getters para imprimir todos objetos
        System.out.println("Nome do Funcionário: " + funcionario.getNome());
        System.out.println("Salário do Funcionário: " + funcionario.getSalario());

        System.out.println("Nome do Funcionário: " + funcionario2.getNome());
        System.out.println("Salário do Funcionário: " + funcionario2.getSalario());

        System.out.println("Nome do Funcionário: " + funcionario3.getNome());
        System.out.println("Salário do Funcionário: " + funcionario3.getSalario());

        System.out.println("Nome do Funcionário: " + funcionario4.getNome());
        System.out.println("Salário do Funcionário: " + funcionario4.getSalario());

        System.out.println("Nome do Funcionário: " + funcionario5.getNome());

        System.out.println("Nome do Funcionário: " + funcionario6.getNome());
    }
}
