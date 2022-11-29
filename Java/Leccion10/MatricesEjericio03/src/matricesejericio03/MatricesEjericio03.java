
package matricesejericio03;
//Ejercicio 3: Crear y cargar una matriz de tamaño 3x3, transponerla y mostrarla

import java.util.Scanner;


public class MatricesEjericio03 {
    public static void main(String[] args) {
    
        Scanner entrada = new Scanner(System.in);
        int matriz [][] = new int [3][3];
        
        System.out.println("Rellenar la matriz: ");
        //cargamos valores en la matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Matriz ["+i+"] ["+j+"]: ");
                matriz[i][j] = entrada.nextInt();
            }
            
        }
        System.out.println(); //salto de linea
        
        
        
        //IMPORTANTE
        //para mostrar con fomrato matriz, es decir que luego de cada iteracion no se muestre en 
        //la fila de abajo la siguiente posicion, lo que hacemos es quietar el ln a print de sout
        
        System.out.println("matriz original");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j]+" "); //Imprimimos la matriz 
            } 
            System.out.println();
        }
        System.out.println();
        
        
        //Matriz Transpuesta
        System.out.println("matriz transpuesta");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[j][i]+" "); //Imprimimos la matriz 
            } 
            System.out.println();
        }
        System.out.println();
    }
    
}
