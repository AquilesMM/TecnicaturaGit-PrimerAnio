/*
Ejercicio 12: Pedir un número y calcular su factorial
Hacerlo con las dos clases, Scanner y JOptionPane
*/
package ciclos12;

import java.util.Scanner;

//import javax.swing.JOptionPane;


public class Ciclos12 {
    public static void main(String[] args) {
        
        //int factorial = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero para calcular su factorial"));
        //long total = 1;
       // for (int i = 1; i <= factorial; i++){
         //   total *= i;
        //}
        //JOptionPane.showMessageDialog(null, "El factorial de: "+factorial+" es: "+total);
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite un numero ");
        int factorial = Integer.parseInt(entrada.nextLine());
        long total = 1;
        for (int i = 1; i <= factorial; i++){
            total *= i;
        }
        System.out.println("El factorial de: "+factorial+" es: "+total);
        
        
        
        
        /*
        //Scanner entrada = new Scanner(System.in);
        long factorial = 1;
        //System.out.println("Digite un número: ");
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        for(int i=1; i<=numero;i++){
            factorial *= i;
        }
        //System.out.println("\nEl factorial del número ingresado es: "+factorial);
        JOptionPane.showMessageDialog(null, "El factorial del número ingresado es: "+factorial);
        */        
    }
}
