public class Amarillo implements Estado{

    private Semaforo s;

    public Amarillo(Semaforo s){
        this.s = s;
    }

    @Override
    public void mostrarAviso() {
        System.out.println("Estoy en amarillo");
    }

    @Override
    public void cambiarEstado() {
        s.setEstado(new Rojo(s));
    }
}
