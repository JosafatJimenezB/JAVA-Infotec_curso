package com.example.clasesReferencias;

public class Cliente {

    // variables que se usaran
    private String nombre;
    private Double cantidadDinero;

    // Declarando el constructor de la clase
    public Cliente(String nombre, Double cantidadDinero){

        // Referenciamos a las variables
        this.nombre = nombre;
        this.cantidadDinero = cantidadDinero;
    }

    // Generanado getter para retornar el nombre
    public String getNombre(){
        return nombre;
    }
    // Generando un setter para ingresar el nombre
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public Double getCantidadDinero(){
        return cantidadDinero;
    }

    public void setCantidadDinero(Double cantidadDinero){
        this.cantidadDinero = cantidadDinero;
    }
}
