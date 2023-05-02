package domain;

public class Persona {
    //Bloque de inicializacion
    /*
    Existen dos tipos de bloques de inicializacion
    Bloques Estaticos y Bloques No Estaticos
    
    Ambos bloques se van a ejecutar antes del constructor de la clase
    Este tipo de codigo no es muy comun de encontrarlo 
    lo comun es utilizar los constructores de la clase para inicializar los atributos
    
    Cargamos los atributos
    */
    
    private final int idPersona;
    private static int contadorPersona;
    
    
    //BLOQUE DE INICIALIZACION ESTATICO o Bloque de codidgo de inicializacion estatico
    static{
        System.out.println("Ejecucion bloque estatico"); //para ver cuando se ejecuta este bloque
        
        /*
        Este es el primer bloque en ejecutarse
        se ejecutara antes de el constructor y que cualquier otro bloque de inicializacion
        no estatico
        Este bloque se ejecuta cuando se carga esta clase en memoria y solo se 
        ejecuta una vez, a diferencia del contexto dinamico que se ejecuta cada vez que 
        se crea un objeto
        
        Podemos utilizarlo para inicializar atributos pero solo aquellos de tipo static
        
        EN ESTE BLOQUE SOLO SE PUEDEN TRABAJAR CON ATRIBUTOS ESTATICOS
        DE NO HACERLO DARA ERROR, ADEMAS DE QUE NO 
        TAMPOCO PODEMOS UTILIZAR EL OPERADOR THIS. EN EL CONTEXTO ESTATICO
        
        El uso de el nombre de la clase es opcional, pero es una buena practica para que
        el codigo sea mas legible 
        es decir, podemos llamar al atributo sin necesidad de utilizar el nombre de la 
        clase y el operador de punto
        */
        ++Persona.contadorPersona;
        //idPersona = 10; NO es estatuci por esto tenemos un error
    }
    
    //BLOQUE DE INICIALIZACION NO ESTATICO o CONTEXTO DINAMICO
    {
        /*
        Para crear este bloque solo abrimos llaves sin necesidad de especificar nada
    
        lo utilizamos para inicializar todas las variables que no son estaticas
        
        Este bloque tambien se ejecuta antes del constructor pero se ejecuta luego
        del bloque de inicializacion estatico.
    
        A DIFERENCIA DEL BLOQUE ESTATICO, ESTE SE EJECUTARA CADA VEZ QUE CREEMOS UN  
        OBJETO
    
        */
        System.out.println("Ejecucion del bloque NO estatico");
        this.idPersona = Persona.contadorPersona++; //incrementamos el atributo  
        
    }
    
    
    public Persona(){
        System.out.println("Ejecucion del constructor");
    }

    public int getIdPersona(){
        return this.idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }
    
    
}
