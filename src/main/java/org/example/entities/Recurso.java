package org.example.entities;

public class Recurso {
    private String nombre;
    private String ubicacion;

    public Recurso(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public static Recurso createRecurso(String nombre, String ubicacion){
        if("oficina".equals(nombre)){
            return null;
        }

        return new Recurso(nombre, ubicacion);
    }

    public String getNombre() {
        return nombre;
    }
    public String getUbicacion() {
        return ubicacion;
    }

    // Getters y setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}
