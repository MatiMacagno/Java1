public class Main {

    public static void main(String[] args) {
        Casa casa1 = (Casa) FactoryPropiedad.getInstance().crearPropiedad("Casa");
        Casa casa2 = (Casa) FactoryPropiedad.getInstance().crearPropiedad("Casa");

        casa1.setCalle("Av. San Martín");
        casa1.setNumero(130);
        casa1.setMontoBaseImpuesto(500);

        casa2.setCalle("Mitre");
        casa2.setNumero(233);
        casa2.setMontoBaseImpuesto(700);

        BarrioCerrado barrioCerrado1 = (BarrioCerrado) FactoryPropiedad.getInstance().crearPropiedad("BarrioCerrado");
        barrioCerrado1.agregarCasas(casa1);
        barrioCerrado1.agregarCasas(casa2);
        barrioCerrado1.setCalle("Gutierres");
        barrioCerrado1.setNumero(330);
        barrioCerrado1.setMultiplicador(2);

        Municipalidad muni = new Municipalidad("Municipalidad");
        muni.agregar(barrioCerrado1);
        muni.mostrar();


    }










}
