package com.example.Interfaces;

public class Main {

    public static void main(String[] args) {
        // POO -> Programacion Orientada a Objetos
        Implementacion instancia = new Implementacion();

        String resultado = instancia.concatena("1000");

        System.out.println(resultado);

        // PF -> Programacion Funcional
            // CLASE

        InterfazFuncional inter = new InterfazFuncional() {
            @Override
            public String concatena(String x) {
                return "Clase anonima: " + x;
            }
        };

        String resultado2 = inter.concatena("2000");
        System.out.println(resultado2);

        concatenaSuperior(instancia);
        concatenaSuperior(inter);

        // lambda

        InterfazFuncional lambda1 = (String s) -> {
            Integer suma = 4 + 4;
            return "Lambda1 Retorno " + suma + " parametro "+ s;
        };

        InterfazFuncional lambda2 = (s) -> "Lambda1 Retorno " + (4+4) + " parametro "+ s;

        InterfazFuncional lambda3 = s -> "Lambda1 Retorno " + (4+4) + " parametro "+ s;

        concatenaSuperior(lambda1);
        concatenaSuperior(lambda2);
        concatenaSuperior(lambda3);


        Gato gato = new Gato();
        concatenaSuperior(gato::miau);

    }

    /*
    * Estructura lambda
    *
    * () -> {}
    * () ----> parametros de entrada de la funcion
    * -> ----> Operador lambda
    * {} ----> Cuerpo de la función
    *
    *  --------- Reglas para los parametros -----------
    * Sin parametros ()
    * Si solo tiene un parametro (s) -> {}
    * Si tiene > 1 parametro (s, x) o (Integer s, String x)
    *
    * --------- Reglas del cuerpo de instrucciones ----------
    * {}
    * {Integer suma = 4 + 4;
    *  System.out.println(suma);
    * }
    *
    * {
    *   return "cadena"
    * }
    *
    * "cadena"
    *
    * */


    /// Expresiones de orden Superior

    // Funcion de orden superior
    public static void concatenaSuperior(InterfazFuncional inter){
        System.out.println(inter.concatena("Orden superior"));
    }
}
