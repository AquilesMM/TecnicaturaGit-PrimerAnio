package SistemaEstudiantes.src.main.java.UTN.presentacion;

import SistemaEstudiantes.src.main.java.UTN.conexion.Conexion;
import SistemaEstudiantes.src.main.java.UTN.datos.EstudianteDAO;
import SistemaEstudiantes.src.main.java.UTN.dominio.Estudiante;

import java.util.Scanner;

public class SistemaEstudiantesApp {
    public static void main(String[] args) {
        var salir = false;
        var consola = new Scanner(System.in);
        //Se crea una instancia de la clase servicio. esto lo hacemos fuera del ciclo
        var estudianteDao = new EstudianteDAO(); //esta instancia debe hacerse una vez por ello se hace fuera del ciclo
        while(!salir){
            try{
                mostrarMenu();
                //Este sera el metodo que devolvera un booleano (ejecutarOpciones)
                salir = ejecutarOpciones(consola, estudianteDao); //  Este arroja una exception
            } catch(Exception e){
                System.out.println("Ocurrio un error al ejecutar la operacion: "+e.getMessage());
            }
        }//Fin while
    }//Fin main

    private static void mostrarMenu() {
        System.out.println("""
                ******* Sistema de estudiantes *******
                1.  Listar Estudiantes
                2. Buscar Estudiante
                3. Agregar Estudiante
                4. Modificar Estudiante
                5. Eliminar Estudiante
                6. Salir
                Elige una opcion:
                """);
    }


    //Metodo para ejecutar las opciones, va a regresar un valor booleano, ya que es el que
    //puede modificar el valor de la variable salir, si es verdadero termina el ciclo while
    private static boolean ejecutarOpciones(Scanner consola, EstudianteDAO estudianteDao) {

        var opcion = Integer.parseInt(consola.nextLine());
        var salir = false;
        switch (opcion){ //Listar estudiantes
            case 1 -> { //Listar Estudiantes
                System.out.println("Listado de Estudiantes...");
                //No muestra la informacion, solo recupera la info y regresa una lista
                var estudiantes = estudianteDao.listarEstudiantes();//recibe el listado
                //vamos a iterar cada objeto de tipo estudiante
                estudiantes.forEach(System.out::println);//para imprimir la lista
            }//Fin caso 1
            case 2 -> { // Buscar estudiante por id
                System.out.println("Introduce el id_estudiante a buscar: ");
                var idEstudiante = Integer.parseInt(consola.nextLine());
                var estudiante = new Estudiante(idEstudiante);
                var encontrado = estudianteDao.buscarEstudiantesPorId(estudiante);
                if(encontrado)
                    System.out.println(" Estudiante encontrado: "+estudiante);
                else
                    System.out.println("Estudiante NO encontrado: "+estudiante);
            }//Fin caso 2
            case 3 -> { //Agregar estudiante
                System.out.println("Agregar estudiante: ");
                System.out.println("Nombre: ");
                var nombre = consola.nextLine();
                System.out.println("Apellido: ");
                var apellido = consola.nextLine();
                System.out.println("Telefono: ");
                var telefono = consola.nextLine();
                System.out.println("Email: ");
                var email = consola.nextLine();
                //crear objeto estudiante (sin id)
                var estudiante = new Estudiante(nombre, apellido, telefono, email);
                var agregado = estudianteDao.agregarEstudiante(estudiante);
                if(agregado)
                    System.out.println("Estudiante gregdo: "+estudiante);
                else System.out.println("Estudiante NO agregado: "+estudiante);
            }//Fin caso 3
            case 4 -> { // Modificar estudiate
                System.out.println("Modificar estudiante: ");
                //Aqui lo primero es especificar cual es el id del objeto a modificar
                System.out.println("Id Estudiante: ");
                var idEstudiante = Integer.parseInt(consola.nextLine());
                System.out.println("Nombre: ");
                var nombre = consola.nextLine();
                System.out.println("Apellido: ");
                var apellido = consola.nextLine();
                System.out.println("Telefono: ");
                var telefono = consola.nextLine();
                System.out.println("Email: ");
                var email = consola.nextLine();
                //crea el objeto estudiante a modificar
                var estudiante =
                        new Estudiante(idEstudiante, nombre, apellido, telefono, email);
                var modificado = estudianteDao.modificarEstudiante(estudiante);
                if(modificado)
                    System.out.println("Estudiante modificado: "+estudiante);
                else
                    System.out.println("Estudiante NO modificado: "+estudiante);
            }//Fin caso 4
            case 5 -> { //Eliminar estudiante
                System.out.println("Eliminar estudiante: ");
                System.out.println("Id estudiante: ");
                var idEstudiante = Integer.parseInt(consola.nextLine());
                var estudiante = new Estudiante(idEstudiante);
                var eliminado = estudianteDao.eliminarEstudiante(estudiante);
                if(eliminado)
                    System.out.println("Estudiante eliminado: "+estudiante);
                else
                    System.out.println("Estudiante NO eliminado: "+estudiante);
            }//Fin caso 5
            case 6 -> { //Salir
                System.out.println("Hasta pronto !!!");
                salir = true;
            }//Fin caso 6
            default -> System.out.println("Opcion no reconocida, ingrese otra opcion: ");
        }//Fin switch
        return salir;
    }
}
