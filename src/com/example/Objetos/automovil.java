package com.example.Objetos;

public class automovil {

    /// Declarando variables para el objeto
    String nombre;
    String marca;
    double km;
    String color;

    static int modelo;

    public static void main(String[] args) {

        automovil.modelo = 2021;

        // Declarando objetos
        automovil auto1 = new automovil();
        /// Atributos del objeto
        auto1.color= "blanco";
        auto1.km = 100d;
        auto1.nombre = "Supre";
        auto1.marca = "Nyse";
        auto1.modelo = 2020;

        automovil auto2 = new automovil();
        /// Atributos del objeto
        auto2.color= "negro";
        auto2.km = 120d;
        auto2.nombre = "Vento";
        auto2.marca = "Nyx";
    }
}
