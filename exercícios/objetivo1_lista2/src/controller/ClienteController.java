package controller;

import model.Cliente;

public class ClienteController {
    public static void main(String[] args) {
        // Crie duas instâncias de cada classe utilizando um construtor padrão;
        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();

        // Crie duas instâncias de cada classe utilizando um construtor parametrizado
        Cliente cliente3 = new Cliente("", "", "", "", "", "");
        Cliente cliente4 = new Cliente("", "", "", "", "", "");

        // Crie duas instâncias de cada classe utilizando uma variação do construtor parametrizado
        Cliente cliente5 = new Cliente("", "");
        Cliente cliente6 = new Cliente("", "");

        // Imprima todos os objetos criados com os construtores utilizando metodo toString();
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);
        System.out.println(cliente5);
        System.out.println(cliente6);

        // Utilize os métodos setters para alterar o estado de cada objeto
        cliente1.setCpf("");
        cliente1.setNome("");
        cliente1.setSobrenome("");
        cliente1.setEndereco("");
        cliente1.setTelefone("");
        cliente1.setEmail("");

        cliente2.setCpf("");
        cliente2.setNome("");
        cliente2.setSobrenome("");
        cliente2.setEndereco("");
        cliente2.setTelefone("");
        cliente2.setEmail("");

        cliente3.setCpf("");
        cliente3.setNome("");
        cliente3.setSobrenome("");
        cliente3.setEndereco("");
        cliente3.setTelefone("");
        cliente3.setEmail("");

        cliente4.setCpf("");
        cliente4.setNome("");
        cliente4.setSobrenome("");
        cliente4.setEndereco("");
        cliente4.setTelefone("");
        cliente4.setEmail("");

        cliente5.setCpf("");
        cliente5.setNome("");

        cliente6.setCpf("");
        cliente6.setNome("");

        // Imprima todos objetos com Getters
        System.out.println(cliente1.getCpf());
        System.out.println(cliente1.getNome());
        System.out.println(cliente1.getSobrenome());
        System.out.println(cliente1.getEndereco());
        System.out.println(cliente1.getTelefone());
        System.out.println(cliente1.getEmail());

        System.out.println(cliente2.getCpf());
        System.out.println(cliente2.getNome());
        System.out.println(cliente2.getSobrenome());
        System.out.println(cliente2.getEndereco());
        System.out.println(cliente2.getTelefone());
        System.out.println(cliente2.getEmail());

        System.out.println(cliente3.getCpf());
        System.out.println(cliente3.getNome());
        System.out.println(cliente3.getSobrenome());
        System.out.println(cliente3.getEndereco());
        System.out.println(cliente3.getTelefone());
        System.out.println(cliente3.getEmail());

        System.out.println(cliente4.getCpf());
        System.out.println(cliente4.getNome());
        System.out.println(cliente4.getSobrenome());
        System.out.println(cliente4.getEndereco());
        System.out.println(cliente4.getTelefone());
        System.out.println(cliente4.getEmail());

        System.out.println(cliente5.getCpf());
        System.out.println(cliente5.getNome());

        System.out.println(cliente6.getCpf());
        System.out.println(cliente6.getNome());
    }
}




