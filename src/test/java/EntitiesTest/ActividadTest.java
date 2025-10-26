package EntitiesTest;

import org.example.entities.Actividad;
import org.example.entities.Socio;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ActividadTest {


    @Test
    void toStringValido(){
        String nombre="casino de tandil";
        String encargado= "encargado del casino";
        String horario = "21:21";
        int edadMinima = 18;
        String lugar = "casino de tandil";
        int cupo = 50;

        Actividad a = new Actividad(nombre,encargado,horario,edadMinima,lugar,cupo);

        assertEquals(nombre+"*"+lugar,a.toString());//Ahi lo pasa
    }

    @Test
    void inscribirseABoxeoCon16AniosTest(){
        Actividad boxeo = new Actividad("boxeo", "Martin", "20:00", 16, "Club Maravilla", 8);

        Socio s = new Socio("Mateo", 15, "Yrigoyen 589", "146993");

        assertFalse(boxeo.agregarInscripcion(s));
    }

    @Test
    void capacidadPorCupoTest(){
        Actividad boxeo = new Actividad("Padel", "Juan Miguel", "19:45", 10, "Club Maravilla", 2);
        Socio s1 = new Socio("Lautaro", 25, "Ramos mejia 200", "146878");
        Socio s2 = new Socio("Ulises", 22, "Arroyo seco 2000", "112368");
        Socio s3 = new Socio("Mauro", 15, "San Martin 475", "100002");

        assertAll(
                ()->assertTrue(boxeo.agregarInscripcion(s1)),
                ()->assertTrue(boxeo.agregarInscripcion(s2)),
                ()->assertFalse(boxeo.agregarInscripcion(s3))
        );



    }
}
