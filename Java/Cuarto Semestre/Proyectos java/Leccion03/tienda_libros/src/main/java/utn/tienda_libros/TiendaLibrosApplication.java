package utn.tienda_libros;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import utn.tienda_libros.vista.LibroFrom;

import java.awt.EventQueue;
@SpringBootApplication
public class TiendaLibrosApplication {

	public static void main(String[] args) {

        ConfigurableApplicationContext contextoSpring =
                new SpringApplicationBuilder(TiendaLibrosApplication.class)
                        .headless(false)
                        .web(WebApplicationType.NONE)
                        .run(args); //Objeto de contexto Spring |configuracion de los headless
        //.class es para que se pueda instanciar
        //esta es otra forma de instanciar nuestra app de spring, obtenemos el contexto de spring indicando algunas caracteristicas mas
        //sobre tod0 para que no se ejecute como una app web

        //Ejecutamos el codigo para cargar el formulario
        EventQueue.invokeLater(() -> {
            //Obtenemos el objeto from a traves del spring
            LibroFrom libroFrom = contextoSpring.getBean(LibroFrom.class); //instanciamos la clase a travez de la fabrica de spring
            libroFrom.setVisible(true);
        });
    }
}
