public class Main {
    public static void main(String[] args) {

        CargaSimple TV32LCD = (CargaSimple) FactoryCarga.getInstance().crearCarga("CargaSimple");
        TV32LCD.setPesoCarga(3);
        TV32LCD.setNecesitaRefrigeracion(false);

        CargaSimple medicamentos = (CargaSimple) FactoryCarga.getInstance().crearCarga("CargaSimple");
        medicamentos.setPesoCarga(2);
        medicamentos.setNecesitaRefrigeracion(true);

        Contenedor contenedor = (Contenedor) FactoryCarga.getInstance().crearCarga("Contenedor");
        contenedor.setNombre("contenedor francia");
        contenedor.setPesoContenedor(100);

        contenedor.agregarCarga(TV32LCD);
        contenedor.agregarCarga(medicamentos);

        System.out.println(contenedor.calcularPeso());

        Barco barco = new Barco();
        barco.agregarCarga(contenedor);
        barco.mostrar();













    }
}
