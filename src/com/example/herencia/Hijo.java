package com.example.herencia;

/// COn la palabra reservada extends hacemos referencia a que heredamos
// los atributos de la clase padre
public class Hijo extends Padre{

    Integer edad;

    public static void main(String[] args) {

        /// Declaramos nuestros objeto para acceder a los metodos
        Hijo instanciaHijo = new Hijo();

        // instanciamos para usar los atributos heredados
        instanciaHijo.edad = 11;
        instanciaHijo.nombre = "Juan";
        instanciaHijo.imprimirNombre();
    }

}
