package com.example.EjerciciosTarea.Dia7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Ejercicio de la hora
        EjercicioHora hora = new EjercicioHora();

        hora.obtenerHora(22);


        // Ejercicio Triangulo
        Scanner sc = new Scanner(System.in);
        Triangulo triangulo = new Triangulo();

        triangulo.generarTriangulo(5);
    }

}
