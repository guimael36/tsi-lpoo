package model;

public abstract class Personagem {
    protected double x;
    protected double y;

    public Personagem(){}

    public Personagem(double y, double x) {
        this.y = y;
        this.x = x;
    }

    public void mover(double x, double y){
        this.x = x;
        this.y = y;
    }

    public abstract void desenhar(); // classe abstrata não tem código, apenas a implementação

    // classe abstrata não tem toString
}
