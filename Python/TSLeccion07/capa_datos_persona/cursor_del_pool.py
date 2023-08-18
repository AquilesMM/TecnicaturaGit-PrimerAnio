from logger_base import log
from conexion import Conexion
'''
El cursor se obtiene de una conexion valida, y esta se obtiene del pool, por ello el nombre
'''
class CursorDelPool:
    def __init__(self):
        self._conexion = None
        self._cursor = None

    #Vamos a utilizar risourse manager / context manager
    '''
    En Python, un context manager (administrador de contexto) es un objeto que define los métodos __enter__() y __exit__().
    Se utiliza para gestionar recursos que necesitan ser inicializados y liberados de manera adecuada, como archivos,
    conexiones de red o bloqueos de hilos.
    
    Un context manager se utiliza típicamente con la instrucción with, que proporciona una sintaxis más clara y garantiza 
    que los recursos sean liberados correctamente, incluso si ocurre una excepción durante la ejecución.
    
    Cuando se utiliza la instrucción with, el método __enter__() del context manager es invocado al comienzo del bloque, 
    y devuelve un objeto. Este objeto se asocia a un identificador especificado en la cláusula as de la instrucción with. 
    A continuación, el bloque de código dentro del with se ejecuta, y finalmente, el método __exit__() del context manager 
    es llamado, lo que permite liberar los recursos de manera adecuada.

    Aquí tienes un ejemplo básico que muestra cómo utilizar un context manager con un archivo:
    
    with open('archivo.txt', 'r') as archivo:
    contenido = archivo.read()
    # Hacer algo con el contenido del archivo

    # En este punto, el archivo se ha cerrado automáticamente
    
    En este ejemplo, la función open() devuelve un objeto que actúa como un context manager para el archivo especificado. 
    Al usarlo con la instrucción with, nos aseguramos de que el archivo se cierre correctamente al final del bloque, 
    independientemente de si ocurre una excepción o no.
    
    '''

    def __enter__(self):
        log.debug('Inicio del metodo with y __enter__')
        self._conexion = Conexion.obtenerConexion()
        self._cursor = self._conexion.cursor()
        return self._cursor

    def __exit__(self, tipo_exception, valor_exception, detalle_exception):
        log.debug('Se ejecuta el metodo exit')
        if valor_exception: #Si valor_exception es true, es decir tiene una valor
            self._conexion.rollback()
            log.debug(f'Ocurrio una excepcion: {valor_exception}')
        else:
            self._conexion.commit()
            log.debug('Commit de la transaccion')
        self._cursor.close()
        Conexion.liberarConexion(self._conexion)

if __name__ == "__main__":
    with CursorDelPool() as cursor:
        log.debug("Dentro del bloque with")
        cursor.execute('SELECT * FROM persona')
        log.debug(cursor.fetchall())

