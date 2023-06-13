#Este es un patron de diseño, esta clase tendra todas las quertys del crud
from Persona import Persona
from conexion import Conexion
from logger_base import log

"""
Pool de conecciones
Psycopg2 tambien incluye un manejo de pool de conexiones
un pool de conexiones va a ser un objeto que va a administrar a su vez los objetos de conexion hacia la base de datos, podemos tener uno o mas pool de conexiones y cada pool de conexion va a administrar un numero determinado de objetos de conexion hacia la base de datos.
De esta manera ya no tendremos que obtener de manera independiente los objetos de conexion ya que este proceso es bastante pesado para una aplicacion
y lo mas recomendable es tener en todo momento disponibles objetos de conexion hacia la base de datos.

Una vez que cierto cliente, necesite de un objeto de conexion hacia la base de datos, lo va a obtener del pool, y una vez que a terminado de su proceso,
lo libera y regresa al pool de conexiones, para que otro cliente pueda seguir utilizando los objetos disponibles en el pool de conexiones

ACLARACION
Dos clientes no pueden utilizar al mismo tiempo el mismo  objeto del pool de conexiones, es decir, usaran dos objetos distintos aunque sean del mismo pool
de conexiones. Utilizaran mismo pool pero diferentes objetos, podran utilzar el objeto del otro siempre y cuendo el otro lo haya dejado de utilizar

ES UN PROCESO BASTANTE RAPIDO
"""
class PersonaDAO:
    """
    DAO significa: Data Acccess Object
    CRUD significa:
                    Create --> Insertar
                    Read   --> Seleccionar
                    Update --> Actualizar
                    Delete --> Eliminar
    """
    #Definimos las variables.
    _SELECCIONAR = 'SELECT * FROM persona ORDER BY id_persona'
    _INSERTAR = 'INSERT INTO persona(nombre, apellido, email) VALUES (%s, %s, %s)'
    _ACTUALIZAR = 'UPDATE persona SET nombre=%s, apellido=%s, email=%s WHERE id_persona=%s'
    _ELIMINAR = 'DELETE FROM persona WHERE id_persona=%s'

    #Continuamos con la definicion de los metodos de clase

    @classmethod
    def seleccionar(cls):
        #realizamos la conexion de no estar echa
        with Conexion.obtenerConexion(): #debemos comentar para que no de error en pruebas incertar
            #Obtenemos el cursor
            with Conexion.obtenerCursor() as cursor:
                #vamos a ejecutar a travez del cursor el query seleccionar
                cursor.execute(cls._SELECCIONAR)
                registros = cursor.fetchall()
                #creamos una lista vacia que le pasaremos a persona
                personas = []
                #vamos a recorrer los registros con un for each
                for registro in registros:
                    #pasaremos cada registro en cada posicion a un objeto, de la siguiente manera
                    #cada registro es para cada columna, id_persona, nombre, apellido, email
                    persona = Persona(registro[0], registro[1], registro[2], registro[3])
                    personas.append(persona)
                return personas #de no poner el return, nada de lo que hagamos aqui servira para guardarse cuando
                #se llame el metodo

    @classmethod
    def insertar(cls, persona):
        with Conexion.obtenerConexion():
            with Conexion.obtenerCursor() as cursor:
                valores = (persona.nombre, persona.apellido, persona.email)
                cursor.execute(cls._INSERTAR, valores)
                log.debug(f'Persona Insertada: {persona}')
                return cursor.rowcount

    @classmethod
    def actualizar(cls, persona):
        with Conexion.obtenerConexion():
            with Conexion.obtenerCursor() as cursor:
                valores = (persona.nombre, persona.apellido, persona.email, persona._id_persona)
                cursor.execute(cls._ACTUALIZAR, valores)
                log.debug(f'Persona actualizada: {persona}')
                return cursor.rowcount

    @classmethod
    def eliminar(cls, persona):
        with Conexion.obtenerConexion() as cursor:
            with Conexion.obtenerCursor():
                valores = (persona.id_persona)
                cursor.execute =(cls._ELIMINAR, valores)
                log.debug(f'Los objetos eliminados son: {persona}')
                return cursor.rowcount


if __name__ == '__main__':

    # Eliminar un registro
    #persona1 = Persona(id_persona=13)
    #personas_eliminadas = PersonaDAO.eliminar(persona1)
    #log.debug(f'Personas eliminadas: {personas_eliminadas}')

    # Actualizar un registro
    #persona1 = Persona(1,'Juan Jose', 'Pena', 'jjpena@gmail.com')
    #personas_actualizadas = PersonaDAO.actualizar(persona1)
    #log.debug(f'Personas actualizadas: {personas_actualizadas}')
    # Insertar un registro
    #persona1 = Persona(nombre='Omero', apellido='Ramos', email='omeror@gmail.com')
    #personas_insertadas = PersonaDAO.insertar(persona1)
    #log.debug(f'Personas Insertadas: {personas_insertadas}')
    # Seleccionar objetos
    personas = PersonaDAO.seleccionar()
    for persona in personas:
        log.debug(persona)
