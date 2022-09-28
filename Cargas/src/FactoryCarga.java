public class FactoryCarga {

    private static FactoryCarga factory;

    private FactoryCarga(){

    }

    public static FactoryCarga getInstance(){
        if (factory == null)
            factory = new FactoryCarga();
        return factory;
    }

    public Cargas crearCarga (String tipo){

        switch (tipo){
            case "CargaSimple":
                return new CargaSimple();
            case "Contenedor":
                return new Contenedor();
            default:
                return null;
        }
    }
}
