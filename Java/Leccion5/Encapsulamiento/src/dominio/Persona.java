package dominio;

public class Persona {
    //Atributos
    //los crearemos con mod de acceso tipo private
    
    private String nombre;//de poner private con mayuscula no lo tomara bien
    private double sueldo;
    private boolean eliminado;
    
    //de no poner modificador, el que se le otorgara automaticamente sera default o package, tampoco podra accederse de otro paquete
    //el no tener no modificador no lo hace publico, lo vuelve defautl o package, esto se hace de manera interna
    // si nosotros queremos definir default o package no lo aceptara y sera un error
    
    //String empieza con mayuscula a diferencia de double, boolean por ej, ya que string String no es tipo primitivo cmo el resto
    
    
    //Contructor
    //siempre el constructor debe llevar el mismo nombre de la clase
    //si los atributos son de tipo private la unica forma de acceder a ellos sera mediante metodos
    //en este caso el metodo principal es el constructor
    // si los metodos no son de tipo publico no vamos a poder acceder a los atributos
    public Persona(String nombre, double sueldo, boolean eliminado){ //definimos las variables que vamos a recibir para modificar los atributos
        //deben coincidir con los mismos tipos que los atributos. porque en esa coincidencia es que van a poder acceder
        //los metodos a los atributos para que sean modificados, obtenidos, asignados otros valores, etc
        
        //para que suceda la conexion en el constructor utilizamos this
        
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.eliminado = eliminado;
    }
    
    //definimos los metodos que necesitamos (seter/set  | geter/get)
    
    //si ponemos clicl derecho y ponemos incertar codigo nos permite insertar constructores, geter, seter, etc
    //si precionamos seter and geter saldra pantalla preguntando si quremos crear para cada uno de los atributos
    //estos seters and geters necesitan acceder a los atributos privados

    
    //geter y seter de todos los atributos
    // set asigna nuevos parametros | NO RETORNA NADA
    // get obtiene el valor de los atributos a travez de un return | NO MODIFICA NADA
    //todos son de tipo publico ya que estos son los que nos van a poder permitir acceder a atributos privados
    //de no ser publicos no tendria sentido su uso
    
    
    //EXCEPCION
    //PARA UN TIPO BOOLEAN NO SE UTILIZA GET, SE UTILIZA IS
    //esto ya que boolean es la pregunta de si es V o F, por ello el is, is V or F
    //por eso veremos algo distinto en el caso de boolean
    //en en el caso de set seguira siendo set
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    
    public boolean isEliminado() {
        return eliminado;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }
    
    
    
    //TO STRING
    
    public String toString(){ //convierte en una cadena cada atributo
        //Para poder ver todos los datos que va a mostrar esta debe ser publica, y debe ser string
        return "Persona [nombre: "+this.nombre+
                ", sueldo: "+this.sueldo+
                ", eliminado: "+this.eliminado+" ]";
        
        //de esta manera accedemos a todos los atribtos de la clase, convirtiendolos en String
        //para mostrarlos del objeto que queramos
    }
}
