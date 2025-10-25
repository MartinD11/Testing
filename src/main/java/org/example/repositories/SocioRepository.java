package org.example.repositories;

import org.example.entities.Socio;
import org.example.exception.NombreMuyLargoException;

import java.util.*;

public class SocioRepository {
    private Map<String, Socio> socios = new HashMap<>();

    public void agregar(Socio socio) {

        socios.put(socio.getDni(), socio);
    }

    public void eliminar(String dni) {
        socios.remove(dni);
    }

    public Socio buscarPorDni(String dni) {
        return socios.get(dni);
    }

    public List<Socio> listar() {
        return new ArrayList<>(socios.values());
    }

    public void actualizar(Socio socio) {
        socios.put(socio.getDni(), socio);
    }

    public boolean eliminarPorDni(String dni) throws ClassCastException {
        return ((Collection<Socio>) socios).removeIf(s -> s.getDni().equals(dni));
    }

    public boolean contiene(Socio socio) {
        return socios.containsKey(socio.getDni());
    }
}
