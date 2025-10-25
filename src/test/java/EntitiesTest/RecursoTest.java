package EntitiesTest;

import org.example.entities.Recurso;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNull;

public class RecursoTest {
    @Test
    void nombreOficinaTest(){
        String nombre ="oficina";
        String ubicacion ="ubicacion";

        Recurso r = Recurso.createRecurso(nombre,ubicacion);

        assertNull(r);

    }

}
