package com.example.EjerciciosTarea.Dia4.ClasesEjercicio;

import com.example.EjerciciosTarea.Dia4.ClasesEjercicio.Alumno;
import com.example.EjerciciosTarea.Dia4.ClasesEjercicio.Persona;

public class Main {

    public static void main(String[] args) {

        Persona persona = new Persona();
        Alumno alumno1 = new Alumno();
        Alumno alumno2 = new Alumno();

        Alumno.setPromedio("10");
        Alumno.setAprobado("Si");

        System.out.println("hashcode");
        System.out.println("Alumno 1: " + alumno1.hashCode());
        System.out.println("Alumno 2: " + alumno2.hashCode() + "\n");

        System.out.println(alumno1.infoAlumno(persona));
        System.out.println(alumno1.infoEscolar() + "\n");
        System.out.println(alumno2.infoAlumno(persona));
        System.out.println(alumno2.infoEscolar());




    }
}
