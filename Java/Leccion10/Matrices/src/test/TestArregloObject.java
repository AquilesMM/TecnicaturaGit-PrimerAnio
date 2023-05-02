
package test;

import domain.Persona;

public class TestArregloObject {
    public static void main(String[] args) {
        //Creamos arreglo tipo object, con clase Persona
        /*
        A diferencia de la creacion normal, en el lado derecho, en vez de parentesis, tendremos que poner corchetess
        y dentro de estos corchetes, indicar la cantidad de elementos que tendra el arreglo
        
        Recordar que objetos por default se les asigna null, lo mismo aplica para los espacios en os arreglos object
        */
        Persona personas[] = new Persona[2];
        //Modificamos los valores de los elementos que estan en null
        //hay que agregar una nueva referencia en cada indice para que apunte a un nuevo objeto de tipo Persona, el objeto se puede crear
        //en una misma linea o en otra
        personas[0] = new Persona("Aquiles");
        personas[1] = new Persona("Mily");
        System.out.println("personas[0] = " + personas[0]); //nos mostrara las direcciones de memoria
        System.out.println("personas[1] = " + personas[1]);
        
        //Iterar elementos de tipo object
        
        for(int i = 0; i < personas.length; i++){
            System.out.println("personas["+i+"] = " + personas[i]);
        }
        //SINTAXIS RESUMIDA PARA TRABAJAR CON ARREGLOS
        
        String frutas[] ={"Banana", "Pera", "Durazno"};
        /*
        Sintaxis resumida ya que asignamos el contenido de la array y tambien le asignamos de por si los valores para cada lugar
        El primero siendo 0, el segundo 1 y etc
        */
        
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("frutas["+i+"] = " + frutas[i]);
        }
        
        
    }
}
