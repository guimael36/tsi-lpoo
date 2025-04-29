package controller;
import java.util.*;
import model.*;

public class BancoController {
    public static void main(String[] args) {
        // c) Crie seis instâncias de cada classe do diagrama. Imprima estes objetos.
        Cliente c1 = new Cliente("Ana", "Alves", "AN4", 10);
        Cliente c2 = new Cliente("Bruno", "Bastos", "BRU", 20);
        Cliente c3 = new Cliente("Carlos", "Cruz", "CRL", 30);
        Cliente c4 = new Cliente("Deise", "Silva", "DEI", 40);
        Cliente c5 = new Cliente("Fernanda", "Fernandes", "FER", 50);
        Cliente c6 = new Cliente("Guilherme", "Amaral", "GUI", 60);

        Desenvolvedor d1 = new Desenvolvedor("Luiz", 1800.00);
        Desenvolvedor d2 = new Desenvolvedor("Marcelo", 1800.00);
        Desenvolvedor d3 = new Desenvolvedor("Nivaldo", 3500.00);
        Desenvolvedor d4 = new Desenvolvedor("Orlando", 3500.00);
        Desenvolvedor d5 = new Desenvolvedor("Patricia", 5500.00);
        Desenvolvedor d6 = new Desenvolvedor("Quevin", 5500.00);

        Gerente g1 = new Gerente("Alice", 5000.00, "ALI", 100);
        Gerente g2 = new Gerente("Bruce", 5000.00, "BRU", 200);
        Gerente g3 = new Gerente("Carlota", 5000.00, "CAR", 300);
        Gerente g4 = new Gerente("Dado", 7000.00, "DAD", 400);
        Gerente g5 = new Gerente("Feliz", 9000.00, "FEL", 800);
        Gerente g6 = new Gerente("Godofredo", 9000.00, "GOD", 800);

        System.out.println("Clientes:");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);

        System.out.println("\nDesenvolvedores:");
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
        System.out.println(d5);
        System.out.println(d6);

        System.out.println("\nGerentes:");
        System.out.println(g1);
        System.out.println(g2);
        System.out.println(g3);
        System.out.println(g4);
        System.out.println(g5);
        System.out.println(g6);

        // d) Crie coleções
        List<Investidor> Investidores = new ArrayList<>(); // se criam coleções apenas para os itens mais abstratos
        List<Funcionario> Funcionarios = new ArrayList<>();

        // e) Insira os objetos nas coleções. Imprima estas coleções.
        Investidores.add(c1);
        Investidores.add(c2);
        Investidores.add(c3);
        Investidores.add(c4);
        Investidores.add(c5);
        Investidores.add(c6);
        Investidores.add(g1);
        Investidores.add(g2);
        Investidores.add(g3);
        Investidores.add(g4);
        Investidores.add(g5);
        Investidores.add(g6);

        Funcionarios.add(g1);
        Funcionarios.add(g2);
        Funcionarios.add(g3);
        Funcionarios.add(g4);
        Funcionarios.add(g5);
        Funcionarios.add(g6);
        Funcionarios.add(d1);
        Funcionarios.add(d2);
        Funcionarios.add(d3);
        Funcionarios.add(d4);
        Funcionarios.add(d5);
        Funcionarios.add(d6);

        System.out.println("\nInvestidores:");
        System.out.println(Investidores);

        System.out.println("\nFuncionarios:");
        System.out.println(Funcionarios);

        // f) liste todos os funcionários cadastrados, ordenando-os pelo salário, em ordem decrescente;
        System.out.println("\nImpressão da coleção Funcionários ordenados pelo salário, em ordem decrescente: ");
        Funcionarios
                .sort(Comparator.comparing(Funcionario::getSalario)
                        .reversed());
        System.out.println(Funcionarios);

        // g) Liste todos os clientes cadastrados, ordenando-os pela quantidade de cotas, em ordem decrescente;
        System.out.println("\nImpressão de todos os clientes cadastrados, ordenando-os pela quantidade de cotas, em ordem decrescente:");
        Investidores
                .sort(Comparator.comparing(Investidor::getQdeCotas)
                        .reversed());
        for (Investidor i : Investidores) {
            if(i instanceof Cliente){ // faz o filtro para buscar somente instâncias da classe Clientes
                System.out.println(i);
            }
        }

        // h) A partir das coleções criadas, liste todos os investidores cadastrados, ordenando-os pela quantidade de cotas, em ordem decrescente;
        System.out.println("\nImpressão dos investidores cadastrados, ordenados pela quantidade de cotas, em ordem decrescente: ");
        Investidores
                .sort(Comparator.comparing(Investidor::getQdeCotas)
                        .reversed());
        System.out.println(Investidores);

        //i) A partir das coleções criadas, faça a aplicação imprimir os funcionários com o maior salário;
        System.out.println("\nImpressão dos funcionários com o maior salário:");
        Funcionario maiorSalario =
                Collections
                .max(Funcionarios, Comparator.comparing(Funcionario::getSalario)); // primeiro determina o maior
        for (Funcionario f : Funcionarios) {
            if(f.getSalario() >= maiorSalario.getSalario()) { // compara com o maior objeto da coleção
                System.out.print(f);
            }
        }

        //j) A partir das coleções criadas, faça a aplicação imprimir os investidores com o maior número de cotas.
        System.out.println("\nImpressão dos investidores com o maior número de cotas: ");
        Investidor maiorCotasCollections =
                Collections
                        .max(Investidores, Comparator.comparing(Investidor::getQdeCotas));

        for (Investidor i : Investidores) {
            if(i.getQdeCotas() == maiorCotasCollections.getQdeCotas()){
                System.out.println(i);
            }
        }
    }
}

