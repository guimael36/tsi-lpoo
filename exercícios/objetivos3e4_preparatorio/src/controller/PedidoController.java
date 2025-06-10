package controller;

import model.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PedidoController {
    public static void main(String[] args) {
        //c. Faça a aplicação realizar um pedido. Um pedido compreende:

        //Registrar o Vendedor, os Produtos, e o Carrinho (uma lista de Item);
        Vendedor vendedor = new Vendedor(111L, "Vendedor 1", "vendedor_1@email.com", "5555-1234", BigDecimal.valueOf(1000.0), 5.0, Regiao.SUL);
        Produto produto1 = new Produto("111", "Arroz", "Tordilho pc  5kg", 100, BigDecimal.valueOf(10.9), BigDecimal.valueOf(19.9), List.of(new Fornecedor("Tordilho")));
        Item item1 = new Item(1000, produto1.getPrecoDeVenda().multiply(BigDecimal.valueOf(1000)), Situacao.ATIVO, produto1);
        Item item2 = new Item(10, produto1.getPrecoDeVenda().multiply(BigDecimal.valueOf(10)), Situacao.ATIVO, produto1);
        List<Item> carrinho = new ArrayList<>();
        carrinho.add(item1);
        carrinho.add(item2);

        //Registrar os detalhes de Pedido, como, número do pedido, total do pedido e a data do pedido;
        BigDecimal totalPedido = BigDecimal.ZERO;
        for(Item item : carrinho) {
            totalPedido = totalPedido.add(item.getTotal());
        }

        Pedido pedido1 = new Pedido(
                "111",
                LocalDateTime.now(),
                totalPedido,
                vendedor,
                Estado.ABERTO,
                carrinho);

        //Baixar o estoque de Produto;
        Produto.baixarEstoque(carrinho);

        //Imprimir o Pedido com seus detalhes
        System.out.println(pedido1);

        //d. Faça a aplicação realizar outro pedido, no mesmo formato, variando apenas a quantidade de cada Item;
        Item item4 = new Item(5, produto1.getPrecoDeVenda().multiply(BigDecimal.valueOf(5)), Situacao.ATIVO, produto1);
        Item item5 = new Item(5, produto1.getPrecoDeVenda().multiply(BigDecimal.valueOf(5)), Situacao.ATIVO, produto1);
        carrinho.clear();
        carrinho.add(item4);
        carrinho.add(item5);
        totalPedido = BigDecimal.ZERO;
        for(Item item : carrinho) {
            totalPedido = totalPedido.add(item.getTotal());
        }
        Produto.baixarEstoque(carrinho);
        Pedido pedido2 = new Pedido(
                "222",
                LocalDateTime.now(),
                totalPedido,
                vendedor,
                Estado.ABERTO,
                carrinho);
        System.out.println("\n\n Segundo Pedido:");
        System.out.println(pedido2);

        //Faça a aplicação registrar os dois pedidos em uma coleção de pedidos;
        List<Pedido> pedidos = new ArrayList<>();
        pedidos.add(pedido1);
        pedidos.add(pedido2);

        //f. Faça o programa imprimir todos os pedidos realizados e o total de vendas;
        System.out.println("\n\nPedidos realizados:");
        System.out.println(pedidos);
        BigDecimal totalVendas = BigDecimal.ZERO;
        for(Pedido pedido : pedidos) {
            totalVendas = totalVendas.add(pedido.getTotal());
        }
        System.out.println("\nTotal de vendas= " + totalVendas);

        //g. Faça o programa registrar os fornecimentos em uma coleção de Fornecimento. Depois, faça
        //o programa imprimir o Relatório de Fornecimentos, isto é, todos os fornecimentos realizados, bem como, o total fornecido;
        Produto produtoTJ = new Produto("111", "Arroz", "Tio João pc  5kg", 100, BigDecimal.valueOf(10.9), BigDecimal.valueOf(19.9), null);
        Fornecedor fornecedorTJ = new Fornecedor("111", "Tio João", "tiojoao@email.com", "5555-9876", List.of(produtoTJ));
        Fornecimento fornecimento1 = new Fornecimento(LocalDateTime.now(), 30, produtoTJ.getPrecoDeCusto().multiply(BigDecimal.valueOf(30)),fornecedorTJ, produtoTJ);
        System.out.println("\n\n Fornecimento TJ:");
        produtoTJ.setEstoque(produtoTJ.getEstoque() + fornecimento1.getQuantidade());
        System.out.println(fornecimento1);

        //h. Crie uma classe de Exceção, a classe EstoqueInsuficiente, que emita a seguinte mensagem “Estoque Insuficiente”,
        //e faça o programa lançar essa exceção, ao baixar o estoque, toda vez que a quantidade de produto for insuficiente.
        List<Fornecimento> fornecimentos = new ArrayList<>();
        fornecimentos.add(fornecimento1);
        BigDecimal totalFornecimentos = BigDecimal.ZERO;
        for(Fornecimento fornecimento : fornecimentos) {
            totalFornecimentos = totalFornecimentos.add(fornecimento.getTotal());
        }
        System.out.println("\nTotal de fornecimentos= " + totalFornecimentos);
    }
}