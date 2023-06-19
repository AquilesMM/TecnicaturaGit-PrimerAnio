import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListadoPersonasApp {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Definimos la lista fuera del ciclo while
        List<Persona> personas = new ArrayList<>();
        /*
        List<Persona> personas: Aquí se declara una variable llamada "personas" de tipo "List" que almacenará objetos de tipo "Persona".
         En Java, "List" es una interfaz que representa una lista ordenada de elementos y "Persona" es el tipo de objeto que se almacenará en la lista.
         La variable "personas" se utilizará para hacer referencia a esta lista.

         = new ArrayList<>();: En Java, se utiliza el operador "new" para crear una nueva instancia de una clase. En este caso,
         se crea un nuevo objeto "ArrayList" que implementa la interfaz "List". El "<>" indica que no se especifica un tipo de dato concreto para el
         "ArrayList", lo que permite que se almacenen objetos de cualquier tipo en él. El "ArrayList<>" también se conoce como "ArrayList parametrizado"
         o "ArrayList genérico".

         En resumen, la línea de código declara una variable llamada "personas" que es una lista vacía en Java, donde se almacenarán objetos de tipo "Persona".
          Se utiliza la implementación de "ArrayList" para crear esta lista. Cabe destacar que esta explicación es específica de Java y puede variar en otros
          lenguajes de programación.

         */
        //Uso de <>
        /*
        En Java, los símbolos "<>" se utilizan para indicar la generificación o el uso de tipos genéricos. Esta característica se introdujo en Java
        5 como parte de la programación genérica y permite escribir código más flexible y reutilizable.


        Algunos usos comunes de los símbolos "<>" en Java son los siguientes:

        Declaración de tipos genéricos: Permite definir clases, interfaces y métodos que pueden trabajar con diferentes tipos de datos.
        Por ejemplo, la declaración List<T> indica que la lista puede contener elementos de cualquier tipo, donde "T" representa un tipo genérico
        que se determinará cuando se utilice la clase.

        Creación de objetos genéricos: Al utilizar el operador new para crear una instancia de una clase genérica,
        se pueden proporcionar argumentos entre los símbolos "<>". Por ejemplo, new ArrayList<Integer>() crea un nuevo objeto ArrayList que
        almacenará objetos de tipo Integer.

        Uso de métodos genéricos: Los métodos también pueden utilizar tipos genéricos. Esto permite que un método trabaje con diferentes tipos de datos
         según sea necesario. Por ejemplo, el método public <T> T getFirst(List<T> list) puede devolver el primer elemento de una lista de cualquier tipo.

        En resumen, los símbolos "<>" en Java se utilizan para implementar la programación genérica, lo que permite crear clases,
        interfaces y métodos que funcionan con diferentes tipos de datos de manera flexible y reutilizable.





         */
        //Empezamos con el menu
        var salir = false;
        while(!salir){ //mientras salir sea falso !variable = variable false (independientemente que al momento de hacer esa declaracion, la variable sea falsa)
            mostrarMenu();
            try{
                salir = ejecutarOperacion(entrada,personas);
            }catch (Exception e){
                System.out.println("Ocurrio unn error: "+e.getMessage());
            }
            System.out.println();
        }// Fin ciclo while
    }//Fin metodo main

    private static void mostrarMenu(){
     //Mostramos las opciones
        System.out.print("""
                ********Listado de Personas **********
                1. Agregar
                2. Listar
                3. Salir
                """);
        System.out.print("Digite una de las opciones: ");

    }//Fin metodo mostrarMenu

    //LAMBDA
    /*
    En Java, la función lambda es una característica introducida en Java 8 que permite tratar las funciones como objetos.
    Una función lambda es una función anónima que se puede pasar como argumento a otro método o almacenar en una variable.

    La función lambda en Java se utiliza principalmente para implementar interfaces funcionales de una manera más concisa y legible.
    Una interfaz funcional es una interfaz que contiene solo un método abstracto. Antes de la introducción de las funciones lambda,
    para utilizar una interfaz funcional, era necesario crear una clase anónima o una clase separada que implementara la interfaz.


    Con las funciones lambda, puedes definir una implementación compacta y expresiva del método de la interfaz funcional directamente en el
    lugar donde se necesita. Esto mejora la legibilidad del código y reduce la necesidad de escribir clases adicionales.

    La sintaxis básica de una función lambda en Java es la siguiente:
    (parametros) -> expresion

    Aquí, "parámetros" representa los parámetros de la función lambda, y "expresion" es la lógica o el cuerpo de la función.
    La función lambda se puede asignar a una variable o se puede utilizar directamente en el lugar donde se necesita una implementación
    de una interfaz funcional.

    Por ejemplo, supongamos que tienes una interfaz funcional llamada Operacion con un único método calcular(int a, int b)
    que realiza una operación matemática. Puedes utilizar una función lambda para implementar esta interfaz de la siguiente manera:

    Operacion suma = (a, b) -> a + b;
    int resultado = suma.calcular(2, 3); // resultado será 5

    En este ejemplo, la función lambda (a, b) -> a + b implementa la lógica de la suma de dos números enteros. Luego, se asigna a la variable
    suma y se llama al método calcular para obtener el resultado.

    En resumen, la función lambda en Java se utiliza para implementar interfaces funcionales de manera más concisa y legible,
    evitando la necesidad de crear clases adicionales. Permite escribir código más limpio y legible al expresar la implementación de
    una interfaz funcional directamente en el lugar donde se necesita.



     */
    //METODO DE REFERENCIA
    /*
    En Java, además de las funciones lambda, también existe la posibilidad de utilizar los métodos de referencia para implementar interfaces
    funcionales de manera concisa. Los métodos de referencia permiten referenciar directamente a un método existente en lugar de proporcionar
    una implementación lambda.

    Existen diferentes tipos de métodos de referencia, que se pueden utilizar según el contexto y los requisitos de la interfaz funcional.
    A continuación, se presentan algunos ejemplos de los tipos más comunes de métodos de referencia:

    Referencia a un método estático: Se utiliza para referenciar un método estático existente.

    // Ejemplo: Referencia a un método estático de la clase Math
    Operacion suma = Math::addExact;
    int resultado = suma.calcular(2, 3); // resultado será 5

    En este ejemplo, el método addExact de la clase Math se referencia mediante Math::addExact y se asigna a la variable suma.
    Luego, se llama al método calcular para obtener el resultado.

    Referencia a un método de instancia de un objeto existente: Se utiliza para referenciar un método de instancia de un objeto ya creado.

    // Ejemplo: Referencia a un método de instancia de un objeto String
    String mensaje = "Hola, Mundo!";
    FuncionImprimir imprimir = mensaje::println;
    imprimir.imprimirMensaje(); // imprime "Hola, Mundo!"

    En este ejemplo, el método println del objeto mensaje se referencia mediante mensaje::println y se asigna a la variable imprimir.
    Luego, se llama al método imprimirMensaje para imprimir el mensaje en la consola.

    Referencia a un método de instancia de un tipo arbitrario: Se utiliza para referenciar un método de instancia de un tipo específico,
    sin un objeto en particular.

    // Ejemplo: Referencia a un método de instancia de un tipo arbitrario
    List<String> lista = Arrays.asList("a", "b", "c");
    Consumer<String> imprimir = System.out::println;
    lista.forEach(imprimir); // imprime cada elemento de la lista

    En este ejemplo, el método println de la clase System.out se referencia mediante System.out::println.
    Luego, se utiliza el método forEach en la lista para imprimir cada elemento.

    Estos son solo algunos ejemplos de los diferentes tipos de métodos de referencia disponibles en Java.
    La elección del método de referencia adecuado depende del contexto y los requisitos específicos de la interfaz funcional que
    se está implementando. Los métodos de referencia proporcionan una forma más concisa de utilizar métodos existentes en lugar
    de escribir implementaciones lambda completas.


     */
    private static boolean ejecutarOperacion(Scanner entrada, List<Persona> personas){
        var opcion = Integer.parseInt(entrada.nextLine());
        var salir = false; //esta variable es local al metodo
        //Revisamos la opcion digitalizada a travez de un switch
        switch (opcion){
            case 1 -> { //Agregar una persona a la lista
                System.out.print("Digite el nombre: ");
                var nombre = entrada.nextLine(); // tambien es una variable local
                System.out.print("Digite el telefono: ");
                var tel = entrada.nextLine();//variable local
                System.out.print("Digite el correo: ");
                var email = entrada.nextLine();
                //Creamos el objeto persona
                var persona = new Persona(nombre, tel, email);
                //Agregamos la persona a la lista
                personas.add(persona);
                System.out.println("La lista tiene: "+personas.size()+" elementos");
            }//Fin caso 1
            case 2 -> {//Listar a las personas
                System.out.println("Listado de personas: ");
                //Implementamos una mejora utilizando lamda y metodo de referencia
                //vamos a utilizar esta mejora para iterar cada uno de los objetos de la lista
                //El listado de personas, al ser una coleccion, tiene un metodo llamado for each (persona.forEach)
                //Este metodor requiere de un consumer, es decir de la funcion lamda que pasaremos.
                //de manera interna vamos a definir la funcion lambda

                //personas.forEach((persona) -> System.out.print(persona)); //esta es la primer forma

                //utilizando una mejora mas utilizando el concepto de metodos por referencia
                //En lugar de agregar una funcion lamda, podemos simplificar este codigo ya que este metodo println puede acceder a cada uno de los
                //objetos de tipo persona, utilizando la siguiente sintaxis
                //esta quiere decir que por cada objeto de tipo persona que tendra la lista, se ejecutara el metodo printLine
                //con este metodo ya no tenemos que indicar que vamos a iterar cada objeto de tipo persona
                //metodo de referencia == ::  (sintaxis de doble punto)
                //tambien se utiliza en otros lenguajes
                //con cada uno de los objetos de tipo persona que tengamos en la lista, se infiere que queremos acceder a cada uno de los objetos
                //y pasarlos a println, y por ende println los manda a imprimir en la lista
                //esta sintaxis simplifica mucho la iteracion de tipo persona

                personas.forEach(System.out::println); // caso 2
            }//Fin caso 2
            case 3 ->{ //salir del ciclo
                System.out.println("Hasta pronto...");
                salir = true;
            }//Fin caso 3
            default -> System.out.println("Opcion incorrecta: "+opcion);
        }//Fin del switch
        return salir;
    }//Fin metodo ejecutarOperacion


}//Fin de la clase ListadoPersonasApp