package org.example.repositories;

import org.example.entities.Recurso;

import java.util.HashMap;
import java.util.Map;

public class RecursoRepository {
    private Map<String, Recurso> recursos = new HashMap<>();
    public Recurso buscarPorNombre(String nombreRecurso) {
        // TODO Auto-generated method stub
        return null;
    }

    public void agregar(Recurso recurso) {
        recursos.put(recurso.getNombre(),recurso);

    }
}
