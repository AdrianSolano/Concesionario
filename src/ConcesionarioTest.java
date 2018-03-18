import org.junit.jupiter.*;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


public class ConcesionarioTest {
    private static Coche[] coches;
    private static int posActual = 0;
    private Coche cocheAProbar = null;


    @BeforeAll
    static void crearCoches() {
        coches = new Coche[10];
        coches[0] = new Coche("Ford", "Mondeo");
        coches[1] = new Coche("Citroen", "Picasso");
        coches[2] = new Coche("Lexus", "is300");
        coches[3] = new Coche("Audi", "A4");
        coches[4] = new Coche("Audi", "A8");
    }

    @BeforeEach
    void prepararCochuesProbar() {
        cocheAProbar = coches[posActual];
        System.out.println(cocheAProbar);
    }

    @AfterEach
    void aumentarPosicion() {
        posActual += 1;
        System.out.println("Posicion " + posActual);
    }

    @AfterAll
    static void terminar() {
        System.out.println("Pruebas han finalizado con un total "+posActual+" pruebas");
    }


    @Test
    void probarSiSonIguales1() {
        assertTrue(cocheAProbar.iguales("Ford", "Mondeo"));
    }
    @Test
    void probarSiSonIguales2(){
        assertFalse(cocheAProbar.iguales("Citroen", "Picasso"));
    }

    @Test
    void probarDiversidad1(){
        Concesionario c = new Concesionario("Nombre");
        assertNotNull(cocheAProbar.diversidad5(c));
    }
    @Test
    void probarDiversidad2(){
        Concesionario r1 = null;
        assertNull(cocheAProbar.diversidad5(r1));
    }

    @Test
    void marcaModeloIgual1(){
        assertNotSame(cocheAProbar.marcaModeloIgual("Ford", "Mondeo"),"Citroen");
    }
    @Test
    void marcaModeloIgual2(){
        assertSame(cocheAProbar.marcaModeloIgual("Ford","Mondeo"),"Ford Mondeo");
    }

    @Test
    void devolverOtroCoche1(){
        assertNotNull(cocheAProbar.devolverOtroCoche("Lexus", "is300"));
    }
    @Test
    void test(){
        Coche o = new Coche("","");
        assertSame(o,o);
    }
    @Test
    void test2(){
        Coche o = new Coche("","");
        boolean[] coches1 = new boolean[3];
        boolean[] coches2 = new boolean[3];

        coches1[0] = o.iguales("Ford", "Mondeo");
        coches1[1] = o.iguales("Citroen", "Picasso");
        coches1[2] = o.iguales("Lexus", "is300");

        coches2[0] = o.iguales("Ford", "Mondeo");
        coches2[1] = o.iguales("Lexus", "is250");
        coches2[2] = o.iguales("Lexus", "is300");

        assertArrayEquals(coches1,coches2);
    }



}
