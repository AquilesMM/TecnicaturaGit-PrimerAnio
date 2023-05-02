package arreglos_ejercicio_3;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Arreglos_ejercicio_3 {
    /*
    Ejercicio 3: Leer 5 numeros por teclados, almavenarlos por un arreglo y a continuacion
    realizar la media de los numeros  positivos, la media de los negativos y contar el numero de ceros
    */
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        float numeros[] = new float [5], cantidadCeros = 0, mediaNegativos = 0, mediaPositivos = 0, cantidadNegativos = 0, cantidadPositivos=0;
        
        
        for(int i = 0; i < numeros.length; i++){
            System.out.println("Ingresar el "+(i+1)+"° numero");
            numeros[i] = Entrada.nextFloat();
        }
        for(int i = (numeros.length-1); i >=0 ; i--){
            if(numeros[i] > 0){
                cantidadPositivos++;
                mediaPositivos += numeros[i];
                
            }else if(numeros[i] < 0){
                cantidadNegativos++;
                mediaNegativos += numeros[i];
                
                
            }else{
                cantidadCeros++;
            }
            System.out.println("Media de numeros Positivos: "+(mediaPositivos/cantidadPositivos));
            System.out.println("Media de numeros Negativos: "+(mediaNegativos/cantidadNegativos));
            System.out.println("Cantidad de ceros: "+cantidadCeros);
                    
                    
                    
        }
            
        
        
        
    }
    
}
