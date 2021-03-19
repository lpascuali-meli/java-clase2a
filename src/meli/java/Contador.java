package meli.java;

public class Contador {
    private int valor;

    public Contador() {
        this.valor = 0;
    }

    public Contador(int valor) {
        this.valor = valor;
    }

    public Contador(Contador cont) {
        this.valor = cont.valor;
    }

    public int getValor() {
        return valor;
    }

    public void incrementar() {
        this.valor += 1;
    }

    public void decrementar() {
        this.valor -= 1;
    }
}
