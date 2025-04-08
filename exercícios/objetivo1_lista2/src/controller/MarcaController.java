package controller;

import model.Marca;

import java.util.*;

public class MarcaController {
    public static void main(String[] args) {
        // Crie duas instâncias de cada classe utilizando um construtor padrão;
        Marca marca1 = new Marca();
        Marca marca2 = new Marca();

        // Crie duas instâncias de cada classe utilizando um construtor parametrizado
        Marca marca3 = new Marca(1,"Toyota");
        Marca marca4 = new Marca(2, "Honda");

        // Crie duas instâncias de cada classe utilizando um construtor parametrizado com alterações
        Marca marca5 = new Marca("Jeep");
        Marca marca6 = new Marca("Tesla");

        // Imprima todos os objetos criados com os construtores utilizando metodo toString();
        System.out.println(marca1);
        System.out.println(marca2);
        System.out.println(marca3);
        System.out.println(marca4);
        System.out.println(marca5);
        System.out.println(marca6);

        // Utilize os métodos setters para alterar o estado de cada objeto
        marca1.setId(1);
        marca1.setDescricao("Chevrolet");
        marca2.setId(2);
        marca2.setDescricao("Ford");
        marca3.setId(3);
        marca3.setDescricao("Nissan");
        marca4.setId(4);
        marca4.setDescricao("BMW");
        marca5.setId(5);
        marca5.setDescricao("Suzuki");
        marca6.setId(6);
        marca6.setDescricao("Renault");

        // Imprima todos objetos com Getters
        System.out.println("Id: " + marca1.getId());
        System.out.println("Descricao: " + marca1.getDescricao());
        System.out.println("Id: " + marca2.getId());
        System.out.println("Descricao: " + marca2.getDescricao());
        System.out.println("Id: " + marca3.getId());
        System.out.println("Descricao: " + marca3.getDescricao());
        System.out.println("Id: " + marca4.getId());
        System.out.println("Descricao: " + marca4.getDescricao());
        System.out.println("Id: " + marca5.getId());
        System.out.println("Descricao: " + marca5.getDescricao());
        System.out.println("Id: " + marca6.getId());
        System.out.println("Descricao: " + marca6.getDescricao());

        // Adicione dois objetos do tipo coleção, um List e um Map
        List<Marca> marcaLista = new ArrayList<>();
        Map<Marca, Integer> marcaMapa = new HashMap<>();
    }
}
