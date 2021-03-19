package meli.java;

public class Fraccion {
    private int numerador;
    private int denominador;

    public Fraccion(int numerador) {
        this.numerador = numerador;
        this.denominador = 1;
    }

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    private Fraccion operationSum( Fraccion f2, int signo) {
        int den = this.denominador * f2.getDenominador();
        int num = (den / this.denominador * this.numerador)
                    + (signo) * (den / f2.getDenominador() * f2.getNumerador());
        return new Fraccion(num, den);
    }

    public Fraccion sumar(Fraccion f2) {
        return operationSum(f2, 1);
    }
    public Fraccion sumar(int val2) {
        Fraccion f2 = new Fraccion(val2);
        return sumar(f2);
    }

    public Fraccion restar(Fraccion f2) {
        return operationSum(f2, -1);
    }
    public Fraccion restar(int val2) {
        Fraccion f2 = new Fraccion(val2);
        return restar(f2);
    }


    public Fraccion multiplicar(Fraccion f2) {
        int num = this.numerador * f2.getNumerador();
        int den = this.denominador * f2.getDenominador();
        return new Fraccion(num, den);
    }
    public Fraccion multiplicar(int val2) {
        Fraccion f2 = new Fraccion(val2);
        return multiplicar(f2);
    }

    public Fraccion dividir(Fraccion f2) {
        int num = this.numerador * f2.getDenominador();
        int den = this.denominador * f2.getNumerador();
        return new Fraccion(num, den);
    }
    public Fraccion dividir(int val2) {
        Fraccion f2 = new Fraccion(val2);
        return dividir(f2);
    }

    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }
}
