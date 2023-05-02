package arreglos_ejercicio_1;

import javax.swing.JOptionPane;


public class Arreglos_ejercicio_1 {
    /*
    Ejercicio 1: Leer 5 numeros, guardarlos en un arreglo y mostrarlos en el mismo orden introducido
    */
    
    public static void main(String[] args) {
        
        int numeros[] = new int [5];
        
        for(int i = 0; i < numeros.length; i++){
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el "+i+"° numero"));
        }
        for(int i = 0; i < numeros.length; i++){
            JOptionPane.showMessageDialog(null, "numeros ["+i+"] = " + numeros[i] );
            
            /*IMPRESION CON FOR MEJORADO: (PROFE)
            system.out.println("El aregglo tiene los siguientes elementos")
            for(float(o int) i:numeros){
                system.out.println(i+" ")
            solo sirve para mostrar los elementos del arreglo
            }
            
            */
        }
    }
    
}
