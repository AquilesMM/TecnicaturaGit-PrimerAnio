package accesodatos;

public class ImplementacionOracle implements IAccesoDatos {

    @Override
    public void insertar() {
        System.out.println("Insertar desde Oracle");
    }

    @Override
    public void listar() {
        System.out.println("Listar desde Oracle");
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizar desde Oracle");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminar desde Oracle");
    }
    /*
    CASO ELIMINAR UN METODO
    En el caso de eliminar algun metodo, el id de manera automatica nos marcara un error
    y podemos hacer dos cosas. Implementar el metodo nuevamente o marcar que la clase es abstracta
    y borrar todos los demas metodos que haya
    
    LO QUE QUIERE DECIR QUE PARA IMPLEMENTAR UNA INTERFAZ DEBEMOS IMPLEMENTAR TODOS SUS METODOS 
    YA QUE PARA IMPLEMENTAR LA INTERFAZ, LA CLASE NO DEBE SER ABSTRACTA
    */
}
