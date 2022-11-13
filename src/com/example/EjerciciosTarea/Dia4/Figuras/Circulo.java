package com.example.EjerciciosTarea.Dia4.Figuras;

public class Circulo extends Figura{

    Circulo(Integer ancho, Integer alto){
        super(ancho, alto);
    }

    @Override
    public double area(){
        if (ancho == alto){
            area = Math.PI*(ancho/2)*(ancho/2);
        }
        else{
            area = 0.00;
        }

        return area;
    }
}
