//creacion de Arreglos / arrays
/*
en javascript los arreglos son de tipo object que permite almacenar varios valores
hay diversas formas de declarar un arreglo
veremos las diversas formas y las mejores practicas a dia de hoy

NO HAY QUE OLVIDAR QUE LOS ARREGLOS ALMACENAN DE CUALQUIER TIPO DE DATO
*/
//let autos = new Array('Ferrari', 'Renault', 'BMW'); //esta forma es antigua, ya no se utiliza

//SINTAXIS ACTUAL
/*
podemos asignar la palabra const, y asignar las referencias del arreglo
por referencia nos referimos al tipo de dato del arreglo
con esto nos referimos a la referencia de memoria donde se encuentra el arreglo
por ello utilizamos el const ya que la referencia de memoria de este arreglo ya no se modificara
lo que podemos modificar es el contenido del arreglo

antes lo que utilizabamos como referencia era new, ahora const
*/
const autos = ['Ferrari', 'Renault', 'BMW']
console.log(autos);

//Recorremos lo elementos de un arreglo
//si queremos recorrer todos los elementos de una sola vez, utilizamos el ciclo for
console.log(autos[0]) //mostramos el elemento que queramos

for (let i = 0; i < autos.length; i++) {
    console.log(i+ ": " +autos[i]);
    
}

//modificamos los elementos del arreglo

autos[1] = 'Volvo';
console.log(autos[1]);


//Agregar nuevos valores al arreglo
//para ello utilizamos el metodo push

autos.push('Audi');
console.log(autos);

//otras formas de agregar elementos al arreglo
//para ello utilizamos el largo del arreglo
//le decimos que al final de nuestro arreglo le ingrese otro elemento

autos[autos.length] = 'Porche';
console.log(autos);

//Forma numero tres (se debe tener mas cuidado y detalle)
//se agrega el elemento al final, es decir uno mas del ultimo elemento, el cuidado es que si se ingresa el valor
//en un numero mucho mas adelante, todos los espacios en el medio entre el ultimo elemento y el nuevo es decir
//si el ultimo llega al lugar 4 y yo agrego un elemento en el 10, todos los espacios en el medio se guardaran vacios
//y en ello ocupara memoria en nada.

autos[6] = 'Renault';

//como preguntar si es un array o arreglo
//si nosotros utilizaramos el typeof este nos diria que es un tipo object

//para averiguar si es o no un arreglo utilizamos lo siguiente
//para ello utilizamos la clase Array y usamos el metodo isArray para preguntar si es un array, y entre parentesis
//le pasamos el elemento del que deseamos saber si es o no un array. El resultado sera Boolean

console.log(Array.isArray(autos));

//segunda forma
//aqui lo que hacemos es preguntar si el elemento es una instancia de la clase Array. Tambien devuelve boolean
console.log(autos instanceof Array);

