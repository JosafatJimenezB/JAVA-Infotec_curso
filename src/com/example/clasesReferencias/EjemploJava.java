package com.example.clasesReferencias;

public class EjemploJava {

    public static void main(String[] args) {
        Producto servilleta = new Producto("Servilleta", 23.00);
        Cliente cliente1 = new Cliente("Juan", 1200.00);
        Tienda tienda = new Tienda("Sonora", "Calle roble",cliente1, servilleta);

        System.out.println("Nombre del cliente: "+ tienda.getCliente().getNombre());
        System.out.println("Nombre del producto: "+ tienda.getProducto().getNombre());


    }
}
