//Ejercicio para encontrar números pares

let parImpar = 10;
if (parImpar % 2 == 0){
    console.log("El numero es PAR");
}else{
    console.log("El numero es IMPAR");
}


//Ejercicio es mayot de edad

let persona = 19;
if (persona >= 18){
    console.log("La persona es mayor de edad")
}
else{
    console.log("La persona es menor de edad")
}


//Ejercicio dentro de un rango
let dentroRango = 5; //aqui iremos cambiando el valor
let valMin = 0, valMax = 10;

if( dentroRango >= valMin && dentroRango<= valMax){
    console.log("El valor esta dentro del rango")
}else{
    console.log("El valor esta fuera del rago")
}

//Ejercicio: Si el padre puede asistir al juego de su hijo

let vacaciones = true, diadescanso = false;
if(vacaciones || diadescanso){
    console.log("Puede asistir al juego de su hijo")
}
else{
    console.log("No puede asistir al juego de su hijo")
}

//Operador ternario

//es lo mismo que vimos en java, por lo que solo sera un ejercicio para ejemplo
//recordar que solo es para comprovaciones pequeñas y cortas, si se extiende usar if else normal

let resultado2 = 3 > 2 ? "Verdadero" : "Falso";
console.log(resultado2)

let parImpar2 = 5 % 2 == 0 ? "par" : "Impar"
console.log(parImpar2)


//Convertir de String a Number
//usamos funcion Number para hacer la conversion
//bastante utilizado 
//pero si la cadena tiene alguna letra habra un error pasando a ser NaN en vez de un numero

let miNumero = "20"; //Es una cadena
console.log(typeof miNumero);  //muestra que es cadena

let edad2 = Number(miNumero); //usamos la funcion Number para pasar de String a Number 
console.log(typeof edad2) //muestra que paso a ser Number
console.log(edad2)

//Funcion isNaN (is Not a Number) para ver si es o no un numero

//esta funcion sirver para verificar el valor de una variable que sea de tipo numerica
//funcion que compara numero con numero y nos devuelve un boolean

if(isNaN(edad2)){
    console.log("Esta variable no contiene solo numeros")
}
else{
    if(edad2 >= 18){
        console.log("Puede votar")
    }
    else{
        console.log("No puede votar")
    }
}


//mismo ejercicio en ternario sin isNaN

let resultado3 = edad2 >= 18 ? "Puede votar" : "No puede votar"
console.log(resultado3)



