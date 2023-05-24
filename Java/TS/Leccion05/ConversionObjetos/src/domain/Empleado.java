package domain;

import java.util.Objects;

public class Empleado {
    
    protected String nombre;
    protected double sueldo;
    
    public Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }   
    
    
    //METODO PARA LA SOBREESCRITURA
    public String obtenerDetalles(){
        return "Nombre: " + this.nombre+", Sueldo: "+this.sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", sueldo=" + sueldo + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.nombre);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.sueldo) ^ (Double.doubleToLongBits(this.sueldo) >>> 32));
        return hash;
    }
    /*
    El código que proporcionaste es una implementación de los métodos hashCode() y equals() en una clase llamada Empleado. 
    Estos métodos son parte de la funcionalidad de comparación y uso de objetos en Java. 
    Aquí tienes una explicación paso a paso de cada método:
    
    
    hashCode(): Este método devuelve un valor entero que representa el código hash del objeto. 
    El código hash es una representación numérica única generada para cada objeto, y se utiliza en diversas estructuras de datos, 
    como tablas hash, para optimizar la búsqueda y comparación de objetos. Veamos paso a paso la implementación:
    
    Se inicializa la variable hash con el valor 7.
    
    Se multiplica el valor actual de hash por 97 y se le suma el código hash del objeto nombre utilizando Objects.hashCode(). 
    Esto se hace para asegurar que el nombre contribuya al código hash de manera significativa.
    
    Se vuelve a multiplicar el valor actual de hash por 97 y se realiza una operación de bits XOR exclusiva entre el 
    código hash del sueldo (convertido a un entero de 64 bits mediante Double.doubleToLongBits()) y el 
    desplazamiento a la derecha de 32 bits del código hash del sueldo. Esta operación combina los bits del sueldo de una manera 
    que es menos probable que cause colisiones en el código hash.
    
    Finalmente, se devuelve el valor resultante de hash.
    
    
    */

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empleado other = (Empleado) obj;
        if (Double.doubleToLongBits(this.sueldo) != Double.doubleToLongBits(other.sueldo)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }
    
    /*
    equals(Object obj): Este método verifica si el objeto actual (this) es igual al objeto pasado como argumento (obj). 
    Aquí está el análisis paso a paso de su implementación:
    
    Se realizan algunas comprobaciones iniciales para ver si el objeto actual (this) y obj son el mismo objeto o 
    si alguno de ellos es nulo. Si es así, se devuelve true o false según corresponda.
    
    Luego, se verifica si el tipo de clase del objeto obj es igual al tipo de clase del objeto actual (this).
    Esto se hace para asegurarse de que se estén comparando objetos de la misma clase.
    
    Después, se realiza un casting del objeto obj a la clase Empleado, ya que ahora se puede asumir que ambos objetos son de la misma clase.
    
    Se compara el código hash del sueldo del objeto actual con el código hash del sueldo del objeto other 
    (el objeto Empleado después del casting). Si los códigos hash son diferentes, se devuelve false.
    
    Luego, se compara el objeto nombre del objeto actual con el nombre del objeto other utilizando Objects.equals().
    Si los nombres no son iguales, se devuelve false.
    
    Si ninguna de las comprobaciones anteriores devuelve false, se considera que los objetos son iguales y se devuelve true.
    
    Estos métodos hashCode() y equals() son comúnmente implementados cuando se desea realizar comparaciones y operaciones de 
    búsqueda en colecciones de objetos, como HashMap o HashSet.
    */
    

    
}
