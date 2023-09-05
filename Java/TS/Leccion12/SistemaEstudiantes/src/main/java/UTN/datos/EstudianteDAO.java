package SistemaEstudiantes.src.main.java.UTN.datos;

import SistemaEstudiantes.src.main.java.UTN.dominio.Estudiante;

import static SistemaEstudiantes.src.main.java.UTN.conexion.Conexion.getConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EstudianteDAO {

    //Metodo Listar
    public List<Estudiante> listarEstudiantes() {
        List<Estudiante> estudiantes = new ArrayList<>();

        //Creamos algunos objetos que son necesarios para comunicarnos con la BD

        PreparedStatement ps; //renombramos en ps  |  INTRODUCE LA SENTENCIA A BD
        //El objeto Statement nos sirve como su nombre indica para preparar la sentencia SQL que vamos a
        //ejecutar hacia la BD


        ResultSet rs;//renombramos a rs | OBTIENE EL RESULTADO DE BD
        //ResultSet es un objeto que nos permite almacenar el resultado obtenido de lo que es la base de datos


        //Creamos un objeto de tipo connection/conexion
        //Este objeto es de nuestra clase cconexion, no de los packetes de java, porque ya existe una, para ello
        //importamos nuestra clase manualmente
        Connection con = getConnection();

        String sql = "SELECT * FROM estudiantes2022 ORDER BY idestudiantes2022";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {//mientras haya registros que iterar .next(al siguiente)
                var estudiante = new Estudiante();
                estudiante.setIdEstudiante(rs.getInt("idestudiantes2022"));
                estudiante.setNombre(rs.getString("nombre"));
                estudiante.setApellido(rs.getString("apellido"));
                estudiante.setTelefono(rs.getString("telefono"));
                estudiante.setEmail(rs.getString("email"));
                //Falta agregarlo a la lista
                estudiantes.add(estudiante);
            }
        } catch (Exception e) {
            System.out.println("Ocurrio un error al seleccionar datos " + e.getMessage());
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                System.out.println("Ocurrio un error al cerrar la conexion " + e.getMessage());
            }
        }
        return estudiantes;
    }//Fin metodo listar


    //Metodo por id -> find by id
    public boolean buscarEstudiantesPorId(Estudiante estudiante) {
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConnection();
        String sql = "SELECT * FROM estudiantes2022 WHERE idestudiantes2022=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, estudiante.getIdEstudiante());
            rs = ps.executeQuery();
            if (rs.next()) {
                estudiante.setNombre(rs.getString("nombre"));
                estudiante.setApellido(rs.getString("apellido"));
                estudiante.setTelefono(rs.getString("telefono"));
                estudiante.setEmail(rs.getString("email"));
                return true;
            }//Fin if
        } catch (Exception e) {
            System.out.println("Ocurrio un error al buscar estudiante: " + e);
        }//Fin catch
        finally {
            try {
                con.close();
            } catch (Exception e) {
                System.out.println("Ocurrio un error al cerrar la conexion " + e.getMessage());
            }//Fin catch

        }//Fin finally
        return false;
    }


    //Metodo agregar un nuevo estudiante
    public boolean agregarEstudiante(Estudiante estudiante) {

        PreparedStatement ps;
        Connection con = getConnection();
        String sql = "INSERT INTO estudiantes2022 (nombre, apellido, telefono, email) VALUES (?, ?, ?, ?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, estudiante.getNombre());
            ps.setString(2, estudiante.getApellido());
            ps.setString(3, estudiante.getTelefono());
            ps.setString(4, estudiante.getEmail());
            ps.execute(); //no usamos executeQuery porque no vamos a leer informacion, sino solo insertarla
            return true; //el metodo termina en el return, por lo que si se ejecuta este, no se ejecutara el otro
        } catch (Exception e) {
            System.out.println("Ocurrio un error al agregar estudiante: " + e.getMessage());
        }//Fin catch
        finally {
            try {
                con.close();
            } catch (Exception e) {
                System.out.println("Ocurrio un error al cerrar la conexion: " + e.getMessage());
            }//fin catch
        }//Fin finally
        return false;
    }


    //Metodo para modificar estudiante
    public boolean modificarEstudiante(Estudiante estudiante) {
        PreparedStatement ps;
        Connection con = getConnection();
        String sql = "UPDATE estudiantes2022 SET nombre=?, apellido=?, telefono=?, email=? WHERE idestudiantes2022=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, estudiante.getNombre());
            ps.setString(2, estudiante.getApellido());
            ps.setString(3, estudiante.getTelefono());
            ps.setString(4, estudiante.getEmail());
            ps.setInt(5, estudiante.getIdEstudiante());
            ps.execute();
            return true;
        } catch (Exception e) {
            System.out.println("Error al modificar estudiante: " + e.getMessage());
        }//Fin catch
        finally {
            try {
                con.close();
            } catch (Exception e) {
                System.out.println("Ocurrio un error al cerrar la conexion: " + e.getMessage());
            }//Fin catch
        }//Fin finally
        return false;
    }//Fin metodo modificar estudiante

    //Eliminar Estudiante
    public boolean eliminarEstudiante(Estudiante estudiante) {
        PreparedStatement ps;
        Connection con = getConnection();
        String sql = "DELETE FROM estudiantes 2022 WHERE idestudiantes2022=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, estudiante.getIdEstudiante());
            ps.execute(); //no utilizamos el excecutequery porque solo vamos a eliminar y no recibiremos nada, solo enviamos el dato
            return true;
        } catch (Exception e) {
            System.out.println("Error al eliminar estudiante: " + e.getMessage());
            return false; //en el caso de no haber podido eliminar ningun estudiante, retornara falso
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                System.out.println("Error al cerrar la conexion: " + e.getMessage());
            }

        }
    }//Fin metodo eliminar estudiante

    public static void main(String[] args) {
        var estudianteDao = new EstudianteDAO();


        //Modificar estudiante
        //var estudianteModificado = new Estudiante(1, "Juan Carlos", "Juarez", "56598956", "Juanj@gmail.com");
        //var modificado = estudianteDao.modificarEstudiante(estudianteModificado);
        //if(modificado){
        //    System.out.println("Estudiante modificado: "+estudianteModificado);
        //}else{
        //    System.out.println("No se modifico el estudiante: "+estudianteModificado);
        //}


        //Agregar estudiante
        //var nuevoEstudiante = new Estudiante("Carlos", "Lara", "5684744658", "carlosl@gmail.com"); //Usamos constructor sin id
        //var agregado = estudianteDao.agregarEstudiante(nuevoEstudiante);

        //if(agregado){//mientras sea verdadero que se haya agregado
        //    System.out.println("Estudiante agregado: "+nuevoEstudiante);
        //}else{
        //    System.out.println("No se ha agregado estudiante: "+nuevoEstudiante);
        //}


        //Eliminar estudiantes
        var estudianteEliminar = new Estudiante(5);
        var eliminado = estudianteDao.eliminarEstudiante(estudianteEliminar);
        if (eliminado)
            System.out.println("Estudiiante eliminado: " + estudianteEliminar);
        else
            System.out.println("No se elimino estudiante: " + estudianteEliminar);

        //Listar los estudiantes
        System.out.println("Listado de estudiantes: ");
        List<Estudiante> estudiantes = estudianteDao.listarEstudiantes();
        estudiantes.forEach(System.out::println);//Funcion lamda para imprimir


        //Buscar por id
    /*
    var estudiante1 = new Estudiante(1);
    System.out.println("Estudiantes antes de la busqueda: "+estudiante1);
    var encontrado = estudianteDao.buscarEstudiantesPorId(estudiante1);
    if(encontrado){
        System.out.println("Estudiante encontrado: "+estudiante1);
    }
    else{
        System.out.println("No se encontro el estudiante: "+estudiante1.getIdEstudiante());
    }
     */

    }


}
