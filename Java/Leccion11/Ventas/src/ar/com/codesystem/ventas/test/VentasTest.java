
package ar.com.codesystem.ventas.test;

import ar.com.codesystem.ventas.*;

public class VentasTest {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Pantalon", 9500);
        Producto producto2 = new Producto("Campera", 29900);
        Producto producto3 = new Producto("Camisa", 15000);
        Producto producto4 = new Producto("Remera", 6500);
        Producto producto5 = new Producto("Medias", 2500);
        Producto producto6 = new Producto("short", 8500);
        Producto producto7 = new Producto("Remera", 6500);
        Producto producto8 = new Producto("Musculosa", 5500);
        Producto producto9 = new Producto("maya", 11000);
        Producto producto10 = new Producto("camiseta", 16000);
        
        Orden orden1 = new Orden();
        //Agregamos productos al arreglo
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.agregarProducto(producto3);
        orden1.agregarProducto(producto4);
        orden1.mostrarOrden();
        
        //Tarea:
        //Crear mas objetos de tipo Producto = 10
        //Crear mas objetos de tipo Orden = 2
        Orden orden2 = new Orden();
        orden2.agregarProducto(producto5);
        orden2.agregarProducto(producto6);
        orden2.agregarProducto(producto7);
        orden2.mostrarOrden();
        
        Orden orden3 = new Orden();
        orden3.agregarProducto(producto7);
        orden3.agregarProducto(producto8);
        orden3.agregarProducto(producto9);
        orden3.mostrarOrden();
        
    }
    
     
    
}
