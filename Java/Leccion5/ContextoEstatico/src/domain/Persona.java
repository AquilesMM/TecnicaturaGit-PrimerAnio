
package domain;

public class Persona {

  
    //cargamos los atributos
    private int idPersona;
    private static int contadorPersona; //que sea privado y static al mismo tiempo hace
    //que este atributo sea totalmete asociado a lo que es la clase persona y no en si al objeto
    
    private String nombre;
    
    //Contructor | En este caso no vamos  ausar el constructor vacio, asi que solo usaremos el que haremos
    
    public Persona(String nombre){
        this.nombre = nombre;
        //Incrementar el contador por cada objeto nuevo
        //vamos a trabajar y ver como trabaja un atributo estatico
        
        //para los atrinutos estaticos no se utiliza el operador this, solo el mismo nombre de la clase
        Persona.contadorPersona ++; //no utilizar el operador this
        //vamos a asignar un nuevo valor a la variable idPersona 
        
        //IMPORTANTE
        
        //en este caso el atributo estatico crece de valor sin haberlo iniciado anteriormente
        // ESTO ES ASI YA QUE: el atributo al ser estatico se asocia a la clase, al estar asociado a la clase es que puede generar
        //el cambio (aumento) sin estar inicializado
        //un atributo cada vez que nosotros creamos un objeto, el atributo se inicializa nuevamente para asignarle nuevos valores
        //al objeto, en el caso de un metodo/atributo estatico no es asi, simplemente se realizara la operacion, en este caso
        //sumar. 
        
        
        /*
        por lo que entendi, es necesario inicializar los atributos cuando son de tipo dinamico es decir asociado a objetos
        ya que este se inicializara cada que creemos un objeto nuevamente, en cambio al ser de tipo estatico, una vez este se 
        inicializa arriba, ya no necesita volver a hacerlo y todos sus cambios se guardaran en la clase, la cual no varia, es estatica
        */
        
        this.idPersona = Persona.contadorPersona; //le asignamos un atributo estatico haciendo que de esta manera
        //aunque cada vez que se ejecute id persona empiece en cero, el estatico le mantendra el valor
        //cada que se ejecuta se inicializa de nuevo, asi se llamaria, osea, se reinicia a cero, pero el static le da el valor
        // DATO: luego del igual, contadorPersona puede ir sin Persona. antes ya que al haberla usado antes se asocia directamente
        //aun asi se recomienda siempre ponerlo
        
        
        
        //al estar el id asociado a un atributo estatico, no habra otra forma de acceder a su valor que no sea a travez de un objeto
        //ya que el el contexto estatico no puede acceder al dinamico, pero si al revez, es decir, que para ver que valor tendria 
        //desde fuera de un objeto deberia acceder desde id persona a un objeto(dinamico) y de ahi ver el valor que le asocio a dicho objeto
        //pero esto no se puede, ya que dinamico no puede acceder a estatico, en cambio el objeto que es dinamico podra acceder al valor 
        //almacenado por un metodo o atributo estatico
    }

    public int getIdPersona() {
        return this.idPersona; //aunque no se ponga el  operador this, se sugiere ponerlo siempre
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    
      public static int getContadorPersona() {
        return contadorPersona;
    }

    public static void setContadorPersona(int aContadorPersona) {
        contadorPersona = aContadorPersona;
    }
    
    
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + '}';
        //la  notacon override le agrega anotacion extra al metodo que estamos definiendo
        //primero la anotacion, luego el metodo, esta indica que estamos sobre escribiendo el metodo 
        //esto significa que en la herencia de la clase object se hereda el metodo tostring, y en esta clase lo sobreescribimos
        //no olvidar que este metodo viene de herencia de la clase object
    }
    
    
}
