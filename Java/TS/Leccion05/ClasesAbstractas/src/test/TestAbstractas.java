package test;

import domain.*;

public class TestAbstractas {
    public static void main(String[] args) {
        FiguraGeometrica figura = new Rectangulo("Rectangulo");
        //Otra regla para al trabajar con clases abstractas es:  no podemos crear objetos, pero lo vamos a intentar
        //no se pueden haccer instancias de la clase figura geometrica
        //lo que podemos hacer es a una variable de la clase padre, asignarle un objeto de la clase hija, como en este caso
        //a una variable de clase figurageometrica le asignamos un objeto de su clase hija rectangul, no hay que olvidar que las clases padre
        //pueden almacenar referencias de clases hijas gracias al polimorfismo
        //utilizamos polimorfismo para que la variable sea mas generia, es importante intentar que el codigo siempre sea lo mas generico posible 
        
        //estamos utilizando de manera automatica un upcastin, asignando una referencia de tipo hija a una de tipo padre, no hace 
        //falta utilizar conversion en upcasting 
        
        //tomara como prioridad el metodo de menor gerarquia, en este caso el de la clase rectangulo
        
        //algunas veces es util marcar clases como abstractas aunque no se tengan metodos abstractos con el fin de no poder crear objetos
        //de la clase padre, pero si de las clases hijas
        //por lo que no todas las clases abstractas tendran metodos abstractos, a veces solo se marcan asi para evitar que se puedan crear objetos
        //de dicha clase
        
        figura.dibujar();
        
        
    }
}
