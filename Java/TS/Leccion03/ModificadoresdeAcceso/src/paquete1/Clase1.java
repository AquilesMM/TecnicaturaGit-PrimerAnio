package paquete1;

public class Clase1 {
    /*
    al ser publico puede ser utilizado e cualquier parte de nuestro proyeccto
    otra clase, otro paquete, o donde fuera
    */
    
    public String atributoPublic = "Valor atributo public";
    protected String atributoProtected = "Valor atributo protected";
    
    public Clase1(){
        System.out.println("Constructor public ");
    }
    
    protected Clase1(String atributoPublic){
        System.out.println("Contructor protected");
    }
    
    public void metodoPublico(){
        System.out.println("Metodo publico");
    }
    
    protected void metodoProtected(){
        System.out.println("Metodo protected");
    }
}
