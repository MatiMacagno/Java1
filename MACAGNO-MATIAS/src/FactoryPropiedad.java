public class FactoryPropiedad {

    private static FactoryPropiedad factory;

    public FactoryPropiedad(){

    }

    public static FactoryPropiedad getInstance(){
        if (factory == null)
            factory = new FactoryPropiedad();
        return factory;
    }

    public Propiedad crearPropiedad(String tipo){
        switch (tipo){
            case "Casa":
                return new Casa();
            case "BarrioCerrado":
                 return new BarrioCerrado();
            default:
                return null;
        }
    }


}
