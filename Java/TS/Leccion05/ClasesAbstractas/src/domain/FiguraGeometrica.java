package domain;

public  abstract class FiguraGeometrica {
    /*
        CLASES ABSTRACTAS
    Una clase abstracta (palabra reservada abstract)
    ej:     
            public abstract class NombreClase {
            }

    Utilizamos este tipo de clases para definir metodos que no tienen ninguna implementacion, ej: una clase padre que no define comportamiento
    tambien se utiliza en metodos que no tienen ninguna implementacion

    si una clase contiene un metodo abstracto aunque la clase no fuera originalmente abstracta, se debera marcar como abstracta 

    Pero si podemos crear una clase abstracta que no tenga metodos abstractos 

    Lo mas comun es que si se tiene una clase marcada como abstracta es porque tiene por lo menos un metodo abstracto dentro de sus metodos

    Un ejemplo de uso es una clase muy general, con metodos muy generales los cuales no tendran un uso determinado, pero este podra darselo
    una clase hija, como en el caso de estas tareas

    donde la clase padre sera figuraGeometrica y su metodo dibujar, pero no se determinara que figura sera, esto se definira en las clases hijas

    No se podra usar directamente el metodo dibujar ya que no se tiene conocimiento de que dibujara, por lo que este se determinara como abtracto

    una vez se sepa que dibujara (a travez de la clase hija) recien ahi podra darsele el respectivo uso

    con las clases abstractas no estamos obligados a determinar ningun comportamiento por default en las clases o metodos abstractos

    pero obligamos a las clases hijas a implementar el comportamiento definido en las clases padres, una clase hija debe agregar el 
    comportamiento de los metodos abstractos definidos en la clase padre. De no hacerlo, las clases hijas tambien deberan marcarse
    como abstractas
    */
    
   protected String tipoFigura;
   
   protected FiguraGeometrica(String tipoFigura){
       this.tipoFigura = tipoFigura;
   }
   //Metodo abstracto
   public abstract void dibujar();
   //al ser abstracta y no implementar necesariamente ningun comportamiento podemos dejarlo vacio de esa manera, sin llaves, tampoco le pasamos
   //ningun argumento en los parentesis, estos metodos se cierran con punto y coma sin llaves
   
   
   //Agregamos el get y set

    public String getTipoFigura() {
        return tipoFigura;
    }

    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    @Override
    public String toString() {
        return "FiguraGeometrica{" + "tipoFigura=" + tipoFigura + '}';
    }
   
   
   
}
