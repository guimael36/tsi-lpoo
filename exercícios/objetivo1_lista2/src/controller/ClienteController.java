package controller;

import model.Cliente;

public class ClienteController {
    public static void main(String[] args) {
        // Crie duas instâncias de cada classe utilizando um construtor padrão;
        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();

        // Crie duas instâncias de cada classe utilizando um construtor parametrizado
        Cliente cliente3 = new Cliente("12345678901", "João", "Silva", "Rua das Flores, 123", "(11) 98765-4321", "joao.silva@email.com");
        Cliente cliente4 = new Cliente("10987654321", "Maria", "Oliveira", "Avenida Paulista, 456", "(11) 91234-5678", "maria.oliveira@email.com");

        // Crie duas instâncias de cada classe utilizando uma variação do construtor parametrizado
        Cliente cliente5 = new Cliente("11223344556", "Carlos");
        Cliente cliente6 = new Cliente("99887766554", "Fernanda");

        // Imprima todos os objetos criados com os construtores utilizando metodo toString();
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);
        System.out.println(cliente5);
        System.out.println(cliente6);

        // Utilize os métodos setters para alterar o estado de cada objeto
        cliente1.setCpf("12345678900");
        cliente1.setNome("Lucas");
        cliente1.setSobrenome("Costa");
        cliente1.setEndereco("Rua das Acácias, 100");
        cliente1.setTelefone("(11) 3344-5566");
        cliente1.setEmail("lucas.costa@email.com");

        cliente2.setCpf("98765432100");
        cliente2.setNome("Ana");
        cliente2.setSobrenome("Pereira");
        cliente2.setEndereco("Rua Nova, 200");
        cliente2.setTelefone("(11) 5566-7788");
        cliente2.setEmail("ana.pereira@email.com");

        cliente3.setCpf("12345678901");
        cliente3.setNome("João");
        cliente3.setSobrenome("Silva");
        cliente3.setEndereco("Rua das Flores, 123");
        cliente3.setTelefone("(11) 98765-4321");
        cliente3.setEmail("joao.silva@email.com");

        cliente4.setCpf("10987654321");
        cliente4.setNome("Maria");
        cliente4.setSobrenome("Oliveira");
        cliente4.setEndereco("Avenida Paulista, 456");
        cliente4.setTelefone("(11) 91234-5678");
        cliente4.setEmail("maria.oliveira@email.com");

        cliente5.setCpf("11223344556");
        cliente5.setNome("Carlos");

        cliente6.setCpf("99887766554");
        cliente6.setNome("Fernanda");

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
