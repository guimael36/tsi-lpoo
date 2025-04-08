package controller;

import model.Modelo;

import java.util.*;

public class ModeloController {
    public static void main(String[] args) {
        // Crie duas instâncias de cada classe utilizando um construtor padrão;
        Modelo modelo1 = new Modelo();
        Modelo modelo2 = new Modelo();

        // Crie duas instâncias de cada classe utilizando um construtor parametrizado
        Modelo modelo3 = new Modelo(1,"Fusca");
        Modelo modelo4 = new Modelo(2, "Civic");

        // Crie duas instâncias de cada classe utilizando um construtor parametrizado com alterações
        Modelo modelo5 = new Modelo("Onix");
        Modelo modelo6 = new Modelo("Etios");

        // Imprima todos os objetos criados com os construtores utilizando metodo toString();
        System.out.println(modelo1);
        System.out.println(modelo2);
        System.out.println(modelo3);
        System.out.println(modelo4);
        System.out.println(modelo5);
        System.out.println(modelo6);

        // Utilize os métodos setters para alterar o estado de cada objeto
        modelo1.setId(1);
        modelo1.setDescricao("Corsa");
        modelo2.setId(2);
        modelo2.setDescricao("Fiesta");
        modelo3.setId(3);
        modelo3.setDescricao("Gol");
        modelo4.setId(4);
        modelo4.setDescricao("Camry");
        modelo5.setId(4);
        modelo5.setDescricao("March");
        modelo6.setId(4);
        modelo6.setDescricao("Kwid");

        // Imprima todos objetos com Getters
        System.out.println("Id: " + modelo1.getId());
        System.out.println("Descricao: " + modelo1.getDescricao());
        System.out.println("Id: " + modelo2.getId());
        System.out.println("Descricao: " + modelo2.getDescricao());
        System.out.println("Id: " + modelo3.getId());
        System.out.println("Descricao: " + modelo3.getDescricao());
        System.out.println("Id: " + modelo4.getId());
        System.out.println("Descricao: " + modelo4.getDescricao());
        System.out.println("Id: " + modelo5.getId());
        System.out.println("Descricao: " + modelo5.getDescricao());
        System.out.println("Id: " + modelo6.getId());
        System.out.println("Descricao: " + modelo6.getDescricao());

        // Adicione dois objetos do tipo coleção, um List e um Map
        List<Modelo> modeloLista = new ArrayList<>();
        Map<Modelo, Integer> modeloMapa = new HashMap<>();
    }
}

