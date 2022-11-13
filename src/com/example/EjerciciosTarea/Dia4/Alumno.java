package com.example.EjerciciosTarea.Dia4;

public class Alumno extends Persona{

    private static String promedio;
    private static String aprobado;
    private static Persona estudiante;

    public Alumno(){

    }

    public Alumno(String nombre, String primerApellido, String segundoApellido, String direccion, String grado, Persona estudiante) {
        super(nombre, primerApellido, segundoApellido, direccion, grado, estudiante);
        Alumno.aprobado = aprobado;
        Alumno.promedio = promedio;
    }

    public static String getPromedio() {
        return promedio;
    }

    public static void setPromedio(String promedio) {
        Alumno.promedio = promedio;
    }

    public static String getAprobado() {
        return aprobado;
    }

    public static void setAprobado(String aprobado) {
        Alumno.aprobado = aprobado;
    }

    public static Persona getEstudiante() {
        return estudiante;
    }

    public static void setEstudiante(Persona estudiante) {
        Alumno.estudiante = estudiante;
    }

    public static String infoAlumno(Persona estudiante){
        return "Nombre: " + estudiante.getNombre() +
                "\nPrimer Apellido: "+ estudiante.getPrimerApellido() +
                "\nSegundo Apellido: "+ estudiante.getSegundoApellido() +
                "\nDireccion: " + estudiante.getDireccion() +
                "\nGrado escolar: " + estudiante.getGrado();
    }

    public static String infoEscolar(){
        return "Promedio: " + Alumno.getPromedio() + " Aprobado: " + Alumno.getAprobado();
    }
}
