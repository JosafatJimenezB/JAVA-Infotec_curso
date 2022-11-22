package com.example.EjerciciosTarea.Dia6;

public class Empleado {

    private String nombre;
    private String apellidos;
    private int edad;

    private int codigoEmpleado;

    public Empleado(String nombre, String apellidos, int edad, int codigoEmpleado) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.codigoEmpleado = codigoEmpleado;
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

    public int getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(int codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public void actividadesDiarias(){
        System.out.println("Encender pc");
    }
    public void obtenerActividadesDiarias(){
        actividadesDiarias();
    }
}
