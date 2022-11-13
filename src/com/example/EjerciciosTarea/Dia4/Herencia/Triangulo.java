package com.example.EjerciciosTarea.Dia4.Herencia;

public class Triangulo extends Figura{

    Triangulo(Integer ancho, Integer alto){
        super(ancho, alto);
    }

    @Override
    public double area(){
        area = ancho * alto / 2;
        return area;
    }
}
