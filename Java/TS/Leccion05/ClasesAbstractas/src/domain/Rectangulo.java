package domain;

public class Rectangulo extends FiguraGeometrica { // al poner la erencia nos dara un error
    //esto es mientras no este sobre escribiendo ningun metodo de la clase abstracta padre, ya que esta no es una clase abstracta
    //y de momento no cumple con las conficiones para dejar de serlo
    //para cumplir con las condiciones para dejar de ser una clase abstracta debemos sobreescribir todos losmetodos abstractos y determinar 
    //un comportamiento de no hacerlo esta sera una clase abstracta tambien 
    
    //estos metodos pueden implementarse de manera manual o con ayuda del id, insertando codigo
    
    //Constructor
    public Rectangulo (String tipoFigura){
        super(tipoFigura);
    }
    
    
    //si bien sobreescribiremos el metodo abstracto, no es tanto un sobreescribir ya que el metodo no tiene asignado ningun comportamiento
    //asi que debido a que es el primer comportamiento que le vamos a asignar, se denomina implementacion no sobreescritura, aunque el id diga que 
    //se esta sobreescribiendo el metodo de la clase padre lo cual hasta cierto punto es correcto ya que esta definido en la clase padre, pero en realidad
    //se esta implementando aqui 
    @Override
    public void dibujar() {
        System.out.println("Se imprime un: " + this.getClass().getSimpleName());
        /*
        this.getClass().getSimpleName(): Esta es una expresión que se utiliza para obtener el nombre de la clase del 
        objeto en el que se ejecuta este código.

        this se refiere al objeto actual en el contexto en el que se está ejecutando el código.
        
        getClass() es un método que devuelve la clase del objeto.
        getSimpleName() es otro método que se utiliza para obtener el nombre simple de la clase, sin incluir el paquete al que pertenece.
        
        
        En resumen, esta línea de código imprime en la consola un mensaje que indica el tipo de objeto en el que se está ejecutando el código. 
        Por ejemplo, si se ejecuta en una instancia de la clase MiClase, imprimiría: "Se imprime un: MiClase".
        */
    }
    
    
}
