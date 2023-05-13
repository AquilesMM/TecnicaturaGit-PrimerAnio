package test;

import domain.*;

public class TestInstanceOf {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 10000);
        determinarTipo(empleado1);
        empleado1 = new Gerente("Jose",5000.0,"Sistemas"); //reescribimos la variable
        determinarTipo(empleado1);
    }
    

//INSTANCEOF == determinar el tipo
    public static void determinarTipo(Empleado empleado){ 
        /*
        esta palabra se utiliza para determinar el tipo en tiempo de ejecucion
        por tipo nos  referimos a lo que creamos del lado derecho de la instanciacion (tipo int, object, clase de objetct, etc) es decir lo que se asigna
        en la memoria
        
        podemos darle muchos usos, ademas de saber de que clase es un elemento
        tambien podemos cambiar su tipo, por ejemplo, pasar de una variable de tipo padre a una de tipo hija
        */

        
        
        if(empleado instanceof Gerente){ //Empleado es una instancia de gerente?
            //SE RECOMIENDA QUE SE EMPIECE A PREGUNTAR POR LAS CLASES MAS ESPECIFICAS ES DECIR LAS CLASES HIJAS
            //LOS ULTIMOS TIPOS A PREGUNTAR DEBEN SER LOS MAS GENERICOS
            //de preguntar primero por los mas generales, nunca podremos acceder a los especificos, ej:
            //todos los elementos son hijos de la clase objetc por lo que siempre diria que es object y jamas podriamos saber si es de clase 
            //gerente o empleado
            //ademas de que conociendo la ruta de herencia, sabiendo que es una instancia de una clase hija especifica pasara por los respectivos padres
            
            System.out.println("Es de tipo Gerente");
            ((Gerente) empleado).getDepartamento(); //tratamos de acceder  al get de un elemento de esta clase, pero no nos lo deja hacer directamente
            //lo que hizo el id fue ayudar haciendo una conversion de tipo. No hay acceso directamente al atributo departamento
            //lo que hace el id es convertir la variable de tipo padre a una de tipo hijo
//            Gerente geremte = (Gerente)empleado;
//            System.out.println("gerente ="+Gerente.getDepartamento());
            //si hacemos la conversion manual tambien nos dejara hacerlo
        }
        else if(empleado instanceof Empleado){
            System.out.println("Es de tipo Empleado");
            Gerente gerente = (Gerente)empleado;
            System.out.println("gerente ="+gerente.getDepartamento());
        }
        else if(empleado instanceof Object){
            System.out.println("Es de tipo Object");
        }
    }
}
