package com.example.Debuguear;

public class main {

    public static void main(String[] args) {
        int x = 100, y = 200;

        System.out.println("La multiplicacion: " + x*y);

        retornarEntero(x,y);
    }

    public static int retornarEntero(int x, int y){
        int ret = 0;

        ret = x * y;

        return ret;
    }
}
