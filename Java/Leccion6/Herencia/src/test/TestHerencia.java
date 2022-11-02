
package test;

import domain.Empleado;


public class TestHerencia {
    public static void main(String[] args) {
        //haremos un objeto de la clase Empleado, importando la clase
        Empleado empleado1 = new Empleado();
        System.out.println("empleado1 = " + empleado1);
        /*
        A pesar de no haber creado nada en la clase Empleado, aun asi al hacer un objeto con dicha clase, esta 
        nos mostrara el toString heredado de la clase Persona por Empleado, demostrando de esta manera
        que aunque no hayamos puesto nada en la clase Empleado, esta ahora tiene las mismas caracteristicas, metodos
        y atributos que la clase Persona, a persar de que Empleado esta vacia
        TAMBIEN HEREDA LOS CONSTRUCTORES
        podemos acceder a travez de la palabra super para saber que constrctor queremos utilizar
        lo define el numero de argumentos que usemos, si no ponemos ninguno lo define el de la clase padre que esta vacio
        si pasamos uno usara el de la clase padre que tiene un argumento
        
        al no tener nada la clase empleado, al llamar al objeto, va primero a empleado, y al no haber nada pasa a la clase
        Persona
        y luego de usar el constructor vacio, al no tener nada, acude al toString
        */
    }
}
