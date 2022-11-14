package com.example.GestionSupermercado;

public class Producto {

    private String nombre;
    private Integer precio;
    private Integer cantidad;
    private String tipo;

    public Producto(String nombre, Integer precio, Integer cantidad, String tipo) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Producto \t" +
                "nombre: " + nombre +
                ", precio: $" + precio +
                ", cantidad: " + cantidad +
                ", tipo: " + tipo;
    }

    public void setCantidad() {
        this.cantidad = cantidad;
    }
}
