import java.util.ArrayList;

public class Municipalidad {

    private String nombre;
    private ArrayList<Propiedad> Propiedades = new ArrayList<>();

    public Municipalidad(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Propiedad> getPropiedades() {
        return Propiedades;
    }

    public void setPropiedades(ArrayList<Propiedad> propiedades) {
        Propiedades = propiedades;
    }

    public void agregar(Propiedad p){
        Propiedades.add(p);
    }

    public void mostrar(){
        for (Propiedad propiedad: Propiedades){
            System.out.println(propiedad.getCalle() + " " + propiedad.getNumero() + " y el impuesto tiene un valor de $" + propiedad.calcularImpuesto());
        }
    }
}
