package com.example.Conversiones;

public class conversiones {

    public static void main(String[] args) {
        String palabra = "Hola Mundo Java";

        /// 1) Obetener la longitud del texto "Hola Mundo Java
        System.out.println("Resultado ejercicio 1: "+ palabra.length());

        int count = 0;
        for (int i = 0; i < palabra.length(); i++){
            count++;
        }

        System.out.println("Resultado 2 ejercicio 1: "+ count);

        /// 2) Eliminar los espacios del texto: "Hola Mundo Java"

        String palabraSinEspacios = palabra.replace(" ","");
        System.out.println(palabraSinEspacios);

        String palabraSinEspacios2 = "";
        for(int i = 0; i < palabra.length();i++){
            if(palabra.charAt(i) != ' '){
                palabraSinEspacios2+=palabra.charAt(i);
            }
        }

        System.out.println(palabraSinEspacios2);


        /// 3) Imprimir caracter por caracter la palabra "Hola Mundo Java"
        System.out.println("Resultado de ejercicio 3");
        for(int i = 0; i < palabra.length();i++){
            System.out.print(palabra.charAt(i) + " ");
        }

        /// 4) Invierte la cadena "Hola Mundo Java"

        System.out.println("\nResultado de ejercicio 4");

        String palabraInvertida = "";
        for(int i = palabra.length()-1; i >= 0;i--){
            palabraInvertida+=palabra.charAt(i);
        }

        System.out.println(palabraInvertida);

        /// 5) Cuenta las vocales de la palabra "Hola Mundo Java"

        System.out.println("Resultado de ejercicio 5");

        String vocales = "aeiou";
        int contadorVocales = 0;
        for (int i = 0; i < palabra.length(); i++){
//            if(vocales.indexOf(palabra.charAt(i)) != -1){
//                contadorVocales++;
//            }
            if(palabra.charAt(i) == 'a' || palabra.charAt(i) == 'e' || palabra.charAt(i) == 'i' ||
                    palabra.charAt(i) == 'o' || palabra.charAt(i) == 'u'){
                contadorVocales++;
            }
        }

        System.out.println("Resultado de ejercicio 5: "+contadorVocales);

        /// 6) Contar el numero de palabras en la cadena "Hola Mundo Java"
        String[] arrayString = palabra.split(" ");
        System.out.println("Resultado de ejercicio 6: "+arrayString.length);

        for (int i = 0; i < arrayString.length; i++){
            System.out.println("Index "+ i + " "+ arrayString[i]);
        }

        /// 7) Usando la cadena "Hola Mundo Java" agrega un guion medio (-) a lado derecho de cada caracter

        System.out.println("Resultado de ejercicio 7");
        String palabraModificada = "";

        for (int i = 0; i < palabra.length(); i++){
            palabraModificada+=palabra.charAt(i)+"-";
        }

        System.out.println(palabraModificada);

        /// 8) Obtener de cada caracter de la cadena "Hola Mundo Java" su codigo ASCII

        System.out.println("Resultado de ejercicio 8");

        for (int i = 0; i < palabra.length(); i++){
            System.out.println((int)palabra.charAt(i)+" char: "+palabra.charAt(i));
        }

        /// 9) Usando la cadena "Hola Mundo Java" obten la palabra "JAVA"
        System.out.println("\nResultado de ejercicio 9");
        System.out.println(palabra.substring(11));
    }

}
