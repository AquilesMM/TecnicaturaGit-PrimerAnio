package utn.tienda_libros.vista;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import utn.tienda_libros.modelo.Libro;
import utn.tienda_libros.servicio.LibroServicio;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

@Component
//agregando component hacemos que que el formulario de swin participe en la fabrica de spring
//Entonces cuando mandemos a ejecutar la app a partir del contexto de spreen vamos a poder solicitar una instancia de este formulario
//de esta forma empezamos a integrar swin con spring
public class LibroFrom extends JFrame {
    //En el servicio inyectamos la dependencia de spring a travez de un atributo
    //aqui lo comenzaremos a inyectar a travez del constructor debido a que cuando se crea este objeto, necesitamos que ya este integrada
    // esta inyeccion de la inyeccion de dependencia de este servicio para poder utilizarla, de lo contrario, si esperamos que se haga a travez
    //de la inyeccion de un atributo entonces ya es demaciado tarde, necesitamos que este disponible rapidamente para poder empezar a cargar
    // los datos desde la db
    //atributo
    LibroServicio libroServicio;
    private JPanel panel;
    private JTable tablaLibros;
    private JTextField libroTexto;
    private JTextField autorTexto;
    private JTextField precioTexto;
    private JTextField existenciasTexto;
    private JButton agregarButton;
    private JButton modificarButton;
    private JButton eliminarButton;
    private DefaultTableModel tablaModeloLibros;


    @Autowired
    public LibroFrom(LibroServicio libroServicio){
        this.libroServicio = libroServicio;
        iniciarForma(); //metodo que se encarga de tomar la info de db, para que se visualice en el formulario a travez de esta clase
        agregarButton.addActionListener(e -> agregarLibro());
    }

    private void iniciarForma(){
        setContentPane(panel); //llamamos al panel (la ventana de visualizacion) (nosotros le pusimos ese nombre en el .form
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//que se cierre la app con exito
        setVisible(true);//para visualizar el formulario
        setSize(900, 700);//dimencion de la ventana (alto ancho)
        //Para obtener las dimenciones de la ventana
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        //utilizaremos la clase dimencion para obtener el tamaño de la pantalla y asi poder centrar la ventana para que se muestre con el objeto del toolkit
        Dimension tamanioPantalla = toolkit.getScreenSize();
        //definimos ejes
        int x = (tamanioPantalla.width - getWidth()/2);
        int y = (tamanioPantalla.height - getHeight()/2);
        setLocation(x, y);
    }


    private void agregarLibro(){
        // Leer los valores del formulario (cada una de las textbox)
        if(libroTexto.getText().equals("")){
            mostrarMensaje("Ingresa el nombre del libro");
            libroTexto.requestFocusInWindow();
            //esto mueve el cursor para que se vuelva a ingresar el dato
            return;
        }
        //Obtenemos los datos de los campos de texto
        var nombreLibro = libroTexto.getText();
        var autor = autorTexto.getText();
        var precio = Double.parseDouble(precioTexto.getText());
        var existencias = Integer.parseInt(existenciasTexto.getText());
        //Creamos el objeto libro
        //al pasar el id en null se autoincrementara en la bd, si pasamos un id intentara modificar si existe alguno
        var libro = new Libro(null, nombreLibro, autor, precio, existencias);
        //libro.setNombreLibro(nombreLibro);
        //libro.setAutor(autor);
        //libro.setPrecio(precio);
        //libro.setExistencias(existencias);
        this.libroServicio.guardarLibro(libro); //si el id es nulo creara, si tiene valor intentara modificar
        mostrarMensaje("Se agrego el libro...");
        limpiarFormulario();
        listarLibros();
    }
    private void limpiarFormulario(){
        libroTexto.setText("");
        autorTexto.setText("");
        precioTexto.setText("");
        existenciasTexto.setText("");
    }

    private void mostrarMensaje(String mensaje){
        JOptionPane.showMessageDialog(this, mensaje);
    }

    private void createUIComponents() {
        this.tablaModeloLibros  = new DefaultTableModel(0, 5); //creamos un nuevo objeto y no especificamos ningun negristro, ningun renglon (seran dinamicos)
        // y le indicamos 5 columnas
        //creamos un array para las 5 columnas
        String[] cabecera = {"Id", "Libro", "Autor", "Precio", "Existencias"}; //Cabecera
        this.tablaModeloLibros.setColumnIdentifiers(cabecera);//el objeto tablaML con ayuda de este metodo le agregamos los identificadores de cada columna
        //Instanciar el objeto de JTabl
        this.tablaLibros = new JTable(tablaModeloLibros);
        listarLibros();
    }

    private void listarLibros(){
        //Limpiar la tabla
        tablaModeloLibros.setRowCount(0);
        //Obtener los libros de la BD
        var libros = libroServicio.ListarLibros();
        //Iteramos cada libro
        libros.forEach((libro) -> { //Funcion Lambda
            //Creamos cada registro para agregarlos a la tabla
            Object [] renglonLibro = {
              libro.getIdLibro(),
              libro.getNombreLibro(),
              libro.getAutor(),
              libro.getPrecio(),
              libro.getExistencias(),
            };
          this.tablaModeloLibros.addRow(renglonLibro);
        });
    }
}