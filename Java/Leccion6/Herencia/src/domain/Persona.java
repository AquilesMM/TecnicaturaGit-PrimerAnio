
package domain;

public class Persona {
    protected String nombre; //tipo string por default es null
    
    //ATRIBUTOS DE HERENCIA
    
    //TODO LO QUE ES PRIVATE NO SE HEREDA A LAS CLASES HIJAS
    //SI QUEREMOS QUE LAS CLASES HIJAS PUEDAN ACCEDER UTILIZAMOS EL MODIFICADOR PROTECTED
    //su ventaja es que a pesar de que las clases hijas esten en otro paquete, estas podran acceder
    //PROTECTED ESTA PENSADO PARA EL CONCEPTO DE HERENCIA
    protected char genero; //char por default esta vacio
    protected int edad; //int por default es 0
    protected String direccion;
    
    //PASAR DE PROTECTED A PRIVATE
    
//    cuando ponemos los geters and seters (y to string probablemente) con nsrt code
//    esto nos cambia el modificador de los atributos de protected a private de menra automatia, por lo quue
//    si queremos manterlos en protected debemos volver a cambiarlos
    
    
    //constructor vacio: este es para crear objetos sin necesidad de inicializar los atributos de la clase
    public Persona(){//constructor 1
        
    }
    
    public Persona (String nombre){ //constructor 2
        this.nombre = nombre;
    }

    //TODOS LOS CONSTRUCTORES LLEVAN DE NOMBRE EL NOMBRE DE LA CLASE
    
    //constructor 3 con insert code
    public Persona(String nombre, char genero, int edad, String direccion) { //Constructor 3
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getDireccion() {
        return this.direccion;
        //EL THIS EN LOS GET NO ES OBLIGATORIO, PERO ES BUENA PRACTICA Y HACE MAS LEGIBLE EL CODIGO
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return this.genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + ", direccion=" + direccion + '}';
    }
    
    
    
    
}
