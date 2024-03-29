package matricesejercicio05;

import java.util.Scanner;
import javax.swing.JOptionPane;
/*
Ejercicio 5: Crear y cargar una matriz de n x m. Mostrar la suma de cada fila y cada columna
*/
public class EjercicioProfe {
    
    public static void main(String[] args) {
        
        Scanner entrada  = new Scanner(System.in);
        int matriz[][], nFilas, nCol, sumaFilas, sumaCol;
        int posFila, posCol;
        
        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de filas: "));
        nCol = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de columnas: "));
        
        
        matriz = new int [nFilas][nCol];
        int filas[] = new int [nFilas];
        int columnas[] = new int [nCol];
        System.out.println("Rellenado de matriz: ");
        
        //Rellenado de matriz
        for (int i=0;i<nFilas;i++){
            for (int j=0;j<nCol;j++){
                System.out.println("Matriz ["+i+"] ["+j+"]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }
        
        //Sumando las filas
        posFila = 0;
        for (int i=0;i<nFilas;i++){
            sumaFilas=0;
            for (int j=0;j<nCol;j++){
                sumaFilas += matriz[i][j];
            }
            filas[posFila] = sumaFilas;
            posFila++;
        }
        
        //Suma las columnas
        posCol = 0;
        for (int i=0;i<nCol;i++){
            sumaCol = 0;
            for (int j=0;j<nFilas;j++){
                sumaCol += matriz[i][j];
            }
            columnas[posCol] = sumaCol;
            posCol++;
        }
        System.out.println("\n La suma de filas es: ");
        for (int i=0;i<nFilas;i++){
            System.out.println(filas[i]+" - ");
        }
        System.out.println("");
        
                System.out.println("\n La suma de columnas es: ");
        for (int i=0;i<nCol;i++){
            System.out.println(columnas[i]+" - ");
        }
        System.out.println("");
    }
}
