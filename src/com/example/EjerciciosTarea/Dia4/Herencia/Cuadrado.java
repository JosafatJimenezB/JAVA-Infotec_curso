package com.example.EjerciciosTarea.Dia4.Herencia;

public class Cuadrado extends Figura{

    public Cuadrado(Integer lado){
        super(lado,lado);
    }

    Cuadrado(Integer lado, Integer vacio){
        super(lado, lado);
    }

    @Override
    public double area(){
        area = ancho * alto;
        return area;
    }
}
