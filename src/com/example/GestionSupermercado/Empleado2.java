package com.example.GestionSupermercado;

public class Empleado2 extends Empleado{

    private boolean venderProducto;
    private boolean descansar;
    private boolean correr;

    public Empleado2(boolean venderProducto, boolean descansar, boolean correr) {
        this.venderProducto = venderProducto;
        this.descansar = descansar;
        this.correr = correr;
    }

    public boolean isVenderProducto() {
        return venderProducto;
    }

    public void setVenderProducto(boolean venderProducto) {
        this.venderProducto = venderProducto;
    }

    public boolean isDescansar() {
        return descansar;
    }

    public void setDescansar(boolean descansar) {
        this.descansar = descansar;
    }

    public boolean isCorrer() {
        return correr;
    }

    public void setCorrer(boolean correr) {
        this.correr = correr;
    }
}
