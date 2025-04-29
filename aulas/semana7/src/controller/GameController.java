package controller;
import model.*;
import java.util.*;

public class GameController {
    public static void main(String[] args) {
        Personagem a1 = new Aviao();
        Personagem a2 = new Aviao(5, 5);
        Personagem n1 = new Navio();
        Personagem n2 = new Navio(5, 5);
        Personagem t1 = new Tanque();
        Personagem t2 = new Tanque(5, 5);
        Personagem s1 = new Submarino();
        Personagem s2 = new Submarino(5, 5);

        List<Personagem> Personagens = new ArrayList<>();
        Personagens.add(a1);
        Personagens.add(a2);
        Personagens.add(n1);
        Personagens.add(n2);
        Personagens.add(t1);
        Personagens.add(t2);
        Personagens.add(s1);
        Personagens.add(s2);

        for (Personagem p : Personagens){
            p.desenhar(); // faz a chamada e impressão de todas classes, mesmo que com assinaturas diferentes
        }

        for (Personagem p : Personagens){
            p.mover(8,8); // modifica todas classes

            if (p instanceof Aviao){
                ((Aviao) p).mover3D(2, 2, 2); // downcasting: modifica apenas a classe avião
            }

            System.out.println(p);
        }
    }
}
