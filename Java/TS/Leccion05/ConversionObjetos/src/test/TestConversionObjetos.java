package test;

import domain.*;

public class TestConversionObjetos {
    
    
    //Casting: se conoce como casting en programacion al proceso de cambiar el valor de un tipo de dato a otro tipo de dato.
    
    //DOWCASTING
    /*
    Se denomina dowcasting al proceso de convertir la referencia de tipo padre almacenada en una variable a una referencia de tipo hijo
    
    Es decir convertir la referencia de tipo padre a la de tipo hija de una gerarquia/referencia superior a una inferior
    */
    
    //UPCASTING
    /*
    Se denomina upcasting al proceso de convertir la referencia de tipo hijo almacenada en una variable a una referencia de tipo padre
    
    Es decir convertir una referencia de tipo hija  auna padre, de una gerarquia/referencia inferior a una superior
    */
    
    
    
    public static void main(String[] args) {
        Empleado empleado; //creamos una variable de tipo empleado (clase padre)
        empleado = new Escritor("Juan", 5000, TipoEscritura.CLASICO); //a la variable de tipo padre
        //le asignamos una referencia de su clase hija, no olvidar que las variables de clase padre pueden almacenar referencias de clase hija
        //por ello el objeto que creamos es de la clase hija
        
        
        //vemos en consola como se han guardado correctamente los datos en la variable de clase padre a travez de clase hija
        
        //System.out.println("empleado = " + empleado);
        
        //System.out.println(empleado.obtenerDetalles()); //Si queremos acceder a metodos Escritos
        //mediante esta linea podemos ver que aunque estamos utilizando una variable de tipo padre, podemos acceder a la informacion de la clase hija
        //todo esto gracias al polimorfismo
        //lo que pasa es que al utilizar los metodos sobreescritos, ejecutara el metodo en comun, pero en este caso tomara prioridad el de la clase hija
        //si queremos ver a travez del compilador de que clase proviene el metodo nos enviara a la clase padre, ya que el compilador no puede diferenciarlo
        //este proceso se hace a nivel de ejecucion. Aun asi podemos dar una idea de que el metodo ejecutado es el de la clase hija ya que lo hacemos
        //a travez de un objeto de la clase hija
        
        
        //si querenis acceder al metodo get de la clase hija nos dara un error
        //empleado.getTipoEscritura();
        //esto se debe a que no es un metodo sobreescrito, sino que es un metodo que unicamente se encuentra en la clase hija y por ello la clase
        //padre, a la cual pertenece la variable originalmente, no puede acceder
        //para poder acceder a este metodo, se debe hacer una conversion/casting/casteo a la clase hija (downcasting en este caso)
        
        
        //Dowcasting
        //((Escritor)empleado).getTipoEscritura(); /Tenemos 2 opciones: esta es una
        /*
        En este primer caso lo que se hace es que a travez del objeto empleado estamos asignando a la cariable  el valor de getTipoEscritura
        Lo que hacemos es castearlo hacia la clase hija, y lo envolvemos llamando al metodo
        En este caso el compilador no ayudara, no se realiza de manera automatica
        
        Luego de hacer dowcasting la variable sera de tipo hija por lo que podra acceder a todos los metodos de esta clase y todos sus atributos
        */
        
        //IMPORTANTE
        //notar que lo que se hace es crear una nueva variable y a esta asignarle el valor/referencia de la variable/objeto de tipo padre
        //pero es necesario hacer una conversion
        
        
        //esta es otra sintaxis con la misma funcion que la vista anteriormente
        Escritor escritor = (Escritor)empleado; //Esta es la segunda opcion
        //hacemos la conversion
        //y luego asignamos/utilizamos la funcion de getTipoEscritura
        
        escritor.getTipoEscritura();
        //en estas dos lineas realizamos lo mismo que en la linea vista anteriormente
        //De esta manera es la misma vista en su momento con los tipos primitivos
        
        
        
        //Upcastig
        //en este utilizamos el mismo metodo que vimos tanto para tipos primitivos como para downcasting
        //en este caso lo que hacemos es crear una nueva variable de clase padre
        //esta es de clase padre y le asignamos el valor del objeto/variable de escritor la cual pertenece a la clase hija
        //y luego utilizamos el metodo de obtenerDetalles()
        //a deferencia del uocasting, al asignar una referencia de tipo hija a una variable de tipo padre no hara falta hacer ninguna conversion
        //esto es similar a lo que se ve con los tipos primitivos:
        //los tipos que pueden almacenar mas espacio/bits pueden soportar tipos con menos cantidad de bits. Pero al revez no es posible
        //por lo que es necesario realizar una conversion. Aqui es lo mismo pero trabajando con la gerarquia de clases
        Empleado empleado2 = escritor;
        System.out.println(empleado2.obtenerDetalles());
    }
    
}
