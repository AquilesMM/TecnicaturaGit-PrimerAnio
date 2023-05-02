
package test;

import domain.Persona;

public class TestMatrices {
    public static void main(String[] args) {
         //Definimos una matriz
         //INGRESO MANUAL BASICO
         int edades [] [] = new int [3][2];
         /*
         -------------------------------------------------
         Lado izquierdo: Lo que hacemos es dedinir la variable
         todo eso es solo una definicion
         
         
         Lado derecho: instanciamos la matriz y ponemos de que tipo es. Cuantas filas tienes
         y luego cuantas columnas
         primer corchete filas, segundo columnas
         
         -------------------------------------------------------
         Tanto arreglos como matrices son de tipo object
         */
         System.out.println("edades = " + edades);
         //como no hemos asignado nada hasta ahora, veremos al objeto y su espacio de memoria
         
         //MODIFICAR VALORES DE MATRIZ (manual)
         //indicamos a que posicion queremos indicarle un valor
         edades [0][0] = 5;
         edades [0][1] = 7;
         edades [1][0] = 8;
         edades [1][1] = 4;
         edades [2][0] = 3;
         edades [2][1] = 9;
         
         System.out.println("edades[0][0] = " + edades[0][0]);
         System.out.println("edades[0][0] = " + edades[0][1]);
         System.out.println("edades[1][0] = " + edades[1][0]);
         System.out.println("edades[1][1] = " + edades[1][1]);
         System.out.println("edades[2][0] = " + edades[2][0]);
         System.out.println("edades[2][1] = " + edades[2][1]);
         
         //RECORRER MATRIZ CON CICLO FOR anidado para filas y columnas (interno columnas externo fulas)
         System.out.println("Recorremos la matriz a travez del ciclo for");
         for (int fila = 0; fila < edades.length; fila++) {
             
             //lo que podemos ver es que en el caso de las matrices, por defecto .length toma el valor de la cantidad de filas
             for (int col = 0; col < edades[fila].length; col++) {
                 //como vimos que .length toma el largo de las filas, en este caso espeficicamos que queremos el largo de cada fila en particular
                 //es decir la cantidad de columnas
                 System.out.println("edades = "+fila+"-"+col+": "+edades[fila][col]);
                 //aqui mostramos que fila y que columna y a continuacion el valor de esta poosicion
             }
         }
         
         //SINTAXIS SIMPLIFICADA DE MATRIZ
             
         //sintaxis clasica
         //String frutas [][] = new String[3][2];
             
         //Sintaxis simplificada
         //en esta dejamos registrado los valores de todas las filas y columnas en codigo duro
        String frutas [][] = {{"Limon", "Pomelo"}, {"Ciruela", "Kiwi"}, {"Banana", "Manzana"}};
            
        
             //mostramos sintaxis simplificada
             
         imprimir(frutas); //usamos el metodo para mostrar matriz
         
//         for (int i = 0; i < frutas.length; i++) {
//      
//             for (int j = 0; j < frutas[i].length; j++) {
//                 System.out.println("edades = "+i+"-"+j+": "+frutas[i][j]);
//                 
//             }
//         }
         
         //EN UNA MATRIZ DE OBJETOS
         //utilizamos clase persona
         
         //Creamos la matriz de objetos
         Persona personas[][] = new Persona [2][3];
         
         //asinamos valores a la matriz (manualmente / se puede con iteraciones)
         personas[0][0] = new Persona("Aquiles"); //creamos un objeto, instanciando el objeto en la posicion deseada dentro de la matriz
         personas[0][1] = new Persona("Mily");
         personas[0][2] = new Persona("Juan");
         personas[1][0] = new Persona("Gera");
         personas[1][1] = new Persona("Pablo");
         personas[1][2] = new Persona("Lucas");
         imprimir(personas);
         //como es matriz de objetos mostrara el valor o lo que se le haya asignado al objeto y tattmbien mostrara su espacio de memoria
    }
    
    //Creamos un metodo para mostrar matrices de tipo objetos
    public static void imprimir(Object matriz[][]){ //no necesitamos espeficicar filas y columnas (a matriz entre parentesis)
        //ya que la variable va a apuntar a la referencia del objeto  matriz que ya hemos creado, es como definir la variable de lado izquierdo
        //aunque no sea de objetos la matriz la mostrara, ya que todas las matrices son de tipo object
        
        for (int i = 0; i < matriz.length; i++) {
      
             for (int j = 0; j < matriz[i].length; j++) {
                 System.out.println("edades = "+i+"-"+j+": "+matriz[i][j]);
                 
             }
         }
        
        //este metodo nos permite trabajar con objetos ya que la clase persona hereda de object, metodo muy util
        
    }
    
}
