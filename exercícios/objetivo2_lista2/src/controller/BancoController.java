package controller;
import model.*;
import java.util.*;

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
        Gerente g5 = new Gerente("Feliz", 8000.00, "FEL", 800);
        Gerente g6 = new Gerente("Godofredo", 9000.00, "GOD", 600);

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
        List<Cliente> Clientes = new ArrayList<>();
        List<Desenvolvedor> Desenvolvedores = new ArrayList<>();
        List<Gerente> Gerentes = new ArrayList<>();
        List<Investidor> Investidores = new ArrayList<>();
        List<Funcionario> Funcionarios = new ArrayList<>();

        // e) Insira os objetos nas coleções. Imprima estas coleções.
        Clientes.add(c1);
        Clientes.add(c2);
        Clientes.add(c3);
        Clientes.add(c4);
        Clientes.add(c5);
        Clientes.add(c6);

        Desenvolvedores.add(d1);
        Desenvolvedores.add(d2);
        Desenvolvedores.add(d3);
        Desenvolvedores.add(d4);
        Desenvolvedores.add(d5);
        Desenvolvedores.add(d6);

        Gerentes.add(g1);
        Gerentes.add(g2);
        Gerentes.add(g3);
        Gerentes.add(g4);
        Gerentes.add(g5);
        Gerentes.add(g6);

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

        System.out.println("\nImpressão da coleção Clientes: ");
        for (Cliente c : Clientes) {
            System.out.println(c);
        }

        System.out.println("\nImpressão da coleção Desenvolvedores: ");
        for (Desenvolvedor d : Desenvolvedores) {
            System.out.println(d);
        }

        System.out.println("\nImpressão da coleção Gerentes: ");
        for (Gerente g : Gerentes) {
            System.out.println(g);
        }

        System.out.println("\nImpressão da coleção Investidores: ");
        for (Investidor i : Investidores) {
            System.out.println(i);
        }

        System.out.println("\nImpressão da coleção Funcionários: ");
        for (Funcionario f : Funcionarios){
            System.out.println(f);
        }

        // f) liste todos os funcionários cadastrados, ordenando-os pelo salário, em ordem decrescente;
        System.out.println("\nImpressão da coleção Funcionários ordenados pelo salário, em ordem decrescente: ");
        Funcionarios.sort(Comparator.comparingDouble(Funcionario::getSalario).reversed());
        for (Funcionario f : Funcionarios) {
            System.out.println(f);
        }

        // g) Liste todos os clientes cadastrados, ordenando-os pela quantidade de cotas, em ordem decrescente;
        System.out.println("\nImpressão de todos os clientes cadastrados, ordenando-os pela quantidade de cotas, em ordem decrescente:");
        Clientes.sort(Comparator.comparingInt(Cliente::getQdeCotas).reversed());
        for (Cliente c : Clientes) {
            System.out.println(c);
        }

        // h) A partir das coleções criadas, liste todos os investidores cadastrados, ordenando-os pela quantidade de cotas, em ordem decrescente;
        System.out.println("\nImpressão dos investidores cadastrados, ordenados pela quantidade de cotas, em ordem decrescente: ");
        Investidores.sort(Comparator.comparing(Investidor::getQdeCotas).reversed());
        for (Investidor i : Investidores) {
            System.out.println(i);
        }

        //i) A partir das coleções criadas, faça a aplicação imprimir o funcionário com o maior salário;
        System.out.println("\nImpressão dos funcionários com o maior salário:");
        Funcionario f_maior_salario = Collections.max(Funcionarios, Comparator.comparing(Funcionario::getSalario)); // primeiro determina o maior
        for (Funcionario f : Funcionarios) {
            if(f.getSalario() >= f_maior_salario.getSalario()) { // compara com o maior objeto da coleção
                System.out.print(f);
            }
        }

        //j) A partir das coleções criadas, faça a aplicação imprimir o investidor com o maior número de cotas.
        System.out.println("\n\nImpressão dos investidores com o maior número de cotas:");
        Investidor i_maior_quantidade_acoes = Collections.max(Investidores, Comparator.comparing(Investidor::getQdeCotas)); // determina o maior número
            for (Investidor i : Investidores) {
                if (i.getQdeCotas() >= i_maior_quantidade_acoes.getQdeCotas()) { // compara com o maior objeto da coleção
                    System.out.print(i);
                }
            }
    }
}
