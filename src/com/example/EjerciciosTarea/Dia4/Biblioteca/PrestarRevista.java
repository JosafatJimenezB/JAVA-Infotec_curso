package com.example.EjerciciosTarea.Dia4.Biblioteca;

public class PrestarRevista extends Libro{

    boolean prestar;
    boolean devolver;
    boolean prestado;

    public PrestarRevista(){

    }

    public PrestarRevista(String titulo, int codigo, String estado, int anio, boolean prestar, boolean devolver, boolean prestado) {
        super(titulo, codigo, estado, anio);
        this.prestar = prestar;
        this.devolver = devolver;
        this.prestado = prestado;
    }

    public void setPrestar(boolean prestar) {
        this.prestar = prestar;
    }

    public boolean getPrestar(){
        return prestar;
    }

    public void setDevolver(boolean devolver) {
        this.devolver = devolver;
    }

    public boolean getDevolver(){
        return devolver;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public boolean getPrestado(){
        return prestado;
    }

    @Override
    public String toString() {
        return  "\nRevista" +
                "\ntitulo='" + getTitulo() +
                "\ncodigo=" + getCodigo() +
                "\nestado='" + getEstado() +
                "\nanio=" + getAnio() + "\n" +

                "\nPrestarRevista{" +
                "\nprestar=" + prestar +
                "\ndevolver=" + devolver +
                "\nprestado=" + prestado +
                '}';
    }
}
