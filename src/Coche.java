import java.util.ArrayList;
import java.util.Calendar;

public class Coche{
    //
    private String marcas;
    private String modelos;
    private int diversidad=0;
    private int num1=1;
    private int num2=31;
    //


    /**
     * Constructor de la clase coche en el que se le pasa dos parametros
     * @param marcas String
     * @param modelos String
     */
    public Coche(String marcas, String modelos) {
        this.marcas = marcas;
        this.modelos = modelos;
        diversidad++;
    }

    public Coche(String marcas) {
        this.marcas = marcas;
    }

    /**
     * Metodod que dice si el concesionario es diverso o no
     * @param a
     * @return
     */
    public int diversidad5(Concesionario a){
        if (diversidad <= 5)
            System.out.println("Concesionario diverso");
        if (diversidad > 5)
            System.out.println("El concesionario no es diverso");
        return diversidad;
    }

    /**
     * Metodo que te devuelve otro coche del mismo modelo
     * @param marca
     * @param modelo
     */
    public String marcaModeloIgual(String marca,String modelo){
        String aux="";
        if (marca.equals(this.marcas) && modelo.equals(this.modelos)){
            aux += "Los coches son de la misma marca y modelo";
        }else {
            aux +="Los coches no son iguales  , "+"estas son las marcas introducidas: "+marca+" "+modelo;
        }
        return aux;
    }

    /**
     * Devuelve otro modelo de la misma marca
     * @param marca
     * @param modelo
     */
    public String devolverOtroCoche(String marca, String modelo){
        String aux="";
        if (modelos.contains(modelo) && marcas.contains(marca)){
          aux += "Este coche tiene varias opciones: Berlina , Sedan";
        }else {
            aux += "null";
        }
        return aux;
    }

    /**
     * Da la fecha de los coches que estan en el concecionario
     */
    public int obtenerFechaCoches(){
         Calendar c;
         c = Calendar.getInstance();
         int numAleatorio=(int)Math.floor(Math.random()*(num1-(num2+1))+(num2));
         c.set(2015,2,numAleatorio);
         System.out.print(marcas+" ");
         System.out.println(modelos+" ");
         System.out.println(c.getTime());
         return numAleatorio;
    }

    /**
     * Compara dos coches si son iguales
     * @param marca
     * @param modelo
     * @return
     */
    public boolean iguales(String marca , String modelo){
        if (marcas.equals(marca) && modelos.equals(modelo)) {
            System.out.println("Los coches a comparar son iguales");
            return true;
        }
        if (!marcas.equals(marca) && !modelos.equals(modelo)){
            System.out.println("Los coches a comparar no son iguales");
            return false;
        }
        return false;
    }

    /**
     * Devuelve coches entre 5 y 20 caracteres
     * @param marca
     * @param modelo
     */
    public void cochesNombre5Y20Carac(String marca,String modelo){/////
        if (marca.length()<5 && modelo.length()<5)
            System.out.println(marca+modelo);
        if (marca.length()>5 && modelo.length()>5)
            System.out.println("Menor que");
    }


    /**
     * ToString de Coche
     * @return
     */
    @Override
    public String toString() {
        return "marcas:" + marcas +
                " , modelos:" + modelos;
    }
}
