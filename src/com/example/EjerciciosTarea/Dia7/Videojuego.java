package com.example.EjerciciosTarea.Dia7;

public class Videojuego implements Activar{

    private String titulo;
    private int duracion = 10;
    private boolean status;
    private String genero;
    private String compania;

    private boolean entregado;

    public Videojuego(){

    }

    public Videojuego(String titulo, int duracion){
        this.titulo = titulo;
        this.duracion = duracion;
    }

    public Videojuego(String titulo, int duracion, String genero, String compania) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.genero = genero;
        this.compania = compania;
        this.entregado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    public boolean isEntregado() {
        return entregado;
    }

    public void setEntregado(boolean entregado) {
        this.entregado = entregado;
    }

    public void activar(){
        status = true;
    }

    public void desactivar(){
        status = false;
    }

    public boolean isActivo(){
        if (status){
            return true;
        }else {
            return false;
        }
    }

    public int compareTo(Object a){
        int estado= -1;

        Videojuego ref=(Videojuego) a;
        if (duracion>ref.getDuracion()){
            estado=1;
        }else if(duracion==ref.getDuracion()){
            estado= 0;
        }
        return estado;
    }


    @Override
    public String toString() {
        return "Videojuego{" +
                "titulo='" + titulo + '\'' +
                ", duracion=" + duracion + "hrs \n" +
                ", status=" + status +
                ", genero='" + genero + '\'' +
                ", compania='" + compania + '\'' +
                '}';
    }
}
