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