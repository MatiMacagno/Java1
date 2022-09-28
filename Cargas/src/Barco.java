import java.util.ArrayList;

public class Barco {

    private String nombre;
    private ArrayList<Cargas> listaCargas = new ArrayList<>();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Cargas> getListaCargas() {
        return listaCargas;
    }

    public void setListaCargas(ArrayList<Cargas> listaCargas) {
        this.listaCargas = listaCargas;
    }

    public void agregarCarga(Cargas c){
        listaCargas.add(c);
    }

    public void mostrar(){
        for (Cargas cargas: listaCargas)
            System.out.println(cargas.getNombre() + " y el peso es: " + cargas.calcularPeso() + " kg");
    }
}
