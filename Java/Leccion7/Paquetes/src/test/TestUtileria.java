
package test;
 
//import ar.com.codesystem.Utileria; //esta es la manera de importar  un paquete 
//cuando se utiliza el metodo nuevo de creacion de paquetes, que separa en carpetas
//tras cada punto el autocompletado nos muestra el siguiente paquete
//para agregar todas las clases del paquete utilizamos el asterisco: import ar.com.codesystem.*;

//IMPORTACION DE METODOS STATIC
//import static ar.com.codesystem.Utileria.imprimir;//cuando indicamos el static lo que quiere decir es que vamos a utilizar
//ya sea un atributo o un metodo static de la clase indicada (utileria en este caso)


//NOMBRE COMPLETAMENTE CALIFICADO

public class TestUtileria {
    public static void main(String[] args) {
        //Utileria.imprimir("Hola mundo");
        
        /*  IMPORT STATIC
    lo visto anterior es la sintaxis para trabajar con paquetes y la importacion de sus clases
    pero hay otros tipos de sintaxis, por ejemplo la importacion static
    esta se utiliza para trabajar con metodos estaticos
    */
        
        //imprimir("Terminamos en unos minutos"); //utilizamos el metodo static de la clase utileria, sin ningun problemam y sin llamar a dicha clase
        //ni habiendola importado, ya que solo importamos el metodo
        //si precionamos ctrl y hacemos clic en el metodo, nos llevara a su clase de origen
        
        //ES UNA SINTAXIS RARA DE VER, TIENDE A CONFUNDIR PERO SE LOGRA SOLO A TRAVEZ DE IMPORAR STATIC
        //tiende a confundir ya que al ver la sintaxis podemos interpretarcualquier cosa, pero al ver ese tipo de sintx, tenemos que ver lo que se 
        //a importado y que tipo de metodologia para la importacion se a utilizado, aun asi podemos utilizar ctrl click para ver de donde viene
        
        
        
        /*NOMBRE COMPLETAMENTE CALIFICADO
        Este metodo nos permite utilizar las clases sin necesidad de  ningun import, esto nos obliga a usar el nombre complteo de la clase
        
        NO ES RECOMENDABLE UTILIZAR ESTE METODO
        hace mas dificil la lectura del codigo sobre todo a otros programadores
        
        SIEMPRE SE RECOMIENDA HACER IMPORTACION NORMAL O STATIC
        */
        
        ar.com.codesystem.Utileria.imprimir("Hola mundo");
        //de esta manera llamamos desde el paquete al metodo, y lo utilizamos sin necesidad de importar ningun metodo o clase
        
        
    }
}
