
//Crear una funcion
/*
Para crear una funcion utilizamos la pabra reservada funcion 
luego ponemos el nombre de la funcion
utilizamos camelCase
dentro de los parentecis ponemos los parametros las funciones pueden o no tener parametros que al momento de ser llada van a ser argumentos

tod0 lo que se pone dentro de la funcion se denomina cuerpo de la funcion

HOSTING: SE PUEDEN LLAMAR LAS FUNCIONES ANTES DE DEFINIRLAS

TODAS LAS  FUNCIONES RETORNAN. aunque no utilicemos la palabra return
el compilador utiliza de por si la palabra return 

Return:
    return se encuentra de manera implicita en las funciones, es decir:
    si al llegar al final de la funcion, el compilador no detecto return
    este agregara un return (que no se vera) en la ultima linea de la funcion
    este lo utilizamos cuando queremos que una funcion retorne un valor, sino no es necesario
*/

miFuncion(5, 4);//ESto se lo conoce como hosting

function miFuncion(a, b){
    //console.log("Sumamos: "+ (a + b)); //utilizamos parentesis para que se realzce la suma y no se concatenen como texto
    return a + b;

}
miFuncion(5, 5);

let resultado = miFuncion(6, 7);
console.log(resultado);

//declaramos una funcion de tipo expresion o anonima
/*
De esta forma podemos asignar una funcion a una variable sin necesidad de ponerle nombre a una funcion
Estas funciones se utilizan para realizar operaciones simples y rápidas sin la necesidad de definir una función completa con nombre.
*/
let x = function(a, b){return a + b}; // necesita cierre con punto y coma
resultado = x(5, 6); // al llamarla se poe la variable y parentesis donde van los argumentos para la funcion
console.log(resultado);

//Funciones de tipo self e invoking
/*
funciones que se llaman as si mismas
Las funciones de tipo self-invoking (autoinvocadas) o también conocidas como Immediately
Invoked Function Expression (IIFE) son funciones en JavaScript que se invocan a sí mismas 
inmediatamente después de ser definidas. Esto se logra mediante la inclusión de la función
entre paréntesis y agregar una pareja de paréntesis al final, como en el siguiente ejemplo:
*/

(function(a,b){
    console.log('Ejecutando la funcion: '+ (a + b))
})(9, 6);

//Las funciones pueden ser de tipo function o object
/*
Las funciones son consideradas objetos ya que tienen propiedades y metodo
hay diversas propiedades que pueden ser usadas en las funciones

*/
console.log(typeof miFuncion);

function miFuncionDos(arguments){
 console.log(arguments.length); //sirve para saber cuantos argumentos se han definido
 //los muestra y ordena como si fuesen un arreglo
 //esta propiedad solo puede ser utilizada dentro de la funcion, no fuera del bloque de la funcion
 
}
miFuncionDos(5, 7, 8, 9);

//toString
//otro ejemplo de que es un objeto es que por ejemplo podemos utilizar el metodo toString
var miFuncionTexto = miFuncionDos.toString();
console.log(miFuncionTexto)


//Funciones flecha
/*
Este tipo de funciones son muy similares a las de tipo expresion

Lo mas comun en estas funciones es que una vez se le asignen los parametros de referencia
estos ya no cambien, es por ello que para definir la variable de referencia utilizamos cosnt

Cuando utilizamos estas funciones, ya no es necesario utilizar la palabra reservada function
tampoco utilizamos llaves, utilizamos el operador de flecha => 
Tampoco es necesario utilizar return
*/

const sumarFuncionFlecha = (a, b) => a + b; 
resultado = sumarFuncionFlecha;
console.log(resultado);

/*
Cuando definimos una funcion, podemos observar que dentro de los parentesis hemos definido variables
a esto se lo conoce como parametros de la funcion, cuando llamamos a la funcion lo que ponemos entre parentes
es llamado argumentos

EN JAVASCRIPT NO ES NECESARIO PASAR TODOS LOS PARAMETROS CUANDO LLAMAMOS UNA FUNCION
TAMBIEN PODEMOS PASAR MAS ARGUMENTOS QUE PARAMETROS HAYA DEFINIDOS
NO ES REQUERIDO QUE COINCIDAN EL NUMERO DE ARGUMENTOS CON EL NUMERO DE PARAMETROS

tambien es posible poner valores por default en los parametros, pero estos cambiaran en cuanto se llame a la funcion
y seran sustituidos por los nuevos valores en el caso de que en el llamado de la funcion no se ponga un argumento para alguno
(solo durante el llamado a la funcion, no seran sustituidos para cada llamado)
de los parametros que fueron definidos por default, este en caso de ser requerido en la funcion, tomara el valor puesto por
default


Acalaracion, la funcion arguments no detectara los calores por default


*/


//FUNCION DE TIPO EXPRESION

let sumar = function(a = 4, b = 8){
    console.log(arguments[0]); //muestra el parametro de a
    console.log(arguments[1]); //muestra el parametro de b
    return  a + b + arguments[2]; //sumara el argumento 2 aunque este no haya sido definido como parametro
    //pero si hacemos algo como lo del return hay que tener cuidado ya que de no pasar un argumeto extra, no mostrara resultado
}

resultado = sumar(3, 5, 9);
console.log(resultado);

console.log(sumar());


//SUMAR TODOS LOS ARGUMENTOS
//en javascript siempre que no utilicemos la funcion flecha
//podemos utilizar el concepto de hoisting, es decir que podemos utilizar la funcion
//en alguna parte del archivo antes de haberla declarado

let respuesta = sumarTodo(5, 4, 13, 10, 9);

console.log(respuesta);

function sumarTodo(){
    let suma = 0;
    for(let i = 0; i < arguments.length; i++){
        suma += arguments[i];
    }
    return suma;
}

//Paso por valor
/*
se considera paso por valor cuando se utilizan tipos que no son objetos.
ej: numericos, boolean etc.

al asignar un valor numerico a una variable, este se considera como valor primitivo ya que no tiene propiedades ni metodos
no podemos asociar ni propiedades ni metodos a este valor

crearemos un metodo para intentar cambiar este valor numerico desde el metodo
y veremos que ya que es un tipo primitivo esto no es posible

el paso por valor quiere decir que unicamente se pasa una copia  de este valor de esta variable al metodo que se 
va a llamar


*/
//tipos primitivos

let k = 10;
function cambiarValor(a){ //paso por valor
    a = 20;
}

cambiarValor(k);
console.log(k); //como vemos no cambia el valor de la variable 
//el parametro pasado solo tendra valor dentro de la funcion, pero no cambiara el valor de la variable original

//PASO POR REFERENCIA
/*
para ello debemos crear un objeto ya que a este se le pueden asociar propiedades y metodos

lo recomendable para crear un objeto es utilizar const
*/


const persona = {
    nombre: 'juan',
    apellido: 'Lepez' //el ultimo atributo no necesita coma
}
console.log(persona)
function cambiarValorObjeto(persona1){
    persona1.nombre = 'Ignacio';
    persona1.apellido = 'Perez';

    //la variable persona1 al finalizar la funcion se va a destruir, pero en este caso estuvo apuntando al espacio de memoria
    //del objeto, es decir que las modificaciones echas dentro de la funcion afectaran fuera de ella, a diferencia de en 
    //el paso por valor
}

cambiarValorObjeto(persona);

console.log(persona)