package argumentosvariables;

public class ArgumentosVariables {

    public static void main(String[] args) {
        imprimirNumeros(3, 4, 5);
        imprimirNumeros(1, 2);
        variosParametros("Aquiles", "Martinez", 10, 5, 20);//como el argumento variable va al final, podemos poner tantos valores como queramos una vez hayamos completado
        //el resto de parametros
    }
    
    private static void variosParametros(String nombre, String apellido, int ...numeros){
        //IMPORTANTE
        //SI TENEMOS UN ARGUMENTO VARIABLE DEFINIDO DENTRO DEL METODO, ESTE DEBBE SER EL ULTIMO ARGUMENTO DEL METODO 
        
        System.out.println("Nombre: "+ nombre);
        System.out.println("Apellido: "+ apellido);
        imprimirNumeros(numeros);
    }
    private static void imprimirNumeros(int  ...numeros){//los tres puntos hacen que sea un argumento variable, es decir ahora numeros es un arreglo de tipo int
        //que sea un argumento variable lo que hace es que la cantidad de elementos de el arreglo sea indefinida
        //si solo pusieramos un arreglo deberiamos saber cuantos elementos vamos a pasar, pero de esta forma esto es innecesario
        //sin mebargo la sintaxis de declaracionn del argumento no variable sera tratada igual a la de un arreglo
        //por dentro la sintaxis sera trabajada sin los puntos 
        
        
        
        for(int i = 0; i < numeros.length; i++){
            System.out.println("Elementos: "+numeros[i]);
        }
    }
}
