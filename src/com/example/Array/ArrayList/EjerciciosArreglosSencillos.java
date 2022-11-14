package com.example.Array.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class EjerciciosArreglosSencillos {

    public static void main(String[] args) {

        // 1)Generar un arregto con \Os siguientes valores 114,53,21,49,1), obtener valor mayor y el valor menor y © imprimetos en conso\a

        Integer[] valores = {14,33,21,45,1};
        int mayor = 0;
        int menor = 0;

        Arrays.sort(valores, Collections.reverseOrder());

        System.out.println("Mayor "+ valores[0] + " Menor "+ valores[valores.length-1]);

        /*for (int i = 0; i < valores.length; i++){
            if (mayor == 0){
                mayor = valores[i];
                menor = valores[i];

            }if (mayor < valores[i]){
                mayor = valores[i];

            }if (menor > valores[i]){
                menor = valores[i];
            }
        }

        System.out.println("Mayor "+ mayor + " Menor "+ menor);*/


        // 2) Genera un arreglo con las siguientes cadenas de texto "Hola Mundo”, “Hola Java” y “Hola Curso”, obtener el segundo elemento del
        // arreglo y generar un arreglo que contenga cada cardcter de la cadena de texto

        /*String[] cadenas = {"Hola Mundo", "Hola Java", "Hola curso"};

        char[] caracteres = new char[cadenas[1].length()];

        for (int i = 0; i < cadenas[i].length(); i++){
            caracteres[i] = cadenas[1].charAt(i);
        }
        for (int i = 0; i < caracteres.length; i++){
            System.out.println(caracteres[i]+ " - ");
        }*/


        // 3) Agrega 10 valores de tipo Integer en un arreglo, imprime cada uno de los valores y su indice correspondiente
        Integer[] valoresAleatorios = {123,42,4354,554,5452,42123,312,212,3413,313};
        /*int j = 0;
        while (j <= valoresAleatorios.length){
            System.out.println("valor "+ valoresAleatorios[j]+" indice: "+j);
            j++;
        }*/


        //4) Utilizando el arreglo del ejercicio anterior copia su contenido a otro arreglo que se
        // llame “copiaEjercicio3” e imprime cada valor de ambos arreglos en consola

        Integer[] copia = Arrays.copyOf(valoresAleatorios, valoresAleatorios.length);

        for (int ii = 0; ii < valoresAleatorios.length; ii++){
            System.out.println("Original: "+ valoresAleatorios[ii] + " Copia: "+ copia[ii]);
        }


        //5) Genera un arreglo que contenga los nombre de 5 alumnos y otro arreglo que contenga las calificacién de estos
        // alumnos con los siguientes valores [6,7,4,10,5], ahora en un tercer arreglo
        // quardaremos los siguientes datos para cada alumno:
        // El nombre del alumno, la calificacién y la palabra “Aprobado”
        // en caso de que su calificacién sea mayor a 6 y “Reprobado” en caso contrario,
        // imprime los valores de este tercer arreglo en consola;


        String[] alumnos = {"Lupita", "Marcos", "juan", "Yolanda", "Jorge"};

        Integer[] calificaciones = {6,7,4,10,5};
        String[] resultados = new String[alumnos.length];

        for (int y = 0; y < alumnos.length; y++){

            String resultado = "Aprobado";

            if (calificaciones[y] <= 6){
                resultado = "Reprobado";
            }

            resultados[y] = "Nombre: "+ alumnos[y]+ " Calif: "+ calificaciones[y] + " Resultado: "+ resultado;
        }

        System.out.println("Resultado de alumnos");
        for (int y = 0; y < resultados.length; y++){
            System.out.println(resultados[y]);
        }

    }
}
