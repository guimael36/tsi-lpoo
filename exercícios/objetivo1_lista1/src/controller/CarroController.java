package controller;

import model.Carro;
import java.util.*;

public class CarroController {
    public static void main(String[] args) {
        // Exercício 1
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
        System.out.println("\n" + carro);
        System.out.println("\n" + carro2);
        System.out.println("\n" + carro3);
        System.out.println("\n" + carro4);
        System.out.println("\n" + carro5);
        System.out.println("\n" + carro6);

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
        System.out.println("\nId:" + carro.getId());
        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("AnoFabricacao: " + carro.getAnoFabricacao());

        System.out.println("\nId: " + carro2.getId());
        System.out.println("Marca: " + carro2.getMarca());
        System.out.println("Modelo: " + carro2.getModelo());
        System.out.println("AnoFabricacao: " + carro2.getAnoFabricacao());

        System.out.println("\nId: " + carro3.getId());
        System.out.println("Marca: " + carro3.getMarca());
        System.out.println("Modelo: " + carro3.getModelo());
        System.out.println("AnoFabricacao: " + carro3.getAnoFabricacao());

        System.out.println("\nId: " + carro4.getId());
        System.out.println("Marca: " + carro4.getMarca());
        System.out.println("Modelo: " + carro4.getModelo());
        System.out.println("AnoFabricacao: " + carro4.getAnoFabricacao());

        System.out.println("\nMarca: " + carro5.getMarca());
        System.out.println("Modelo: " + carro5.getModelo());

        System.out.println("\nMarca: " + carro6.getMarca());
        System.out.println("Modelo: " + carro6.getModelo());

        // Exercício 2
        // Coleção do tipo List
        // Declarando a coleção
        List<Carro> carroList = new ArrayList<>();

        // Populando a coleção
        carroList.add(carro);
        carroList.add(carro2);
        carroList.add(carro3);
        carroList.add(carro4);
        carroList.add(carro5);
        carroList.add(carro6);

        // Imprimindo a coleção
        System.out.println("\nImprimindo a coleção recém populada: ");
        System.out.println(carroList.toString());

        // Ordene a coleção em ordem decrescente, pelo critério id, e a imprima;
        System.out.println("\nImprimindo a coleção em ordem decrescente, pelo critério ID: ");
        carroList.sort(Comparator.comparing(Carro::getId).reversed());
        System.out.println(carroList);

        // Faça uma pesquisa por força bruta na coleção e retorne o objeto de id = 3;
        System.out.println("\nImpressão da pesquisa por força bruta do objeto de id 3: ");
        for (Carro carro1 : carroList) {
            if (carro3.getId() == 3) {
                System.out.println(carro3);
            }
            break;
        }

        // Faça uma pesquisa binária na coleção e retorne o objeto de id = 3.
        System.out.println("\nImpressão do objeto de id 3 por pesquisa binária: ");
        carroList.sort(Comparator.comparing(Carro::getId));
        System.out.println(
                carroList.get(
                        Collections.binarySearch(
                                carroList,
                                new Carro(3, "Volkswagen", "Fusca", 1969),
                                Comparator.comparing(Carro::getId)
                        )
                )
        );

        // Coleção do tipo Map
        // Declarando a coleção
        Map<Integer, Carro> carroMap = new HashMap<>();

        // Populando a coleção
        carroMap.put(carro.getId(), carro);
        carroMap.put(carro2.getId(), carro2);
        carroMap.put(carro3.getId(), carro3);
        carroMap.put(carro4.getId(), carro4);
        carroMap.put(carro5.getId(), carro5);
        carroMap.put(carro6.getId(), carro6);

        // Imprime a coleção
        System.out.println("\nImprimindo a coleção do tipo Map: ");
        System.out.println(carroMap);

        // Pesquisa na coleção pelo ID
        System.out.println("\nImprimindo a coleção pela busca do ID 3: ");
        System.out.println(carroMap.get(carro3.getId()));
    }
}