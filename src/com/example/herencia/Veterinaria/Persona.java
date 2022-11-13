package com.example.herencia.Veterinaria;

public abstract class Persona extends Habilidad{

    private String nombre;
    private String apellido;

    public Persona(){

    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombreCompleto(){
        return nombre == null ? "Sin dato" :  nombre + " " + (apellido == null ? "": apellido);
    }

    public abstract void pruebaAbstracto();
}