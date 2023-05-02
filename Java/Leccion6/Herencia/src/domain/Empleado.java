
package domain;
    //HERENCIA

    //EN MEMORIA 
    //EN MEMORIA LA CLASE PADRE E HIJA SON UN SOLO OBJETO
    //tenemos info de ambas clases porque hija hereda de padre

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
    
    
    
    //sobrecarga de constructores, podemos crear tantos constructores como combinaciones de atributos tengamos
    //no podemos usar constructores para tipos de atributos que no hayamos definido, ni construir constructores que ya tengamos echos
    //siempre deben ser utiles
     public Empleado(){
        this.idEmpleado = ++Empleado.contadorEmpleados;
        
    }

    public Empleado(String nombre, double sueldo) { //pedimos el atributo nombre de la clase padre Persona
        //para trabajar con atributos heredados de la clase padre, deberemos trabajar con el constructor:
        //SUPER
        //super(nombre); //recibira el nombre
        //con super podemos acceder a tributos de clase padre aunque no sean protected, no es necesario en los atributos protected
        /*
        Si bien el constructor de la clase padre(super) siempre se coloca al pricipio, hay una excepcion a esta rregla y es
        cuando llamamos a un constructor interno, es decir, llamar a otro constructor de la misma clase desde un constructor
        
        IMPORTANTE, CUANDO LLAMAMOS A UN CONSTRUCTO INTERNO ------NO PODEMOS USAR SUPER------ ES UNO U OTRO
        
        llamaremos a constructor vacio, para que use idEmpleado
        */
        
        this();  //estamos llamando al constructor vacio (llamar a un constructor interno
        
        /* 
        al llamar al constructo interno, y no a super, no inicializamos el atributo nombre, entonces lo que hacemos es
        que al ser los atributos desde la clase padre de tipo protected, podemos acceder a estos atributos directamente sin problema
        */
        
        this.nombre = nombre; //accedemos al atributo de la clase padre (tipo protected) sin super
        
        
        
        
        //agregamos aumento para idEmpleado
        //this.idEmpleado = ++Empleado.contadorEmpleados; //para que se entienda bien lo que sucede, lo haremos utilizando la clase
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
        sb.append(", ").append(super.toString()); //mediante el constructor super, accedemos  al toString de la clase padre
        //aunque bien podria ser a cualquier metodo o atributo de la clase padre, exceptuando atributos privados
        //en cambio a aquellos privados, podremos acceder a travez de metodos get o set
        //podemos acceder a atributos heredados a travez de this.
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
