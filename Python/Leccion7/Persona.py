class Persona:  # Esta clase hereda de la clase object, pero no se pone ya que es automatico
    def __init__(self, nombre, edad):
        self._nombre = nombre
        self._edad = edad

    @property
    def nombre(self):
        print("get nombre")
        return self._nombre

    @nombre.setter
    def nombre(self, nombre):
        print("Set nombre")
        self._nombre = nombre

    @property
    def edad(self):
        print("get edad")
        return self._edad

    @edad.setter
    def edad(self, edad):
        print("Set edad")
        self._edad = edad

    # SOBREESCRIBIMOS __str__ (DUNDER STR)
    def __str__(self):  # Este metodo viene de la clase object
        """
        significa override = sobreescribir
        este metodo sobreescribe los atributos, tod0 lo que recibe, y al ser miembro de la misma clase, puede acceder a los atributos (de esta clase o Herencia)
        aunque esten encapsulados, pero no va a mostrar los atributos con el valor real, por ejemplo:
        sabemos que edad va a tener un tipo entero, pero este metodo va a mostrar tod0 de tipo cadena
        """
        return f'Persona: [nombre: {self._nombre}, edad: {self._edad} ]'


class Empleado(Persona):  # De esta menera le decimos a la clase empleado que es heredada de la clase Persona
    def __init__(self, nombre, edad, sueldo):
        # utilizamos el contructor de la clase padre de todos, llamado: super
        super().__init__(nombre, edad)  # luego de super llamamos al metodo inicializador de la clase padre persona
        # alli pasamos los parametros de la misma clase persona de quien llamamos el inicializador
        # de esta manera hacemos uso de las caracteristicas de la clase persona

        # LOS METODOS INIT SE SOBREESCRIBEN EN LAS CLASES HIJAS

        self._sueldo = sueldo

    """
    La clase padre e hija ademas de indicarle de quien hereda debemos hacer que se involucren para poder hacer
    uso de sus atributos, para ello la clase hija debe inicializar recibiendo los atributos de la clase padre
    es decir en el __init__ indicarle tambien dichos atributos
    """

    @property
    def sueldo(self):
        print("get sueldo")
        return self._sueldo

    @sueldo.setter
    def sueldo(self, sueldo):
        print("set sueldo")
        self._sueldo = sueldo

    def __str__(self):
        return f'Empleado: [ Sueldo: {self._sueldo} ] {super().__str__()}'  # aqui lo que hacemos es, luego de mostrar el str de empleado
    # llamamos/sobre escribimos (segun profe) a el str de la clase persona, haciendo de esta manera que se muestren ambos __str__
    # es como concatenar ambos str


empleado1 = Empleado("Aquiles", 20, 75000)
print(f"nombre: {empleado1.nombre}, edad: {empleado1.edad}, sueldo: {empleado1.sueldo}")
"""
Tarea: encapsular los atributos y agregar los metodos getters and setters
Crear otro objeto, pasar los datos para nombre, edad y sueldo
Mostrar estos datos, luego modificar y mostrar nuevamente
"""

# ACOTACION DE ALGO APRENDIDO
"""
A la hora de encapsular, puedo encapsular en la clase padre y no cambiara en nada la sintaxis de vinculacion 
o uso de constructor super a la hora de heredar atributos, y su forma de uso no cambia, por lo que los metodos de 
cada clase (POR LO QUE SE) se deben encapsular en la misma clase de la que son, aunque tambien se pueden encapsular en sus
herencias

"""

empleado2 = Empleado("Mily", 20, 80000)
print(f"Nombre: {empleado2.nombre}, edad: {empleado2.edad}, sueldo: {empleado2.sueldo}")
empleado2.nombre = "Juan"
empleado2.edad = 12
empleado2.sueldo = 10000
print(f"nombre: {empleado2.nombre}, edad: {empleado2.edad}, sueldo: {empleado2.sueldo}")
