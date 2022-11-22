package com.example.EjerciciosTarea.Dia6;

public class Programador extends Empleado{

    private String analisisRequierimientos;
    private String desarrolloRequerimientos;
    private String presentacionPruebasUnitarios;


    public Programador(String nombre, String apellidos, int edad,int codigoEmpleado) {
        super(nombre, apellidos, edad, codigoEmpleado);
    }

    @Override
    public void actividadesDiarias() {
        super.actividadesDiarias();
        System.out.println(presentacionPruebasUnitarios().substring(1,desarrolloRequerimientos().length()-1));
        System.out.println(desarrolloRequerimientos().substring(1,desarrolloRequerimientos().length()-1));
        System.out.println(analisisRequierimientos().substring(1,analisisRequierimientos().length()-1));
    }

    public String analisisRequierimientos(){
        return "analisis de los datos conseguidos en la entrevista";
    }

    public String desarrolloRequerimientos(){
        return "Creacion del documento";
    }

    public String presentacionPruebasUnitarios(){
        return "lista de pruebas unitarias";
    }
}
