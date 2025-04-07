package controller;

import model.Modelo;

public class ModeloController {
    public static void main(String[] args) {
        // Crie duas instâncias de cada classe utilizando um construtor padrão;
        Modelo modelo1 = new Modelo();
        Modelo modelo2 = new Modelo();

        // Crie duas instâncias de cada classe utilizando um construtor parametrizado
        Modelo modelo3 = new Modelo("Fusca");
        Modelo modelo4 = new Modelo("Civic");

        // Não possui construtor parametrizado com alterações

        // Imprima todos os objetos criados com os construtores utilizando metodo toString();
        System.out.println(modelo1);
        System.out.println(modelo2);
        System.out.println(modelo3);
        System.out.println(modelo4);

        // Utilize os métodos setters para alterar o estado de cada objeto
        modelo1.setDescricao("Corsa");
        modelo2.setDescricao("Fiesta");
        modelo3.setDescricao("Gol");
        modelo4.setDescricao("Camry");

        // Imprima todos objetos com Getters
        System.out.println(modelo1.getDescricao());
        System.out.println(modelo2.getDescricao());
        System.out.println(modelo3.getDescricao());
        System.out.println(modelo4.getDescricao());
    }
}

