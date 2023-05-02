
package ejerciciosvacaciones;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejerciciosvacaciones {

    /*
    Ejercicio 4: Leer 10 numeros enteroos, guardaros en un arreglo.
    Debemos mostrarlos en el siguiente orden: el primero, el ultimo,
    el segundo, el penultimo, el tercero, etc.
    */
    
    public static void main(String[] args) {
        
        double arreglo[] = new double[10];
        int aux = 0;
        int aux2 = 0;
        int aux3 = 0;
        
        for (int i = 0; i < arreglo.length; i++) {
                arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor: "));
        }
        
        for (int i = 0; i < arreglo.length -1 ; i++) {
            aux += 1;
            if(aux %2 == 0){
                aux2 += 1;
                JOptionPane.showMessageDialog(null,arreglo[arreglo.length - aux2]);
                
            }else{
                aux3 += 1;
                JOptionPane.showMessageDialog(null, arreglo[aux3]);
            }
        }
        
        //UNA MANERA MUCHO MEJOR Y MAS EFICIENTE DE HACERLO
                Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];

        // Leer los 10 números enteros y guardarlos en el arreglo
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese un número entero: ");
            numeros[i] = sc.nextInt();
        }

        // Mostrar los números en el orden indicado
        for (int i = 0; i < numeros.length / 2; i++) {
            System.out.print(numeros[i] + " ");
            System.out.print(numeros[numeros.length - 1 - i] + " ");
        }
        
        // Si hay un número central, mostrarlo
        if (numeros.length % 2 != 0) {
            System.out.print(numeros[numeros.length / 2]);
        }

        
        
        // EJEMPLO CON UNA ESTRUCTURA FOR MAS EFICIENTE
                //int[] numeros = new int[10];

        // Leer los 10 números enteros y guardarlos en el arreglo
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese un número entero: ");
            numeros[i] = sc.nextInt();
        }

        // Mostrar los números en el orden indicado
        for (int i = 0, j = numeros.length - 1; i < j; i++, j--) {
            System.out.print(numeros[i] + " ");
            System.out.print(numeros[j] + " ");
        }

        // Si hay un número central, mostrarlo
        if (numeros.length % 2 != 0) {
            System.out.print(numeros[numeros.length / 2]);
        }

        sc.close();
   
    }
    
}
