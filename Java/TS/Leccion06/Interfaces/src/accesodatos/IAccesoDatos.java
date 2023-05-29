package accesodatos;

/*
 INTERFACE

una interface es similar a una clase abstracta en el sentido de que los metodos de una interface tampoco tienen una implementacion asi que tambien
son metodos abstractos
Una interface es un nuevo tipo en java similar a las clases abstractas y similar a estas, todos los metodos definidos en una interface
seran metodos abstractos.
Otro detalle a mencionar es que si agregamos atributos a nuestra interface, estos seran constantes, es decir que en automatico
son atributos de tipo public final static (las tres caracteristicas asociadas a una constante)
Cualquier variable definida en una interface sera una constante
La diferencia entre una clase abstracta y una interface es que si ambos, tanto abstracta e interface tienen metodos abstractos, cual utiliza una clase 
abstracta y cual una interface. La respuesta es la siguiente:

Cuando las caracteristicas de nuestra clase son muy parecidas, Ej: clase abs figura geomtrica y clases hijas cuadrado,triangulo, etc. En este caso tenemos 
una relacion de herencia  por lo tanto en este tipo de casos, lo mas conveniente es utilizar una clase abstracta

Sin embargo cuando la relacion entre clases no es tanto por lo que sean caracteristicas, sino mas bien por comportamiento, es mas conveniente utilizar 
una interface

Un ejemplo es una interface para mysql y oracle la cual comparten muchos comandos en comun por lo que podemos hacer una
para que se mantenga en ambos puntos y luego hacer clases para oracle y para mysql como veremos a continuacion
  
 */
public interface IAccesoDatos {
    /*
    A diferencia de los metodos abstractos o clases, aqui podemos ver el termino interface en vez de class
    Cabe mencionar que al nombre de la interface es buena practica poner la letra I primero de interface
    Y estas se crean en new interface en vez de new class
    
    En java creamos un nuevo tipo, y al no ser una clase, esta no esta heredando de la clase object como sucede con las clases en general
    Pero se puede extender de otras interface, esto se trabaja similar a la herencia de clases, habra interface padres e interface hijas
    */
    
    //NO PODEMOS CREAR EL ATRIBUTO SIN ASINGARLE UN VALOR, DARA ERROR, ESTO SUCEDE EN LAS INTERFACES
    int MAX_REGISTRO = 10; //no olvidar que las constantes van en mayusculas
    //estos atributos tienen asociados de manera automatica las 3 caracteristicas de una constante (public final static)
    
    
    
    
    
    //UNA INTERFACE NO TIENE CONSTRUCTORES (es por ello que los atributos deben tener valores asignados de manera obligatoria)
    //solo tendra metodos y todos los metodos seran abstractos (por ello tambien no solo se declara sino tambien se les asigna valor a los atributos)
    
    //CUALQUIER METODO QUE SE AGREGE SERA PUBLICO Y SERA ABSTRACTO
    //de no agregarlo en la sintaxis el compilador lo declarara de manera automatica



    //TODO LO DECLARADO A CONTINUACION SERAN METODOS
    //en este caso se busca crear metodos clasicos para trabajar con tablas de bases de datos
    //(aunque en este caso no incorporaremos ninguna base de datos simularemos trabajar con ella
    
    
    //Metodo insertar es abstraco y sin cuerpo
    void insertar();
    
    void listar();
    
    void actualizar();
    
    void eliminar();
}


