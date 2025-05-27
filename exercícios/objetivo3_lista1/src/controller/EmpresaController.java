package controller;

import model.Empresa;
import model.Funcionario;

import java.time.LocalDate;
import java.util.Comparator;

public class EmpresaController {
    public static void main(String[] args) {
        //a. Crie um objeto da classe Empresa e dois objetos da classe Funcionário, e insira
        //valores válidos em seus atributos;
        Empresa empresa = new Empresa("Devs","Programadores SA", "000000001" );
        Funcionario funcionario1 = new Funcionario(1L, "00000000001", "Maria", "Silva", LocalDate.of(1990, 7, 15));
        Funcionario funcionario2 = new Funcionario(2L, "00000000002", "João", "Souza", LocalDate.parse("1985-03-20"));

        //b. Adicione todos os funcionários na empresa;
        empresa.getFuncionarios().add(funcionario1);
        empresa.getFuncionarios().add(funcionario2);

        //c. Imprima a lista de funcionários em ordem crescente, critério nome.
        System.out.println("-- Impressão da lista de funcionários em ordem crescente, critério nome: --");
        empresa.getFuncionarios().sort(Comparator.comparing(Funcionario::getNome));
        System.out.println(empresa);
        }
    }

