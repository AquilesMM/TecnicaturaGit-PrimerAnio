
package operaciones;

public class Operaciones {
    
    public static int sumar(int a, int b){
        System.out.println("Metodo para sumar enteros");
        return a + b;
    }
   
    //una de las diferencias de los tipos de metodos que pueden habe en la sobrecarga
    //son los tipos de datos que se utilicen, en el anterior fue int, en el siguiente double
    //ambos metodos realizan la misma accion pero resiben distinto tipo de dato
    //uno entero otro double, por  ende los argumentos deberan respetar estos tipos
    
    
    //IMPORTANTE
    //cuando un metodo es tipo public, el siguiente no puede cambiar el modificador de acceso, no puede hacerse mas restrictivo
    //no puede ser private, protected o default
    //pero su return si puede variar de tipo de dato
    public static double sumar(double a, double b){
        System.out.println("Metodo para sumar double");
        return a + b;
    }
    
}
