package test;

import domain.*;

public class TestSobreEscritura {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 10000);
        imprimir(empleado1);
       //System.out.println("empleado1 = " + empleado1.obtenerDetalles());
        empleado1 = new Gerente("Jose",5000.0,"Sistemas"); //reescribimos la variable
        imprimir(empleado1);
        //System.out.println("gerente1 = " + gerente1.obtenerDetalles());
    }
    
    
    //Polimorfismo: Multiples comportamientos, unicamente visualizado en tiemp de ejecucion
    /*
    Definiremos  un metodo que llamara al metodo obtener detalles
    se ejecutara el metodo obtener detalles dentro del metodo. Se ejecutara el de la clase padre o el de la clase hija dependiendo del objeto
    que se este pasando al momento de ejecutar nuestro programa
    
    EL OBJETIVO DEL POLIMORFISMO ES CREAR METODOS MAS GENERICOS, SIMPLIFICAR EL CODIGO Y HACERLO MAS EFICIENTE
    
    */
    
    public static void imprimir(Empleado empleado){
        //En este caso el argumento empleado apunta a un tipo compatible, es compatible con la clase padre y con la clase hija
        //Es decir en este caso, en tiempo de ejecucion el metodo que se ejecutara sera del tipo de referencia que a recibido la variable (argumento empleado)
        //En el primer caso, recibe un objeto de la clase padre e imprime tal cosa como se ve en el codigo
        //En el segundo caso, pasamos un objeto de la clase hija gerente, cuando pasamos la referencia a la clase hija, esta referencia la vemos
        //disfrazada con la variable empleado, en ese momento, la variable de tipo empleado puede apuntar y almacenar referencias a la clase hija
        //ya que tiene una relacion entre clases padres e hija
        
        //Una clase padre puede apuntar y almacenar referencias de la clase hija debido a que tienen una relacion de clase padre y clase hija
        //una clase padre puede apuntar a objetos de tipo hijo
        
        /*
        Al objeto ser de la clase hija, el llamado que se hace a travez de la referencia que originalmente es de clase padre y precisamente al ser 
        de clase padre y esta podera apuntar a la clase hija, la referencia apunta a la clase hija y el metodo utilizado sera de la clase hija
        */
        String detalles = empleado.obtenerDetalles();
                
        System.out.println("detalles = " + detalles);
        
    }
    
}
