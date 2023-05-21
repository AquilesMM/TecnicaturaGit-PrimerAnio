//En javascript casi todo lo que usemos son objetos
//la diferencia con llos tipos primitivos, es que estos no contienen
//propiedades y tampoco metodos
//un objeto puede tener propiedades y metodos

let x = 10; //variable de tipo primitiva

console.log(x.length);

//Objeto  forma mas utilizada

let persona = {
    /*luego del = lo que sucede es que se crea un espacio de memoria
    con las propiedades que le indiquemos 
    a este objeto se le asigna un espacio de memoria
    esta es la referencia con la que se trabaja y se realiza todo,
    y es la que nos permite acceder a losa tributos y metodos
    nos referimos a ella a travez del nombre que le asignemos al objeto
    persona en este caso
    */
    nombre: 'Carlos',
    apellido: 'Gill',
    email: 'cgill@gmail.com',
    edad: 28,
    idioma: 'ES', //es buena practica manejar los idiomas en mayuscula
    //Agregar metodos a los objetos
    nombreCompleto: function(){//metodo o funcion
        return this.nombre +' '+ this.apellido;
    }, //podemos agregar , al final de la llave y poner mas atributos o metodos

    //utilizamos el operador this. este apunta al objeto al cual
    //se esta trabajando, es decir al que esta dentro del mismo bloque
    //no podemos apuntar a nada que este fuera del objeto. 
    //puede dar la opcion que en vez del this del el nombre del propio objeto, pero esto dara error

    //METODOS GET Y SET

    //metodo get
    //este se agrega como una propiedad mas a la hora de la creacion del objeto
    get nombreEdad(){
        return 'nombre: '+this.nombre+', edad: '+this.edad;
    },

    get lang(){
        return this.idioma.toUpperCase(); //este metodo convierte todo en mayuscula, independientemente de la entrada
    },

    set lang(lang){
        this.idioma = lang.toUpperCase;
    }

}
console.log(persona.nombre); //al ser un objeto podemos acceder a sus metodos y propiedades
console.log(persona.apellido);
console.log(persona.email);
console.log(persona.edad);
console.log(persona);

//accedemos al metodo
console.log(persona.nombreCompleto());


//Objeto forma 2 menos utilizado

let persona2 = new Object();//Debe crear un nuevo objeto en memoria
//lo que hacemos es asignar a la variable persona2 que sea de tipo objeto

persona2.nombre = 'Juan'; //a travez del operador de punto
//le creamos una nueva propiedad al objeto persona2
persona2.direccion = 'Salada 14';
persona2.telefono = '2604223556';
 console.log(persona2.telefono);

 //Acceder a las propiedades de los objetos
 //forma menos usada


/*
De esta forma accedemos como si fuera un arreglo,
esto nos sirve porque nos permite recorrer todas las propiedades
que posee un objeto utilizando un ciclo for especial en el cual cambia la sintaxis
es un for in
*/

 console.log(persona['apellido']);

 //for in

 for(propiedad in persona){
    console.log(propiedad); 
    //aqui nos muestra todas las propiedades, pero no su contenido
    
    //ambas formas sirven

    console.log(persona[propiedad]); 
    //aqui nos muestra el contenido de las propiedades pero no el nombre de la propiedad
 }

/*
Una de las ventajas de trabajar con javascript es su flexibilidad y facilidad para
agregar nuevas propiedades a un objeto
*/

persona.apellido = 'Betancud'; //cambiamos dinamicamente el valor de un objeto
console.log(persona);

/*
HAY QUE SER MINUSIOSOS CON LA SINTAXIS
Esta sintaxis para cambiar un valor dinamicamente debe tomarse con cuidado
ya que puede ser muy problematica

si nos equivocaramos por ejemplo poniendo apellidos y no apellido, este creara una nueva propiedad
y esto podra dar errores 
*/
persona.apellidos = "Betancud";
//BORRAR UNA PROPIEDAD
console.log(persona);
//para ello utilizamos la funcion delete
delete persona.apellidos; //eliminamos la propiedad erronea
console.log(persona);

//DISTINTAS FORMAS DE IMPRIMIR UN OBJETO
//Numero 1: La mas sencilla: concatenar cada valor de cada propiedad
console.log(persona.nombre + ', '+ persona.apellido);

//Numero 2: A travez del ciclo for in

for(nombrePropiedad in persona){
    console.log(persona[nombrePropiedad]);
}

//Numero 3: La funcion Object.values()
/*
Este es un metodo que nos regresa el objeto como un arreglo
*/
let personaArray = Object.values(persona);
console.log(personaArray); //muestra todos los valores en un arreglo


//Numero 4: Utilizaremos el metodo JSON.stringify
/*
convierte todos los elementos en una cadena

Esta es una anoracion especial, la cual se adecua perfectamente
al manejo de objetos, ya que JSON utiliza la notacion de propiedad y valor
y el metodo Stringify convierte cada uno de los valores y propiedades 
a una cadena, de esta manera se asigna nuestra variable de cadena y podemos 
imprimir sin problema 
*/
let personaString = JSON.stringify(persona);
console.log(personaString);


//ACCEDEMOS A ATRIBUTOS A TRAVEZ DE GET

console.log('Comenzamos a utilziar el metodo get');
console.log(persona.nombreEdad); //al tratarse del metodo get, no es necesario agregar parentesis al uso de la funcion

console.log('Comenzamos con el metodo get y set para idiomas');
console.log(persona.lang);
persona.lang = 'en';



//CONSTRUCTORES
//se denomina constructor a la funcion especial que nos permite crear multiples objetos ligados a los mismos atributos
//evitando asi cada vez que creemos un objeto tener que escribir en codigo duro sus atributos y nuevos valores, ademas de sus
//respectivos metodos
//a diferencia de otros lenguajes no es necesario crear clases para trabajar con estos conceptos
function Persona3(nombre = 'Luis', apellido, email){ //los parametros pueden traer o no valores preasignados
    /*
    En este caso a diferencia de otros lenguajes no se crean los atributos primero y luego se hace referencia a ellos
    a travez de this. sino que utilizando simplemente this.nombreAtributo automaticamente se toma como atributo y luego
    se trabaja con el sin necesidad de definir el atributo previamente
    */
    
    this.nombre = nombre;
    this.apellido = apellido;
    this.email = email;

//Agregamos metodos al metodo constructor

    this.nombreCompleto = function(){
        return this.nombre+' '+this.apellido;
    }

}

//en este caso se denomina constructor a la palabra reservada new seguido del constructor que hayamos creado, ej:
let padre = new Persona3('leo', 'Lopez', 'lopez@gmail.com'); //Traduccion nuevo objeto de constructor persona3
padre.nombre = 'Luis';
//esto nos permitira crear varios objetos de tipo persona y no solo uno, como veniamos haciendo
console.log(padre);
console.log(padre.nombreCompleto()); //utilizamos la funcion
padre.telefono = '5492618282'; //una propiedad exclusiva del objeto padre

let madre = new Persona3('Laura', 'Contrera', 'contreral@gmail.com');
console.log(madre);
console.log(madre.telefono); //la propiedad no esta definida
console.log(madre.nombreCompleto);

//Existen funciones constructores para todos los tipos que trabajamos en js sin embargo esto no quiere decir que sea la mejor
//practica, generalmente no es tan usado

//ejemplos
//DIFERENTES FORMAS DE CREAR OBJETOS
//caso numero 1
let miObjeto = new Object(); //esta es una opcion formal

//caso numero 2
let miObjeto2 = {}; //esta opcion es breve y recomendada

//caso numero 3 (String)
let miCadena1 = new String('Ejemplo'); //Sintaxis formal

//caso numero 4 (String 2)
let miCadena2 = 'Hola'; //Estaes la sintaxis simplificada y recomendada

//caso numero 5 (numeros 1)
let miNumero = new Number(1); //es formal (no recomendada)

//caso numero 6 (numeros 2)
let miNumero2 = 1; //Sintaxis recomendada

//caso numero 7 (boolean 1)
let miBoolean1 = new Boolean(false); //formal

//caso numero 8 (boolean2)
let miBoolean2 = false; //sintaxis recomendada

//caso numero 9 (arreglos 1)
let miArrgelo = new Array(); //Formal

//caso numero 10 (arreglos 2)
let miArreglo2 = [0]; //Sintaxis recomendada


//caso numero 11 (Funciones 1)
let miFuncion1 = new function(){}; //Todo despues de new es considerado objeto

//caso numero 12 (Funciones 2)
let miFuncion2 = function(){}; //Notacion simplificada y recomendada


//Uso de prototype
//anteriormente vimos como si le asignamos un nuevo atributo a una variable que tenga asignada en su espacio de memoria un objeto
//tomemos el caso del objeto anterior padre, este nuevo atributo solo sera disponible para este objeto, mas no para el objeto madre
//en el caso de padre pudimos verlo al agregarle el atributo telefono, en el caso de querer ver este atributo, en el objeto
//madre, nos dira que esta indefinido

//SI LO QUE QUEREMOS ES AGREGAR UN ATRIBUTO/PROPIEDAD PARA TODOS LOS OBJETOS, UTILIZAMOS PROTOTYPE
//ejemplo:

Persona3.prototype.telefono = "261838383";
console.log(padre);
console.log(madre);
madre.telefono = '256445786554';
console.log(madre.telefono);

//Uso de call
//Este metodo nos va a permitir llamar un metodo que esta definido en un objeto, desde otro objeto
//independientemente de que podamos crear un constructor y a travez de este crear varios objetos
//a su vez estos objetos creados por el constructor, comparten metodos y atributos que han sido establecidos en el 
//constructor. Aunque en ocaciones no tenemos este metodo constructor, pero aun asi podemos utilizar metodos de objetos
//llamados desde otros objetos, Para ello utilizamos el metodo call

//para ello crearemos otro objeto
let persona4 = {
    nombre: 'Juan',
    apellido: 'Perez',
    nombreCompleto2: function(titulo, telefono){
        //return para call y apply
        return titulo+': '+this.nombre+' '+this.apellido+' '+telefono;
        //return para apply
        //return this.nombre+' '+this.apellido
    }
}

let persona5 = {
    nombre: 'Carlos',
    apellido: 'Lara',
}

//console.log(persona4.nombreCompleto2('Lic', '565855885546'));

//a pesar de no haber definido la funcion nombreCompleto2 en persona5, pudimos acceder a este, primero
//a travez de el objeto que posee dicho metodo, y luego indicando con que objeto se usara, para luego pasar los datos que pide
//la funcion
//console.log(persona4.nombreCompleto2.call(persona5, 'ing', '4564678484946'));

//METODO APPLY
//de manera muy similar a como se trabaja con el metodo call, el metodo apply nos permite hacer el mismo tipo de llamadas
//DIFERENCIA DE CALL Y APPLY
//apply nos permite llamar a un metodo en un objeto que no tiene definido cierto metodo
//la unica diferencia es la forma en que se pasan los argumentos a cierto metodo
//ya que para apply debemos pasar un metodo con todos los argumentos
let arreglo = ['ing', '46545646546']
console.log(persona4.nombreCompleto2.apply(persona5, arreglo));
