//EJEMPLO DE LA NO EXISTENCIA DE HOISTING EN TRABAJO DE CLASES
//let persona3 = new Persona('Carla', 'Ponce'); //da error


//SINTAXIS BASICA PARA DEFINIR UNA CLASE
//se recomienda que el nombre inicie con mayuscula
class Persona {
    //Si bien la clase padre no extiende de nada, la clase de la que extienden todas las clases por defecto
    //es la clase Object, al igual que pasa en java





    //creamos un constructor
    //este constructor es muy similar al constructor utilizado para crear un objeto
    //su sintaxis tambien es muy similar a la sintaxis de un metodo
    constructor(nombre, apellido){
        //inicializamos los atributos de la clase, utilizando this.
        this._nombre = nombre; //usamos el gion bajo para trabajar con get
        this._apellido = apellido;

        
        //CASO NO DEFINIR CONSTRUCTOR
        /*
        En el caso de que no definamos un constructor en nuestra clase
        js agregara uno vacio de manera automatica
        */
    }
    //METODOS GET Y SET
    //se colocan como suele ser lo general luego del constructor y metodos
    
    //IMPORTANTE METODO GET Y SET (buena practica guion delante de propiedad)

    // En js a diferencia de otros lenguajes, el metodo get no puede llevar el mismo nombre
    //que nuestra propiedad. Es por ello que en muchas ocaciones se acostumbra a poner un gion bajo
    // delante del nombre de las propiedades. propidades == atributos
    

    get nombre(){ //utilizamos el nombre sin el guion, es la idea de haber puesto un guin al atributo
        return this._nombre;
    }

    get apellido(){
        return this._apellido;
    }


    //METODO SET

    set nombre(nombre){
        this._nombre = nombre;
    }


    set apellido(apellido){
        this._apellido = apellido;
    }


    //cabe destacar que no es necesario agregar ninguna coma entre metodo y metodo
    //tampoco utilizamos la palabra reservada function para crear los metodos
    //solo con el nombre js entiende que es una funcion o un metodo dentro de la clase


    //Metodo para heredar a la clase hija
    nombreCompleto(){
        return this._nombre+ ' '+ this._apellido;
        //Podemos observar que aunque el metodo este creado en la clase padre, este podra ser accesible
        //desde la clase hija
    }


   //METODO TO STRING
   /*
   Este metodo nos permite imprimir informacion del estado del objeto es decir todos los valores y estados actuales de los atributos de nuestro objeto 
   es buena practica agregar este metodo en la definicion de nuestra clase

   Sin embargo cuando trabajamos en la clase object, tenemos que tener en cuenta que hay metodos que ya estan definidos en la clase objetc, o metodos que ya 
   estan definidos en el atributo de prototype

   podemos ver que uno de estos atributos definidos en object.prototype es toString
   
   Object.prototype.toString

   A continuacion sobreescribimos el metodo toString
    */

    toString(){ //regresa un String
        return this.nombreCompleto
    }



}






//CREACION DE UNA NUEVA CLASE QUE EXTIENDE DE PERSONA

class Empleado extends Persona{ //Clase Hija

    constructor(nombre, apellido, departamento){
        //cuando creamos un objeto de la clase hija, solo estamos inicializando el atributo de departamento
        //pero al extender de Persona, js, no tiene forma de inicializar los atributos de nombre y apellido
        //por lo que la unica forma que hay es llamar a su constructor para pasar los valores de nombre y apellido al constructor de la clase padre
        //para ello lo hacemos con super, la primer linea de la clase hija es el constructor de la clase padre, y a este le pasamos los valores requeridos
        //por lo sera necesario tomar en cuenta los atributos del constructor padre para agregarlos a los parametros, para luego pasarlos como argumetos
        super(nombre, apellido)
        this._departameto = departamento;
    }

    get departamento(){
        return this._departameto
    }

    set departamento(departamento){
        this._departameto = departamento;
    }

    //SOBREESCRITURA

   /*
   Hasta este punto el metodo nombre completo de la clase padre, no esta completo desde el punto de vista de la clase hija
   le falta el atributo de departamento, ya que el metodo solo trae el nombre y apellido, no el departament que es el 
   atributo con el que trabaja la clase hija.

   Para cambiar esto, utilizaremos el concepto de sobreescritura desde la clase hija, permitiendonos cambiar el comportamiento de el metodo en la clase hija 


   IMPORTANTE:
   Para que se considere sobreescritura, el metodo debe manetener el mismo nombre que tiene en su clase padre, si lo modificamos, por minimo que sea
   este se considerara un metodo distinto, y no sera sobreescritura, si se tiene parametros tambien deben estar incluidos los mismos parametros
    */

   nombreCompleto(){
    //return this._nombre+' '+this._apellido+' '+this._departameto;
    //el codigo de arriba es muy redundante ya que tenemos gran parte de esto echo en el metodo de la clase padre, por lo que no es necesario
    //por ello resumimos con el siguiente codigo 
    return super.nombreCompleto()+' '+this._departameto
    //no olvidar los parentesis en el metodo para que sea considerado un metodo
   }


    


}





//Crearemos objetos

let persona1 = new Persona('Martin', 'Perez');
//console.log(persona1); //accedemos a todos los atributos del metodo
console.log(persona1.nombre); //utilizamos el metodo get
//al momento de llamarlo no es necesario poner los parentesis ya que 
//al no recibir parametros, no es necesario que lleven los parentesis
//js entiende que se esta llamando un metodo get

persona1.nombre = 'Juan Carlos';
console.log(persona1.nombre);
//js detectara de manera automatica que se llama a get o set a pesar de tener el mismo nombre
//esto lo hace por contexto
persona1.apellido = 'Rodrigez';
console.log(persona1.apellido);

let persona2 = new Persona('Carlos', 'Lara');
//console.log(persona2);
console.log(persona2.nombre);
persona2.nombre = 'Maria Laura';
console.log(persona2.nombre);
persona2.apellido = 'Dominguez';
console.log(persona2.apellido);

//hoisting
/*
El hoisting es un comportamiento en JavaScript donde las declaraciones de variables y funciones se mueven automáticamente 
al principio de su ámbito (ya sea el ámbito global o el ámbito de una función) durante la fase de compilación. Esto significa 
que puedes utilizar variables y funciones antes de declararlas explícitamente en tu código.

IMPORTANTE
Sin embargo, es importante tener en cuenta que solo la declaración en sí se eleva, no la inicialización. En el ejemplo anterior,
 la declaración de miVariable se eleva, pero su asignación (valor asignado)) se mantiene en su posición original.

 por lo que si llamamos una variable antes de declararla, no dara error, pero su valor sera indefinido o el valor default
*/

//NO HAY HOISTING EN CLASES

/*
Cuando trabajamos con clases no existe el histing, es decir, si queremos declarar un objeto antes de haber
declarado la clase, no se podra  hacer, dara un error

*/

//CREAMOS OBJETOS DE LA CLASE HIJA

let empleado1 = new Empleado('Maria', 'Gimenez', 'Sistemas');
//al crear un objeto de la clase hija, si lo hacemos de la misma manera que lo hacemos con la clase padre
//esto nos devolvera un error que nos dira que debemos llamar a super en el constructor
// por lo que al crear objetos de una clase hija,es importante en el constructor de estos objetos, llamar a super 

console.log(empleado1);
console.log(empleado1.nombre);
//en este caso vemos como se heredan los metodos de la clase padre, ya que get nombre no esta en la clase hija
//pero si en la clase padre, y por ello podemos utilizarlo en un objeto de su clase hija



//ACCEDEREMOS A METODOS DE CLASE PADRE A TRAVEZ DE OBJETO DE CLASE HIJA QUE HEREDA CLASE PADRE
console.log(empleado1.nombreCompleto()); //Es necesario poner los parentesis para indicar que es un metodo



//Object.prototype.toString   //esta es la manera de acceder a atributos y metodos de manera dinamica 

//EL METODO PROTOTYPE NOS PERMITE AGREGAR OTROS METODOS A NUESTRA CLASE 
 /*
 En JavaScript, cada objeto tiene una propiedad llamada "prototype" (prototipo), que es una referencia a otro objeto.
  El prototipo es utilizado por el motor de JavaScript para buscar propiedades y métodos en caso de que no estén presentes en el objeto actual.

 La propiedad Object.prototype es un objeto especial en JavaScript que actúa como el prototipo de todos los objetos creados a través
 del constructor Object. En otras palabras, todos los objetos en JavaScript heredan propiedades y métodos de Object.prototype.

 La función toString es un método definido en Object.prototype. Cuando invocas Object.prototype.toString en un objeto,
 se devuelve una representación en forma de cadena de ese objeto. La cadena devuelta indica el tipo de objeto.
 */


console.log(empleado1.toString()); //accedemos desde la clase hija por herencia

/*
En este caso tambien se estara poniendo en practica el polimorfismo, ya que al ejecutar to String, no solo se llamara a nombre y apellido
sino que tambien se llamara al departamento, es decir, como en el metodo toString, retornamos el metodo nombreCompleto() este detecta que el mas
adecuado en este caso sera el metodo de la clase hija, es decir, la clase padre mediante polimorfismo puede acceder a los metodos de la clase hija

El metodo que se utilice dependera de la referencia con la que estemos trabajando, es decir, si lo que se utiliza es una referencia de clase hija, 
se llamara al metodod e la clase hija puesto que es el mas adecuado, pero si utilizamos un metodo de la clase padre, se mandara a llamar al metodo de la
clase padre, puesto que es el mas adecuado por el contexto

Polimorfismo: multiples formas en tiempo de ejecucion


El recorrido se puede describir de la siguiente manera:

hacemos el llamado desde objeto de clase hija, este busca el metodo en la clase hija y no lo encuentra
pero lo encuntra heredado de la clase padre, por lo que va a la clase padre, y utiliza el metodo, este llama
al metodo nombreCompleto() pero este metodo lo llama desde la clase padre pero no utiliza el de la clase padre, 
sino que va a la clase hija y utiliza el metodo sobreescrito, puesto que a sido llamado desde el objeto de la clase hija
el metodo de la clase hija, por como esta echo, llama al metodo de la clase padre, y le añade el departamento 


*/

console.log(persona1.toString());

/*
En este caso el recorrido va directamente a la clase, padre y al ser un objeto de clase padre, utilizara el metodo definido en esta clase 
*/

