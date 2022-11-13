package com.example.ApiStream;

public class PersonaDTO {

    public String nombreApellido;

    public PersonaDTO(Persona persona){
        this.nombreApellido = persona.getNombre() + " " + persona.getApellido();
    }
}
