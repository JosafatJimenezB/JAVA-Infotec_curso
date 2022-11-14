package com.example.EjerciciosTarea.Dia4.Biblioteca;

public class Libro {

    private String titulo;
    private int codigo;
    private String estado;
    private int anio;


    public Libro(){

    }

    public Libro(String titulo, int codigo, String estado, int anio) {
        this.titulo = titulo;
        this.codigo = codigo;
        this.estado = estado;
        this.anio = anio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Libro" +
                "\ntitulo='" + titulo + '\'' +
                "\ncodigo=" + codigo +
                "\nestado='" + estado + '\'' +
                "\nanio=" + anio;
    }
}
