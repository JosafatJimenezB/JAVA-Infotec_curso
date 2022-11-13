package com.example.EjerciciosTarea.Dia4.Figuras;

public class Rectangulo extends Figura{

    Rectangulo(Integer ancho, Integer alto){
        super(ancho, alto);
    }

    @Override
    public double area(){
        area = Double.valueOf(ancho*alto);
        return area;
    }
}
