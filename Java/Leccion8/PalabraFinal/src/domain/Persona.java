
package domain;

public  class Persona { //el modificar ginal lo convierte en una clase constante
    //es decir, no podran hacerse hijos o extensiones, sublcases de esta clase
    
    
    //ATRIBUTO CONSTANTE
    //un atributo final se suele convinar con static, esto para poder llamar la variable solo utilizando el nombre de la clase, sin
    //necesidad de instanciar
    public final static int CONSTATE_AQUI = 15; //LAS CONSTANTES VAN EN MAYUSCULAS Y GUIN BAJO PARA AGREGAR PALABRA
    //final static nos dice que es constate, este formato es constante
    
    
    //USO FINAL OBJETOS
    private String nombre;
    
    public  void imprimir(){
            System.out.println("Metodo para imprimir");
        }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
