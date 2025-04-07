package controller;

import model.Conta;

public class ContaController {
    public static void main(String[] args) {
    // Crie duas instâncias de cada classe utilizando um construtor padrão;
    Conta conta = new Conta();
    Conta conta2 = new Conta();

    // Crie duas instâncias de cada classe utilizando um construtor parametrizado com todos os atributos
    Conta conta3 = new Conta(1000.00);
    Conta conta4 = new Conta(2000.00);

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
    conta2.deposita(500.00);
    conta3.deposita(500.00);
    conta4.deposita(500.00);
    conta5.deposita(500.00);
    conta6.deposita(500.00);

    // Getters para imprimir todos objetos
    System.out.println(conta.getSaldo());
    System.out.println(conta2.getSaldo());
    System.out.println(conta3.getSaldo());
    System.out.println(conta4.getSaldo());
    System.out.println(conta5.getSaldo());
    System.out.println(conta6.getSaldo());
    }
}
