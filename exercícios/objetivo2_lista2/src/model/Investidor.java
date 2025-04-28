package model;

// Interfaces em Java:

// São contratos: definem métodos que as classes que implementarem devem obrigatoriamente seguir.
// Só têm assinaturas de métodos (não têm implementação concreta).
// Métodos em interfaces são implicitamente públicos e abstratos (não precisa escrever public abstract).
// Uma classe pode implementar múltiplas interfaces (Java permite "herança múltipla" de interfaces).
// Interfaces ajudam a aumentar o desacoplamento e facilitar a manutenção do código.
// Não é possível criar instâncias diretas de interfaces (não pode fazer `new Investidor()`).

public interface Investidor {
    public String getTicker();
    public void setTicker(String ticker);
    public int getQdeCotas();
    public void setQdeCotas(int qdeCotas);
}
