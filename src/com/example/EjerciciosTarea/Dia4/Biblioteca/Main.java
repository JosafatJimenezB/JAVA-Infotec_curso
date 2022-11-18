package com.example.EjerciciosTarea.Dia4.Biblioteca;

public class Main {

    public static void main(String[] args) {

//        Libro libro = new Libro("hola",23234,"Buen estado",2002);

        PrestarLibro libro1 = new PrestarLibro();
        PrestarRevista revista = new PrestarRevista();

        libro1.setTitulo("Haz click aqui para matarlos a todos");
        libro1.setAnio(2002);
        libro1.setEstado("Buen estado");
        libro1.setCodigo(1212312);
        libro1.setDevolver(true);
        libro1.setPrestado(true);
        libro1.setPrestar(false);


        revista.setTitulo("Caras");
        revista.setAnio(2005);
        revista.setEstado("Buen estado");
        revista.setCodigo(123452);
        revista.setDevolver(false);
        revista.setPrestado(false);
        revista.setPrestar(true);


        System.out.println(libro1.toString());
        System.out.println(revista.toString());
    }

}
