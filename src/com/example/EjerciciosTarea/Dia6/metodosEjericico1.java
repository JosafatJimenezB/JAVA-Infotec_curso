package com.example.EjerciciosTarea.Dia6;

import java.util.ArrayList;
import java.util.List;

public class metodosEjericico1 {

    private String concatenacion;
    private String cad1 = " ", cad2 = " ";
    private Integer num1 = 0, num2 = 0;


    //// Sobrecarga de constructores
    // Metodo vacio
    public metodosEjericico1(){

    }

    /// Metodo que recibe 4 parametros y los concatena
    public String metodosEjericico1(String cad1, String cad2, Integer num1, Integer num2){
        concatenacion = cad1 + " " + cad2 + " " + num1 + " " + num2;
        return concatenacion;
    }

    // Metodo que recibe la concatenacion y dos parametros para retornarlos
    public String metodosEjercicio1(double n1, double n2){
        concatenacion += " "+  n1 + " " + n2;
        return concatenacion;
    }


    /// Metodo para buscar un numero en la lista y cambiar el valor
    public void searchNumber(List<Integer> list,Integer search,Integer newValue){
        // Busqueda de la posicion del dato que se desea
        int index = list.indexOf(search);

        // Comprobando si existe el dato en la lista
        if (index != -1) {
            // Mensaje al usuario sobre la busqueda
            System.out.println("La búsqueda " + search + " esta en el índice " + index +
                    "\n valor a sustituir: "+ newValue + "\n");
            // Cambiando el dato antiguo por el nuevo dato
            list.set(index, newValue);
        } else {
            System.out.println("El elemento no existe");
        }
    }


    /// Metodo para calcular la suma de un arraylist de Strings
    public void calculateSum(List<String> list){

        /// variable local para los datos recibidos
        Integer suma = 0;

        // iterador para realizar la suma
        for (int i = 0; i < list.size(); i++){

            /* Proceso de suma obteniendo los elementos y
            * cambiando los datos a tipo int
            */
            suma += Integer.parseInt(list.get(i));
        }

        /// Imprimiendo los datos
        System.out.println("suma = " + suma);
    }

}
