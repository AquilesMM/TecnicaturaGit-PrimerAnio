var nombre = 'Jose';
var apellido = 'Montes';
var nombreCompleto = nombre+' '+apellido; //esta es una concatenacion
console.log(nombreCompleto);
var nombreCompleto2 = 'Aquiles'+' '+'Martinez'; //otra forma de concatenar
console.log(nombreCompleto2);
var juntos = nombre + 219; //lee  de izq a der siguiendo la cadena lee el numero como str
console.log(juntos);
juntos =  nombre + 78 + 17; // seguira leyendo de iz a der tomando los numeros como str}
console.log(juntos);
juntos = 78 + 17 + nombre; //en este caso, al ser primero numeros, los sumara y luegos los concatenara como s fueran str
console.log(juntos);
//una de las cosas quue podemos hacer para diferenciar en caso de que queramos sumar o concatenar, en distinto orden es el uso de parentesis
juntos = nombre + (78+17);//aqui aunque este primero un str, pedimos que se sume primero
console.log(juntos);

//A TODO LO ANTERIOR SE LO LLAMA CONTEXTO STRING o CONTEXTO CADENA

//otra manera de concatenar  a travez de operador simplificado
nombre += apellido;
//para evitar que en este caso se concatenen pegados sepuede poner siempre un espacio al final de las palabras
console.log(nombre);

//OBJETO CONSOLE

//console es un objeto que llama al metodo/funcion log, y le pasamos el argumento a mostrar
//lo que se le pone adentro de el parentesis es un argumento

//SIMILITUDES JAVA Y JAVASCRIPT

//definimos variables con let
let x, y; //podemos declarar/definir multiples variables en una sola linea
x = 17, y = 21; //se puede hacer asignacion de varias variables dentro de la misma linea
let z = x + y; //se puede asignar el valor/resultado de una operacion

console.log(z);

//JAVASCRIPT ES KEY SENSITIVE / sensible a mayusculas y minusculas

//LAS VARIABLES/ARGUMENTOS NO PUEDEN INICIAR CON NUMEROS  ---ERROOOOR--

//let 1num = 31; --ERROR--

//si permite, asignar al inicio del nombre el signo $ que habilita que luego haya un numero
let _1num = 31;

//NO SE PUEDEN USAR PALABRAS RESERVADAS DE JS COMO VARIABLES

//let break = "rompe"; --ERROR-- si modificaciones de la palabra, pero NO SE UTILIZAN PARA NO CONFUSIONES
let rompiendo = "rompe";

console.log(_1num);
console.log(rompiendo);

// USO BASICO var, let y const
//a dia de hoy ya no es recomendable utilizar var, ahora se usa let para las variables
//let para variables
//const para las constantes

//se puede crear una variable solo con el identificador, ESTO ES UNA MALA PRACTICA, pero es posible
//ej:
//ejemplo = "Pedro"; //esto nos demuestra que solo con el identificador se puede crear una variable
//MALA PRACTICA
//console.log(ejemplo);

//CONST
const apellido2 = "Funes";
//no se puede alterar una constante
//ejemplos de const: DNI, CUIL, Fecha Nacimiento, const numericas como Pi y e

//apellido2 = "Martinez"; //esto da error porque las const no pueden ser reasignadas/modificadas
console.log(apellido2)


//ACLARACIONES var, let, const

/*
Con var puedes reasignar en calquier momento, ya que este foram parte del ambito global
Un error es que se sobreescriba

se puede reasignar un nuevo valor, o hasta un nuevo tipo (boolean, int, etc)
*/
var nombre = 'Ariel';
nombre = 'Osvaldo';
console.log(nombre);

function saludar(){
    var nombre3 = 'Natalia';
    console.log(nombre3);
}
//console.log(nombre3); //Aqui no lee el dato en la funcion  || funciona bien, no queremos que algo en una funcion no usada cambie nada del resto del codigo


if(true){
    var edad = 34;
    console.log(edad);
}
console.log(edad); //en la  funcion funciono correctamente, en la estructura if fallo || cambio un valor y creo, cuando la estructura no a sido ejectuda
//al crearse una variable dentro de una estructura, deberia estar bloqueada para que se reflejaran los resultados fuera de esa estructura
//no deberia darme acceso a esa variable, es decir deberia decir que la variable no a sido definida
//per esta interpretando que la variable esta definida dentro de la estructura, esto es un fallo
//ya que la informacion dentro de una estructura no deberia filtrarse fuera por ello se deja de utilizar el var, tiene fallas




/*
let: esta puede ser reasignada en cualquier momento
la diferencia es que su ambito es de bloque,
solo disponible dentro de un bloque de llaves
o dentro de una fuuncion


No deja filtrar informacion como var
una variable iniciada en una estructura, no se filtrara fuera

si queremos utilizarla fuera deberemos definirla fuera del bloque

*/

function saludar2(){
    let nombre2 = 'Ariel';
    console.log(nombre2);
}
console.log(nombre2);
if(true){
    let edad2 = 33;
    console.log(edad2);
}
//console.log(edad2);

/*
const se utiliza para valores constantes que no pueden ser reasignados
*/
const fechaNacimiento = 2006;
console.log(fechaNacimiento);
//fechaNacimiento = 2003;
//console.log(fechaNacimiento); //solo se ejecuta el console anterior