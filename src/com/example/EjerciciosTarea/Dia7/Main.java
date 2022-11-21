package com.example.EjerciciosTarea.Dia7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Variable para las opciones del menu
        int opc = 0;

        // Objetos para el uso de los metodos
        Scanner sc = new Scanner(System.in);
        EjercicioHora hora = new EjercicioHora();
        Triangulo triangulo = new Triangulo();
        secuenciaNumeros numeros = new secuenciaNumeros();

        // Ciclo do-while para la iteracion de nuestro menu
        do {
            System.out.println("****************************\n" +
                               "*            Menu          *\n" +
                               "****************************\n");
            System.out.println("Gestion de ejercicios con menu");
            System.out.println("1.- Ejercicio Hora");
            System.out.println("2.- Ejercicio Triangulo");
            System.out.println("3.- Ejercicio secuencia de numeros");
            System.out.println("4.- salir..." );
            opc = sc.nextInt();

            switch (opc){
                case 1:
                    System.out.println("****************************\n" +
                                       "*      Ejercicio Hora      *\n" +
                                       "****************************\n");
                    System.out.println("Ingrese una hora");
                    int time = sc.nextInt();
                    hora.obtenerHora(time);
                    break;

                case 2:
                    System.out.println("*****************************\n" +
                                       "*    Ejercicio Triangulo    *\n" +
                                       "*****************************\n");

                    System.out.println("ingrese el tamaño del triangulo que desea");
                    int tam = sc.nextInt();
                    triangulo.generarTriangulo(tam);
                    triangulo.generarTrianguloVacio(tam);
                    break;


                case 3:

                    System.out.println("*****************************\n" +
                                       "*     Ejercicio Numeros     *\n" +
                                       "*****************************\n");
                    System.out.println("Finaliza al colocar -1");
                    int numeroUsuario=0;
                    do{
                        // Obtener el numero menor
                        numeros.menor(numeroUsuario);
                        // Obtener el numero mayor
                        numeros.mayor(numeroUsuario);
                        // Obtener la suma de todos los numeros
                        numeros.suma(numeroUsuario);
                        // Suma de numeros positivos y negativos por separado
                        numeros.getSumaPositivosNegativos(numeroUsuario);
                        // Pidiendo un numero al usuario
                        System.out.println("Introduce un numero");
                        numeroUsuario = sc.nextInt();

                        // Ciclo do-while para la iteracion del programa
                    }while(numeroUsuario!=-1);

                    // Impresion de los resultados al usuario
                    numeros.imprimirResultados();
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    break;
            }

        }while(opc != 4);


    }

}
