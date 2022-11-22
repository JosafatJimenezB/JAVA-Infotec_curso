package com.example.EjerciciosTarea.Dia7;

import java.io.*;
import java.util.Scanner;
import com.google.gson.Gson;

public class Main {

    public static void main(String[] args) {
        // Variable para las opciones del menu
        int opc = 0;

        // Objetos para el uso de los metodos de los ejercicios y del scanner para leer datos
        Scanner sc = new Scanner(System.in);
        EjercicioHora hora = new EjercicioHora();
        Triangulo triangulo = new Triangulo();
        secuenciaNumeros numeros = new secuenciaNumeros();
        ArchivoJSON usuario = new ArchivoJSON("Miguel","Programador", 45);
        Gson gson = new Gson();


        // Ciclo do-while para la iteracion de nuestro menu
        do {

            // Menu de opciones para el usuario
            System.out.println("****************************\n" +
                               "*            Menu          *\n" +
                               "****************************\n");
            System.out.println("Gestion de ejercicios con menu");
            System.out.println("1.- Ejercicio Hora");
            System.out.println("2.- Ejercicio Triangulo");
            System.out.println("3.- Ejercicio secuencia de numeros");
            System.out.println("4.- Ejercicio archivo JSON");
            System.out.println("5.- Ejercicio archivo Traductor");
            System.out.println("6.- Ejercicio archivo Peliculas y videojuegos");
            System.out.println("7.- salir..." );
            // guardamos la opcion del usuario
            opc = sc.nextInt();

            // Switch para la seleccion de las opciones que eliga el usuario
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
                    System.out.println("*****************************\n" +
                                       "*       Ejercicio JSON      *\n" +
                                       "*****************************\n");

                    ArchivoJSON usuario2 = new ArchivoJSON("Pedro", "Ingeniero", 78);

                    String jsonFinal = "";

                    try{
                        // Creando objeto buffer para lectura de archivos usando fileReader
                        BufferedReader br = new BufferedReader(new FileReader("dataUser.json"));

                        String linea = "";

                        String cadenaJson = gson.toJson(usuario);
                        String cadenaJSON2 = gson.toJson(usuario2);
                        System.out.println("data Subida: " + cadenaJson + cadenaJSON2);
                        FileWriter fileWriter = new FileWriter("dataUser.json");
                        fileWriter.write(cadenaJson + cadenaJSON2);
                        fileWriter.close();

                        // loop para la lectura del archivo linea por linea
                        try{
                            while((linea = br.readLine()) != null){
                                jsonFinal += linea;
                            }

                        }catch (IOException e){
                            e.printStackTrace();
                        }

                    }catch (FileNotFoundException e){
                        e.printStackTrace();
                    }//// Final del try catc
                    catch (IOException e) {
                        throw new RuntimeException(e);
                    }

                    System.out.println("Data JSON = " + jsonFinal);
                    break;


                case 5:
                    System.out.println("*****************************\n" +
                                       "*    Ejercicio Traductor    *\n" +
                                       "*****************************\n");
                    break;

                case 6:
                    System.out.println("************************************************\n" +
                                       "*       Ejercicio peliculas y videojuegos      *\n" +
                                       "************************************************\n");

                    // Creando listas de los objetos
                    Pelicula listaPeliculas[] = new Pelicula[5];
                    Videojuego listaVideojuego[] = new Videojuego[5];

                    /// Llenando los objetos de los arreglos
                    listaPeliculas[0] = new Pelicula();
                    listaPeliculas[1] = new Pelicula("Guerra mundial z", "enrique");
                    listaPeliculas[2] = new Pelicula("Los simpson",24,"Humor","Matt Groening");
                    listaPeliculas[3] = new Pelicula("Padre de familia", 23, "Humor", "Seth MacFarlane");
                    listaPeliculas[4] = new Pelicula("Breaking bad", 23,"Trhiller", "Vince Gilligan");

                    listaVideojuego[0]=new Videojuego();
                    listaVideojuego[1]=new Videojuego("Assasin creed 2", 30, "Aventura", "EA");
                    listaVideojuego[2]=new Videojuego("God of war 3", 34);
                    listaVideojuego[3]=new Videojuego("Super Mario 3DS", 30, "Plataforma", "Nintendo");
                    listaVideojuego[4]=new Videojuego("Final fantasy X", 200, "Rol", "Square Enix");

                    // Usando los metodos del interface
                    listaPeliculas[1].activar();
                    listaPeliculas[4].activar();
                    listaVideojuego[0].activar();
                    listaVideojuego[3].activar();


                    // Consultado cuantos estan activados y se desactivan
                    int entregados=0;

                    for(int i=0;i<listaPeliculas.length;i++){
                        if(listaPeliculas[i].isActivo()){
                            entregados+=1;
                            listaPeliculas[i].desactivar();

                        }
                        if(listaVideojuego[i].isEntregado()){
                            entregados+=1;
                            listaVideojuego[i].desactivar();
                        }
                    }

                    System.out.println("Hay "+entregados+" articulos activos");

                    // Creando dos objetos de la posicion
                    Pelicula peliculaMayor = listaPeliculas[0];
                    Videojuego videojuegoMayor = listaVideojuego[0];

                    // Comparando cual es la pelicula y videojuego de mayor duracion
                    for(int i=1;i<listaPeliculas.length;i++){
                        if(listaPeliculas[i].compareTo(peliculaMayor)==1){
                            peliculaMayor=listaPeliculas[i];
                        }
                        if(listaVideojuego[i].compareTo(videojuegoMayor)==1){
                            videojuegoMayor=listaVideojuego[i];
                        }
                    }

                    // Impresion de las peliculas y de los videojuegos
                    System.out.println(videojuegoMayor);
                    System.out.println(peliculaMayor);
                    break;


                case 7:
                    System.out.println("Saliendo...");
                    break;
            }

        }while(opc != 7);


    }

}
