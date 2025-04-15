package controller;

import model.Carro;
import model.Funcionario;
import model.Produto;

import java.util.*;

public class ProdutoController {
    public static void main(String[] args) {
    // Crie duas instâncias de cada classe utilizando um construtor padrão;
    Produto produto = new Produto();
    Produto produto2 = new Produto();

    // Crie duas instâncias de cada classe utilizando um construtor parametrizado com todos os atributos
    Produto produto3 = new Produto(1, "Monitor", "4K", 2199.00, 10);
    Produto produto4 = new Produto(2, "Cafeteira", "Expresso", 399.00, 40);

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
    produto.setId(1);
    produto.setNome("Celular");
    produto.setDescricao("Smartphone");
    produto.setValor(5000.00);
    produto.setEstoque(20);

    produto2.setId(2);
    produto2.setNome("Fone");
    produto2.setDescricao("Bluetooth");
    produto2.setValor(200.00);
    produto2.setEstoque(15);

    produto3.setId(3);
    produto3.setNome("Teclado");
    produto3.setDescricao("Mecânico");
    produto3.setValor(349.00);
    produto3.setEstoque(20);

    produto4.setId(4);
    produto4.setNome("Notebook");
    produto4.setDescricao("Gamer");
    produto4.setValor(5000.00);
    produto4.setEstoque(5);

    produto5.setNome("Mouse");
    produto5.setEstoque(25);

    produto6.setNome("Monitor");
    produto6.setEstoque(10);

    // Getters para imprimir todos objetos
    System.out.println("\nId: " + produto.getId());
    System.out.println("Nome: " + produto.getNome());
    System.out.println("Descricao: " + produto.getDescricao());
    System.out.println("Valor: " + produto.getValor());
    System.out.println("Estoque: " + produto.getEstoque());

    System.out.println("\nId: " + produto2.getId());
    System.out.println("Nome: " + produto2.getNome());
    System.out.println("Descricao: " + produto2.getDescricao());
    System.out.println("Valor: " + produto2.getValor());
    System.out.println("Estoque: " + produto2.getEstoque());

    System.out.println("\nId: " + produto3.getId());
    System.out.println("Nome: " + produto3.getNome());
    System.out.println("Descricao: " + produto3.getDescricao());
    System.out.println("Valor: " + produto3.getValor());
    System.out.println("Estoque: " + produto3.getEstoque());

    System.out.println("\nId: " + produto4.getId());
    System.out.println("Nome: " + produto4.getNome());
    System.out.println("Descricao: " + produto4.getDescricao());
    System.out.println("Valor: " + produto4.getValor());
    System.out.println("Estoque: " + produto4.getEstoque());

        System.out.println("\n");
    System.out.println(produto5.getNome());
    System.out.println(produto5.getEstoque());

        System.out.println("\n");
    System.out.println(produto6.getNome());
    System.out.println(produto6.getEstoque());

    // Exercício 2
    // Coleção do tipo List
    // Declarando a coleção
    List<Produto> produtoList = new ArrayList<>();

    // Populando a coleção
    produtoList.add(produto);
    produtoList.add(produto2);
    produtoList.add(produto3);
    produtoList.add(produto4);
    produtoList.add(produto5);
    produtoList.add(produto6);

    // Imprimindo a coleção
        System.out.println("\nImprimindo a coleção recém populada");
    System.out.println(produtoList.toString());

    // Ordene a coleção em ordem decrescente, pelo critério id, e a imprima
    produtoList.sort(Comparator.comparing(Produto::getId).reversed());
        System.out.println("\nImprimindo a coleção em ordem decrescente, pelo critério ID");
    System.out.println(produtoList);

    // Faça uma pesquisa por força bruta na coleção e retorne o objeto de id = 3;
        System.out.println("\nImpressão da pesquisa por força bruta do objeto de id 3");
    for (Produto produto1 : produtoList) {
        if (produto1.getId() == 3) {
            System.out.println(produto1);
        }
        break;
    }

    // Faça uma pesquisa binária na coleção e retorne o objeto de id = 3.
    produtoList.sort(Comparator.comparing(Produto::getId));
    System.out.println(
            produtoList.get(
                    Collections.binarySearch(
                            produtoList,
                            new Produto(3, "Cafeteira", "Elétrica", 300, 10),
                            Comparator.comparing(Produto::getId)
                    )
            )
    );

    // Coleção do tipo Map
    // Declarando a coleção
    Map<Integer, Produto> produtoMap = new HashMap<>();

    // Populando a coleção
    produtoMap.put(produto.getId(), produto);
    produtoMap.put(produto2.getId(), produto2);
    produtoMap.put(produto3.getId(), produto3);
    produtoMap.put(produto4.getId(), produto4);
    produtoMap.put(produto5.getId(), produto5);
    produtoMap.put(produto6.getId(), produto6);

    // Imprime a coleção
        System.out.println("\nImprimindo a coleção Map");
    System.out.println(produtoMap);

    // Pesquisa na coleção pelo ID
        System.out.println("\nImprimindo a pesquisa da coleção Map por ID");
    System.out.println(produtoMap.get(produto3.getId()));
    }
}