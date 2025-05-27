package controller;

import model.Aluno;
import model.Disciplina;

import java.util.Comparator;

public class AlunoController {
    public static void main(String[] args) {
        // a. Crie dois objetos de cada classe, e insira valores válidos em seus atributos;
        Aluno aluno1 = new Aluno(1L, "João", "Silva");
        Aluno aluno2 = new Aluno(2L, "Maria", "Souza");

        Disciplina disciplina1 = new Disciplina(1L, "Lógica de Programação");
        Disciplina disciplina2 = new Disciplina(2L, "Banco de Dados");

        // b. Matricule cada um dos alunos nas duas disciplinas.
        aluno1.getDisciplinas().add(disciplina1);
        aluno1.getDisciplinas().add(disciplina2);
        aluno2.getDisciplinas().add(disciplina1);
        aluno2.getDisciplinas().add(disciplina2);

        // c. Imprima o relatório de disciplinas por aluno, em ordem crescente, critério nome
        // da disciplina.
        System.out.println("-- Relatório de disciplinas por aluno, em ordem crescente, por nome da disciplina: --");
        aluno1.getDisciplinas().sort(Comparator.comparing(Disciplina::getNome));
        System.out.println("Aluno: " + aluno1.getNome() + ", Matrícula: " + aluno1.getMatricula());
        System.out.println(aluno1.getDisciplinas());
        System.out.println("---------------------------");
        aluno2.getDisciplinas().sort(Comparator.comparing(Disciplina::getNome));
        System.out.println("Aluno: " + aluno2.getNome() + ", Matrícula: " + aluno2.getMatricula());
        System.out.println(aluno2.getDisciplinas());
    }
}
