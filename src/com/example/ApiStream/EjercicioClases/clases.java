package com.example.ApiStream.EjercicioClases;

import javax.print.Doc;

public class clases {

    public static void main(String[] args) {

        /*1) Crea una clase llamada Persona que contenga los siguientes atributos,
        Nombres, primer Apellido, Segundo apellido, edad y domicilio (usa el tipo de datos que creas adecuados) .

        2) Oculta los atributos de la clase Persona hacienda uso de encapsulamiento

        3) Genere 2 métodos en la clase Persona el primero se llamara "nombreCompleto" y retornara
        el nombre y los apellidos de la persona en una cadena String, el otro método se Llamara
        “imprimirNonbre¥Direccion* no retornara valor alguno e impriniré en consola el nonbre y la direccién concatenada...
        este método usara la palabra reservada return; aunque no retorne valor;

        4) Crea una clase Llamada Doctor que extienda a la clase persona y que contenga los siguientes parametros:
        cédula (tipo String), especialidad(tipo String) y paciente (tipo Persona).

        5) Oculta los atributos de la clase Doctor hacienda uso de encapsulamiento

        6) Sobreescribe los dos métodos de la clase persona con las siguientes instrucciones:
        El método “nombreCompleto” retornara el nombre completo de nuestro atributo paciente,
        el método “imprimirNombreYDireccion” retornara el nombre y direccién de nuestro atributo paciente

        7) Creamos un método Llamado “consultorio” en la clase doctor que reciba como pardmetros
        un Objeto de tipo Persona e imprima en pantalla todos los datos de la clase Doctor y todos
        Los datos del atributo persona.

        8) Ahora en nuestro programa principal creamos una instancia de un objeto de tipo
        Persona Utilizando la clase Doctor y le asignamos valores a sus 5 atributos, creamos una
        Astonia, ie. mi obiata. de Fes Docket. > Ae Balmames valbins. i ° BETAS, asignamos
        al atributo paciente la instancia de persona creada previamente.
        */


        Persona persona = new Persona("Juan", "Lopez", "Perez", 23, "Calle olivos");

        Doctor doctor = new Doctor("Oscar", "Gomez", "Martinez", 27, "Calle pera", "2234234", "Pediatra", persona);

        doctor.consultorio(persona);

    }
}
