package com.example.Metodos;

public class CuentaBancaria {

    // Variables a usar
    private double saldo;
    public static int totalCuentas = 0;


    // Metodos

    public void transferenciaSegura(CuentaBancaria origen){
        if (this == origen)
            return;
        saldo += origen.saldo;
        origen.saldo = 0;

    }

    /// Instanciar de manera explicita sin el uso de this
    public CuentaBancaria(){
        this(0.0);
    }

    /// Contructor para incializar saldo en 0.0
    public CuentaBancaria(double ingreso){
        saldo = ingreso;
        incCuentas();
    }

    /// Metodo para mostrar el saldo de la cuenta
    public double saldo(){
        return saldo;
    }

    /// Proceso de conteo de las cuentas existentes
    public static void incCuentas(){
        totalCuentas++;
    }

    /*
    * Metodo para tranferir saldo de una cuenta a otra recibiendo
    * como parametro un objeto con el cual se accede al saldo y lo
    * transfiere a la cuenta de destino
    */
    public void transferencias(CuentaBancaria origen){
        saldo += origen.saldo();
        origen.saldo = 0;
    }
}
