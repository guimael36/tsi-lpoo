package controller;

import model.Locacao;

import java.time.LocalDateTime;

public class LocacaoController {
    public static void main(String[] args) {
        // Crie duas instâncias de cada classe utilizando um construtor padrão;
        Locacao locacao1 = new Locacao("2025-04-01-", );
        Locacao locacao2 = new Locacao();

        // Crie duas instâncias de cada classe utilizando um construtor parametrizado
        Locacao locacao3 = new Locacao();
        Locacao locacao4 = new Locacao();

        // Crie duas instâncias de cada classe utilizando uma variação do construtor parametrizado
        Locacao locacao5 = new Locacao();
        Locacao locacao6 = new Locacao();

        // Imprima todos os objetos criados com os construtores utilizando metodo toString();
        System.out.println(locacao1);
        System.out.println(locacao2);
        System.out.println(locacao3);
        System.out.println(locacao4);
        System.out.println(locacao5);
        System.out.println(locacao6);

        // Utilize os métodos setters para alterar o estado de cada objeto
        locacao1.setDataHoraLocacao();
        locacao1.setDataHoraDevolucao();
        locacao1.setQuilometragem();
        locacao1.setValor_caucao();
        locacao1.setValor_locacao();
        locacao1.setDevolucao();

        locacao2.setDataHoraLocacao();
        locacao2.setDataHoraDevolucao();
        locacao2.setQuilometragem();
        locacao2.setValor_caucao();
        locacao2.setValor_locacao();
        locacao2.setDevolucao();

        locacao3.setDataHoraLocacao();
        locacao3.setDataHoraDevolucao();
        locacao3.setQuilometragem();
        locacao3.setValor_caucao();
        locacao3.setValor_locacao();
        locacao3.setDevolucao();

        locacao4.setDataHoraLocacao();
        locacao4.setDataHoraDevolucao();
        locacao4.setQuilometragem();
        locacao4.setValor_caucao();
        locacao4.setValor_locacao();
        locacao4.setDevolucao();

        locacao5.setDataHoraLocacao();
        locacao5.setDataHoraDevolucao();
        locacao5.setQuilometragem();
        locacao5.setValor_caucao();
        locacao5.setValor_locacao();
        locacao5.setDevolucao();

        locacao6.setDataHoraLocacao();
        locacao6.setDataHoraDevolucao();
        locacao6.setQuilometragem();
        locacao6.setValor_caucao();
        locacao6.setValor_locacao();
        locacao6.setDevolucao();

        // Imprima todos objetos com Getters
        System.out.println(locacao1.getDataHoraLocacao());
        System.out.println(locacao1.getDataHoraDevolucao());
        System.out.println(locacao1.getQuilometragem());
        System.out.println(locacao1.getValor_caucao());
        System.out.println(locacao1.getValor_locacao());
        System.out.println(locacao1.getDevolucao());

        System.out.println(locacao2.getDataHoraLocacao());
        System.out.println(locacao2.getDataHoraDevolucao());
        System.out.println(locacao2.getQuilometragem());
        System.out.println(locacao2.getValor_caucao());
        System.out.println(locacao2.getValor_locacao());
        System.out.println(locacao2.getDevolucao());

        System.out.println(locacao3.getDataHoraLocacao());
        System.out.println(locacao3.getDataHoraDevolucao());
        System.out.println(locacao3.getQuilometragem());
        System.out.println(locacao3.getValor_caucao());
        System.out.println(locacao3.getValor_locacao());
        System.out.println(locacao3.getDevolucao());

        System.out.println(locacao4.getDataHoraLocacao());
        System.out.println(locacao4.getDataHoraDevolucao());
        System.out.println(locacao4.getQuilometragem());
        System.out.println(locacao4.getValor_caucao());
        System.out.println(locacao4.getValor_locacao());
        System.out.println(locacao4.getDevolucao());

        System.out.println(locacao5.getDataHoraLocacao());
        System.out.println(locacao5.getDataHoraDevolucao());
        System.out.println(locacao5.getQuilometragem());
        System.out.println(locacao5.getValor_caucao());
        System.out.println(locacao5.getValor_locacao());
        System.out.println(locacao5.getDevolucao());

        System.out.println(locacao6.getDataHoraLocacao());
        System.out.println(locacao6.getDataHoraDevolucao());
        System.out.println(locacao6.getQuilometragem());
        System.out.println(locacao6.getValor_caucao());
        System.out.println(locacao6.getValor_locacao());
        System.out.println(locacao6.getDevolucao());
    }
}
