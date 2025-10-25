package org.example.entities;

import org.example.exception.DocumentoInvalido;
import org.example.exception.EdadInvalidaException;
import org.example.exception.NombreMuyLargoException;

public class Socio {
    private String nombre;
    private int edad;
    private String direccion;
    private String dni;

    public Socio(String nombre, int edad, String direccion, String dni) throws NombreMuyLargoException, EdadInvalidaException {
        if (nombre.length()>51)
            throw new NombreMuyLargoException("muy largo");
        this.nombre = nombre;
        if (edad <0 ||edad >100)
            throw new EdadInvalidaException("edad invalido");
        this.edad = edad;
        this.direccion = direccion;
        if (!esDNIValido(dni)) {
            throw new DocumentoInvalido("DNI invalido");
        }
        this.dni = dni;
    }

    private boolean esDNIValido(String dni){
        return ((dni.length() == 6 || dni.length() == 7) && (!dni.contains(".")));
    }
    public int getEdad() {
        // TODO Auto-generated method stub
        return this.edad;
    }

    public String getDni() {
        // TODO Auto-generated method stub
        return this.dni;
    }

    public String getNombre() {
        // TODO Auto-generated method stub
        return this.nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setDni(String dni) throws DocumentoInvalido {
        if (esDNIValido(dni))
            this.dni = dni;
    }
}
