package org.example.services;

import org.example.entities.Actividad;
import org.example.entities.Socio;

public class InscripcionService {
    public boolean inscribir(Socio socio, Actividad actividad) {
        return actividad.agregarInscripcion(socio);
    }

    public boolean eliminarInscripcion(Socio socio, Actividad actividad) {
        return actividad.eliminarInscripcion(socio);
    }
}
