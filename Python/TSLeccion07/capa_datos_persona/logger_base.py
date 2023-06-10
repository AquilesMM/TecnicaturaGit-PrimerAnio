import logging as log
# https://docs.python.org/es/3/howto/logging.html Documentacion

#Otra forma de renombrar el elemento logging es:
#log = logging

# APRENDEREMOS A UTILIZAR LOGGING

# Llamamos una configuracion basica

"""
Ademas de mandar informacion a consola, vamos a configurar el objeto de log para poder mandar informacion, no solo a consola, sino tambiena  un archivo

para mandar informacion no solo a consola, sino a un archivo, es agregar el concepto de handler
handler = manejador

un handler es un recurso a donde vamos a mandar esta informacion ya que no solo podemos mandarla a la consola en la ejecucion, sino que la vamos a mandar
tambien a un archivo.
"""
log.basicConfig(level=log.DEBUG,
                format='%(asctime)s:%(levelname)s [%(filename)s:%(lineno)s] %(message)s',
                datefmt='%I:%M:%S %p',
                handlers=[
                    log.FileHandler('capa_datos.log'),
                    log.StreamHandler()
                ])
                # Al cambiar el nivel cambia el mensaje, debug miestra todos
                #-------------------------------------------------------------------------------
                #Trabjamos con el parametro posicional, solo que agregamos parentesis entre % y s, donde agregaremos distintos valores
                #tiempo (asctime), nivel(levelname), entre corchetes agregaremos una cadena con el nombre del archivo donde se esta trabajando (filename)
                #luego otra cadena para mostrar la linea en la que se este ejecutando (lineno)
                #Luego otro parametro posicional donde mostraremos el mensaje (message)
                #Estos mensajes son muy utiles cuando estamos trabajando con archivos/aplicaciones grandes
                #Nos dira en que horario se lanzo el error, el nivel de error que se lanzo, luego el nombre del archivo, la linea y el mensaje
                #-----------------------------------------------------------
                #Luego modificamos la hora (asctime) utilizando datefmt (date format), lego abrimos para crear el formato
                # I%: para la hora | %M para los minutos | %S para los segundos | pm o am mediante %p (la p minuscula)
                #-----------------------------------------------------------
                #HANDLER
                #en este caso un handler va a controlar que no solo se arroje la informaciona  consola, sino tambien a un archivo
                #Para ello abriremos una lista, y dentro pondremos un valor de log de FileHandler, a este le pasamos el nombre del archivo
                #Luego indicamos que le vamos a agregar informacion a lo que es StreamHandler, que es la consola que hemos manejado hasta el momento
                #El archivo donde se guarda toda la informacion, se crea y se guarda en el directorio donde se encuentra ejecutando el codigo



#En este nivel se van a  mostrar o ejecutar todos los mensajes que configuraremos a continuacion
#El nivel que elijamos mostrara su mensaje y los mensajes de los niveles superiores
'''
Veremos la configuracion para que este codigo se ejecute unicamente si estamos trabajando dentro de este archivo "logger_base"
ya que este archivo lo usaremos en otros modulos y no queremos que esto se ejecute en todo momento, solamente si estamos realizando la prueba
dentro de este archivo 

Lo haremos mediante un if
'''
if __name__ == '__main__':
    log.debug('Mensaje a nivel debug')
    log.info('Mensaje a nivel info')
    log.warning('Mensaje a nivel warning')
    log.error('Mensaje a nivel error')
    log.critical('Mensaje a nivel critical')



