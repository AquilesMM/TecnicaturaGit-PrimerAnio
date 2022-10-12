// Tipos de Datos en JavaScript
/*
La sintaxis en lo que es comentarios
es muy similar a la de Java
realmente diriamos que es identica
*/

var nombre = 'Ariel'; //Tipo Str
console.log(nombre);

var numero = 3000; // Tipo Numérico
console.log(numero);

var objeto = {
    nombre : "Ariel",
    apellido : "Betancud",
    telefono : "2614567893"
}

console.log(objeto);

//Tipo de dato boolean
var bandera = true;
console.log(typeof bandera);

//Tipo de dato funcion
function miFuncion(){}
console.log(typeof miFuncion);

//Tipo de dato symbol
var simbolo = Symbol("Mi simbolo");
console.log(simbolo);

//Tipo de dato clase
class Persona{
    constructor(nombre,apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
}

console.log(typeof Persona);

//Tipo de dato undefined
//este tipo de dato lo tenemos automaticamente cuando definimos una variable
//cualquier tipo de dato va a recibir este tipo de dato cuando no esta inicializada
// es decir cuando esta iniciada pero no se le a asignado ningun valor, es decir por default Js le asigna este tipo de dato

//TAMBIEN PODEMOS ASIGNARLE NOSOTROS TIPO UNDEFINED EJ:   x = undefined; (SIN VAR)
//undefined = variable no definida

var x;
console.log(typeof x); //al verlo en consola veremos que es tipo undefined, ni siquiera tenemos que poner typeof
//al usar typeof veremos undefined pero con texto oscuro, antes estaba gris claro porque era asignado por Js por default sin preguntar


//null: significa ausencia de valor, es decir que no tiene nada dentro no es undefined ni nada, TOTALMENTE VACIA
//SIN ASIGNACION DE NINGUN TIPO DE DATO

//parecido a undefined pero se comporta de manera distinta

var y = null; //null NO ES UN TIPO DE DATO pero SU ORIGEN ES OBJECT
//es decir que null esta considerado de tipo objeto

console.log(typeof y); //sin typeof saldra null. Preguntando nos dira que es tipo object

//no es un tpo de dato pero trabaja con su origen que es tipo object


//Tipo de dato array u Empty String

//En Js existen los arreglos (listas). En Js son de tipo Object
//para definir un arreglo, lo hacemos con corchetes
//puede contenet cualquier tipo de dato
var autos = ['Citroen','Audi','BMW','Ford'];
console.log(autos);
console.log(typeof autos); //es de tipo objeto

//Empty string 
//par hacer valores/cadenas vacias simplemente abrimos los comillas y dejammos vacio
//caso contrario, de simplemente no poner nada y dejar la variable vacia, esta sera undefined
var z = "";
console.log(z); //Sera un empty string (cadena vacia)
console.log(typeof z); //nos dira que es de tipo string

