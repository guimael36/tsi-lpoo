package model;

public interface Investidor {
    //Todos atributos são constantes
    //Todos os métodos são públicos e abstratos (não precisa declarar)
    String getTicker();
    void setTicker(String ticker);
    int getQuantidade();
    void setQuantidade(int quantidade);
}
