package enumeraciones;

public enum Dias {//para una enumeracion no utilizamos class, sino enum
    /*
    Una enumeracion es un tipo similar a una clase, pero esta es una clase particular
    Esta contiene varios elementos, por ello se le llama enumeracion
    ya que los elementos van a estar definidos dentro de esta enumeracion 
    */
    
    //ENUMERAMOS LOS DIAS DE LA SEMANA
    /*
    Una caracteristica de los elementos de enumeracion es que estos por default son 
    elementos public static final
    
    por lo que todos los elementos que agregemos en una enumeracion son constantes
    
    normalmente las enumeraciones sirven para definir este tipo de datos
    para evitar el tedio de agregar estos elementos como atributos en clases
    por ello se definen todas estas constantes en una clase(enum) y luego las utilizamos en el
    resto de clases como valores fijos
    
    por ello se creo este tipo de dato
    
    enum == lista de valores constantes
    */
    
    LUNES, //Se separan con comas no punto y coma
    MARTES,
    MIERCOLES,
    JUEVES,
    VIERNES, //SE UTILIZAN EN MAYUSCULAS PORQUE SON CONSTANTES
    SABADO,
    DOMINGO; //SE PUEDE UTILIZAR ; PARA CERRAR LA LISTA DE ELEMENTOS
    /*
    Para acceder a estos elementos sera como acceder a un atributo de una clase
    Ej: Dias.LUNES;
    pero no debemos olvidar que este atributo sera public static final
    */
}   
