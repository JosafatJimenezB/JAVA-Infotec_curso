package com.example.ApiStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        /*List<Integer> numeros = new ArrayList<>();

        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);*/


//        List<Integer> numerosFiltrados = new ArrayList<>();

//        for (int i = 0; i < numeros.size(); i++){
//            if (numeros.get(i) > 30){
//                numerosFiltrados.add(numeros.get(i));
//            }
//        }

//        System.out.println(numerosFiltrados);
//        List<Integer> apiFiltro = numeros.stream().filter((Integer parametro1) -> {
//            return parametro1 > 30;
//        }).collect(Collectors.toList());
//
//        System.out.println(apiFiltro);


        // Modificar los numeros


        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona(1,"Juan1","Lopez1"));
        personas.add(new Persona(2,"Juan2","Lopez2"));
        personas.add(new Persona(3,"Juan3","Lopez3"));
        personas.add(new Persona(4,"Juan4","Lopez4"));
        personas.add(new Persona(5,"Juan5","Lopez5"));

        List<PersonaDTO> dataDTO = new ArrayList<>();
        for (Persona persona:personas){
            dataDTO.add(new PersonaDTO(persona));
        }

        for (PersonaDTO persona:dataDTO){
            System.out.println(persona.nombreApellido);
        }

        List<PersonaDTO> personaDATA = personas.stream().map(PersonaDTO::new).collect(Collectors.toList());

        personaDATA.stream().forEach(i -> System.out.println(i.nombreApellido));

    }

}
