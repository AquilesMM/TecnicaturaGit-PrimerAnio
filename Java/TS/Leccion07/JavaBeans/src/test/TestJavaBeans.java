package test;

import domain.Persona;

public class TestJavaBeans {
    public static void main(String[] args) {
        Persona persona = new Persona();
        //las tecnologias mas avanzadas que utilizaran nuestra clase, lo haran sin pasar argumentos (esto solo con javabeans), es por eso que 
        //necesitamos el constructor totalmente vacio
        //para asignar valores, utilizamos el set de cada atributo
        persona.setNombre("Juan");
        persona.setApellido("Perez");
        System.out.println("persona = " + persona);
        System.out.println("Persona nombre: "+persona.getNombre());
        System.out.println("Persona apellido: "+persona.getApellido());
    }
}
