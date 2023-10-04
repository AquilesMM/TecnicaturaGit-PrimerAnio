package utn.estudiantes.servicio;

import utn.estudiantes.modelo.Estudiantes2022;

import java.util.List;

public interface IEstudianteServicio{
    //Spring recomienda trabajar con interface en vez de clases concretas
    //Esta interface ttendra los metodos basicos para trabajar con la entidad estudiante
    //trabajando a su vez con la interface de respositorio
    public List<Estudiantes2022> listarEstudiantes(); //no se implementa aqui, se implementa en la clase
    public Estudiantes2022 buscarEstudiantePorId(Integer idEstudiante);
    public void guardarEstudiante(Estudiantes2022 estudiante);
    public void eliminarEstudiante(Estudiantes2022 estudiante);
    //jpa determinara automaticamente si se debe insertar o modificar estudiante
    // la diferencia esta en que si ya tenemos definido el valor de la pk entonces se actualiza el registro
    //si la pk esta vacio, por la forma en que definimos nuestra clase estudiante, si el id del objeto esta vacio
    //se debe insertar, si tiene un valor se debe actualizar
}
