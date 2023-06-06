package domain;

import java.io.Serializable;

/*
JAVABEANS
Para que una clase en java se considere un javabeans, debe cumplir ciertas caracteristicas:

-Debe tener un constructor vacio
-Cada atributo a definir en esta clase, debe ser un atributo private, y cada atributo private, debe tener su get y set, utilizando encapsulamiento
-Debe implementar una interface llamada Serializable

Nos permitira enviar nuestra clase entre diferentes equipos, ejemplo: Si tenemos diferentes servidores de java, y necesitamos transferir esta clase java 
(este javabeans) entre diferentes equipos, entonces sera importante que implemente la interface de Serializable, esta interfaz tiene mas usos, pero, 
simplemente agregar implements Serializable a una clase, todo lo demas lo va a implementar el servidor de aplicaciones java, por lo que no es necesario
agregar ninguna otra caracteristica a la clase.

Solo con que la clase cumpla dichas caracteristicas, se considerara un javabeans.

Al considerarse un javabeans, entonces entran otras tecnologias, como pueden ser javaEmpresarial, sprin, etc, que podran hacer uso de estas clases
Si nuestra clase no consigue la nomenclatura de JavaBeans, entonces estas otras tecnologias no podran utilizar estas clases



SERIALIZABLE
En Java, una interfaz Serializable es una interfaz marcadora (marker interface) que se utiliza para indicar que una clase puede ser serializada,
es decir, que sus objetos se pueden convertir en una secuencia de bytes para ser almacenados en memoria o transmitidos a través de una red.

La interfaz Serializable no tiene métodos que deban ser implementados, simplemente actúa como una marca para el compilador y la máquina virtual de Java,
indicando que la clase es compatible con la serialización.

Cuando una clase implementa la interfaz Serializable, se le permite que sus objetos sean guardados en archivos, bases de datos o transmitidos a 
través de una red. La serialización se utiliza en Java para fines como el almacenamiento persistente de objetos,
el envío de objetos a través de sockets o la comunicación entre diferentes procesos.

*/


public class Persona implements Serializable{ //implementa Serializable
    
    //Agregaremos atributos de tipo private, para cumplir con los requisitos necesarios
    
    private String nombre;
    private String apellido;
    
    
    //Constructor vacio: esto es obligatorio para ser un javaBeans
    public Persona(){
        
    }
    
    //Agregamos otro constructor con parametros, NO ES REQUERIDO NI NECESARIO PARA SER UNA JAVABEANS, esto se hace por este programa especifico
    
    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    
    //GETTERS Y SETERS ENCAPSULADOS: ES OBLIGATORIO PARA UN JAVABEANS

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

   //podemos agregar un equals, hascode, to string, para complementar, aunque esto no es requerido

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + '}';
    }
    
    
    
    
    
}
