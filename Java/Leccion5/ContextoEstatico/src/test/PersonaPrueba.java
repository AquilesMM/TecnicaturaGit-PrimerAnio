
package test;

import domain.Persona;

public class PersonaPrueba {
    //CREAR UN ATRIBUTO DE LA CLASE PERSONA PRUEBA es decir el mismo donde esta el main
    private int contador; //no podra ser referenciado dentro de metodos/contextos static, si dinamic
    //ningun atributo de la misma clase puede ser llamado dentro de contextos static
    //ya que this no puede ser referenciada en metodos static, y acceder a atributos de otra clase se puede si son publicos
    //y lo hacemos a travez de la clase  ( y no recuerdo si se requiere un objeto para ello, creo que no)
    
    
    public static void main(String[] args) {
        //PUBLIC STATIC VOID ES PARA IMPRIMIR, NO DEVUELVE NADA
        //la palabra this no puede ser referenciada dentro de un contexto static
        
        //EL METODO MAIN ES ESTATIC
        //Esto es ya que el compilador no va a crear un objeto de la clase para ejecutar la prueba
        //lo que hace es utilizar el nombre de la clase y luego directamente en el nombre del metodo main, por ello es static
        //para no crear objetos de esta clase, sino que poder acceder poniendo directamente al metodo poniendo el nombre de la clase
        Persona persona1 = new Persona("Aquiles");
        System.out.println("persona1 = " + persona1);
        //como en este caso hemos sobre escribido/ creado el metodo toString, al llamar al objeto este no nos mostrara su
        //espacio de memoria, sino todos los argumentos y datos asociados a este objeto a travez del metodo toString
        
        Persona persona2 = new Persona("Mily");
        System.out.println("persona2 = " + persona2);
        
        //imprimir(persona1);
        //imprimir(persona2);
        /*
        Esto es un claro ejemplo de que un dinamic no se puede llamar/referenciar desde un static DIRECTAMENTE
        de querer hacer lo de arriba, no podra ser y que el metodo imprimir es dinamic, mientras que el metodo main es static
        aun asi podriamos llamar al metodo main desde imprimir pero no a imprimir desde main
        
        para llamarlo podemos convertir al metodo imprimir en static y ahi si podriamos llamarlo desde otro static
        */
        
        //this.contador = 10;
        /*
        si queremos llamar a este atributo creado en esta clase, al menos dentro de cualquier metodo static no podremos 
        ya que la palabra this no puede referenciarse dentro de contextos static
        */
        PersonaPrueba personaP1 = new PersonaPrueba();
        System.out.println(personaP1);//de esta manera a travez de un objeto y un metodo no static podemos acceder al atributo de 
        //esta clase en un contexto static
        //cabe aclarar que solo a travez de un objeto podemos llamar un metodo dinamico dentro de un contexto static
        
    } 
    
    public void imprimir(Persona persona){
        System.out.println("persona = " + persona);
        //este no es un metodo static, es dinamic
        
    }
    
    public int getContador(){
        return this.contador;
    }
}
