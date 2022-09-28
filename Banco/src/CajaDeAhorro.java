public class CajaDeAhorro extends Cuenta {

    private double tasaDeInteres;

    public CajaDeAhorro(double saldo, Cliente cliente) {
        super(saldo, cliente);
    }

    public CajaDeAhorro(double saldo, Cliente cliente, double tasaDeInteres) {
        super(saldo, cliente);
        this.tasaDeInteres = tasaDeInteres;
    }

    public void cobrarInteres () {
        saldo = saldo + ((saldo*tasaDeInteres)/100);
    }

    @Override
    public void depositar(double cantidad) {
        saldo = saldo + cantidad;
        System.out.println("El nuevo saldo de tu caja de ahorro es " + saldo);
    }

    @Override
    public void extraerEfectivo(double cantidad) {
        saldo = saldo - cantidad;
        System.out.println("El nuevo saldo de tu caja de ahorro es " + saldo);
    }

    @Override
    public double informarSaldo() {
        return saldo;
    }
}
