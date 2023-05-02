package test;

public class TestAutoboxinUnboxin {
    public static void main(String[] args) {
        /*
        Esto tiene que ver con los tipos primitivos
        cada uno de estos tipos tiene una clase en java asociada o conocida
        como clase wrapper o envolvente de tipo primitivo
        
        Las clases envolventes nos permiten acceder a atributos y metodos 
        asociados al tipo primitivo
        
        una variable inicializada con la clase envolvente en vez  de solo
        con el tipo primitivo, tendra acceso a diversos atributos y metodos
        que de otra forma no tendra
        
        Los tipo primitivo solo almacenan un valor, sin otros usos de por si
        
        Por lo general utilizamos tipos primitivos cuando en nuestro algoritmo vamos a
        hacer demaciados calculos. Caso contrario podemos utilizar los tipo object (wrapper)
        
        Las variables inicializadas con clases envolventes pasan a ser objetos hijos de dicha clase
        
        Se recomienda utilizaar tipos object ya que gracias a la cantidad de funciones y metodos
        nos dan una amplia variedad de herramientas, y nos permiten hasta hacer conversiones  de manera mas simple
        
        
        
        No hay que olvidar que los clases wrapper inician con mayusculas, ya que en si, son clases
        a diferencia de los tipos primitivos
        
        wrapper para int 
        
        int = Integer
        long = Long
        float = Float
        double = Double
        boolean = Boolean
        byte = Byte
        chat = Character
        short = Short
        
        
        
        
        Buscar bien la diferencia de unboxin y autoboxin
        */
        
        //CLASES ENVOLVENTES O WEAPPER
        
        int enteroPrimitivo = 10;
        //enteroPrimitivo.  no da acceso a nada
        System.out.println("enteroPrimitivo = " + enteroPrimitivo);
        Integer entero = 10;
        //entero.toString(); //un ejemplo de uso de metodo con integer
        System.out.println("entero = " + entero.doubleValue()); //Autoboxin
        
        /*
        Autoboxing: Es la conversión automática de un tipo primitivo a su 
        correspondiente tipo envolvente. Por ejemplo, si se asigna un 
        valor int a una variable de tipo Integer, el valor int se convertirá
        automáticamente en un objeto Integer. El autoboxing es útil porque 
        permite tratar los tipos primitivos como objetos en ciertos contextos.

        Unboxing: Es la conversión automática de un tipo envolvente a su 
        correspondiente tipo primitivo. Por ejemplo, si se asigna un objeto 
        Integer a una variable de tipo int, el objeto Integer se convertirá 
        automáticamente en un valor int. El unboxing es útil porque permite 
        utilizar valores de tipo envolvente en contextos que requieren valores primitivos.
        */
        int entero2 = entero;
        System.out.println("entero2 = " + entero2);
            
            
    }
}
