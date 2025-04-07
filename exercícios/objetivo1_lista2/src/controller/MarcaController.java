package controller;

import model.Marca;

public class MarcaController {
    public static void main(String[] args) {
        // Crie duas instâncias de cada classe utilizando um construtor padrão;
        Marca marca1 = new Marca();
        Marca marca2 = new Marca();

        // Crie duas instâncias de cada classe utilizando um construtor parametrizado
        Marca marca3 = new Marca("");
        Marca marca4 = new Marca("");

        // Não possui construtor parametrizado com alterações

        // Imprima todos os objetos criados com os construtores utilizando metodo toString();
        System.out.println(marca1);
        System.out.println(marca2);
        System.out.println(marca3);
        System.out.println(marca4);

        // Utilize os métodos setters para alterar o estado de cada objeto
        marca1.setDescricao("");
        marca2.setDescricao("");
        marca3.setDescricao("");
        marca4.setDescricao("");

        // Imprima todos objetos com Getters
        System.out.println(marca1.getDescricao());
        System.out.println(marca2.getDescricao());
        System.out.println(marca3.getDescricao());
        System.out.println(marca4.getDescricao());
    }
}
