import java.util.ArrayList;

public class Contenedor extends Cargas{

    private double pesoContenedor;
    private ArrayList<Cargas> cargas = new ArrayList<>();

    public double getPesoContenedor() {
        return pesoContenedor;
    }

    public void setPesoContenedor(double pesoContenedor) {
        this.pesoContenedor = pesoContenedor;
    }

    public ArrayList<Cargas> getCargas() {
        return cargas;
    }

    public void setCargas(ArrayList<Cargas> cargas) {
        this.cargas = cargas;
    }


    public void agregarCarga(Cargas c){
        cargas.add(c);
    }

    @Override
    public double calcularPeso() {
        double total = 0;
        for (Cargas carga : cargas){
            total += carga.calcularPeso();
        }
        return total + pesoContenedor;
    }
}
