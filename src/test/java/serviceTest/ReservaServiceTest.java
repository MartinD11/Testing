package serviceTest;

import org.example.entities.Recurso;
import org.example.entities.Reserva;
import org.example.entities.Socio;
import org.example.services.ReservaService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ReservaServiceTest {
    private ReservaService reservaService = new ReservaService();

    @BeforeEach
    public void setUp() {
        reservaService = new ReservaService();
    }

    @Test
    public void reservarRecursoDisponible(){
        Recurso r = new Recurso("fichas","casino");
        Socio socio = new Socio("Conan",84,"casa rosada","875875");
        LocalDateTime inicio = LocalDateTime.of(2025,8,11,17,0);
        LocalDateTime fin = LocalDateTime.of(2025,8,11,18,0);

        //se deberia de poder agregar el primero sin problema
        assertTrue(reservaService.reservar(r,socio,inicio,fin));

        //instancio otro socio para comparar

        Socio socio2 = new Socio("Milton",85,"casa rosada","8753875");
        LocalDateTime inicio1 = LocalDateTime.of(2025,8,11,14,0);
        LocalDateTime fin1 = LocalDateTime.of(2025,8,11,15,0);

        assertTrue(reservaService.reservar(r,socio2,inicio1,fin1));
    }

    @Test
    void cancelarReservaSiendoOtroSocioTest(){
        Recurso r = new Recurso("fichas","casino");
        Socio socio = new Socio("Conan",84,"casa rosada","875875");
        LocalDateTime inicio = LocalDateTime.of(2025,8,11,17,0);
        LocalDateTime fin = LocalDateTime.of(2025,8,11,18,0);

        //se deberia de poder agregar el primero sin problema
        assertTrue(reservaService.reservar(r,socio,inicio,fin));

        Socio socio2 = new Socio("Milton",85,"casa rosada","8753875");
        assertFalse(reservaService.cancelarReserva(r, socio2, inicio, fin));

    }

    @Test
    void cancelarReservaTest(){
        Recurso r = new Recurso("fichas","casino");
        Socio socio = new Socio("Conan",84,"casa rosada","875875");
        LocalDateTime inicio = LocalDateTime.of(2025,8,11,17,0);
        LocalDateTime fin = LocalDateTime.of(2025,8,11,18,0);

        //se deberia de poder agregar el primero sin problema
        reservaService.reservar(r,socio,inicio,fin);

        assertTrue(reservaService.cancelarReserva(r, socio, inicio, fin));

    }



}
