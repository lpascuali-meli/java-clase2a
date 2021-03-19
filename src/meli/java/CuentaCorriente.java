package meli.java;

public class CuentaCorriente {
    private double saldo;

    public CuentaCorriente() {
        this.saldo = 0;
    }

    public CuentaCorriente(String titular) {
        this.saldo = saldo;
    }

    public CuentaCorriente(double saldo) {
        this.saldo = saldo;
    }

    public CuentaCorriente(CuentaCorriente cc) {
        this.saldo = cc.saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void ingreso(double ingreso) {
        this.saldo += ingreso;
    }

    public boolean egreso(double egreso) {
        if (egreso > this.saldo) return false;
        this.saldo -= egreso;
        return true;
    }

    public void reintegro(double valor) {
        this.ingreso(valor);
    }

    public boolean transferencia(double valor, CuentaCorriente ccDestinatario) {
        if (valor > this.saldo) return false;
        this.egreso(valor);
        ccDestinatario.ingreso(valor);
        return true;
    }
}
