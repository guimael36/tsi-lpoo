package controller;

import model.*;

import java.text.NumberFormat;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 1c
        Desenvolvedor d1 = new Desenvolvedor();
        Desenvolvedor d2 = new Desenvolvedor("João", 2000.00);
        Gerente g1 = new Gerente();
        Gerente g2 = new Gerente("José", 3000.00);

        // 1d
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(g1);
        System.out.println(g2);

        // 1e
        d1.setNome("\nAna");
        d1.setSalario(2000.00);
        d2.setNome("\nBruna");
        d2.setSalario(2500.00);
        g1.setNome("\nMateus");
        g1.setSalario(3500.00);
        g2.setNome("\nMirella");
        g2.setSalario(5000.00);

        System.out.println(d1.getNome());
        System.out.println(d1.getSalario());
        System.out.println(d2.getNome());
        System.out.println(d2.getSalario());
        System.out.println(g1.getNome());
        System.out.println(g1.getSalario());
        System.out.println(g2.getNome());
        System.out.println(g2.getSalario());

        //1f. Faça o programa retornar o bônus de cada um dos funcionários, seguindo a seguinte regra: para Gerente = 20%, e para Desenvolvedor = 5%. Imprima-os
        System.out.print("\nBônus de cada funcionário: \n");
        System.out.print(d1);
        System.out.println("\nBônus = " + d1.getBonus());
        System.out.print(d2);
        System.out.println("\nBônus = " + d2.getBonus());
        System.out.print(g1);
        System.out.println("\nBônus = " + g1.getBonus());
        System.out.print(g2);
        System.out.println("\nBônus = " + g2.getBonus());

        // 1g
        // 1. Foi possível criar instâncias da classe Funcionario?
        // Não é possível criar objetos na classe Funcionario pois ela é abstrata.

        // 2. Onde você inseriu as regras de negócio solicitadas na questão “f”? Na classe Controller? Na classe Funcionário? Ou nas classes Gerente e Desenvolvedor?
        // Nas classes modelo Gerente e Desenvolvedor.

        // 2a
        List<Funcionario> funcionarios = new ArrayList<>();

        // 2b. Acrescente na coleção criada no item “a” vinte funcionários, sendo, 2 gerentes e 18 desenvolvedores.
        /* 2b.i */ Gerente ger1 = new GerenteGeral("A", 6500.00);
        /* 2b.ii */ Gerente ger2 = new GerenteDesenvolvimento("B", 4500.00);

        // 2b.iii
        Desenvolvedor dev1 = new DesenvolvedorSenior("C", 4500.00);
        Desenvolvedor dev2 = new DesenvolvedorSenior("D", 4500.00);
        Desenvolvedor dev3 = new DesenvolvedorSenior("E", 4500.00);
        Desenvolvedor dev4 = new DesenvolvedorSenior("F", 4500.00);
        Desenvolvedor dev5 = new DesenvolvedorSenior("G", 4500.00);
        Desenvolvedor dev6 = new DesenvolvedorSenior("H", 4500.00);
        Desenvolvedor dev7 = new DesenvolvedorPleno("I", 2500.00);
        Desenvolvedor dev8 = new DesenvolvedorPleno("J", 2500.00);
        Desenvolvedor dev9 = new DesenvolvedorPleno("K", 2500.00);
        Desenvolvedor dev10 = new DesenvolvedorPleno("L", 2500.00);
        Desenvolvedor dev11 = new DesenvolvedorPleno("M", 2500.00);
        Desenvolvedor dev12 = new DesenvolvedorPleno("N", 2500.00);
        Desenvolvedor dev13 = new DesenvolvedorJunior("O", 1800.00);
        Desenvolvedor dev14 = new DesenvolvedorJunior("P", 1800.00);
        Desenvolvedor dev15 = new DesenvolvedorJunior("Q", 1800.00);
        Desenvolvedor dev16 = new DesenvolvedorJunior("R", 1800.00);
        Desenvolvedor dev17 = new DesenvolvedorJunior("S", 1800.00);
        Desenvolvedor dev18 = new DesenvolvedorJunior("T", 1800.00);

        funcionarios.add(ger1);
        funcionarios.add(ger2);
        funcionarios.add(dev1);
        funcionarios.add(dev2);
        funcionarios.add(dev3);
        funcionarios.add(dev4);
        funcionarios.add(dev5);
        funcionarios.add(dev6);
        funcionarios.add(dev7);
        funcionarios.add(dev8);
        funcionarios.add(dev9);
        funcionarios.add(dev10);
        funcionarios.add(dev11);
        funcionarios.add(dev12);
        funcionarios.add(dev13);
        funcionarios.add(dev14);
        funcionarios.add(dev15);
        funcionarios.add(dev16);
        funcionarios.add(dev17);
        funcionarios.add(dev18);
        System.out.print("\n\nFuncionários cadastrados na empresa: \n" + funcionarios);

        //2c. Calcule e imprima qual é a folha salarial dessa empresa, COM bônus;
        double total_folha_com_bonus = 0.0;
        for (Funcionario funcionario : funcionarios) { //forEach percorrendo toda coleção de objetos
            total_folha_com_bonus += funcionario.getSalario() + funcionario.getBonus(); // soma cada salário com os bônus e atribui a variável total
        }
        System.out.println("\n\nTotal da Folha COM Bônus:");
        System.out.println(NumberFormat.getCurrencyInstance().format(total_folha_com_bonus));

        //2d. Calcule e imprima qual é a folha salarial dessa empresa, SEM bônus;
        double total_folha_sem_bonus = 0.0;
        for (Funcionario funcionario : funcionarios) {
            total_folha_sem_bonus += funcionario.getSalario();
        }
        System.out.println("\n\nTotal da Folha SEM Bônus:");
        System.out.println(NumberFormat.getCurrencyInstance().format(total_folha_sem_bonus));

        //2e. Calcule e imprima o valor do bônus e o salário bruto de cada um dos funcionários dessa empresa;
        System.out.print("\n\nSalário bruto, bônus e salário de cada funcionário:");
        for(Funcionario f : funcionarios) {
            double salarioBruto = f.getSalario() + f.getBonus();
            System.out.println("\nFuncionário: " + f.getNome());
            System.out.println("Cargo: " + f.getClass().getSimpleName());
            System.out.println("Salário= " + NumberFormat.getCurrencyInstance().format(f.getSalario()));
            System.out.println("Bônus= " + NumberFormat.getCurrencyInstance().format(f.getBonus()));
            System.out.println("Salário bruto= " + NumberFormat.getCurrencyInstance().format(salarioBruto));
        }

        //2f. Calcule e imprima a nova folha salarial dessa empresa, caso todos os funcionários, independente de cargo, tenham um reajuste salarial de 5%.
        total_folha_com_bonus = 0.0;
        for(Funcionario f : funcionarios){
            f.setSalario(f.getSalario() + (f.getSalario() * 0.05));
            total_folha_com_bonus += f.getSalario() + f.getBonus();
        }
        System.out.println("\n\nTotal da nova folha com reajuste salarial de 5%:");
        System.out.println(NumberFormat.getCurrencyInstance().format(total_folha_com_bonus));
    }
}