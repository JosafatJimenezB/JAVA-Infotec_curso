package com.example.GestionSupermercado;

public class Empleado {

    private String nombre;
    private Integer edad;
    private Integer antiguedad;
    private Empleado empleado;

    private Integer reibirPago = 1200;

    public Empleado(){

    }

    public Empleado(String nombre, Integer edad, Integer antiguedad, Empleado empleado, Integer reibirPago) {
        this.nombre = nombre;
        this.edad = edad;
        this.antiguedad = antiguedad;
        this.empleado = empleado;
        this.reibirPago = reibirPago;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(Integer antiguedad) {
        this.antiguedad = antiguedad;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public void setReibirPago(Integer reibirPago){
        this.reibirPago = reibirPago;
    }

    public Integer getReibirPago(){
        return reibirPago;
    }
}
