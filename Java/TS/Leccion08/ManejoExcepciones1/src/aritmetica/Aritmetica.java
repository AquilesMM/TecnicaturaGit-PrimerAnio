package aritmetica;

import excepciones.OperacionException;

/*
Esta clase tendra un metodo, de tipo public static para no tener la necesidad de crear objetos de esta clase, sino que podamos llamarlo directamente

En este caso sera el metodo de la division, y lo hara con tipos enteros 
*/
public class Aritmetica {
// public static int division(int numerador, int denominador) throws OperacionException{ //FIRMA
//     if(denominador == 0){
//         //En este caso, si el denominador es == 0 reportaremos una excepcion
//         //aunque en este caso arrojaria excepcion de manera automatica, lo haremos igual a modo de ejemplo
//         //Para crear esta exception, utilizaramos la sintaxis towr (arrojar)
//         //indicamos que creamos un nuevo objeto de tipo exception
//         //no basta simplemente con crear un objeto, operacionException ademas teemos que indicar que vamos a arrojar esta exception
//         //para ello utilizamos throw y le indicamos que mensaje arrojara
//         
//         throw new OperacionException("Division entre cero"); //ESTAMOS REPORTANDO AL EXCEPTION
//         //arrojar nuevo objeto de OperacionException con mensaje ();
//         //no solo basta con esa linea, sino que tambien debemos indicar que esta exception probablemente arroje otras exceptions
//         
//         //Por lo tanto en la firma de este metodo, debemos indicar la posible exception que puede arrojar
//         //para ello utilizamos throws. Si bien es igual a throw, en la firma el verbo estara conjugado
//         
//     }
//     return numerador / denominador;
// }
    
    
    
    
    
    //MISMO METODO PERO TRABAJANDO CON RUNTIMEEXCEPTION
    //al trabajar con exception tipo unchecked es innecesario agregar la exception a la firma del metodo, por eso la quitamos
    //Esto hace que el codigo sea mas limpio, sin embargo la exception si la estamos creando, solo no reportamos la exception en la firma del metodo
    
    public static int division(int numerador, int denominador){ //FIRMA
     if(denominador == 0){
         
         throw new OperacionException("Division entre cero"); 
         
     }
     return numerador / denominador;
 }
    
}
