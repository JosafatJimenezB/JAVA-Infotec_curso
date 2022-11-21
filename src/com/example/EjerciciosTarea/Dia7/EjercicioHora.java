package com.example.EjerciciosTarea.Dia7;

public class EjercicioHora {

    public void obtenerHora(int hora){
        if (hora >= 6 && hora <= 12){
            System.out.println("buenos dias");
        } else if (hora >= 13 && hora <= 20) {
            System.out.println("Buenas tardes");
        }else if(hora >= 22){
            System.out.println("Buenas noches");
        }
        else {
            System.out.println("Hora incorrecta");
        }
    }
}
