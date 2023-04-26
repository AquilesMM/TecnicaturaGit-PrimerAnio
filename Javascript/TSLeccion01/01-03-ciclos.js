//while

let contador = 0;
while(contador < 3){
    console.log(contador);
    contador++;
}
console.log("Fin de ciclo while");

//do while
let conteo = 0;
do{
    console.log(conteo);
    conteo++;
}while(conteo < 3);
console.log("fin de ciclo do while"); 

//for
for(let contando = 0;contando < 3; contando++ ){ //se pueden definir multiples variables en 1ra posicion, separadas por una coma
    console.log(contando);
}
console.log('fin del ciclo for');

//palabra reservada break
for(let contando = 0; contando <= 10; contando++){
    if (contando % 2 == 0){
        console.log(contando);
        break; //Esto hara que solo muestre el primer numero par ya que break rompera el ciclo for
        //podemos poner una etiqueta luego de break
        //esto hara que rompamos todas las estructuras desde donde este posicionada la etiqueta
    }

}
console.log("Terina el ciclo al encontrar los pares");

//palabra reservada continue //USO DE ETIQUETAS/LABELS
//la programacion con etiquetas se denomina programacion go to
//no es recomendada pero es importante conocerla

inicio:
for(let contando = 0;contando <= 10; contando++){
    if(contando % 2 != 0){
        continue inicio; 
        // continue lo que hace es pasar a la siguiente iteracion del ciclo
        //otro uso es haber puesto una etiqueta en algun punto y nombrarla luego de continue.
        //esto hara que salte a esa parte del codigo 
        //las etiquetas tambien pueden ser utilizadas con break
    }
    console.log(contando);
}
console.log("Fin del ciclo for con continue");

