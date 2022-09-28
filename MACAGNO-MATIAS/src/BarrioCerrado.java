import java.util.ArrayList;

public class BarrioCerrado extends Propiedad{

    private int multiplicador;
    private ArrayList<Propiedad> casas = new ArrayList<>();

    public int getMultiplicador() {
        return multiplicador;
    }

    public void setMultiplicador(int multiplicador) {
        this.multiplicador = multiplicador;
    }

    public ArrayList<Propiedad> getCasas() {
        return casas;
    }

    public void setCasas(ArrayList<Propiedad> casas) {
        this.casas = casas;
    }

    public void agregarCasas(Propiedad p){
        casas.add(p);
    }

    @Override
    public double calcularImpuesto() {
        double total = 0;
        for (Propiedad propiedad: casas){
            total += propiedad.calcularImpuesto() * multiplicador;
        }
        return total;
    }
}
