package com.example.Polimorfismo;

import com.example.Objetos.Person;

public abstract class Persona {

    private String nombre;

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public Persona(String nombre){
        super();
        this.nombre = nombre;
    }

    public abstract Boolean trabajando();

    public static void main(String[] args) {


        /// Instanciando a los objetos
        Persona i = new Doctor("Pedro");
        Persona j = new Abogado("Gema");

        /// Imprimiendo en consola
        System.out.println(i.trabajando());
        System.out.println(j.trabajando());
    }

}
