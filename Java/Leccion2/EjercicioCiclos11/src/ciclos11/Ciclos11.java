/*
Ejercicio 11: Diseñar un programa que muestre el producto
de los 10 primeros números impares
Hacerlo con JOptionPane
*/
package ciclos11;

import javax.swing.JOptionPane;

public class Ciclos11 {
    public static void main(String[] args) {
        
        
        int total = 1,contador = 0;
        while (contador < 20){
            contador ++;
            if (contador % 2 != 0){
                total *= contador;
            }
        }
        JOptionPane.showMessageDialog(null, "El producto de numeros impares es: "+total);
        //1 3 5 7 9 11 13 15 17 19
        
        
        //EJERCICIO PROFE
        
        long producto = 1;
        for (int i = 1; i<=20; i+=2){ //define i = 1, mientras i<= 20 recorre y con paso de 2 (i+=2)
            producto*=i;
            //esta resolucion es mas simple, y mas eficiente ya que en vez de recorrer todos los numeros solo va de 
            //impar en inmpar
        }
        JOptionPane.showMessageDialog(null,"El total es: "+ producto);
    }
}
