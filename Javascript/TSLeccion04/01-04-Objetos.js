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
    edad: 30,
    //Agregar metodos a los objetos
    nombreCompleto: function(){//metodo o funcion
        return this.nombre +' '+ this.apellido;
    } //podemos agregar , al final de la llave y poner mas atributos o metodos


    //utilizamos el operador this. este apunta al objeto al cual
    //se esta trabajando, es decir al que esta dentro del mismo bloque
    //no podemos apuntar a nada que este fuera del objeto. 
    //puede dar la opcion que en vez del this del el nombre del propio objeto, pero esto dara error
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