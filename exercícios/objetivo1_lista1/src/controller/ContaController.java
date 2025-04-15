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
    System.out.println("\n" + conta);
    System.out.println("\n" + conta2);
    System.out.println("\n" +conta3);
    System.out.println("\n" +conta4);
    System.out.println("\n" +conta5);
    System.out.println("\n" +conta6);

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

        System.out.println("\nForam depositados R$ 500 em cada conta. Saldo atual: ");

    // Getters para imprimir todos objetos
    System.out.println("Saldo: " + conta.getSaldo());
    System.out.println("Id: " + conta.getId());
    System.out.println("\nSaldo: " + conta2.getSaldo());
    System.out.println("Id: " + conta2.getId());
    System.out.println("\nSaldo: " + conta3.getSaldo());
    System.out.println("Id: " + conta3.getId());
    System.out.println("\nSaldo: " + conta4.getSaldo());
    System.out.println("Id: " + conta4.getId());
    System.out.println("\nSaldo: " + conta5.getSaldo());
    System.out.println("Id: " + conta5.getId());
    System.out.println("\nSaldo: " + conta6.getSaldo());
    System.out.println("Id: " + conta6.getId());

        // Exercício 2
        // Coleção do tipo List
        // Declarando a coleção
        List <Conta> contaList = new ArrayList<>();

        // Populando a coleção
        contaList.add(conta);
        contaList.add(conta2);
        contaList.add(conta3);
        contaList.add(conta4);
        contaList.add(conta5);
        contaList.add(conta6);

        // Imprimindo a coleção
        System.out.println("\nImprimindo a coleção recém populada:");
        System.out.println(contaList.toString());

        // Ordene a coleção em ordem decrescente, pelo critério id, e a imprima;
        System.out.println("\nImprimindo a coleção em ordem decrescente, pelo critério ID:");
            contaList.sort(Comparator.comparing(Conta::getId).reversed());
            System.out.println(contaList);

        // Faça uma pesquisa por força bruta na coleção e retorne o objeto de id = 3;
        System.out.println("\nImpressão da pesquisa por força bruta do objeto de id 3");
        for (Conta conta1 : contaList) {
            if (conta1.getId() == 3) {
                System.out.println(conta1);
            }
            break;
        }

        // Faça uma pesquisa binária na coleção e retorne o objeto de id = 3.
        contaList.sort(Comparator.comparing(Conta::getId));
        System.out.println(
                contaList.get(
                        Collections.binarySearch(
                                contaList,
                        new Conta(3, 1000.00),
                                Comparator.comparing(Conta::getId)
                        )
                )
        );

        // Coleção do tipo Map
        // Declarando a coleção
        Map<Integer, Conta> contaMap = new HashMap<>();

        // Populando a coleção
        contaMap.put(conta.getId(), conta);
        contaMap.put(conta2.getId(), conta2);
        contaMap.put(conta3.getId(), conta3);
        contaMap.put(conta4.getId(), conta4);
        contaMap.put(conta5.getId(), conta5);
        contaMap.put(conta6.getId(), conta6);

        // Imprime a coleção
        System.out.println("\nImprimindo a coleção Map");
        System.out.println(contaMap);

        // Pesquisa na coleção pelo ID
        System.out.println("\nImprimindo a pesquisa da coleção Map por ID");
        System.out.println(contaMap.get(conta3.getId()));
    }
}
