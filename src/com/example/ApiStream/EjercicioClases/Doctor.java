package com.example.ApiStream.EjercicioClases;

public class Doctor extends Persona{

    private String cedula;
    private String especialidad;
    private Persona paciente;

    public Doctor(){

    }

    public Doctor(String nombres, String pa, String sa, Integer e, String d, String cedula, String especialidad, Persona paciente) {
        super(nombres, pa, sa, e, d);
        this.cedula = cedula;
        this.especialidad = especialidad;
        this.paciente = paciente;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Persona getPaciente() {
        return paciente;
    }

    public void setPaciente(Persona paciente) {
        this.paciente = paciente;
    }


    @Override
    public String nombreCompleto(){
        return paciente.getNombres() + " " + paciente.getPrimerApellido() + " " + paciente.getSegundoApellido();
    }

    @Override
    public void imprimirNombreYDireccion(){
        System.out.println("Nombres: " + paciente.getNombres() + " Direcc: " + paciente.getDomicilio());
    }

    public void consultorio(Persona persona){
        System.out.println("Cedula: " +this.cedula +
                "\nEspecialidad: "+ this.especialidad +
                "\nNombre Completo Paciente: " + paciente.getNombres() + " " +
                paciente.getPrimerApellido() + " " + paciente.getSegundoApellido() +
                "\nDireccion del paciente: " + paciente.getDomicilio() +
                "\nEdad: " + paciente.getEdad() +

                "\nNombre Completo Persona: " + persona.getNombres() + " " +
                persona.getPrimerApellido() + " " + persona.getSegundoApellido() +
                "\nDireccion de la persona: " + persona.getDomicilio() +
                "\nEdad: " + persona.getEdad());
    }
}
