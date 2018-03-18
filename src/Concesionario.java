import java.util.Calendar;

public class Concesionario {

    private String nombreCon;
    private int num1=1;
    private int num2=31;

    /**
     * Constructor principal de Concesionario
     * @param nombreCon
     */
    //
    public Concesionario(String nombreCon) {
        this.nombreCon = nombreCon;
    }
    //

    /**Metodo que te devuelve el tiempo en el concecionario de un coche
     * @param n coche
     * @return
     */
    public Calendar tiempoEnConcesionario(Coche n){
        Calendar c = Calendar.getInstance();
        int numAleatorio=(int)Math.floor(Math.random()*(num1-(num2+1))+(num2));
        c.set(2012,2,numAleatorio);
        System.out.println("Tiempo que lleva en le concesionario: "+c.getTime());
        return c;
    }
    //

    /**
     * ToString concesionario
     * @return
     */
    @Override
    public String toString() {
        return "Concesionario: " + nombreCon;
    }
}
