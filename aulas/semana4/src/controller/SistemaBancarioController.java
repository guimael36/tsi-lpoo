package controller;

import model.ContaCorrente;
import model.ContaPoupanca;
import model.ContaSalarioPoupanca;

public class SistemaBancarioController {
    public static void main(String[] args) {
        //Conta conta = new Conta(); -> não funciona, pois Conta é abstrato
        ContaPoupanca cp1 = new ContaPoupanca();
        ContaCorrente cc1 = new ContaCorrente();
        ContaPoupanca cp2 = new ContaPoupanca(2000);
        ContaCorrente cc2 = new ContaCorrente(2000);
        ContaSalarioPoupanca csp1 = new ContaSalarioPoupanca();

        System.out.println(cp1);
        System.out.println(cc1);
        System.out.println(cp2);
        System.out.println(cc2);
        System.out.println(csp1);

        cp1.deposita(1000.00);
        System.out.println(cp1);

        cp1.saca(500);
        System.out.println(cp1);
    }
}
