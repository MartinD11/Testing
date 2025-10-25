package EntitiesTest;

import org.example.entities.Actividad;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ActividadTest {


    @Test
    public void toStringValido(){
        String nombre="casino de tandil";
        String encargado= "encargado del casino";
        String horario = "21:21";
        int edadMinima = 18;
        String lugar = "casino de tandil";
        int cupo = 50;

        Actividad a = new Actividad(nombre,encargado,horario,edadMinima,lugar,cupo);

        assertEquals(nombre+"*"+lugar,a.toString());//Ahi lo pasa

    }
}
