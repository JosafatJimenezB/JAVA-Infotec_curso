package com.example.Array.ArrayList;

import java.util.ArrayList;

public class EjemploArrayList {

    public static void main(String[] args) {
        ArrayList ar1Test = new ArrayList();

        System.out.println("Tamaño del ArrayList en la creacion: "+ ar1Test.size());

        ar1Test.add("D");
        ar1Test.add("U");
        ar1Test.add("K");
        ar1Test.add("E");

        System.out.println("Tamaño del ArrayList despues de agregar elementos: "+ ar1Test.size());
        System.out.println("Lista de todos los elementos: "+ ar1Test);

        ar1Test.remove("D");

        System.out.println("Contenido despues de eliminar un elemento: "+ar1Test);
        System.out.println("Tamaño del ArrayList depues de eliminar elementos: "+ ar1Test.size());
        System.out.println(ar1Test.contains("K"));
    }
}
