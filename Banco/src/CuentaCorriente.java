public class CuentaCorriente extends Cuenta {

    private double montoGiroEnDescubierto;

    public CuentaCorriente(double saldo, Cliente cliente) {
        super(saldo, cliente);
    }

    public CuentaCorriente(double saldo, Cliente cliente, double montoGiroEnDescubierto) {
        super(saldo, cliente);
        this.montoGiroEnDescubierto = montoGiroEnDescubierto;
    }


    public void giroDescubierto (double cantidad) {
        if (cantidad > saldo) {
            montoGiroEnDescubierto = cantidad - saldo;
            saldo = 0 - montoGiroEnDescubierto;
        }
    }

    @Override
    public void depositar(double cantidad) {
        saldo = saldo + cantidad;
        System.out.println("El nuevo saldo de tu cuenta corriente " + saldo);
    }

    @Override
    public void extraerEfectivo(double cantidad) {
        saldo = saldo - cantidad;
        System.out.println("El nuevo saldo de tu cuenta corriente " + saldo);
    }

    @Override
    public double informarSaldo() {
        return saldo;
    }


}




