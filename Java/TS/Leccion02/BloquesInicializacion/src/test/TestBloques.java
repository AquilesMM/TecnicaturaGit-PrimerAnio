package test;

import domain.Persona;

public class TestBloques {
    
    public static void main(String[] args) {
        Persona persona1 = new Persona(); 
        /*
        Al crear un objeto observamos que sin imprimir nada, de manera automatica
        se ejecutan las impresiones de bloque estatico, luego dinamico y luego constructor
        
        */
        System.out.println("persona1 = " + persona1);
        Persona persona2 = new Persona();
        System.out.println("persona2 = " + persona2);
        /*
        Al crear otro objeto podemos ver como se vuelve a ejecutar el bloque dinamico
        y el constructor pero no el bloque estatico
        */
    }
    
}
