/*Significado de palabra final dependiendo donde se apliqie

esta palabra tiene significados diferentes dependiendo donde se aplique:

Variables: Evita cambiar el valor que almacena la variable
Metodos: Evita que se modifique la definicion o el comportamiento de un metodo desde una sublcase (hija)
Clases: Evita quhe se creen clases hijas

Otra caracteristica es que normalmente, cuando trabajamos con variables, 
se combina con el modificador de acceso estatico para convertir una variable en una constante, es decir que no se puede moficidar suu valor,
por ejemplo, de esto es la clase Math en la cual todos sus atributos son de tipo static y final, es por esoto que la variable pi* se conoce
como una constante
*/
package test;
import domain.Persona;

public class TestFinal {
    public static void main(String[] args) {
        final int miDni = 44439081; //final en variables
        System.out.println("miDni = " + miDni);
        //miDni = 0; //nos dara un error, ya que no podemos cambiar el valor por ser final (es decir que es un valor constante)
        //System.out.println("miDni = " + miDni);
        //Persona.CONSTATE_AQUI = 9; //esto dara error ya que la constante no se puede modificar
        System.out.println("Mi atributo constante es: " +Persona.CONSTATE_AQUI); //podemos mostrar la constante
        
        
        //USO FINAL CON OBJETOS
        
        //no hemos puesto ningun contructor, por lo que el compilador crea por defaul el constructor vacio
        final Persona persona1 = new Persona();
        /*
        Crear el objeto con final, significa que:  si le queremos asignar una referencia de un nuevo objeto, ya no se podrea hacer
        ejemplo de nueva referencia
        persona1 = new Persona();
        no se podra reasignar como un objeto con otras caracteristicas
        
        SI SE PODRA MODIFICAR EL CONTENIDO DEL OBJETO
        */
        persona1.setNombre("Aquiles Martinez");
        System.out.println("persona1 nombre = " + persona1.getNombre());
        /*
        esto demuestra que podemos asignar otros contenidos al objeto, pero no asignar una nueva referencia
        */
        persona1.setNombre("Mily Funes");
        System.out.println("persona1 nombre = " + persona1.getNombre());
        /*
        podemos cambiar sus contenidos/ modificar los valores de los atributos pero no hacer nuevas referencias
        */
        
    }
}
