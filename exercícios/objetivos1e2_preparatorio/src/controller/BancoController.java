package controller;
import model.*;
import java.util.*;

public class BancoController {
    public static void main(String[] args) {
        //c. Crie 3 instâncias de cada classe, insira valores válidos e imprima esses objetos;
        Cliente cliente = new Cliente("João", 500);
        Cliente cliente2 = new Cliente("Maria", 400);
        Cliente cliente3 = new Cliente("Pedro", 300);

        ContaCorrente contaCorrente = new ContaCorrente(5000.00, 200);
        ContaCorrente contaCorrente2 = new ContaCorrente(4000.00, 100);
        ContaCorrente contaCorrente3 = new ContaCorrente(3000.00, 50);

        ContaPoupanca contaPoupanca = new ContaPoupanca(2000.00);
        ContaPoupanca contaPoupanca2 = new ContaPoupanca(1000.00);
        ContaPoupanca contaPoupanca3 = new ContaPoupanca(500.00);

        System.out.println("--- Impressão dos valores inseridos para cada classe ---");
        System.out.println(cliente);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(contaCorrente);
        System.out.println(contaCorrente2);
        System.out.println(contaCorrente3);
        System.out.println(contaPoupanca);
        System.out.println(contaPoupanca2);
        System.out.println(contaPoupanca3);

        //d. Crie coleções com as contas registradas no sistema e os associados e as imprima;
        List<Conta> contas = new ArrayList<>();
        List<Associado> associados = new ArrayList<>();

        contas.add(contaCorrente);
        contas.add(contaCorrente2);
        contas.add(contaCorrente3);
        contas.add(contaPoupanca);
        contas.add(contaPoupanca2);
        contas.add(contaPoupanca3);

        associados.add(contaCorrente);
        associados.add(contaCorrente2);
        associados.add(contaCorrente3);
        associados.add(cliente);
        associados.add(cliente2);
        associados.add(cliente3);

        System.out.println("\n--- Imprimindo a coleção com as contas e associados: ---");
        System.out.println(contas);
        System.out.println(associados);

        //e. Movimente, pelo menos, uma conta poupança, realizando as seguintes operações: depósito
        //de R$ 1.000,00; atualização monetária de 5%; saque de R$ 1000,00. Imprima o objeto;
        contaPoupanca.deposita(1000.00);
        contaPoupanca.atualiza(50.00);
        contaPoupanca.saca(100.00);

        System.out.println("\n--- Imprimindo a Conta Poupança 1 após depositar e sacar ---");
        System.out.println(contaPoupanca);

        //f. Movimente, pelo menos, uma conta corrente, realizando as seguintes operações: depósito
        //R$ 1.000,00; atualização monetária de 10%; saque de R$ 1000,00. Imprima o objeto;
        contaCorrente.deposita(1000.00);
        contaCorrente.atualiza(100.00);
        contaCorrente.saca(1000.00);

        System.out.println("\n--- Imprimindo a Conta Corrente 1 após depositar e sacar ---");
        System.out.println(contaCorrente);

        //g. Faça com que cada associado tenha as seguintes quantidades de cotas, nessa ordem: 100,
        //400, 600, 300, 600, 600, e imprima a coleção de associados;
        contaCorrente.setQdeCotas(100);
        contaCorrente2.setQdeCotas(400);
        contaCorrente3.setQdeCotas(600);
        cliente.setQdeCotas(300);
        cliente2.setQdeCotas(600);
        cliente3.setQdeCotas(600);

        System.out.println("\n--- Imprimindo a coleção Associados após modificar as cotas: ---");
        System.out.println(associados);

        //h. Imprima todos os associados, ordenados pelo critério de número de cotas, em ordem
        //decrescente. Calcule e imprima os associados com maior número de cotas;
        associados.sort(Comparator.comparing(Associado::getQdeCotas).reversed());
        System.out.print("\n--- Associados ordenados por quantidade de cotas, em ordem decrescente: ---\n");
        System.out.println(associados);

        System.out.print("\n--- Associados com o maior número de cotas: ---\n");
        double maxQdeCotas = // atribui a variável o maior elemento da lista
                Collections.max // retorna o maior elemento da lista
                        (associados,
                                Comparator.comparing(Associado::getQdeCotas)).getQdeCotas();
        for (Associado a : associados) {
            if(a.getQdeCotas() == maxQdeCotas){ // verifica se o número de cotas é igual ao encontrado antes
                System.out.print(a + "\n");
            }
        }

        //i. Imprima todas as contas, ordenadas pelo critério saldo, em ordem decrescente.
        //Imprima todos associados que sejam do tipo Associado e possuam conta cadastrada.
        //Imprima a lista de contas com maior saldo bancário.
        contas.sort(Comparator.comparing(Conta::getSaldo).reversed());
        System.out.println("\n--- Imprimindo todas as contas, pelo saldo, em ordem decrescente: ---");
        System.out.println(contas);

        System.out.println("\n--- Imprimindo todos associados que possuem conta cadastrada: ---");
        for (Associado a : associados) {
            if (a instanceof Conta){
                System.out.println(a);
            }
        }

        System.out.println("\n--- Imprimindo a lista de contas com o maior saldo: ---");
        Conta maiorSaldo = contas.stream()
                .max(Comparator.comparing(Conta::getSaldo))
                .get();
        for(Conta conta : contas) {
            if(conta.getSaldo() >= maiorSaldo.getSaldo()) {
                System.out.print(conta);
            }
        }
    }
}
