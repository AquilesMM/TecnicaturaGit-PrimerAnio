
package Operaciones;

public class Aritmetica {
    //Atributos de la clase
    int a;
    int b;
    
    //El constructor es un método especial
    public Aritmetica(){ //Constructor 1 vacio
        System.out.println("Se esta ejecutando este constructor número uno");
    }
    //Estamos viendo lo que se llama sobrecarga de constructores
    public Aritmetica(int a, int b){ //Constructor 2
        this.a = a;
        this.b = b;
        System.out.println("Se esta ejecutando este constructor número dos");
    }
    
    //Metodo
    public void sumarNumeros(){
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    }
    
    public int sumarConRetorno(){
        //int resultado = a + b;
        return a + b;
    }
    
    public int sumarConArgumentos(int a, int b){
        this.a = a;
        this.b = b;
        //return a + b;
        return this.sumarConRetorno();
    }
}

//CREAMOS UNA CLASE A CONTINUACION DE OTRA CLASE

//si queremos crear una clase fuera de la que ya esta, debemos tener en cuenta que solo
//PUEDE HABER SOLO UNA CLASE PUBLICA
//la clase que vamos a crear ya no podra ser tipo publica


//datos tipo ingenieer
//la otra clase que creemos sera por default (se lo conoce como default o) package y nunca se va a mostrar, no es necesario
//escribirlo tampoco, pero al omitir cualquieir modificador es asi como se lo va a conocer (default o package)

//para crear una clase no se utiliza mayuscula

class Persona{
    // se veria asi: default class Persona{ / package class Persona{     PERO ESTO DA ERROR, NO DEBE ESCRIBIRSE, 
    
    //a esta clase y todo lo que tenga dentro SOLO SE PUEDE ACCEDER DENTRO DEL MISMO PAQUETE
    
    String nombre;
    String apellido;
    
    
    //CREAMOS UN METODO QUE TAMPOCO SE LE ASIGNA MODIFICADOR DE ACCESO, tambien por default recibira el mismo modificador de acceso
    Persona(String nombre, String apellido){ // ESTE ES UN METODO CONSTRCTOR
        this.nombre = nombre;
        this.apellido = apellido;
    
        //
    }
    
}