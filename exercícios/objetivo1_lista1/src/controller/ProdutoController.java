package controller;

import model.Produto;

public class ProdutoController {
    public static void main(String[] args) {
    // Crie duas instâncias de cada classe utilizando um construtor padrão;
    Produto produto = new Produto();
    Produto produto2 = new Produto();

    // Crie duas instâncias de cada classe utilizando um construtor parametrizado com todos os atributos
    Produto produto3 = new Produto("Monitor", "4K", 2199.00, 10);
    Produto produto4 = new Produto("Cafeteira", "Expresso", 399.00, 40);

    // Crie duas instâncias de cada classe utilizando uma variação do construtor parametrizado;
    Produto produto5 = new Produto("Jarra Elétrica", 30);
    Produto produto6 = new Produto("Ferro de Passar", 50);

    // Imprima todos os objetos criados com os construtores utilizando o metodo toString();
    System.out.println(produto);
    System.out.println(produto2);
    System.out.println(produto3);
    System.out.println(produto4);
    System.out.println(produto5);
    System.out.println(produto6);

    // Setters para alterar o estado de cada objeto
    produto.setNome("Celular");
    produto.setDescricao("Smartphone");
    produto.setValor(5000.00);
    produto.setEstoque(20);

    produto2.setNome("Fone");
    produto2.setDescricao("Bluetooth");
    produto2.setValor(200.00);
    produto2.setEstoque(15);

    produto3.setNome("Teclado");
    produto3.setDescricao("Mecânico");
    produto3.setValor(349.00);
    produto3.setEstoque(20);

    produto4.setNome("Notebook");
    produto4.setDescricao("Gamer");
    produto4.setValor(5000.00);
    produto4.setEstoque(5);

    produto5.setNome("Mouse");
    produto5.setEstoque(25);

    produto6.setNome("Monitor");
    produto6.setEstoque(10);

    // Getters para imprimir todos objetos
    System.out.println(produto.getNome());
    System.out.println(produto.getDescricao());
    System.out.println(produto.getValor());
    System.out.println(produto.getEstoque());

    System.out.println(produto2.getNome());
    System.out.println(produto2.getDescricao());
    System.out.println(produto2.getValor());
    System.out.println(produto2.getEstoque());

    System.out.println(produto3.getNome());
    System.out.println(produto3.getDescricao());
    System.out.println(produto3.getValor());
    System.out.println(produto3.getEstoque());

    System.out.println(produto4.getNome());
    System.out.println(produto4.getDescricao());
    System.out.println(produto4.getValor());
    System.out.println(produto4.getEstoque());

    System.out.println(produto5.getNome());
    System.out.println(produto5.getEstoque());

    System.out.println(produto6.getNome());
    System.out.println(produto6.getEstoque());
    }
}
