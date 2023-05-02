
package test;

import operaciones.Operaciones;

public class TestOperaciones {
    public static void main(String[] args) {
        //creamos variables para utilizar losmetodos
        
        var resultado = Operaciones.sumar(7, 9);
                //al llamar a operaciones ya nos saldran los metodos dispobibles y sus tipos
                
        System.out.println("resultado = " + resultado);
        
        var resultado2 = Operaciones.sumar(5.0, 7);
        //para llamar al metodo double, al menos uno de los argumentos debe ser de tipo double, (no hay problema por poner entero), ya que sino
        //aunque seleccionemos el tipo double, si ponemos dos enteros se utilizara el metodo para enteros
        
        System.out.println("resultado2 = " + resultado2);
        
        
        var resultado3 = Operaciones.sumar(8, 6L); //6L -> 6 tipo Long
        
        //en este caso, el compilador primero deduse que es el metodo entero y al toparse con un tipo long luego, lo que hace es: recurrir al metodo
        //double ya que el tipo int no soportaria al tipo long, es demaciado pesado, double si lo soportaria, double es el tipo mas grande
        //el compilador siempre buscara el metodo mas adecuado para la operacion que realizamos
        //razonamiento compialador: si tipo int no puede soportar el peso, quien si, double, por ello utiliza el metodo double
        System.out.println("resultado3 = " + resultado3);
    }
    
}
