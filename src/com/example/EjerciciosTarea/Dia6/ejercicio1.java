
package com.example.EjerciciosTarea.Dia6;

import java.util.ArrayList;
import java.util.List;

public class ejercicio1 {

    public static void main(String[] args) {
        /*
    * 1.-Crea aun metodo que reciba dos parametros de tipo String y dos parametros de
    * tipo Integer y retorne la concatenacion de los 4 parametros
    */
        System.out.println("Ejercicio 1");
        metodosEjericico1 m1 = new metodosEjericico1();
        m1.metodosEjericico1("hola", "mundo", 22,22);
        System.out.println(m1.metodosEjericico1("hola", "mundo", 22,22));


    /*
    * 2.- Crea un metodo que reciba como parametro el resultado del metodo del ejercicio 1
    * y reciba dos parametros de tipo double y nos devuelva la concatenacion de los 3 parametros
    * en cualquier orden
    */
        System.out.println("\nEjercicio 2");
        System.out.println(m1.metodosEjercicio1(2.00,23.00));


    /* 3.- Genera 3 metodos con sobrecarga
    * Este se encuentra en la clase metodosEjercicio1.java 
    */
        
        
    /* 4.- Genera una lista de enteros con los valores 10, 58, 68, 920, 15, 16, 85, 75, 32
    * y reeemplaza el valor 920 por 25 y 68 por 90 e imprime los valores de la lista
    * y su posicion en ella
    */

        System.out.println("\nEjercicio 4");
        /// Creando la lista de numeros enteros
        List<Integer> numberList = new ArrayList<>();
        
        // Añadiendo los elementos a la lista
        numberList.add( 10);
        numberList.add(58);
        numberList.add(68);
        numberList.add(920);
        numberList.add(15);
        numberList.add(16);
        numberList.add(85);
        numberList.add(75);
        numberList.add(32);

        // Imprimiendo la lista con los datos
        System.out.println("Lista antes de los cambios = " + numberList);

        // Reemplazando los numero en la lista usando una busqueda
        m1.searchNumber(numberList,920,25);
        m1.searchNumber(numberList,68,90);

        // Imprimiendo la lista despues de las modificaciones
        System.out.println("Lista despues de los cambios = " + numberList);
        
    /* 5.- Genera una lista de Strings con los valores 15, 30, 12, 60 obten los elementos de
    * la lista y sumalos en un variable llamada suma de tipo Integer y muestre el resultado
    * */

        System.out.println("\nEjercicio 5");
        // Creando la lista
        List<String> sumaLista = new ArrayList<>();
        
        // Agregando los valores a la lista
        sumaLista.add("15");
        sumaLista.add("30");
        sumaLista.add("12");
        sumaLista.add("60");

        // Impresion de la lista
        System.out.println("sumaLista = " + sumaLista);

        // Impresion de la suma
        m1.calculateSum(sumaLista);

    }

}
