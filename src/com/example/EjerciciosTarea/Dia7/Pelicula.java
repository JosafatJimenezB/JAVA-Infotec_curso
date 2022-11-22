package com.example.EjerciciosTarea.Dia7;

public class Pelicula implements Activar{

    private String titulo;
    private int duracion = 2;
    private boolean status;
    private String genero;
    private String director;

    public Pelicula(){

    }

    public Pelicula(String titulo, String director){
        this.titulo = titulo;
        this.director = director;
    }

    public Pelicula(String titulo, int duracion, String genero, String director) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.genero = genero;
        this.director = director;
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

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
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

        Pelicula ref=(Pelicula)a;
        if (duracion>ref.getDuracion()){
            estado=1;
        }else if(duracion==ref.getDuracion()){
            estado= 0;
        }
        return estado;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", duracion=" + duracion + "hrs \n"+
                ", status=" + status +
                ", genero='" + genero + '\'' +
                ", director='" + director + '\'' +
                '}';
    }
}
