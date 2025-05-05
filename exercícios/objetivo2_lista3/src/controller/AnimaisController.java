package controller;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class AnimaisController {
    public static void main(String[] args) {
        // b. Crie três instâncias de cada classe, insira-os numa coleção List e os imprima;
        Peixe peixe = new Peixe(10.0, 10.0);
        Peixe peixe2 = new Peixe(10.0, 10.0);
        Peixe peixe3 = new Peixe(10.0, 10.0);

        Cachorro cachorro = new Cachorro(20.0, 20.0);
        Cachorro cachorro2 = new Cachorro(20.0, 20.0);
        Cachorro cachorro3 = new Cachorro(20.0, 20.0);

        Passaro passaro = new Passaro(30.0, 30.0);
        Passaro passaro2 = new Passaro(30.0, 30.0);
        Passaro passaro3 = new Passaro(30.0, 30.0);

        List<Animal> animais = new ArrayList<>();
        animais.add(peixe);
        animais.add(peixe2);
        animais.add(peixe3);
        animais.add(passaro);
        animais.add(passaro2);
        animais.add(passaro3);
        animais.add(cachorro);
        animais.add(cachorro2);
        animais.add(cachorro3);

        System.out.println("\nImprimindo a coleção Animais: ");
        System.out.println(animais);

        // c. Percorra a coleção, posicione os personagens nas coordenadas (2, 2), os desenhe e imprima-os;
        System.out.println("\nPosicionando todos animais nas coordenadas 2 e 2: ");
        for (Animal animal : animais) {
            animal.mover(2.0, 2.0);
            animal.desenhar();
            System.out.println(animal);
        }

        // d. Reposicione os personagens da classe Cachorro nas coordenadas (8, 8), os desenhe e imprima-os;
        System.out.println("\nReposicionando apenas os Cachorros para as coordenadas 8 e 8: ");
        for (Animal animal : animais) {
            if (animal instanceof Cachorro) {
                animal.mover(8.0, 8.0);
                animal.desenhar();
                System.out.println(animal);
            }
        }

        // e. Reposicione os personagens das classes Peixe e Passaro, nas coordenadas (5, 5, 5), os desenhe e imprima-os;
        System.out.println("\nReposicionando apenas Peixe e Passaro para as coordenadas 5, 5 e 5: ");
        for (Animal animal : animais) {
            if (animal instanceof Peixe) {
                ((Peixe) animal).mover3D(5.0, 5.0, 5.0); // ((Peixe) animal) representa um downcasting da Classe animal para a classe Peixe
                animal.desenhar();
                System.out.println(animal);
            }

            if (animal instanceof Passaro) {
                ((Passaro) animal).mover3D(5.0, 5.0, 5.0); // esse downcasting permite o acesso ao metodo mover3D
                animal.desenhar();
                System.out.println(animal);
            }
        }
    }
}
