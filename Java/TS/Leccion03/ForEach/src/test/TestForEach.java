package test;

import domain.Persona;

public class TestForEach {
    public static void main(String[] args) {
        /*
        For Each se refiere a un ciclo for mejorado, el cual nos ayuda
        a simplificar el recorrer los arreglos y colecciones
        
        */
        
        int edades[] = {25, 26, 18, 19}; //sintaxis resumida
        
        for (int edad: edades) { //Sintaxis del ForEach
            /*
            la variable edad sera la que nos permita recorrer los datos
            en el arreglo.
            esta sintaxis se leeria algo asi:
            para cada edad(variable) de tipo entero en edades hacer
            para cada elemento en arreglo hacer
            ES IMPORTANTE QUE LA VARIABLE QUE RECORRERA SEA DEL MISMO TIPO
            DE DATO QUE EL ARREGLO.
            
            La variable no solo recorre sino que almacena temporalmente el valor
            del elemento que este recorriendo dentro del arreglo.
            
            EL UNICO DETALLE A TENER EN CUENTA ES QUE YA NO TENEMOS UN CONTADOR
            (iterador) por lo que no podremos usarlo en otros elementos u otros usos
            Ni siquiera podremos imprimir el indice y saber por que vuelta vamos, eso habria
            que hacerlo de otra forma
            */
            System.out.println("Edad: "+ edad);
        }
        
        
        //Usaremos forEach para recorrer un objeto
        
        //Crearemos n arreglo de objetos de tipo persona
        //NO SE PUEDE UTILIZAR VAR PARA DEFINIR NINGUN TIPO DE ARREGLO
        //si podemos en la variable de for each que recorrera el arreglo, pero nunca ela rreglo en si
        Persona personas[] = {new Persona("Juan"), new Persona("Carla"), new Persona("Beatriz")};
        
        //FOREACH
        for(Persona persona: personas){
            System.out.println("Persona: "+ persona);
        }
        
        
        
    }
}
