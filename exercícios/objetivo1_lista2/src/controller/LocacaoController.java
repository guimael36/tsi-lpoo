package controller;

import model.Locacao;

import java.time.LocalDateTime;
import java.util.*;

public class LocacaoController {
    public static void main(String[] args) {
        // Crie duas instâncias de cada classe utilizando um construtor padrão;
        Locacao locacao1 = new Locacao();
        Locacao locacao2 = new Locacao();

        // Crie duas instâncias de cada classe utilizando um construtor parametrizado
        Locacao locacao3 = new Locacao(
                1, LocalDateTime.of(2025, 4, 1, 10, 0),
                LocalDateTime.of(2025, 4, 7, 10, 0),
                150,
                500.0,
                300.0,
                false
        );
        Locacao locacao4 = new Locacao(
                2, LocalDateTime.of(2025, 4, 5, 14, 0),
                LocalDateTime.of(2025, 4, 12, 14, 0),
                200,
                600.0,
                350.0,
                true
        );

        // Crie duas instâncias de cada classe utilizando uma variação do construtor parametrizado
        Locacao locacao5 = new Locacao(
                LocalDateTime.of(2025, 3, 20, 9, 30),
                LocalDateTime.of(2025, 3, 25, 9, 30)
        );
        Locacao locacao6 = new Locacao(
                LocalDateTime.of(2025, 3, 22, 16, 45),
                LocalDateTime.of(2025, 3, 30, 16, 45)
        );

        // Imprima todos os objetos criados com os construtores utilizando metodo toString();
        System.out.println(locacao1);
        System.out.println(locacao2);
        System.out.println(locacao3);
        System.out.println(locacao4);
        System.out.println(locacao5);
        System.out.println(locacao6);

        // Utilize os métodos setters para alterar o estado de cada objeto
        locacao1.setId(1);
        locacao1.setDataHoraLocacao(LocalDateTime.of(2025, 4, 2, 11, 0));
        locacao1.setDataHoraDevolucao(LocalDateTime.of(2025, 4, 9, 11, 0));
        locacao1.setQuilometragem(120);
        locacao1.setValor_caucao(550.0);
        locacao1.setValor_locacao(310.0);
        locacao1.setDevolucao(false);

        locacao2.setId(2);
        locacao2.setDataHoraLocacao(LocalDateTime.of(2025, 4, 3, 15, 30));
        locacao2.setDataHoraDevolucao(LocalDateTime.of(2025, 4, 10, 15, 30));
        locacao2.setQuilometragem(180);
        locacao2.setValor_caucao(400.0);
        locacao2.setValor_locacao(280.0);
        locacao2.setDevolucao(false);

        locacao3.setId(3);
        locacao3.setDataHoraLocacao(LocalDateTime.of(2025, 4, 1, 10, 0));
        locacao3.setDataHoraDevolucao(LocalDateTime.of(2025, 4, 7, 10, 0));
        locacao3.setQuilometragem(150);
        locacao3.setValor_caucao(500.0);
        locacao3.setValor_locacao(300.0);
        locacao3.setDevolucao(false);

        locacao4.setId(4);
        locacao4.setDataHoraLocacao(LocalDateTime.of(2025, 4, 5, 14, 0));
        locacao4.setDataHoraDevolucao(LocalDateTime.of(2025, 4, 12, 14, 0));
        locacao4.setQuilometragem(200);
        locacao4.setValor_caucao(600.0);
        locacao4.setValor_locacao(350.0);
        locacao4.setDevolucao(true);

        locacao5.setDataHoraLocacao(LocalDateTime.of(2025, 3, 20, 9, 30));
        locacao5.setDataHoraDevolucao(LocalDateTime.of(2025, 3, 25, 9, 30));
        locacao5.setQuilometragem(130);
        locacao5.setValor_caucao(450.0);
        locacao5.setValor_locacao(290.0);
        locacao5.setDevolucao(false);

        locacao6.setDataHoraLocacao(LocalDateTime.of(2025, 3, 22, 16, 45));
        locacao6.setDataHoraDevolucao(LocalDateTime.of(2025, 3, 30, 16, 45));
        locacao6.setQuilometragem(170);
        locacao6.setValor_caucao(480.0);
        locacao6.setValor_locacao(320.0);
        locacao6.setDevolucao(false);

        // Imprima todos objetos com Getters
        System.out.println("Id: " + locacao1.getId());
        System.out.println("Data/Hora Locacao: " + locacao1.getDataHoraLocacao());
        System.out.println("Data/Hora Devolucao: " + locacao1.getDataHoraDevolucao());
        System.out.println("Quilometragem: " + locacao1.getQuilometragem());
        System.out.println("Valor Caucao: " + locacao1.getValor_caucao());
        System.out.println("Valor Locacao: " + locacao1.getValor_locacao());
        System.out.println("Devolucao: " + locacao1.getDevolucao());

        System.out.println("Id: " + locacao2.getId());
        System.out.println("Data/Hora Locacao: " + locacao2.getDataHoraLocacao());
        System.out.println("Data/Hora Devolucao: " + locacao2.getDataHoraDevolucao());
        System.out.println("Quilometragem: " + locacao2.getQuilometragem());
        System.out.println("Valor Caucao: " + locacao2.getValor_caucao());
        System.out.println("Valor Locacao: " + locacao2.getValor_locacao());
        System.out.println("Devolucao: " + locacao2.getDevolucao());

        System.out.println("Id: " + locacao3.getId());
        System.out.println("Data/Hora Locacao: " + locacao3.getDataHoraLocacao());
        System.out.println("Data/Hora Devolucao: " + locacao3.getDataHoraDevolucao());
        System.out.println("Quilometragem: " + locacao3.getQuilometragem());
        System.out.println("Valor Caucao: " + locacao3.getValor_caucao());
        System.out.println("Valor Locacao: " + locacao3.getValor_locacao());
        System.out.println("Devolucao: " + locacao3.getDevolucao());

        System.out.println("Id: " + locacao4.getId());
        System.out.println("Data/Hora Locacao: " + locacao4.getDataHoraLocacao());
        System.out.println("Data/Hora Devolucao: " + locacao4.getDataHoraDevolucao());
        System.out.println("Quilometragem: " + locacao4.getQuilometragem());
        System.out.println("Valor Caucao: " + locacao4.getValor_caucao());
        System.out.println("Valor Locacao: " + locacao4.getValor_locacao());
        System.out.println("Devolucao: " + locacao4.getDevolucao());

        System.out.println("Data/Hora Locacao: " + locacao5.getDataHoraLocacao());
        System.out.println("Data/Hora Devolucao: " + locacao5.getDataHoraDevolucao());
        System.out.println("Quilometragem: " + locacao5.getQuilometragem());
        System.out.println("Valor Caucao: " + locacao5.getValor_caucao());
        System.out.println("Valor Locacao: " + locacao5.getValor_locacao());
        System.out.println("Devolucao: " + locacao5.getDevolucao());

        System.out.println("Data/Hora Locacao: " + locacao6.getDataHoraLocacao());
        System.out.println("Data/Hora Devolucao: " + locacao6.getDataHoraDevolucao());
        System.out.println("Quilometragem: " + locacao6.getQuilometragem());
        System.out.println("Valor Caucao: " + locacao6.getValor_caucao());
        System.out.println("Valor Locacao: " + locacao6.getValor_locacao());
        System.out.println("Devolucao: " + locacao6.getDevolucao());

        // Adicione dois objetos do tipo coleção, um List e um Map
        List<Locacao> locacaoLista = new ArrayList<>();
        Map<Locacao, Integer> locacaoMapa = new HashMap<>();
    }
}
