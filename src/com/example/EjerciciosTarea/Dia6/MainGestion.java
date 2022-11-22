package com.example.EjerciciosTarea.Dia6;

public class MainGestion {

    public static void main(String[] args) {

        Programador programador = new Programador("Josafat","Jimenez",21,9000);
        programador.actividadesDiarias();

        Disenador disenador = new Disenador("Manuel", "Torres",30,8000);
        disenador.actividadesDiarias();

    }
}
