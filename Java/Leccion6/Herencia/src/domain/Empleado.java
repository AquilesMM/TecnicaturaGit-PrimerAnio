
package domain;
    //HERENCIA

    //EN JAVA SOLO HAY HERENCIA SIMPLE, NO SE PUEDE INDICAR QUE ES HIJA DE MAS CLASES, SOLO DE UNA
    //esto no se puede ya que en java las gerarquias son de herencia simple y porque utilizar herencias multiples
    //podria conllevar problemas de diseño

    //LA CLASE EMPLEADO SERA HIJA DE LA CLASE PERSONA
    //PARA ELLO UTILIZAMOS extends + nombre padre
    //de no colocarse, esta no seria hija de la clase persona y por ende no se podria acceder
    //a ninguno de los metodos y propiedades de la clase Persona
    //sino indicamos de quien es hija la clase, esta sera siempre hija de OBJECT
    //no se pone nunca extends Object, a pesar de que se puede y no da error
public class Empleado extends Persona {
    //esta clase ahora tiene todas las caracteristicas heredadas de la clase Persona
    
    //trabajaremos con atributos de tipo private ya que la clase empleado no heredara a nadie
    
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleados; //es para incrementar, relacionado a idEmpleado
    
    //constructor
    //solo crearemos constructor para sueldo
    public Empleado(String nombre, double sueldo) { //pedimos el atributo nombre de la clase padre Persona
        //para trabajar con atributos heredados de la clase padre, deberemos trabajar con el constructor:
        //SUPER
        super(nombre); //recibira el nombre
        //agregamos aumento para idEmpleado
        this.idEmpleado = ++Empleado.contadorEmpleados; //para que se entienda bien lo que sucede, lo haremos utilizando la clase
        //para llamar al contadorEmpleados, si bien no es necesario, es buena practica y ayuda que se entienda mejor el codigo
        //diciendole que utilizamos el atributo que llega desde la clase Empleado
        //es la manera visible que debe de tener cuando se trabaja dentro del contexto estatico
        //es decir ponemos el atributo asociado a la clase
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }
    //para IdEmpleado solo usamos get ya que no queremos que sea modificado, debe ser onlyread
    //IdEmpleado es modificado desde la clase en contexto static, dentro del mismo constrcuctor,
    //de esta manera cada que se llame el constructor para generar un nuevo empelado, se hara solo su nuevo id
    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() { //marcamos casilla stringBuilder, que hace mas eficiente la concatenacion
        StringBuilder sb = new StringBuilder(); //crea objeto de StringBuilder con constructor vacio
        sb.append("Empleado{idEmpleado=").append(idEmpleado); //atravez del objeto utiliza el metodo append
        sb.append(", sueldo=").append(sueldo);
        sb.append('}');
        return sb.toString();
        //Este metodo es mas eficiente que la concatenacion con suma porque:
        //en el metodo de suma concatenamos muchas cadenas conmuchos  atributos
        
        //EL SIGNO DE SUMA EN JAVA
        //este en realidad es mucho mas lento para concatenar cadenas, porque con cada una se crea un  nuevo objeto de tipo string
        //es decir, con cada concatenacion. Y estos una vez creados ya no se pueden modificar
        
        //STRING INMUTABLES}
        
        //En java los objetos de tipo String son INMUTABLES, una vez asignado el valor no se puede modificar
        
        //NO CONCATEMOS SIN STRING BUILDER
        //debido a lo mensionado anteriormente, no concatemaos sin string builder, no se usa nunca la cncatenacion
        //utilizamos la clase
        
        //APEND
        
        //con el metodo append sucede algo totalmente diferente a la concatenacion con suma, sepueden modificar
        //con append va agregando los atributos tambien
        
        //al finalizar utiliza el objeto creado desde la clase StringBuilder
        //como como el retorno es de tipo string no es compatible, por ello en el retorno ponemos el objeto
        //con el metodo toString para que sea compatible con lo que necesitamos en la salida del retorno que debe ser
        //de tipo String
    }
    
    
    
    
}
