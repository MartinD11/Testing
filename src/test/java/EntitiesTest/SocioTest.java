package EntitiesTest;

import org.example.entities.Socio;
import org.example.exception.DocumentoInvalido;
import org.example.exception.EdadInvalidaException;
import org.example.exception.NombreMuyLargoException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SocioTest {
    @Test
    public void crearSocioValido()throws EdadInvalidaException, NombreMuyLargoException {
        String nombre = "casino";
        int edad = 21;
        String direccion = "brasil y buzon";
        String dni = "43785458";

        Socio socio  = new Socio(nombre, edad, direccion, dni);

        assertEquals(nombre, socio.getNombre());
        assertEquals(edad, socio.getEdad());
        assertEquals(direccion, socio.getDireccion());
        assertEquals(dni, socio.getDni());
        assertNotNull(socio);
    }

    @Test
    void crearSocioConEdadInvalida() throws EdadInvalidaException {
        assertThrows(EdadInvalidaException.class,()->new Socio("sad", 200, "ppp", "2566"));
    }

    @Test
    void crearSocioConNombreInvalido() throws NombreMuyLargoException {
        assertThrows(NombreMuyLargoException.class,()->new Socio("saddlaskdjasjdlkasjdklasjdlkasjdlkasjkjdaskljdasdlkasdjasjda", 21, "ppp", "2566"));
    }

    @Test
    void dniValidoTest(){
        assertThrows(DocumentoInvalido.class, ()->new Socio("lauti", 21, "pinto 222", "44444") );
    }
}
