package excepciones;

//CREAMOS NUESTRAS PROPIAS EXCEPCIONES
/*
Para que el compilador detecte esta clase como una de tipo exception, esta debe extender de alguna de las clases exception definidas en el
API de java, clase exception, rntime exception etc.

Si deriva de exception y por ende es de tipo checked, entonces el compilador nos obligara a procesar la exception
Si deriva de clases unchecked, entonces no sera necesario procesarlas

*/

//public class OperacionException extends Exception {
//    /*
//    Lo que se hace normalmente cuando se extiende de la clase exception es mandar un mensaje pero este mensaje debe propagarse a la clase padre Exception
//    
//    Por lo tanto vamos a agregar un constructor 
//    */
//    
//    //Constructor
//    public OperacionException(String mensaje){
//        //propagamos el mensaje hacia la clase padre a travez de super
//        super(mensaje);
//    }
    //hasta aqui es mas que suficiente para definir nuestra propia clase de exception
    // extend -> recibimos mensaje -> propagamos hacia padre
    //aunque es poco codigo de esta manera podemos trabajar con nuestros propios tipos de exception
        
        
        
        
    //UTILIZANDO EL MISMO METODO DEL EJEMPLO ANTERIOR AHORA TRABAJAREMOS CON RUNTIMEEXCEPTION
    public class OperacionException extends RuntimeException {
    /*
        Para esta clase de exception, la diferencia unicamente radica en el compilador,
        que no nos obliga a procesar este tipo de exception, Es por esto que en el metodo donde arrojamos una exception
        se arroja la exception de tipo OperacionException, pero a diferencia de lo que hicimos anteriormente, en este caso, el compilador
        no nos obliga a agregar esta exception en la firma del metodo, por lo que podemos quitar esa parte del throws Exception
        
        Aun asi la exception se crea de todos modos, solo no reportamos la exception en la firma del metodo
        
        
        Otro dato importante es que al no ser necesario reportar la exception y ser de tipo unchecked, a la hora de trabajar 
        con este tipo de exception, en los test o programa en general, no es necesario trabajarlos dentro del bloque try/catch, pero esto hara que cuando
        ocurra el error, el programa se detenga de forma abruptas, pero enviara los mensajes de error que nosotros especificamos 
        que no sea obligatorio no significa que no haga falta trabajar con try/cath para evitar estas cosas
    */
    
        //Constructor
        public OperacionException(String mensaje){
        //propagamos el mensaje hacia la clase padre a travez de super
            super(mensaje);
        }
    
}/*
COMO SABER QUE TIPO DE EXCEPTION DECLARAR

En los primeros años de java se recomanda declarar a todos los tipos de errores como tipo exception (checked)

a dia de hoy se recomienda mas utilizar excepciones de tipo runtime(unchecked) y trabajarlas dentro de try catch de las exception que estemos
mas seguros que vana  suceder, ya que hace mas limpio el codigo, de lo contrario, de no estar seguros que se arroje una exception, nuestro codigo debe
quedar lo mas limpio posible


DEBE HABER UN EQUILIBRIO ENTRE EXPECTION TIPO RUNTIME, Y EXCEPTION
utilizar exception solo donde es realmente necesario, el resto de clases debe ser de tipo runtime para que sea mas limpio el codigo
*/
