package controller;

import model.Automovel;

public class AutomovelController {
    public static void main(String[] args) {
        // Crie duas instâncias de cada classe utilizando um construtor padrão;
        Automovel automovel1 = new Automovel();
        Automovel automovel2 = new Automovel();

        // Crie duas instâncias de cada classe utilizando um construtor parametrizado
        Automovel automovel3 = new Automovel("", "", "", 4, "", 0, "", 1000.0);
        Automovel automovel4 = new Automovel("", "", "", 4, "", 0, "", 1000.0);

        // Crie duas instâncias de cada classe utilizando uma variação do construtor parametrizado
        Automovel automovel5 = new Automovel("", "");
        Automovel automovel6 = new Automovel("", "");

        // Imprima todos os objetos criados com os construtores utilizando metodo toString();
        System.out.println(automovel1);
        System.out.println(automovel2);
        System.out.println(automovel3);
        System.out.println(automovel4);
        System.out.println(automovel5);
        System.out.println(automovel6);

        // Utilize os métodos setters para alterar o estado de cada objeto
        automovel1.setRenavan("");
        automovel1.setPlaca("");
        automovel1.setCor("");
        automovel1.setNum_rodas(4);
        automovel1.setCombustivel("");
        automovel1.setQuilometragem(0);
        automovel1.setChassi("");
        automovel1.setValor_locacao(1000.0);

        automovel2.setRenavan("");
        automovel2.setPlaca("");
        automovel2.setCor("");
        automovel2.setNum_rodas(4);
        automovel2.setCombustivel("");
        automovel2.setQuilometragem(0);
        automovel2.setChassi("");
        automovel2.setValor_locacao(1000.0);

        automovel3.setRenavan("");
        automovel3.setPlaca("");
        automovel3.setCor("");
        automovel3.setNum_rodas(4);
        automovel3.setCombustivel("");
        automovel3.setQuilometragem(0);
        automovel3.setChassi("");
        automovel3.setValor_locacao(1000.0);

        automovel4.setRenavan("");
        automovel4.setPlaca("");
        automovel4.setCor("");
        automovel4.setNum_rodas(4);
        automovel4.setCombustivel("");
        automovel4.setQuilometragem(0);
        automovel4.setChassi("");
        automovel4.setValor_locacao(1000.0);

        automovel5.setRenavan("");
        automovel5.setPlaca("");

        automovel6.setRenavan("");
        automovel6.setPlaca("");

        // Imprima todos objetos com Getters
        System.out.println(automovel1.getRenavan());
        System.out.println(automovel1.getPlaca());
        System.out.println(automovel1.getCor());
        System.out.println(automovel1.getNum_rodas());
        System.out.println(automovel1.getCombustivel());
        System.out.println(automovel1.getQuilometragem());
        System.out.println(automovel1.getChassi());
        System.out.println(automovel1.getValor_locacao());

        System.out.println(automovel2.getRenavan());
        System.out.println(automovel2.getPlaca());
        System.out.println(automovel2.getCor());
        System.out.println(automovel2.getNum_rodas());
        System.out.println(automovel2.getCombustivel());
        System.out.println(automovel2.getQuilometragem());
        System.out.println(automovel2.getChassi());
        System.out.println(automovel2.getValor_locacao());

        System.out.println(automovel3.getRenavan());
        System.out.println(automovel3.getPlaca());
        System.out.println(automovel3.getCor());
        System.out.println(automovel3.getNum_rodas());
        System.out.println(automovel3.getCombustivel());
        System.out.println(automovel3.getQuilometragem());
        System.out.println(automovel3.getChassi());
        System.out.println(automovel3.getValor_locacao());

        System.out.println(automovel4.getRenavan());
        System.out.println(automovel4.getPlaca());
        System.out.println(automovel4.getCor());
        System.out.println(automovel4.getNum_rodas());
        System.out.println(automovel4.getCombustivel());
        System.out.println(automovel4.getQuilometragem());
        System.out.println(automovel4.getChassi());
        System.out.println(automovel4.getValor_locacao());

        System.out.println(automovel5.getRenavan());
        System.out.println(automovel5.getPlaca());

        System.out.println(automovel6.getRenavan());
        System.out.println(automovel6.getPlaca());
    }
}
