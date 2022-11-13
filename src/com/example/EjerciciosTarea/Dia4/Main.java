package com.example.EjerciciosTarea.Dia4;

public class Main {

    public static void main(String[] args) {

        Persona persona = new Persona();
        Alumno alumno = new Alumno();

        System.out.println(alumno.infoAlumno(persona));

        Alumno.setPromedio("10");
        Alumno.setAprobado("Si");

        System.out.println(alumno.infoEscolar());

    }
}
