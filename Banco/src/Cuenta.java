    public abstract class Cuenta {

    protected double saldo;
    protected Cliente cliente;

    public Cuenta(double saldo, Cliente cliente) {
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public abstract void depositar(double cantidad);

    public abstract void extraerEfectivo(double cantidad);

    public abstract double informarSaldo();

}
