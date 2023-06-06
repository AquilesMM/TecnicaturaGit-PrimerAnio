package test;

import static aritmetica.Aritmetica.division; //de esta manera importamos solo el metodo
import excepciones.OperacionException;
//al ser un metodo static, debemos agregar la sintaxis static luego de import

public class TestExcepciones {
    public static void main(String[] args) {
        
        int  resultado = 0;
        //Apuntes sobre excepciones
        /*
        En el mensaje de error, primero veremos java.lang luego el tipo de excecion y ya luego la excepcion especifica que se detecto
        Java.lang es el paquete donde se encuentran todas las excepciones
        Tambien nos mostrara: paquete.clase.main/ o donde este el error (luego linea de codigo entre parentesis)
        
        
        Lo recomendable es que el programa pueda recuperarse de cualquier tipo de errores, que no se bloquee, que no se detenga el programa
        para ello utilizamos un try/catch
        
        El evitar errores y demas, se lo denomina, controlar el flujo del programa
        
        La clase padre de todas las excepciones es la clase Throwable pero no suele ser muy usadad, no olvidar que hay que tratar de ser
        mas especifico con los errores, siempre que se pueda
        
        se divide en Error y Exception
        
        Error no la vamos a ver de momento (errores de memoria, compilacion, link
        
        Exception es de donde nacen todas las exepciones por lo general
        
        Dentro de la gerarquia de excepciones, es obligatorio controlar de la calse exception, su clase hija IOExeption con todas sus herencias
        y la clase Interrumpted exception
        
        Es decir que si trabajamos con estas clases o herencias, Debemos de manera obligatoria agregar un try catch, El compilador nos obligara a hacerlo
        
        Con todo el resto no nos obligara a agregar este bloque ni a reportar estas excepciones
        */
        
        
        try{
            //resultado = 10/0; //esto nos dara un error obviamente
            
            /*
            Este error no nos obligara a reportarlo o mandarlo a un try catch ya que es de tipo aritmetical y este hereda de runtime
            que no entra dentro de las obligatorias
            */
            
            
            resultado = division(10, 0); //utilizamos el metodo de La clase Aritmetica
                    //como importamos especificamente este metodo, no es necesario llamarlo a travez de la clase
        
        }catch(OperacionException e){ //podemos agregar mas de un catch para distintas exceptions, pero siempre se deben respetar las gerarquias de exceptions
            //la mayor gerarquia es exception, debe ir primero el de gerarquia mas baja y a medida que vayan pasando los catch sera de mayor o igual
        
            System.out.println("Ocurrio un error de tipo OperacionExcception");
            
            System.out.println(e.getMessage());
            
            
        }catch(Exception e){ 
            
            //Excception es una clase de la que derivan muchos tipos de errores, y la excepcion se la asignamos a la variable e
            System.out.println("Ocurrio un error");
            e.printStackTrace(System.out); //Sirve para imprimir en consola
            /*
            Mandar a imprimir a consola no es requerido pero puede hacerse
            Pero el id lo recomienda en si
            
            Con ese metodo al cual accedemos desde la variable "e" a la que asignaremos el error, le asignamos un System.out
            Esto mandara a imprimir a consola toda la pila de excepciones, ya que cuando trabajamos con excepciones, una excepcion puede generar 
            a su vez otra excepcion y asi de manera encadenada. Por lo tanto si tenemos una excepcion que genera otra excepcion entonces a eso 
            se le llama la pila de excepciones, ya que podemos tener una lista larga de excepciones.
            
            En este caso mandamos a imprimir la pila de excepciones
            */
            
            //EXCEPTION PERSONALIZADA
            //ahora lo que se puede observar es que el error que se arrojara sera el que creamos nosotros y no el que se da por defecto
            
            System.out.println(e.getMessage()); //Con este metodo, a travez de la variable donde asignamos el arror, podemos obtener unicamente
            //el mensaje de erorr sin ver todo el resto de mensajes que se arroja al atrapar un error, como su ubicacion, clases, metodo, etc.
            
        
        }finally{//agregamos un finally
            //hayan o no excepciones el finaly siempre se va a ejecutar
            System.out.println("Se reviso la division entre cero");
            
        }
        
        //trabajamos con exception tipo runtime (unchecked) por lo que podemos trabajarlo fuera de try/ catch
        //el error ocurrira de todas formas pero si lo trabajamos asi, el programa terminara de forma abrupta, por no controlar el error
        //pero enviara los mensajes de error que nosotros especificamos 
        //que no sea obligatorio no significa que no haga falta trabajar con try/cath para evitar estas cosas
       // resultado = division(10, 0);



        System.out.println("La variable de resultado tiene como valor: "+ resultado);
        /*
        Como ocurrio un error, y nosotros lo atrapamos, el valor de la variable resultado sera 0, es decir su valor original
        ya que no se pudo efectuar el cambio debido a que ocurrio un error, pero aun asi, mantuvimos el flujo de trabajo evitando que se 
        detuviera el programa, aislando el problema y obviando lo que causa o en este caso, el cambio de valor de la variable,
        Es como si esas lineas de codigo no hubieran existido
        */
        
        
        
        
        
    }
}
