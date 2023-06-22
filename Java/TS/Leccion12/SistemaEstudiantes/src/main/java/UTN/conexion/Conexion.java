package UTN.conexion;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    //metodo para poder conectarnos a la base de datos de mysql
    public static Connection getConnection() {
        //Creamos un metodo para la conexion de tipo connection
        Connection conexion = null; //inicializamos l variable de conecxion de tipo conection en null
        //variable para conectarnos a la base de datos

        var baseDatos = "estudiantes2022";
        var url = "jdbc:mysql://localhost:3306/"+baseDatos; //es esa url
        var usuario = "rood"; //usuario por defecto
        var password = "admin";

        //cargamos la clase del driver de mysql en memoria
        //se hace de la siguiente forma
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(url, usuario, password);
        } catch(ClassNotFoundException | SQLException e){
            System.out.println("Ocurrio un error en la conexion "+e.getMessage() );
        }//fin catch
        return conexion;
    }//Fin metodo Connection
}
