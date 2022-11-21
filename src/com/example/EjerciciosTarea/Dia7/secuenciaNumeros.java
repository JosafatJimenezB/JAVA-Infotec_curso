package com.example.EjerciciosTarea.Dia7;

public class secuenciaNumeros {

    int numeroUsuario=0;
    int menor=0;
    int mayor=0;
    int suma=0;
    int contador=-1;
    int sumaPositivos=0;
    int sumaNegativos=0;


    public int menor(int numeroUsuario){
        if(menor>numeroUsuario){
            menor = numeroUsuario;
        }
        return menor;
    }

    //Comprobamos si el numero es mayor
    //que el actual mayor
    public int mayor(int numeroUsuario){
        if(mayor<numeroUsuario){
            mayor=numeroUsuario;
        }
        return mayor;
    }

    //Suma el numero y lo acumulamos
    public int suma(int numeroUsuario){
        suma+=numeroUsuario;
        return suma;
    }


    //Si el numero es positivo, suma a la variable de los positivos
    // y sino a la de los negativos

    public int getSumaPositivosNegativos(int numeroUsuario){
        if(numeroUsuario>=0){
            return sumaPositivos+=numeroUsuario;
        }else{
            return sumaNegativos+=numeroUsuario;
        }
    }

    public void imprimirResultados(){
        System.out.println("El menor es: "+ menor);
        System.out.println("El mayor es: "+ mayor);
        System.out.println("La suma es: "+ suma);
        System.out.println("La suma de los positivos es: "+ sumaPositivos);
        System.out.println("La suma de los negativos es: "+ sumaNegativos + "\n");
    }
}
