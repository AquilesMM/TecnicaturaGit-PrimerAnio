package arreglos_ejercicio_2;

import javax.swing.JOptionPane;

public class Arreglos_ejercicio_2 {

    /*
    Ejercicio 2: Leer 5 numeros, guardarlos en un arreglo y mostrarlos en el orden inverso al introducido
    */
    public static void main(String[] args) {
                int numeros[] = new int [5];
        
        for(int i = 0; i < numeros.length; i++){
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el "+i+"° numero"));
        }
        for(int i = (numeros.length-1); i >=0 ; i--){
            JOptionPane.showMessageDialog(null, "numeros ["+i+"] = " + numeros[i] );
        }
            
            /*IMPRESION CON FOR MEJORADO: (PROFE)
            system.out.println("El aregglo tiene los siguientes elementos")
            for(float(o int) i:numeros){
                system.out.println(i+" ")
            solo sirve para mostrar los elementos del arreglo
            }
            
            */
        
        
        
    }
    
}
