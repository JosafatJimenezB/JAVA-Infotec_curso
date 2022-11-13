package com.example.herencia.Veterinaria;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Persona> personaList = new ArrayList<>();

        Persona objetoPersona1 = new Doctor();
        Persona objetoPersona2 = new Doctor();
        Persona objetoPersona3 = new Doctor();

        personaList.add(objetoPersona1);
        personaList.add(objetoPersona2);
        personaList.add(objetoPersona3);

        Animal objetoAnimal1 = new Animal();
        Animal objetoAnimal2 = new Animal();
        Animal objetoAnimal3 = new Animal();

        objetoAnimal1.pruebaStatic = "Prueba1";
        System.out.println(objetoAnimal3.pruebaStatic);

        Animal.pruebaStatic = "Prueba2";
        System.out.println(objetoAnimal1.pruebaStatic);

    }
}
