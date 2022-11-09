
package domain;

public class Empleado extends Persona{ //no podemos crear una clase hija de Persona (final)
    
    @Override //a travez de override indicamos que estamos sobre escribiendo un metodo de la clase padre
    public void imprimir(){ //tratamos de sobre escribir el metodo pero no podemos, por ser final
        System.out.println("Metodo para imprimir de clase hija");
    }
   //es decir van a tener que recibir y utilizar si o si o que viene de la clase padre sin poder cambiar nada
}
