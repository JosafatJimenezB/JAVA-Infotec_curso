package com.example.EjerciciosTarea.Dia4.Herencia;

public class Triangulo extends Figura{

    Triangulo(Integer a, Integer b){
        super(a, b);
    }

    @Override
    public double area(){
        area = ancho * alto / 2;
        return area;
    }
}
