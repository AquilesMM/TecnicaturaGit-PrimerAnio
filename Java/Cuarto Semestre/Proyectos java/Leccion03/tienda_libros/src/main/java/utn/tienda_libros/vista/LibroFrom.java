package utn.tienda_libros.vista;

import org.springframework.beans.factory.annotation.Autowired;
import utn.tienda_libros.servicio.LibroServicio;

import javax.swing.*;

public class LibroFrom extends JFrame {
    //En el servicio inyectamos la dependencia de spring a travez de un atributo
    //aqui lo comenzaremos a inyectar a travez del constructor debido a que cuando se crea este objeto, necesitamos que ya este integrada
    // esta inyeccion de la inyeccion de dependencia de este servicio para poder utilizarla, de lo contrario, si esperamos que se haga a travez
    //de la inyeccion de un atributo entonces ya es demaciado tarde, necesitamos que este disponible rapidamente para poder empezar a cargar
    // los datos desde la db
    //atributo
    LibroServicio libroServicio;
    private JPanel panel;

    @Autowired
    public LibroFrom(LibroServicio libroServicio){
        this.libroServicio = libroServicio;
        iniciarForma(); //metodo que se encarga de tomar la info de db, para que se visualice en el formulario a travez de esta clase
    }

    private void iniciarForma(){
        setContentPane(panel); //llamamos al panel (la ventana de visualizacion) (nosotros le pusimos ese nombre en el .form
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//que se cierre la app con exito
        setVisible(true);//para visualizar el formulario
        setSize(900, 700);//dimencion de la ventana (alto ancho)
    }

}
