import java.util.Calendar;

public class MainConcesionario {
    public static void main(String[] args) {
        Concesionario c1 = new Concesionario("BuyACar");
        Coche coche1 = new Coche("Ford","Mondeo");
        Coche coche2 = new Coche("Citroen","Picasso");
        Coche coche3 = new Coche("Lexus","is300");
        Coche coche4 = new Coche("Audi","A4");
        Coche coche5 = new Coche("Audi","A8");
        System.out.println(c1);

        coche2.marcaModeloIgual("Citroen","C4");
        coche1.marcaModeloIgual("Ford","Mondeo");
        coche1.diversidad5(c1);
        coche1.obtenerFechaCoches();
        coche2.obtenerFechaCoches();
        coche1.cochesNombre5Y20Carac("Lexus","is350");

        c1.tiempoEnConcesionario(coche3);


        coche1.iguales("Citroen","Picasso");
        coche1.devolverOtroCoche("Ford","Mondeo");



    }
}
