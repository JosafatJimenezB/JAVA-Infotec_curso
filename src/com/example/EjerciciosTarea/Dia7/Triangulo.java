package com.example.EjerciciosTarea.Dia7;

public class Triangulo {

    public void generarTriangulo(int tam){

        System.out.println("Trinagulo Normal\n");
        for (int i = tam; i >= 1; --i){
            for (int j = 1; j <= i; ++j){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void generarTrianguloVacio(int tam){

        System.out.println("\nTriangulo Hueco");
        for (int i = tam; i >= 1; --i) {
            System.out.println();
            for (int j = 1; j < tam-i; ++j) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i+1; ++j){
                // Condición para imprimir solo los bordes.del triangulo
                if ((i==0)||(i==tam-1)||(j==0)||(j==2*i)) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
        }
        System.out.println();

    }
}
