package test;

import dominio.Persona;
//import dominio.*;
/*
Luego del punto va el nombre de la clase que queremos importar dentro del paquete dominio
en el caso de querer importar todas las clases que haya en este paquete lo hacemos a travez de un asterisco como se ve arriba
en este caso estaria de mas poner el asterisco ya que solo tenemos una clase

Al importar todas las clases no estamos haciendo un mal uso de la memoria porque esta importacion no carga todas las clases
en la memoria, solo las importa para que en el momento que vayamos a utilizar una clase, las tengamos a disposicion
pero de no utilizarse no se cargan en la memoria. Es decir que la importacion no carga estas clases en la memoria
Solo pone a disposicion o deja a la mano el uso de las clases cuado sea requerido, cuando hagamos uso en una de las clases
recien ahi se activara y se hara uso del espacio de memoria para esa clase.
*/
public class PersonaPrueba {
    public static void main(String[] args) {
        
        Persona persona1 = new Persona("Mily", 57.000, false);
        
        System.out.println("El nombre de persona1 original es: "+persona1.getNombre());
        //Modificar a travez de los metodos
        persona1.setNombre("Aquiles");
        //persona1.nombre="Aquiles"; Esto ya no se puede utilizar
        
        System.out.println("persona1 su nombre modificado es: "+persona1.getNombre());
        //System.out.println("Nombre es: "+persona1.nombre); Esto ya no se puede hacer tampoco
        System.out.println("El sueldo de persona1 es: "+persona1.getSueldo());
        System.out.println("Persona1 para obtener el booleano"+persona1.isEliminado());
        
        //Tarea: Crear otro objeto de tpo Persona, asignar valores de manera inicial
        //e imprimir, luego modificar sus valores y volver a imprimir con los valores nuevos
        
        
        
        
        //METODO TO STRING
        
        /*
        Este metodo permite ver el estado del objeto en cualquier momento
        Nos permite ver el valor de cada atributo que agregemos al metodo
        El objetivo es que al hacer la impresion de una variable que apunta a un objeto, se vea toda la informacion
        incluyendo cada valor de cada atributo de este objeto
        
        Manera de llamarlo
        System.out.println("persona1: "+persona1.toString());
        esa es la sintaxis correccta, cuando nos encontramos que el metodo toString no esta definido
        pero como en este caso si lo definimos en la clase Persona, entonces la sintaxis se simplifica de la siguiente manera:
        cont soutv+ tab de esta manera el compilador llamara automaticamente al toString
        */
        System.out.println("persona1 = " + persona1);
        
    }
    
}
