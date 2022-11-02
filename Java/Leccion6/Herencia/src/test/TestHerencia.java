
package test;

import domain.Empleado;
import domain.Cliente;
import java.util.Date;


public class TestHerencia {
    public static void main(String[] args) {
        //haremos un objeto de la clase Empleado, importando la clase
        Empleado empleado1 = new Empleado("Aquiles", 57000.0);
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
        
        Date fecha1 = new Date();
        
        //Cliente cliente1 = new Cliente("Mily",'f', 20, "tupac Amaru", new Date(), true); //esto para ver que podemos crear
       // un objeto dentro de otro, en este caso objeto date
        Cliente cliente1 = new Cliente("Mily",'f', 20, "tupac Amaru", fecha1, true);
        System.out.println("cliente1 = " + cliente1);
        
        //SECRETOS DE EJECUCION
        
        /*
        A la hora de modificar una serie de clases padre e hijas, si nosotros realizamos cambios en uno de ellos
        pongase el padre, los cambios no se veran reflejado en las hijas ni quienes importen a las clases hijas o clase padre
        hasta que no los actualicemos, y en caso de ser una serie de herencia importacion deberemos actualizar todo
        
        ejemplo, hacemos cambio en persona, para que el cambio se vea en testHerencia, primero deberemos actualizar
        las clases hijas de persona Empleado/Cliente, (dependiendo de que objeto usemos) y luego la clase test Herencia
        (el orden no importa, pero si deben ser actualizados todos) para que asi se vea el cambio
        cabe destacar que debemos guardar los cambios que hayamos echo
        
        Para actualizar, basta con borrar y volver a poner un punto y coma y guardar el archivo
        
        puede o no pasar que se necesiten las actualizaciones, hay veces que se actualizan solas. pero en caso de que 
        el cambio no se este mostrando, actualizar clases
        */
        
    }
}
