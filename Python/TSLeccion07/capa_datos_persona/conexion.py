import psycopg2 as bd
#hay otra forma de importar psycopg2
#psycopg2 = bd
from logger_base import log
import sys

class Conexion:
    #Creamos los atributos de clase
    _DATABASE = 'test_bd'
    _USERNAME = 'postgres'
    _PASSWORD = 'Aquiles2710'
    _DB_PORT = '5432'
    _HOST = '127.0.0.1'
    _conexion = None
    _cursor = None

    #Crearemos los metodos de clase para ello usaremos @classmethod
    @classmethod
    def obtenerConexion(cls):
        if cls._conexion is None:
            try:
                #utilizamos bd de psycopg2
                cls._conexion = bd.connect(host=cls._HOST,
                                           user=cls._USERNAME,
                                           password=cls._PASSWORD,
                                           port=cls._DB_PORT,
                                           database=cls._DATABASE)
                log.debug(f'Conexion Exitosa {cls._conexion}')
                return cls._conexion

            except Exception as e:
                log.error(f'Ocurrio un error de tipo {e}')
                sys.exit()

                #El módulo sys es parte de la biblioteca estándar de Python y proporciona acceso a variables y
                #funciones relacionadas con la configuración y el funcionamiento del intérprete de Python.
                #La función exit() dentro del módulo sys se utiliza para terminar la ejecución del programa de
                #manera inmediata.


        else:
            return cls._conexion



    @classmethod
    def obtenerCursor(cls):
        if cls._cursor is None:
            try:
                cls._cursor = cls.obtenerConexion().cursor()
                log.debug(f'Se abrio correctamente el cursor: {cls._cursor}')
                return cls._cursor

            except Exception as e:
                log.error(f'Ocurrio un error: {e}')
                sys.exit()

        else:
            return cls._cursor

#Haremos una prueba de la clase conexion
if __name__ == '__main__':
    Conexion.obtenerConexion()
    Conexion.obtenerCursor()




