package com.example.EjerciciosTarea.Dia6;

public class Disenador extends Empleado{

    private String herramientaDiseno = "Photoshop";

    public Disenador(String nombre, String apellidos, int edad, int codigoEmpleado) {
        super(nombre, apellidos, edad, codigoEmpleado);
    }

    @Override
    public void actividadesDiarias() {
        super.actividadesDiarias();
        elaboracionWeb();
        presentancionDiseno();
        reunionesAvance();
        if (getEdad() <= 25){
            revisionDisenador();
        }else
            apoyoDisenador();

    }

    public void reunionesAvance(){
        System.out.println("Reunione presentando los cambios de la interfaz");
    }

    public void elaboracionWeb(){
        System.out.println("Elaboracion de wireframe para paginas webs");
    }

    public void presentancionDiseno(){
        System.out.println("Presentacion con ajustes del diseño");
    }
    public void revisionDisenador(){
        System.out.println("Revision de diseñador SR");
    }

    public void apoyoDisenador(){
        System.out.println("Apoyar a diseñador JR");

    }
}
