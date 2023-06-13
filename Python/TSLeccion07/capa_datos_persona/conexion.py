from psycopg2 import pool  #importamos pool para que esta clase sea capaz de manejar un pool de conexiones
#import psycopg2 as bd
#hay otra forma de importar psycopg2
#psycopg2 = bd
from logger_base import log
import sys

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

class Conexion:
    #Creamos los atributos de clase
    _DATABASE = 'test_bd'
    _USERNAME = 'postgres'
    _PASSWORD = 'Aquiles2710'
    _DB_PORT = '5432'
    _HOST = '127.0.0.1'
    #Creamos variables de clase de cantnidad de objetos de conexion
    _MIN_CON = 1 #minimo de conexines
    _MAX_CON = 5 #maximo de conexiones, este numero no debe ser muy grande ya que todas las bases de datos tienen un limite y tener tantos objetos
    #de conexion o una base dedd atos en memoria puede resultar un proceso muy pesado, sin embargo este numero se puede ir adecuando dependiendo de las
    #necesidades del proyecto
    _pool = None

    #Crearemos los metodos de clase para ello usaremos @classmethod
    @classmethod
    def obtenerConexion(cls):
       """
       Debido a que ya tenemos el metodo obteener pool, la conexion ya no la vamos a obtener del modulo psycopg2 sino que ahora el objeto 
       de conexion lo vamos a obtener a partir de uno de los objetos que contengan nuestro pool, por esto especificamos que tuviera un minimo y un maximo
       de conexiones, Esto lo vemos ya que en el metodo poll, en si esta todo el proceso de conexion a la base de datos, por lo que cada objeto
       en si, tiene su propio acceso a travezz de este metodo

       dentro de este pool de conexiones le vamos a solicitar un objeto de conexion (definimos de 1 a 5 objetos)
       """
       conexion = cls.obtenerPool().getconn()
       #este metodo, si todavia no existe un objeto de pool se encarga de crearlo, si ya existe, solo lo regresa para no duplicar
       #objetos de pool de conexiones, y debido a que este metodo de obtener pool, no regresa un nuevo objeto de pool de conexiones, entonces mandamos a llamar
       #a su metodo getconn.
       #Este metodo getconn se va a encargar de regresar un objeto de conexion hacia la base de datos,de esta manera cuando un cliente
       # pida un objeto de conexion, el objeto poll de conexiones se encarga de proporcionar este objeto y una vez el cliente ya no ocupe este objeto
       #lo que hace es regresarlo al pool de conexiones para que este disponible para otro cliente, de esta menera el proceso de obtener un objeto de conexion
       #hacia la base de datos es mucho ams rapido ya que lo estamos administrando con un objeto mas generico de pool de conexiones

       log.debug(f'Conexion obtenida del pool: {conexion}')
       #Este objeto de conexion ya no lo vamos a administrar desde la clase, lo vamos a regresar a otra clase, y sera otra clase la que se encargara de
       #administrar tanto el objeto conexion como el objeto cursor.
       return conexion



                #El módulo sys es parte de la biblioteca estándar de Python y proporciona acceso a variables y
                #funciones relacionadas con la configuración y el funcionamiento del intérprete de Python.
                #La función exit() dentro del módulo sys se utiliza para terminar la ejecución del programa de
                #manera inmediata.






    @classmethod
    def obtenerCursor(cls):
        pass #Clase 10 tambien lo quitamos para administrarlo desde otro archivo

    #Agregamos un metodo para lo que es el pool de conexiones
    @classmethod
    def obtenerPool(cls):


        if cls._pool is None:
            try:
                cls._pool = pool.SimpleConnectionPool(cls._MIN_CON,
                                                      cls._MAX_CON,
                                                      host=cls._HOST,
                                                      user=cls._USERNAME,
                                                      password=cls._PASSWORD,
                                                      port=cls._DB_PORT,
                                                      database=cls._DATABASE)
                log.debug(f'creacion del pool exitosa: {cls._pool}')
                return cls._pool
            except:
                log.error(f'Ocurrio un error al obtener el pool: {e}')
                sys.exit()
        else:
            return cls._pool


#Haremos una prueba de la clase conexion
if __name__ == '__main__':
    #Prueba de objeto de pool de conexiones
    conexion1 = Conexion.obtenerConexion()
    conexion2 = Conexion.obtenerConexion() #Con el segundo objeto vemos si obtenemos correctamente varios objetos de conexion
    conexion3 = Conexion.obtenerConexion()
    conexion4 = Conexion.obtenerConexion()
    conexion5 = Conexion.obtenerConexion()
    #conexion6 = Conexion.obtenerConexion() # da error puesto que pusimos como maximo 6 objetos de pool de conexion



