package com.example.Metodos;

public class PruebaCuentaBancaria {

    public static void main(String[] args) {

        /// Accediendo metodo totalCuentas
        System.out.println("Total cuentas: "+ CuentaBancaria.totalCuentas);

        /// Creacion de un objeto de tipo cuenta bancaria y asignando valor
        CuentaBancaria c1 = new CuentaBancaria(17.5);

        /// Impresion del resultado del primer objeto
        System.out.println("Nueva cuenta con: "+ c1.saldo() + " euros");
        System.out.println("Total cuentas: "+ CuentaBancaria.totalCuentas);

        /// Creando otro objeto de tipo cuenta bancaria y asignando valor
        CuentaBancaria c2 = new CuentaBancaria(20.00);

        /// Impresion del resultado del segundo objeto
        System.out.println("Nueva cuenta con: "+ c2.saldo() + " euros");
        System.out.println("Total cuentas: "+ CuentaBancaria.totalCuentas);


        System.out.println("Transferencia de cuenta 2 a cuenta 1");

        /// transfiriendo saldo a cuenta 1 de cuenta 2
        c1.transferencias(c2);

        /// Mostando el balance de las cuentas
        System.out.println("Cuenta 1 con: " + c1.saldo() + " euros");
        System.out.println("Cuenta 2 con: " + c2.saldo() + " euros");
    }
}
