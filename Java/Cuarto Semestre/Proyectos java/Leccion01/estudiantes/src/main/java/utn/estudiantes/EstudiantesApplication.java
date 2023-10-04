package utn.estudiantes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import utn.estudiantes.modelo.Estudiantes2022;
import utn.estudiantes.servicio.EstudianteServicio;

import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class EstudiantesApplication implements CommandLineRunner {


	@Autowired
	private EstudianteServicio estudianteServicio;
	private static final
	Logger logger = LoggerFactory.getLogger(EstudiantesApplication.class);
	//utilizamos el logger factory para generar un logger con el que imprimir en la consola, utilizando un
	//logger configurado, spring tiene de manera automatica un logger

	String nl = System.lineSeparator();

	public static void main(String[] args) {

		logger.info("Iniciando la aplicacion...");

		//al momento de ejecutar main, se ejecuta la fabrica de spring y se ejecuta la inyeccion de dependencia
		// y de manera automatica se ejecutara run
		SpringApplication.run(EstudiantesApplication.class, args);
		logger.info("Aplicacion finalizada...");
	}

	@Override
	public void run(String... args) throws Exception {
		//trabajamos con la implementacion CommandLineRunner,ya que no podemos ejecutrar, los objetos
		//Creados dentro de la fabrica de spring fuera de ella, por ello utilizamos el metodo run

		logger.info(nl+"Ejecutando el metodo run de Spring..."+nl);
		var salir = false;
		var consola = new Scanner(System.in);
		while(!salir){
			mostrarMenu();
			salir = ejecutarOpciones(consola);
			logger.info(nl);
		}//fin ciclo while



	}

	private void mostrarMenu(){
		//logger.info(nl);
		logger.info("""
				******** Sistema de Estudiantes *******
				1. Listar Estudiantes
				2. Buscarr Estudiante}
				3. Agregar Estudiante
				4. Modificar Estudiante
				5. Eliminar Estudiante
				6. Salir
				Elija una opcion:""");
	}

	private boolean ejecutarOpciones(Scanner consola){
		var opcion = Integer.parseInt(consola.nextLine());
		var salir = false;
		switch (opcion){
			case 1 -> {//Listar Estudiante
				logger.info(nl+"Listado de estudiantes: "+nl);
				List<Estudiantes2022> estudiantes = estudianteServicio.listarEstudiantes();
				estudiantes.forEach(estudiante -> logger.info(estudiante.toString()+nl));
			}
			case 2 -> { //Buscar estudiante poor if
				logger.info("Digite el id de estudiante a buscar: ");
				var idEstudiante = Integer.parseInt(consola.nextLine());
				Estudiantes2022 estudiante = estudianteServicio.buscarEstudiantePorId(idEstudiante);
				if (estudiante != null)
					logger.info("Estudiante encontrado: " + estudiante + nl);
				else
					logger.info("Estudiante NO encontrado: " + estudiante + nl);
			}
			case 3 -> { //Agregar Estudiante
				logger.info("Agregar estudiante: " + nl);
				logger.info("Nombre: ");
				var nombre = consola.nextLine();
				logger.info("Apellido: ");
				var apellido = consola.nextLine();
				logger.info("Telefono: ");
				var telefono = consola.nextLine();
				logger.info("Email: ");
				var email = consola.nextLine();
				// Crear el objeto estudiante sin el id
				var estudiante = new Estudiantes2022();
				estudiante.setNombre(nombre);
				estudiante.setApellido(apellido);
				estudiante.setTelefono(telefono);
				estudiante.setEmail(email);
				estudianteServicio.guardarEstudiante(estudiante);
				logger.info("Estudiante agregado: " + estudiante + nl);
			}
			case 4 -> { // Modificar Estudiante
				logger.info("Modificar estudiante: "+nl);
				logger.info("Ingrese el id estudiante: ");
				var idEstudiante = Integer.parseInt(consola.nextLine());
				// buscamos el estudiante a modificar
				Estudiantes2022 estudiante =
						estudianteServicio.buscarEstudiantePorId(idEstudiante);
				if(estudiante != null){
					logger.info("Nombre: ");
					 var nombre = consola.nextLine();
					 logger.info("Apellido");
					 var apellido = consola.nextLine();
					 logger.info("Telefono: ");
					 var telefono = consola.nextLine();
					 logger.info("email: ");
					 var email = consola.nextLine();
					 estudiante.setNombre(nombre);
					 estudiante.setApellido(apellido);
					 estudiante.setTelefono(telefono);
					 estudiante.setEmail(email);
					 estudianteServicio.guardarEstudiante(estudiante);
					 logger.info("Estudiante modificado: "+estudiante+nl);
				}
				else{
					logger.info("Estudiante NO encontrado con el id: "+idEstudiante+nl);
				}
			}
			case 5 -> { // Eliminar Estudiante
				logger.info("Elminar estudiante: "+nl);
				logger.info("Digite el id estudiante: ");
				var idEstudiante = Integer.parseInt(consola.nextLine());
				// Buscamos el id estudiante a eliminar
				var estudiante = estudianteServicio.buscarEstudiantePorId(idEstudiante);
				if (estudiante != null) {
					estudianteServicio.eliminarEstudiante(estudiante);
					logger.info("Estudiante eliminado "+estudiante+nl);
				}else{
					logger.info("Estudiante NO encontrado con id: "+estudiante+nl);
				}
			}
			case 6 ->{ //salir
				logger.info("Hasta pronto!"+nl+nl);
				salir = true;
			}
			default -> logger.info("Opcion no reconocida: "+opcion+nl);
		}//Fin Switch
		return salir;
	}

}


