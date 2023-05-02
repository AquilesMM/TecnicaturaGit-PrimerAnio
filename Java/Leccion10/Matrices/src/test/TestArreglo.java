
package test;


public class TestArreglo {
    public static void main(String[] args) {
        int edades[] = new int [3];
        
        
        /* ARREGLOS
        Dato: El nombre de los arreglos suele ser plural ya que contiene mas de un elemento (buena practica)
        
        Ejemplos de lugares donde se pueden ubicar los corchetes, para identificar un arreglo
        int edades[];   int edades [];     int [] edades;
        mas usado
        
        Utilizamos la palabra reservada new, para crear un arreglo, debido a que estos son tipo object, al final un arreglo hereda de la clase object
        luego indicamos el tipo de dato que se va a utilizar, y entre corchetes la cantidad de datos
        
        En el lado izq de esta linea, lo que hacemos es declarar una variable. Del lado Der instanciamos un objeto de tipo arreglo
        
        CANTIDAD DE ELEMENTOS
            Al indicar la cantidad de elementos como hicimos arriba, esta ya no podra crecer, NO se pueden agregar elementos de manera dinamica, ya no
        se puede cambiar el valor que le hemos asignado mas adelante
        
        Si no se le asignan valores, los valores seran los del tipo del arreglo por default, en caso de int es 0
        si llamamos al arreglo sin definir ninguna posicion, es decir solo la variable sin corchetes, nos mostrara el espacio de memoria
            
        */
        System.out.println("edades = " + edades);
        

        //COMO MODIFICAR LOS ELEMENTOS DE EL ARREGLO
        
            //Accedemos a un elemento y lo modificamos (de las maneras mas practicas)
        edades[0] = 17;
            //mostramos solo la posicion 0
        System.out.println("edades[0] = " + edades[0]);
        edades[1] = 20;
        System.out.println("edades[1] = " + edades[1]);
        edades[2] = 30;
        System.out.println("edades[2] = " + edades[2]);
        
        //ACCEDER A UN ELEMENTO QUE ESTE FUERA DE  NUESTRO ARREGLO (si arreglo tiene 3 elementos intentamos acceder al 4)
        /*
        En este caso no nos marcara como error hasta que ejecutemos ya que este no es un error a nivel de compilacion
        Es un error en tiempo de ejecucion, si ejecutamos el acceso/modificacion, sin necesidad siquiera de imprimirlo, la consola dara error
        diciendonos que el inidice elegido esta fuera de la longitud del arreglo
        */
        //edades[3] = 7;
        
        //iteracion de elementos con for
        
        for(int i=0; i < edades.length; i++){
        /* podemos acceder a la funciong length a travez de el arreglo ya que el arreglo hereda de Object y es un OBJECT
        por lo que tiene propiedades como length, esta es la longitud del elemento, en este caso 3, no muestra las posiciones es decir de 0 a 2 sino la longitud
        si en la condicion del for ponemos i <= edades.length, esto nos dara un error de tiempo de ejecucion
        ya que le decimos que debera ser igual a la longitud, y cuando llegue a tres, aun le quedara una vuelta, es decir para el cuarto elemento que no existe
        */    
        System.out.println("Edades y sus elementos "+i+": "+edades[i]);
            
        //Arreglos de tipo Object    
            
        }
        
    }
}
