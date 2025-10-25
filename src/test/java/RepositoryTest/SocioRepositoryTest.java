package RepositoryTest;

import org.example.entities.Socio;
import org.example.repositories.SocioRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SocioRepositoryTest {

    private SocioRepository socioRepository;

    @BeforeEach
    public void setUp() {
        socioRepository = new SocioRepository();
    }

    @Test //Alta
    void addSocioTest(){
        Socio s1 = new Socio("Mateo", 22, "Por ahi", "212255");

        socioRepository.agregar(s1);

        assertTrue(socioRepository.contiene(s1));
    }

    @Test //Baja
    void deleteSocioTest(){
        Socio s2 = new Socio("Todo", 1, "av buzon y av Brasil", "212");

        socioRepository.agregar(s2);

        socioRepository.eliminar(s2.getDni());

        assertNull(socioRepository.buscarPorDni(s2.getDni()),"el elemento fue borrado");
    }

    @Test //Baja
    void deleteSocioExceptionTest()  {
        Socio s2 = new Socio("Todo", 1, "av buzon y av Brasil", "212");

        socioRepository.agregar(s2);

        assertThrows(ClassCastException.class,()->socioRepository.eliminarPorDni(s2.getDni()));
    }


    @Test //Modificacion
    void updateSocioTest(){
        Socio s2 = new Socio("Martincito timbero", 17, "av buzon y av Brasil", "212");

        socioRepository.agregar(s2);
        s2.setDireccion("qqqq");
        socioRepository.actualizar(s2);

        assertEquals("qqqq", s2.getDireccion(),"EL TEST PASO CON EXITO");
    }




}

