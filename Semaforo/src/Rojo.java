public class Rojo implements Estado{

    private Semaforo s;

    public Rojo(Semaforo s){
        this.s = s;

    }

    @Override
    public void mostrarAviso() {
        System.out.println("Estoy en rojo");
    }

    @Override
    public void cambiarEstado() {
        s.setEstado(new Verde(s));
    }
}
