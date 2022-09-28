public class Verde implements Estado{

    private Semaforo s;

    public Verde(Semaforo s){
        this.s = s;

    }

    @Override
    public void mostrarAviso() {
        System.out.println("Estoy en verde");
    }

    @Override
    public void cambiarEstado() {
        s.setEstado(new Amarillo(s));
    }
}
