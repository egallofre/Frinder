package com.software.egallofre.openwebnavigationdraw.models;

/**
 * Created by egallofre on 13/05/2016.
 */
public class ItemPersona {
    private String nombre;
    private int edad;
    private int tipoCoincidencia;

    public ItemPersona(String nombre, int edad, int tipoCoincidencia) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipoCoincidencia = tipoCoincidencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTipoCoincidencia() {
        return tipoCoincidencia;
    }

    public void setTipoCoincidencia(int tipoCoincidencia) {
        this.tipoCoincidencia = tipoCoincidencia;
    }

}
