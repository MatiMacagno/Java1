public class CargaSimple extends Cargas{

    private double pesoCarga;
    private boolean necesitaRefrigeracion;

    public double getPesoCarga() {
        return pesoCarga;
    }

    public void setPesoCarga(double pesoCarga) {
        this.pesoCarga = pesoCarga;
    }

    public boolean isNecesitaRefrigeracion() {
        return necesitaRefrigeracion;
    }

    public void setNecesitaRefrigeracion(boolean necesitaRefrigeracion) {
        this.necesitaRefrigeracion = necesitaRefrigeracion;
    }

    @Override
    public double calcularPeso() {
        if(necesitaRefrigeracion == true)
            return pesoCarga + (pesoCarga * 0.10);
        return pesoCarga;
    }
}
