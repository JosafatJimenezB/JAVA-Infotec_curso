package com.example.EjerciciosTarea.Dia4.Figuras;

public class Main {

    public static void main(String[] args) {

        Circulo circulo = new Circulo(10,10);
        Rectangulo rectangulo = new Rectangulo(20,10);
        Triangulo triangulo = new Triangulo(23,45);
        Cuadrado cuadrado = new Cuadrado(4,4);

        System.out.println("El area del circulo es de: " + circulo.area());
        System.out.println("El area del rectangulo es de: " + rectangulo.area());
        System.out.println("El area del cuadrado es de: " + cuadrado.area());
        System.out.println("El area del triangulo es de: " + triangulo.area());
    }
}
