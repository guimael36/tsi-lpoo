package controller;

import model.Automovel;

public class AutomovelController {
    public static void main(String[] args) {
        // Crie duas instâncias de cada classe utilizando um construtor padrão;
        Automovel automovel1 = new Automovel();
        Automovel automovel2 = new Automovel();

        // Crie duas instâncias de cada classe utilizando um construtor parametrizado
        Automovel automovel3 = new Automovel("1234567890", "ABC1234", "Preto", 4, "Gasolina", 50000, "XYZ987654321", 1200.0);
        Automovel automovel4 = new Automovel("9876543210", "DEF5678", "Branco", 4, "Álcool", 30000, "ZYX123456789", 1500.0);

        // Crie duas instâncias de cada classe utilizando uma variação do construtor parametrizado
        Automovel automovel5 = new Automovel("1122334455", "GHI8901");
        Automovel automovel6 = new Automovel("9988776655", "JKL2345");

        // Imprima todos os objetos criados com os construtores utilizando metodo toString();
        System.out.println(automovel1);
        System.out.println(automovel2);
        System.out.println(automovel3);
        System.out.println(automovel4);
        System.out.println(automovel5);
        System.out.println(automovel6);

        // Utilize os métodos setters para alterar o estado de cada objeto
        automovel1.setRenavan("1112223334");
        automovel1.setPlaca("MNO1234");
        automovel1.setCor("Azul");
        automovel1.setNum_rodas(4);
        automovel1.setCombustivel("Diesel");
        automovel1.setQuilometragem(20000);
        automovel1.setChassi("ABCD1234567890");
        automovel1.setValor_locacao(1000.0);

        automovel2.setRenavan("5556667778");
        automovel2.setPlaca("PQR5678");
        automovel2.setCor("Vermelho");
        automovel2.setNum_rodas(4);
        automovel2.setCombustivel("Gasolina");
        automovel2.setQuilometragem(15000);
        automovel2.setChassi("EFGH9876543210");
        automovel2.setValor_locacao(800.0);

        automovel3.setRenavan("1234567890");
        automovel3.setPlaca("ABC1234");
        automovel3.setCor("Preto");
        automovel3.setNum_rodas(4);
        automovel3.setCombustivel("Gasolina");
        automovel3.setQuilometragem(50000);
        automovel3.setChassi("XYZ987654321");
        automovel3.setValor_locacao(1200.0);

        automovel4.setRenavan("9876543210");
        automovel4.setPlaca("DEF5678");
        automovel4.setCor("Branco");
        automovel4.setNum_rodas(4);
        automovel4.setCombustivel("Álcool");
        automovel4.setQuilometragem(30000);
        automovel4.setChassi("ZYX123456789");
        automovel4.setValor_locacao(1500.0);

        automovel5.setRenavan("1122334455");
        automovel5.setPlaca("GHI8901");

        automovel6.setRenavan("9988776655");
        automovel6.setPlaca("JKL2345");

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
