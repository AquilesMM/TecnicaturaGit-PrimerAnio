package paquete2;

import paquete1.Clase1;
//la clase 3 es hija de Clase1
//es importante marcar algo como protected cuando queremos heredarle esas caracteristicas a la clase hija
//en caso de que no queramos heredarlas seran private

public class Clase3 extends Clase1{
    public Clase3(){
        //lamamos al constructor de clase padre Clase1
        super("protected"); //podemos acceder al constructor protected
        this.atributoProtected = "Accedemos desde la clase hija";
        //En este caso podemos acceder a atributos protected ya que hemos echo que esta clase sea hija de clase1
        System.out.println("AtributoProtected = " + this.atributoProtected);
        this.atributoPublic = "Es totalmente publico";
    }
}
