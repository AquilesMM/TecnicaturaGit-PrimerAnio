
package Operaciones;


public class PuebaAritmetica {
    public static void main(String[] args) {
        var a = 10; //variables locales
        int b = 7; //Memoria stack
        miMetodo(); //Llamamos el método nuevo
        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a = 3;
        aritmetica1.b = 7;
        aritmetica1.sumarNumeros();
        //Para almacenar un objeto o los atributos se utiliza la memoria heap
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("resultado = " + resultado);
        
        resultado = aritmetica1.sumarConArgumentos(12, 26);
        System.out.println("Resultado usando argumentos = "+resultado);
        
        System.out.println("aritmetica1 a: "+aritmetica1.a);
        System.out.println("aritmetica1 b: "+aritmetica1.b);
        
        Aritmetica aritmetica2 = new Aritmetica(5, 8);
        System.out.println("aritmetica2 = " + aritmetica2.a);
        System.out.println("aritmetica2 = " + aritmetica2.b);
        //aritmetica1 = null; nunca utilizar esto, no de debe hacer
        //System.gc(); método para limpiar residuos, es pesado, no utilizar
        
        //CREAMOS UN NUEVO OBJETO   
        Persona persona = new Persona("Ariel", "Betancud"); //se considera un nuevo objeto de tipo string
        //al trabajar con string no es necesario poner new string, (muchos lo hacen) ej: Persona (new String("Ariel")), etc.
        // es valido pero es poco comun, ya que lo que hacemos con el new es crear un objeto en una ubicacion de memoria unica
        // no es necesario porque ya trabajamos con memoria heap no stack, por lo que con new ya seria demaciado porque ya es 
        //muy seguro lo que hacemos, y ya trabajamos con heap. SI bien el resultado en memoria es diferente, sin el new
        //es la forma mas utilizada, en este caso java utiliza un tipo de mmemora llamada poolstring, esto es un conjunto
        //de cadenas que Java va a administrar para reutilizar. El objetivo es ocupar la menor cantidad de memoria
        
        System.out.println("persona = " + persona); //veremos objeto persona, package.Clase persona + espacio de memoria utilizado
        System.out.println("Persona nombre: "+persona.nombre);// nombre
        System.out.println("Persona apellido: "+ persona.apellido);

    }
    //Modularidad creamos un nuevo método
    public static void miMetodo(){
        //a = 10; //una variable esta limitada
        System.out.println("Aquí hay otro método");
    }
}


//Creamos una nueva clase
class Persona{
    //podemos ver detalles de la clase precionando ctrl y poniendo el muse sobre la clase
    //todas las clases tienen herencia de object porque esta es la clase padre
    // esto hace que dentro de los otros cconstrucotres haya una llamada a la clase padre la cual no se puede ver
    //este es un constructor vacio, no ncesita pasar argumento
    // este constructor es el encargado de reservar los espacios de memoria
    //tambien es el encargado de regresar la referencia
    //SI LO PONEMOS DEBE ESTAR EN LA PRIMERA LINEA
    String nombre;
    String apellido;
    
    Persona(String nombre, String apellido){ //Constructor
        super(); //METODO CONSTRUCTOR DE LA CLASE PADRE OBJECT, NO NECESITA QUE LE PASEMOS ARGUMENTOS
        //ENCARGADO DE PASAR LA REFERENCIA
        //gracias a esto es que el operadr this puede utilizarse para acceder al espacio de memoria}
        //esto demuestra que hay mas cosas que no vemos pero estan sucediendo, detras de cada clase hay llamados a otras clases
        //todas las clases son herencia de la clase padre object
        
        
        //NUEVA FORMA DE CREAR OBJETO
        
        
        //Imprimir imprimir = new Imprimir(); // asi  veniamos creando objetos
        
        new Imprimir().imprimir(this);
          // clase      metodo   this = imprime lo que esta en el metodo imprimir, es decir espacio de memoria persona e imprimir
        // muestra lo que hay en el metodo imprimir, dandole el argumento de this, que en este caso sera la clase persona
        //ya que el llamado se hace desde la clase persona
        this.nombre = nombre;
        this.apellido = apellido;
        //haremos que nuestro constructor imprima
        System.out.println("Objeto persona usando this: "+this);
        //para mostrar el objeto actual utilizamos this
        //esta es la forma que tenemos de trabajar desde un metodo o la clase 
        // dentro del main utilizamos el objeto y en metodos y clases utilizamos el this
        //esto va a mostrar el mismo espacio de memoria que estamos trabajando
        
        //nos mostrara paquete.clasePersona@numeroDeEspacioMemoria
        
        
        
        // el compilador compila siempre de arriba hacia abajo, pero pueden haber variaciones 
        // debido a diferentes estructuras estructura que encuentren en su camino
        //estas estructuras puede ser if, ciclos, metodos, clases, objetos, etc
       
    }
}

class Imprimir{
    public Imprimir(){
        super();//el constructor de la clase padre, para reservar memoria
    }
    public void imprimir(Persona persona){
        System.out.println("Persona de la clase imprimir"+persona); //imprimira el espaco de memoria de la clase persona
        System.out.println("Impresion del objeto actual (this):"+this); //imprim el espacio de memoria de la clase imprimir
    }
}