public class Casa extends Propiedad {

    private double montoBaseImpuesto;

    public double getMontoBaseImpuesto() {
        return montoBaseImpuesto;
    }

    public void setMontoBaseImpuesto(double montoBaseImpuesto) {
        this.montoBaseImpuesto = montoBaseImpuesto;
    }


    @Override
    public double calcularImpuesto() {
        if(this.getCalle().equals("Av. San Martín"))
            return montoBaseImpuesto + (montoBaseImpuesto*0.10);
        return montoBaseImpuesto;
    }
}
