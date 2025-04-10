package controller;

import model.Funcionario;

import java.util.*;

public class FuncionarioController {
    public static void main(String[] args) {
        // Crie duas instâncias de cada classe utilizando um construtor padrão;
        Funcionario funcionario = new Funcionario();
        Funcionario funcionario2 = new Funcionario();

        // Crie duas instâncias de cada classe utilizando um construtor parametrizado com todos os atributos
        Funcionario funcionario3 = new Funcionario(1, "João", 3000.00);
        Funcionario funcionario4 = new Funcionario(2, "Maria", 5000.00);

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
        funcionario.setId(1);
        funcionario.setNome("Matheus");
        funcionario.setSalario(2500.00);

        funcionario2.setId(2);
        funcionario2.setNome("Bruna");
        funcionario2.setSalario(3500.00);

        funcionario3.setId(3);
        funcionario3.setNome("Renato");
        funcionario3.setSalario(4500.00);

        funcionario4.setId(4);
        funcionario4.setNome("Carla");
        funcionario4.setSalario(5500.00);

        funcionario5.setNome("Flávio");

        funcionario6.setNome("Gustavo");

        // Getters para imprimir todos objetos
        System.out.println("Id: " + funcionario.getId());
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Salario: " + funcionario.getSalario());

        System.out.println("Id: " + funcionario2.getId());
        System.out.println("Nome: " + funcionario2.getNome());
        System.out.println("Salario: " + funcionario2.getSalario());

        System.out.println("Id: " + funcionario3.getId());
        System.out.println("Nome: " + funcionario3.getNome());
        System.out.println("Salario: " + funcionario3.getSalario());

        System.out.println("Id: " + funcionario4.getId());
        System.out.println("Nome: " + funcionario4.getNome());
        System.out.println("Salario: " + funcionario4.getSalario());

        System.out.println(funcionario5.getNome());

        System.out.println(funcionario6.getNome());

        // Adicione dois objetos do tipo coleção, um List e um Map
        List<Funcionario> funcionarioLista = new ArrayList<>();
        Map<Funcionario, Integer> funcionarioMapa = new HashMap<>();

        // Adicione na coleção todos os objetos criados no exercício 1
    }
}
