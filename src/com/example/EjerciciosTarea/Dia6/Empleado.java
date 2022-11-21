package com.example.EjerciciosTarea.Dia6;

public class Empleado {

    private String nombre;
    private String apellidos;
    private int edad;
    private String[] actividades;

    public Empleado(String nombre, String apellidos, int edad, String[] actividades) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.actividades = actividades;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String[] getActividades() {
        return actividades;
    }

    public void setActividades(String[] actividades) {
        this.actividades = actividades;
    }
}
