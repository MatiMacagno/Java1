public class Semaforo implements Estado{

    private Estado estado;

    public Estado getEstado() {
        return estado;
    }

    public Semaforo () {
        this.setEstado(new Verde(this));
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public void mostrarAviso() {
        getEstado().mostrarAviso();
    }

    @Override
    public void cambiarEstado() {
        getEstado().cambiarEstado();
    }
}
