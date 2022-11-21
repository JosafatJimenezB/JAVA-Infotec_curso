package com.example.EjerciciosTarea.Dia7;

public class EjercicioHora {

    public void obtenerHora(int hora){
        if (hora >= 6 && hora <= 12){
            System.out.println("buenos dias");
        } else if (hora >= 13 && hora <= 20) {
            System.out.println("Buenas tardes");
        }else if(hora >= 21 && hora <= 24){
            System.out.println("Buenas noches");
        }
        else if(hora >= 1 && hora <= 5){
            System.out.println("Buenas noches");
        }
    }
}
