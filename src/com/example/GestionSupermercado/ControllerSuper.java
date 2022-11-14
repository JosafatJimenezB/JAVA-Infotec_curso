package com.example.GestionSupermercado;

/// importando la libreria Scanner para poder leer datos por teclado
import java.util.Random;
import java.util.Scanner;
public class ControllerSuper {

    public static void main(String[] args) {

        /// variable para almacenar la respuesta del menu propuesto
        int opc = 0;
        String name = "producto";
        String tipo = "tipo ";

        /// Instanciando al objeto Scanner para su utilizacion
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();

        /// Generando una lista para guardar los productos
        Producto[] producto = new Producto[20];


        /// Menu infinito
        do {
            /// Instrucciones disponibles para el usuario
            System.out.println("----------- SuperMercado ------------");
            System.out.println("1.- Lista de empleados");
            System.out.println("2.- Mostrar productos");
            System.out.println("3.- Comprar producto");
            System.out.println("4.- Salir...");
            // almacenando la opcion elegida
            opc = sc.nextInt();


            /// Switch para ingresar a la opcion elegida y separar el codigo
            switch (opc){

                case 1:
                    System.out.println("Empleados registrados en el sistema");

                    // Creando objeto del empleado
                    Empleado empleado1 = new Empleado1(true, true, true,true);

                    // Colocando los atributos del empleado
                    empleado1.setNombre("Juan");
                    empleado1.setEdad(34);
                    empleado1.setAntiguedad(12);
                    empleado1.setEmpleado(empleado1);

                    // Imprimiendo los datos del empleado
                    System.out.println(empleado1.toString());
                    break;

                case 2:
                    System.out.println("Productos disponibles");

                    // creando los productos
                    for (int i = 0; i < 20; i++){
                        /// Generando las cantidades aleatoriamente
                        Integer cantidad = ran.nextInt(10,15);
                        Integer precio = ran.nextInt(300,500);

                        producto[i] = new Producto(name+i,precio+i,cantidad,tipo);
                    }

                    // Imprimiendo el producto
                    for (int j = 0; j < producto.length; j++){
                        System.out.println(producto[j]);
                    }
                    break;

                case 3:

                    /* Seccion para buscar el producto y proceder a reducir las unidades conforme
                    se las van llevando*/

                    System.out.println("Compra de productos");
                    System.out.println("ingrese el nombre del producto: ");

                    sc.nextLine();

                    // Capturando el dato a buscar
                    String productoBuscar = sc.nextLine();

                    // comprobado si existe el producto dentro de la lista
                    for (int x = 0; x < producto.length; x++){
                        if (producto[x].getNombre() == productoBuscar){
                            System.out.println("Producto encontrado");
                            System.out.println(producto[x].getNombre());

//                            producto[x].setCantidad() = producto[x].getCantidad() - 1;

                        }
                        else{
                            System.out.println("Producto no encontrado");
                        }
                    }
                    break;

                case 4:

                    // Mensaje de finalizacion del programa
                    System.out.println("Hasta pronto");
                    System.out.println("Saliendo...");
                    break;

                    /// Opcion default en caso de elegir otra opcion que no este disponible
                default:
                    System.out.println("Opcion no disponible");
                    break;
            }


        /// iteracion del menu hasta que se seleccion la opcion 4 para finalizar el programa de lo contrario
            //este seguira iterando infinitamente
        }while(opc != 4);

    }
}
