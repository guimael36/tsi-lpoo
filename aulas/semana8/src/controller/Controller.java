package controller;

import model.*;

import java.util.*;

public class Controller {
    public static void main(String[] args) {
        //1.3
        ClientePessoaFisica cpf = new ClientePessoaFisica("João", "Silva", "joao@email.com", "00000000001", 0, 0.00);
        ClientePessoaFisica cpf2 = new ClientePessoaFisica("Maria", "Silva", "maria@email.com", "00000000002", 1, 100.00);

        ClientePessoaJuridica cpj = new ClientePessoaJuridica("Pedro", "Silva", "pedro@email.com", "00000000003", 2, 200.00);
        ClientePessoaJuridica cpj2 = new ClientePessoaJuridica("Luiza", "Silva", "luiza@email.com", "00000000004", 3, 300.00);

        Vendedor vendedor = new Vendedor("Marcos" ,"Silva", 5000.00, 5.00, 4, 400.00);
        Vendedor vendedor2 = new Vendedor("Ana", "Silva", 5000.00, 5.00, 5, 500.00);

        Gerente gerente = new Gerente("Fábio", "Silva", 7000.00, 10.00, 6, 600.00);
        Gerente gerente2 = new Gerente("Mirella", "Silva", 7000.00, 10.00, 7, 700.00);

        //1.4
        System.out.println("\n--- 1.4 Impressão de objetos ---");
        System.out.println(cpf.toString());
        System.out.println(cpf2.toString());
        System.out.println(cpj.toString());
        System.out.println(cpj2.toString());
        System.out.println(vendedor.toString());
        System.out.println(vendedor2.toString());
        System.out.println(gerente.toString());
        System.out.println(gerente2.toString());

        //1.5
        List<Socio> socios = new ArrayList<>();

        socios.add(cpf);
        socios.add(cpf2);
        socios.add(cpj);
        socios.add(cpj2);

        socios.add(vendedor);
        socios.add(vendedor2);
        socios.add(gerente);
        socios.add(gerente2);

        System.out.println("\n--- 1.5 Impressão da coleção Socios: ---");
        System.out.println(socios);

        //1.6
        System.out.println("\n--- 1.6 Impressão da coleção ordenada por quantidade de ações, em ordem decrescente: ---");
        socios.sort(Comparator.comparing(Socio::getQuantidadeDeAcoes).reversed());
        System.out.println(socios);

        //1.7
        System.out.println("\n--- 1.7 Impressão dos objetos do tipo Vendedor: ---");
        for (Socio s : socios){
            if (s instanceof Vendedor){
                System.out.println(s);
            }
        }

        System.out.println("\n--- 1.7 Impressão dos objetos do tipo ClientePessoaFisica ---");
        for (Socio s : socios){
            if (s instanceof ClientePessoaFisica){
                System.out.println(s);
            }
        }

        System.out.println("\n--- 1.7 Impressão dos objetos do tipo Gerente ---");
        for (Socio s : socios){
            if (s instanceof Gerente){
                System.out.println(s);
            }
        }
    }
}
