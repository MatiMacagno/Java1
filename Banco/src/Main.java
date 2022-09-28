public class Main {

    public static void main(String[] args) {

        Cliente christian = new Cliente(2, "Carrero", 5, 9);
        CuentaCorriente cuentaC1 = new CuentaCorriente(50000, new Cliente(1, "Macagno", 43, 7));
        CuentaCorriente cuentaCristian = new CuentaCorriente(50000, christian);
        
        cuentaCristian.depositar(7000);


        cuentaCristian.extraerEfectivo(56000);
        System.out.println(cuentaCristian.saldo);


        CajaDeAhorro CA1 = new CajaDeAhorro(10000, christian);
        cuentaCristian.depositar(5000);
        CA1.depositar(5000);

        cuentaCristian.extraerEfectivo(56000);
        System.out.println(cuentaCristian.saldo);

        cuentaCristian.giroDescubierto(3000);
        System.out.println(cuentaCristian.saldo);







    }



}
