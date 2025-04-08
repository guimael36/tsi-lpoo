package controller;

import model.Conta;

import java.util.*;

public class ContaController {
    public static void main(String[] args) {
    // Crie duas instâncias de cada classe utilizando um construtor padrão;
    Conta conta = new Conta();
    Conta conta2 = new Conta();

    // Crie duas instâncias de cada classe utilizando um construtor parametrizado com todos os atributos
    Conta conta3 = new Conta(1, 1000.00);
    Conta conta4 = new Conta(2, 2000.00);

    // Crie duas instâncias de cada classe utilizando uma variação do construtor parametrizado;
    Conta conta5 = new Conta(3000.00);
    Conta conta6 = new Conta(4000.00);

    // Imprima todos os objetos criados com os construtores utilizando o metodo toString();
    System.out.println(conta);
    System.out.println(conta2);
    System.out.println(conta3);
    System.out.println(conta4);
    System.out.println(conta5);
    System.out.println(conta6);

    // Setters para alterar o estado de cada objeto
    conta.deposita(500.00);
    conta.setId(1);
    conta2.deposita(500.00);
    conta2.setId(2);
    conta3.deposita(500.00);
    conta3.setId(3);
    conta4.deposita(500.00);
    conta4.setId(4);
    conta5.deposita(500.00);
    conta5.setId(5);
    conta6.deposita(500.00);
    conta6.setId(6);

    // Getters para imprimir todos objetos
    System.out.println("Saldo: " + conta.getSaldo());
    System.out.println("Id: " + conta.getId());
    System.out.println("Saldo: " + conta2.getSaldo());
    System.out.println("Id: " + conta2.getId());
    System.out.println("Saldo: " + conta3.getSaldo());
    System.out.println("Id: " + conta3.getId());
    System.out.println("Saldo: " + conta4.getSaldo());
    System.out.println("Id: " + conta4.getId());
    System.out.println("Saldo: " + conta5.getSaldo());
    System.out.println("Id: " + conta5.getId());
    System.out.println("Saldo: " + conta6.getSaldo());
    System.out.println("Id: " + conta6.getId());

    // Adicione dois objetos do tipo coleção, um List e um Map
    List<Conta> contaLista = new ArrayList<>();
    Map<Integer, Conta> contaMapa = new HashMap<>();

    // Adicione na coleção todos os objetos criados no exercício 1
    }
}
