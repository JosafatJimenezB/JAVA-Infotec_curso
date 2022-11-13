package com.example.ApiStream.EjercicioClases;

public class Persona {

    private String nombres;
    private String primerApellido;
    private String segundoApellido;
    private Integer edad;
    private String domicilio;

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String nombreCompleto(){
        return this.nombres + " " + this.primerApellido + " " + this.segundoApellido;
    }

    public void imprimirNombreYDireccion(){
        System.out.println("Nombres: " + this.nombres + " Direcc: " + this.domicilio);
    }

    public Persona(){

    }

    public Persona(String nombres, String pa, String sa, Integer e, String d){
        this.nombres = nombres;
        this.primerApellido = pa;
        this.segundoApellido = sa;
        this.edad = e;
        this.domicilio = d;
    }
}
