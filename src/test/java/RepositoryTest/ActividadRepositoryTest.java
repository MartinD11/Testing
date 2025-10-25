package RepositoryTest;

import org.example.entities.Actividad;
import org.example.repositories.ActividadRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ActividadRepositoryTest {

    private ActividadRepository actividades;

    @BeforeEach
    void setUp(){
        this.actividades = new ActividadRepository();
    }

    @Test
    void addActividad(){
        Actividad actividad = new Actividad( "ruleta",  "colorado el 21",  "21:21",  21,  "Casino",  100);
        actividades.agregar(actividad);
        assertNotNull(actividades.buscarPorNombre("ruleta"));
    }

    @Test
    void deleteActividad(){
        Actividad actividad = new Actividad( "Padel",  " Club Nahuel",  "21:21",  21,  "Club Nahuel",  100);
        actividades.agregar(actividad);
        actividades.eliminar("Padel");

        assertFalse(actividades.existeActividad(actividad));

    }

    @Test
    void updateActividad(){
        Actividad actividad = new Actividad( "Padel",  " Club Nahuel",  "21:21",  21,  "Club Nahuel",  100);

        actividades.agregar(actividad);

        actividad.setEdadMinima(80);

        assertEquals(80, actividad.getEdadMinima());
    }


}
