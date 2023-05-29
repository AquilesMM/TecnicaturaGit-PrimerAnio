package accesodatos;
//Implementacion de Interface simulando trabajar con bases de datos MySql
public class ImplementacionMySql implements IAccesoDatos{

    
    //IMPLEMENTACION DE TODOS LOS METODOS DE INTERFACE
    /*
    Al hacer esto estamos obligando a estas clases que quieran implementar esta interface
    a agregar el comportamiento definido en sus metodos
    Lo obigamos ya que si no implementamos todos los metodos de la interface en esta clase, entonces nos obliga a definir
    esta clase como abstracta
    
    Implementar = Sobreescribir (pero se aplica por primera vez ya que originalmente no tiene comportamiento)
    
    Para implementar los metodos se realiza de manera similar a lo que se hace con las clases abstractas
    
    Indicamos que queremos implementar los metodos, esto les asignara un codigo y comportamiento de manera automatica
    y tambien indicara que estan sobreescritos los metodos, aunque en realidad se estan implementando por primera vez
    
    Estos metdos implementados deben ser public void y el nombre de la clase, esta firma debemos respetarla
    tampoco se agrega la palabra abstract ya que se lo esta implementando 
    no aplicamos abstract y si aplicamos override
    
    El codigo que se asigna por defecto son excepciones, las cuales podemos borrar y cambiar al comportamiento que deseemos
    
    Lo que haremos agregar el cuerpo del metodo y luego la implementacion por default del ide que son excepciones
    
    de no agregar nada la metodo, nos arrojara una excepcion diciendo que el metodo esta vacio
    */
    @Override
    public void insertar() {
        System.out.println("Insertar desde MySql");
    }

    @Override
    public void listar() {
        System.out.println("Listar desde MySql");
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizar desde MySql");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminar desde MySql");
    }
    /*
    Para implementar el comportamiento de una interface utilizamos la palabra reservada
    "imlpements" a diferencia del "extends" en herencia
    
    nos dara un error siempre y cuando no hayamos implementado todos los metodos abstractosd e la interface
    esto lo podemos hacer manual o click en la lamparita y darle a dicha opcion
    
    Una vez implementado todos los metodos, el compilador ya no dara error y entonces deberiamos implementar
    una clase hija para poder utilizar esta clase de implementacion MySql
    
    y ya que queremos utilizar esta clase, no puede ser abstracta ya que no se pueden crear objetos de clases abstractas
    
    
    */
    
    
}
