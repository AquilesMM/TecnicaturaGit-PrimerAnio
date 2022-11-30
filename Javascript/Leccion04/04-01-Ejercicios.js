// Ejercicio 1: Calcular estacion del año


let mes = 4;
let estacion;

if(mes == 1 || mes == 2 || mes == 12){
    estacion = "Verano";
}
else if(mes == 4 || mes == 5 || mes == 6){
    estacion = "Otoño";
}
else if( mes == 6 || mes == 7 || mes == 8){
    estacion = "Invierno";
}
else if(mes == 9 || mes == 10 || mes == 11){
    estacion = "Primavera";
}
else{
    estacion = "Valor incorrecto"
}
console.log("El valor ingresado corresponde a la estacion de: "+estacion);

// Ejercicio 2: Hora del dia
/*
de 6 a 11 nos saluda: Good Morning
de 12 a 16 nos saluda: Good Afternoon
de 17 a 19 nos saluda: Good Evening
de 20 a 24 nos saluda: Good Night
Trabajaremos con 24 horas
*/
let horaDia = 9;
let mensaje;
if(horaDia >= 6 && horaDia <=11){
    mensaje = "Good Morning";
}
else if(horaDia >= 12 && horaDia <= 16){
    mensaje = "Good afternoon";
}
else if (horaDia >= 17 && horaDia <= 19){
    mensaje = "Good Evening";
}
else if(horaDia >= 20 && horDIa <= 24){
    mensaje = "Good Night";
}
else{
    mensaje = "El valor asignado no es correcto"
}
console.log(mensaje)

//Estrictira switch(la sintaxis es igual a Java)
switch(mes){//no solo se pueden utilizar numeros, tambien cadenas
    //haremos una comparacion de tipo estricto, es decir que se necesitaran casos numericos y solo comparara numericos
    //de otra forma habra error
    case 1: case 2 : case 12:
        estacion = "Verano";
        break;
    case 3: case 4: cacse 5:
        estacion = "Otroño";
        break;
    case 6: case 7: case 8:
        estacion = "Invierno";
        break;
    case 9: case 10: case 11:
        estacion = "Primavera";
        break;
    default :
        estacion= "Valor Incorrecto";
        //No se necesita un break aunque a veceses se suele poner

}
console.log("Bienvenido a la estacion de: "+estacion)


//Evitar repetir tu codigo
//Dry  don't repeat yourself



let days = 'Sabado';
switch (key) {
    case 'Lunes':
        console.log('Hoy es '+days);
        break;
    case 'Martes':
        console.log('Hoy es '+days);
        break;
    case 'Miercoles':
        console.log('Hoy es '+days);
        break;
    case 'Jueves':
        console.log('Hoy es '+days);
        break;
    case 'Viernes':
        console.log('Hoy es '+days);
        break;
    case 'Sabado':
        console.log('Hoy es '+days);
        break;
    case 'Domingo':
        console.log('Hoy es '+days);
        break;
    default:
        console.log('Error en el ingreso del dia de la semana')
        break;
}

//Version mejorada de el ejercicio anterior (ACORTA MUCHO CODIGOOOOO)
/*
aqui creamos un arreglo con los dias de la semana
creamos una funcion donde necesitamos un parametro entero
mostramos mensaje de error en caso de que no este en el parametro
si esta en el parametro mostrara el dia de la semana, n-1 ya que los arreglos empiezan en 0
luego llamamos a la funcion con console log y le pasamos el numero que queremos para indicar el dia entre parentesis
*/
let days2 = ['Lunes', 'Martes', 'Miercoles', 'Jueves', 'Viernes', 'Sabado', 'Domingo'];
function getDay(n){
    if(n<1 || n>7){
    throw new Error('out of range');
    }
    return days2[n-1];
}

//Hacer un ejercicico similar al que esta echo, pero ahora con los meses del año, debes hacerlo con la estructura switch y luego
//con la funcion en la pcion ejorada

let moth = 11;
switch (moth) {
    case 1:
        console.log('Es Enero');
        break;
    case 2:
        console.log('Es Febrero');
        break;
    case 3:
        console.log('Es Marzo');
        break;
    case 4: 
        console.log('Es Abril');
        break;
    case 5:
        console.log('Es Mayo');
        break;
    case 6:
        console.log('Es Junio');
        break;
    case 7:
        console.log('Es Julio');
        break;
    case 8:
        console.log('Es agosto');
        break;
    case 9:
        console.log('Es Septiembre');
        break;
    case 10:
        console.log('Es Octurabre');
        break;
    case 11:
        console.log('Es Noviembre');
        break;
    case 12:
        console.log('Es diciembre');
        break;
    default:
        console.log('Error con el mes introducido')
        break;
}
let moth2 = ['Enero', 'Febrero', 'Marzo', 'Abril', 'Mayo', 'Junio', 'Julio', 'Agosto', 'Septiembre', 'Octubre', 'Noviembre', 'Diciembre'];
function getmoth(n){
    if(n<1 || n>12){
    throw new Error('out of range');
    }
    return moth[n-1];
}
console.log(getmoth(1))