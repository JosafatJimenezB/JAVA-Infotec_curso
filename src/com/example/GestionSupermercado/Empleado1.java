package com.example.GestionSupermercado;

public class Empleado1 extends Empleado{

    private boolean venderProducto;
    private boolean acomodarProducto;
    private boolean descansar;
    private boolean sentar;

    public Empleado1(boolean venderProducto, boolean acomodarProducto, boolean descansar, boolean sentar) {
        this.venderProducto = venderProducto;
        this.acomodarProducto = acomodarProducto;
        this.descansar = descansar;
        this.sentar = sentar;
    }

    public Empleado1(String nombre, Integer edad, Integer antiguedad, Empleado empleado, Integer reibirPago, boolean venderProducto, boolean acomodarProducto, boolean descansar, boolean sentar) {
        super(nombre, edad, antiguedad, empleado, reibirPago);
        this.venderProducto = venderProducto;
        this.acomodarProducto = acomodarProducto;
        this.descansar = descansar;
        this.sentar = sentar;
    }

    public boolean isVenderProducto() {
        return venderProducto;
    }

    public void setVenderProducto(boolean venderProducto) {
        this.venderProducto = venderProducto;
    }

    public boolean isAcomodarProducto() {
        return acomodarProducto;
    }

    public void setAcomodarProducto(boolean acomodarProducto) {
        this.acomodarProducto = acomodarProducto;
    }

    public boolean isDescansar() {
        return descansar;
    }

    public void setDescansar(boolean descansar) {
        this.descansar = descansar;
    }

    public boolean isSentar() {
        return sentar;
    }

    public void setSentar(boolean sentar) {
        this.sentar = sentar;
    }

    @Override
    public String toString() {
        return "Empleado1 " +
                "\nnombre: "+ this.getNombre()+ " Edad: "+ this.getEdad()+
                " Antguedad: "+ this.getAntiguedad()+" anios " +
                " Pago: " + this.getReibirPago() +
                "\nVender productos=" + this.isVenderProducto() +
                ", Acomodar producto=" + this.isAcomodarProducto() +
                ", descansando=" + this.isDescansar() +
                ", sentarse=" + this.isSentar();
    }
}
