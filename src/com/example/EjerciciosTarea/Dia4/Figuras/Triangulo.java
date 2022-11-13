package com.example.EjerciciosTarea.Dia4.Figuras;

public class Triangulo extends Figura{

    Triangulo(Integer a, Integer b){
        super(a, b);
    }

    @Override
    public double area(){
        area = Double.valueOf((ancho * alto) / 2);
        return area;
    }
}
