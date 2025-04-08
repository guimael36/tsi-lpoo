package controller;

import model.Carro;

import java.util.*;

public class CarroController {
    public static void main(String[] args) {
        // Crie duas instâncias de cada classe utilizando um construtor padrão;
        Carro carro = new Carro();
        Carro carro2 = new Carro();

        // Crie duas instâncias de cada classe utilizando um construtor parametrizado com todos os atributos
        Carro carro3 = new Carro(1, "Volkswagen", "Fusca", 1969);
        Carro carro4 = new Carro(2, "Fiat", "Uno", 1998);

        // Crie duas instâncias de cada classe utilizando uma variação do construtor parametrizado;
        Carro carro5 = new Carro("Volkswagen", "Gol");
        Carro carro6 = new Carro("Chevrolet", "Onix");

        // Imprima todos os objetos criados com os construtores utilizando o metodo toString();
        System.out.println(carro);
        System.out.println(carro2);
        System.out.println(carro3);
        System.out.println(carro4);
        System.out.println(carro5);
        System.out.println(carro6);

        // Setters para alterar o estado de cada objeto
        carro.setId(1);
        carro.setMarca("Ford");
        carro.setModelo("Ka");
        carro.setAnoFabricacao(2019);

        carro2.setId(2);
        carro2.setMarca("Hyundai");
        carro2.setModelo("HB20");
        carro2.setAnoFabricacao(2022);

        carro3.setId(3);
        carro3.setMarca("Honda");
        carro3.setModelo("Fit");
        carro3.setAnoFabricacao(2021);

        carro4.setId(4);
        carro4.setMarca("Renault");
        carro4.setModelo("Kwid");
        carro4.setAnoFabricacao(2023);

        carro5.setMarca("Toyota");
        carro5.setModelo("Etios");

        carro6.setMarca("Nissan");
        carro6.setModelo("March");

        // Getters para imprimir todos objetos
        System.out.println("Id: " + carro.getId());
        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("AnoFabricacao: " + carro.getAnoFabricacao());

        System.out.println("Id: " + carro2.getId());
        System.out.println("Marca: " + carro2.getMarca());
        System.out.println("Modelo: " + carro2.getModelo());
        System.out.println("AnoFabricacao: " + carro2.getAnoFabricacao());

        System.out.println("Id: " + carro3.getId());
        System.out.println("Marca: " + carro3.getMarca());
        System.out.println("Modelo: " + carro3.getModelo());
        System.out.println("AnoFabricacao: " + carro3.getAnoFabricacao());

        System.out.println("Id: " + carro4.getId());
        System.out.println("Marca: " + carro4.getMarca());
        System.out.println("Modelo: " + carro4.getModelo());
        System.out.println("AnoFabricacao: " + carro4.getAnoFabricacao());

        System.out.println("Marca: " + carro5.getMarca());
        System.out.println("Modelo: " + carro5.getModelo());

        System.out.println("Marca: " + carro6.getMarca());
        System.out.println("Modelo: " + carro6.getModelo());

        // Adicione dois objetos do tipo coleção, um List e um Map
        List<Carro> carroLista = new ArrayList<>();
        Map<Carro, Integer> carroMapa = new HashMap<>();

        // Adicione na coleção todos os objetos criados no exercício 1
    }
}
