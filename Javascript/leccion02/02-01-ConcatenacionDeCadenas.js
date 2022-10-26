var nombre = 'Jose';
var apellido = 'Montes';
var nombreCompleto = nombre+' '+apellido; //esta es una concatenacion
console.log(nombreCompleto);
var nombreCompleto2 = 'Aquiles'+' '+'Martinez'; //otra forma de concatenar
console.log(nombreCompleto2);
var juntos = nombre + 219; //lee  de izq a der siguiendo la cadena lee el numero como str
console.log(juntos);
juntos =  nombre + 78 + 17; // seguira leyendo de iz a der tomando los numeros como str}
console.log(juntos)
juntos = 78 + 17 + nombre; //en este caso, al ser primero numeros, los sumara y luegos los concatenara como s fueran str
console.log(juntos)
//una de las cosas quue podemos hacer para diferenciar en caso de que queramos sumar o concatenar, en distinto orden es el uso de parentesis
juntos = nombre + (78+17)//aqui aunque este primero un str, pedimos que se sume primero
console.log(juntos)

//A TODO LO ANTERIOR SE LO LLAMA CONTEXTO STRING o CONTEXTO CADENA

//otra manera de concatenar  a travez de operador simplificado
nombre += apellido
//para evitar que en este caso se concatenen pegados sepuede poner siempre un espacio al final de las palabras
console.log(nombre)