package utn.estudiantes.modelo;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity //indica que esta clase es una clase de entidad, es decir, representa una tabla de datos (necesita import)
//este codigo, constructores, to string, etc, se lo conoce como boilerplate - codigo Repetitivo
//ese codigo no lo haremos, agrgaremos mas anotaciones para evitarlo
@Data //crea los metodos get y set
@NoArgsConstructor // nos agrega el constructor vacio (constrivtor sin argumentos)
@AllArgsConstructor // constructor con todos los argumentos
@ToString //metodo toString
public class Estudiantes2022 { //nombre de tabla
    @Id  //este id es para que vaya agregando el orden de lo que es la llave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) //indica como se generara el valor de la llave primaria
    //La estrategia elegida es para llaves autoincrementables
    //
    private Integer idestudiante2022; //internamente el id en bd es diferente al que ponemos aqui como atributo
    //pero no es problema ya que internamente se va a modificar
    //hybernate modifica internamente lo que sea diferente haciendolo coincidir

    private String nombre;
    private String apellido;
    private String telefono;
    private String email;



}
