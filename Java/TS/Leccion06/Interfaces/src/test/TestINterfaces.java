package test;

import accesodatos.*;


public class TestINterfaces {
    public static void main(String[] args) {
        
        //DEFINIREMOS UNA VARIABLE DE TIPO INTERFACE 
        /*
        Asi como hemos visto clases padres, clases hijas, clases abstractas, etc
        y hemos podido crear variables de esos tipos, tambien se pueden crear variables de tipo interfaces
        
        Esto lo haremos ya que en POO uno de los objetivos es hacer codigo lo mas generico posible
        el uso de interface nos permitira lograr este objetivo
        
        hacer metodos mas genericos recibiendo tipos interface y estos tipos interface pueden apuntar a objetos que 
        hayan implementado esta interface, el comportamiento
        
        A continuacion definiremos un tipo interface
        
        DE UNA INTERFACE NO SE PUEDEN CREAR OBJETOS (no hereda de clase object ni tiene constructor, etc)
        NO PODEMOS INSTANCIAR DESDE UNA INTERFARFACE
        
        */
        //IAccesoDatos datos =  new IAccesoDatos(); //dara error porque no podemos instanciar desde una interface
        //por lo que instanciaremos desde las clases que implementan esta interface
        //Es decir, la manera para instanciar, no es directamente desde la interface, sino crear un objeto de clase interface, pero que apunte
        //AL SER SIMILAR A COMO SE TRABAJA CON HERENCIA, ESTO ES MUY SIMILAR A TRABAJAR CON POLIMORFISMO
        //LA CLASE "PADRE" (INTERFACE) PUEDE ACCEDER A OBJETOS QUE APUNTEN A SUS CLASES "HIJAS" (clases de implementacion de comportamiento interface)
        //a una clase que implemente el comportamiento de la intereface 
        //Cabe mencionar que la variable donde se almacenara el objeto que apunte a la clase que implemente la interface
        //debe ser del mismo tipo que la interface que se implementa en la clase
        //es decir, no podemos asignar un objeto apuntando a una clase que implementa un tipo de interface distinta al tipo de interface de la que es la variable donde se almacenara
        
        
        
        //CUANDO SE TRABAJA CON CLASES SE TRAE CARACTERISTICAS EN COMUN
        //CON INTERFACE SE TRAE COMPORTAMIENTO EN COMUN (funcionalidad y no caracteristicas)
        
        IAccesoDatos datos = new ImplementacionMySql();
        
        //EMPEZAR A TRABAJAR CON LOS METODOS DEFINIDOS EN LA INTERFACE
        /*
        Para ello debemos tomar la implementacion
        */
        
        
        datos.listar();
        //al utilizar este metodo, y querer ver su procedencia, nos enviara al metodo de la interface
        //pero esto aplica polimorfismo por lo que, el metodo que en realidad se esta implementando es el de la calse hija
        //pero esto se ve en tiempo de ejecucion.
        
        //ES DECIR, EL METODO QUE SE EJECUTARA SERA EL QUE PERTENEZCA A LA CLASE DE LA QUE SEA EL OBJETO, NO LA VARIABLE DONDE SE ALMACENA
        
        
        //reutilizaremos la variable de datos para trabajar con la clase de Oracle
        //en este caso como la interfase en la misma, no hay necesidad de cambiar el tipo de variable, solo 
        //la direccion a la que apunta el objeto
        datos = new ImplementacionOracle();
        datos.listar();
        
        //en este caso se utilizara tambien polimorfistmo, pero el objeto al apuntar a la clase de Oracle
        //se utilizara la implementacion de Oracle y no la de MySql

        
        //utilizamos el metodo imprimir, este es un metodo TOTALMENTE GENERICO para trabajar con ambas clases (bases de datos)
        //Lo cual es el mayor objetivo a lograr
        //este recibe un tipo interface que puede apuntar a implementaciones de MySql y a implementaciones de Oracle
        //todo dependera del dato y la referencia que reciba
        
        imprimir(datos);
        
        //EN ESTE PUNTO VAMOS AUN MAS ALLA DE LO QUE TRABAJABAMOS CON POLIMORFISMO
        //TRABAJAMOS CON PURO COMPORTAMIENTO
        //ESTO ES LA BASE DE FRAMEWORKS
    }   
    //PARA VER EL TIMEPO DE EJECUCION SE HACE CON UN DEBUG NO MEDIANTE EL COMPILADOR
    
    
    
    
    //Creamos un metodo para recibir con la variable datos de la interface
    public static void imprimir(IAccesoDatos datos){
        datos.listar();
        
    }
    
    
}
