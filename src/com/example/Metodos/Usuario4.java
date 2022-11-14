package com.example.Metodos;

public class Usuario4 {

    String nombre;
    int edad;
    String direccion;

    Usuario4(){
        nombre = null;
        edad = 0;
        direccion = null;
    }

    Usuario4(String nombre, int edad, String direccion){
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }

    Usuario4(Usuario4 usr){
        nombre = usr.getNombre();
        edad = usr.getEdad();
        direccion = usr.getDireccion();
    }

    void setNombre(String n){
        nombre = n;
    }

    String getNombre(){
        return nombre;
    }

    void setEdad(int e){
        edad = e;
    }

    void setEdad(float e){
        edad = (int) e;
    }

    int getEdad(){
        return edad;
    }

    void setDireccion(String d){
        direccion = d;
    }

    String getDireccion(){
        return direccion;
    }



}
class ProgUsuarioEjemplo{
    void imprimeUsuario(Usuario4 usr){

        /// usr.nombre eqivale en este caso a usr.getNombre()
        System.out.println("\nnombre: " + usr.nombre);
        System.out.println("Edad: "+ usr.getEdad());
        System.out.println("Direccion: " + usr.getDireccion());
    }

    public static void main(String[] args) {
        ProgUsuarioEjemplo prog = new ProgUsuarioEjemplo();
        // Se declaran dos objetos de la clase Usuario4
        Usuario4 usr1, usr2;

        // Se utilizo el constructor por omision
        usr1 = new Usuario4();
        prog.imprimeUsuario(usr1);

        // Se utliza el segundo constructor de Usuario4
        usr2 = new Usuario4("eduardo",23,"Mi direccion");
        prog.imprimeUsuario(usr2);

        // Se utlizo el tercer constructor de Usuario4
        usr1 = new Usuario4(usr2);
        usr1.setEdad(23);
        usr2.setEdad(25.23f);
        prog.imprimeUsuario(usr1);
        prog.imprimeUsuario(usr2);
    }
}
