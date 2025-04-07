package controller;

import model.Marca;

public class MarcaController {
    public static void main(String[] args) {
        // Crie duas instâncias de cada classe utilizando um construtor padrão;
        Marca marca1 = new Marca();
        Marca marca2 = new Marca();

        // Crie duas instâncias de cada classe utilizando um construtor parametrizado
        Marca marca3 = new Marca("Toyota");
        Marca marca4 = new Marca("Honda");

        // Não possui construtor parametrizado com alterações

        // Imprima todos os objetos criados com os construtores utilizando metodo toString();
        System.out.println(marca1);
        System.out.println(marca2);
        System.out.println(marca3);
        System.out.println(marca4);

        // Utilize os métodos setters para alterar o estado de cada objeto
        marca1.setDescricao("Chevrolet");
        marca2.setDescricao("Ford");
        marca3.setDescricao("Nissan");
        marca4.setDescricao("BMW");

        // Imprima todos objetos com Getters
        System.out.println(marca1.getDescricao());
        System.out.println(marca2.getDescricao());
        System.out.println(marca3.getDescricao());
        System.out.println(marca4.getDescricao());
    }
}
