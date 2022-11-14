package com.example.Excepciones;

public class Main {

    public static void main(String[] args){

        try {
            Integer x= 1/0;

        }catch (IndexOutOfBoundsException e){
            System.out.println("Exception generic");
        }catch (ArithmeticException e){
            System.out.println("Exception Arith");
        }catch (Exception e){
            System.out.println("Exception generic");
        }finally {
            System.out.println("Finally");
        }

    }
}

class ExcepcionCustom extends Exception{
    public ExcepcionCustom(String s){
        super(s);
    }
}
