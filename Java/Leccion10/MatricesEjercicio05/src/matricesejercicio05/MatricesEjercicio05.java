package matricesejercicio05;

import java.util.Scanner;

/*
Ejercicio 5: Crear y cargar una matriz de n x m. Mostrar la suma de cada fila y cada columna
*/
public class MatricesEjercicio05 {

    public static void main(String[] args) {
       
        Scanner entrada  = new Scanner(System.in);
        
        //pedimos e ingresamos filas y columnas
        System.out.println("Ingresar cantidad de filas");
        int filas = entrada.nextInt();
        System.out.println("Ingresar la cantidad de columnas");
        int columnas = entrada.nextInt();
        
        int matriz [][] = new int [filas][columnas];
        
        int sumaFila [][] = new int [filas][1];
        int sumaColumna [][] = new int [1][columnas];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Ingrese el valor de la posicion: ["+i+"] ["+j+"]");
                matriz[i][j]  = entrada.nextInt();
                sumaColumna [0][j] = 0;
                
            }
            sumaFila[i][0]  = 0;
        }
        
        for (int i = 0; i < (matriz.length); i++) {
            for (int j = 0; j < (matriz[i].length); j++) {
                System.out.print(matriz[i][j]+" ");
                sumaFila [i][0] += matriz[i][j];
                sumaColumna[0][j] += matriz[i][j];
            }
            System.out.println("");
        }
        
//        for (int i = 0; i < matriz.length; i++) {
//            for (int j = 0; i < matriz[i].length ; j++) {
//                sumaColumna[0][j] += matriz[i][j];
//                
//            }
//        }

        //Imprimir sumaColumna
        System.out.println("sumaColumna");
        for (int j = 0; j < (sumaColumna[0].length); j++) {
            System.out.print(sumaColumna[0][j]+" ");
        }
            
        //Imprimir SumaFila
        System.out.println("");
        System.out.println("sumaFila");
        for (int i = 0; i < (sumaFila.length); i++) {
            System.out.println(sumaFila[i][0]+" ");
        }
        
    }
}
