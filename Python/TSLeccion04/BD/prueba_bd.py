import psycopg2 # Esto es para poder conectarnos a Postre


"""
una vez importado el paquete para conectar con postgre
creamos una variable que se encargara de ser la conexion con la bd
para ello utilizamos psycopg y utilizar el metodo connect()
este metodo nos permitira conectarnos con la bd
entre sus parentesis podemos pasar una tupla, podemos saber que tenemos varios parametros y el 
ultimo que podemos pasar es un diccionario de valores
"""
conexion = psycopg2.connect(
    user="postgres", #ponemos el usuario de la base de datos
    password="Aquiles2710",
    host='127.0.0.1', #Este generalmente es el mismo
    port='5432',
    database='test_bd'
)
#RECORDARTORIO DEL USO DE WITH
"""
La sentencia with en Python se utiliza para administrar recursos externos, como archivos o conexiones de bases de datos, 
de manera segura y eficiente. Es especialmente útil al abrir archivos o bases de datos, 
ya que se encarga automáticamente de la apertura y cierre adecuados de los recursos, incluso si ocurren excepciones.

Cuando se usa la sentencia with junto con un objeto de archivo o una conexión de base de datos, 
se garantiza que los recursos se cierren correctamente una vez que se complete el bloque with, 
sin importar si se produjeron errores o excepciones durante la ejecución del bloque. Esto evita la necesidad de gestionar 
manualmente el cierre de los recursos y ayuda a prevenir posibles fugas de memoria o problemas de seguridad.

IMPORTANTE, ASEGURAR CIERRE DE CONEXIN

En este caso a diferencia del uso de with para archivos externos. cuando lo utilizamos en el caso de bases de datos 
esta funcion no cerrara de manera automatica la base de datos, por lo que de todas formas es necesario cerrarla de manera manual

para ello es recomendable embolver estos with en un bloque try al cual le agregamos la seccion de finally donde asignaremos el cierre
de la base de datos
"""
try:
    with conexion: #este objeto/base de datos no se cerrara automaticamente
        with conexion.cursor() as cursor: #abrimos nuestro cursor y ponemos el nombre de la varible que usaremos como cursor
            #Este bloque with cerrara automaticamente el cursor por lo que presindiremos del cierre manual mas adelante

            """
            utilizamos un print para ver si se logro la conexion
            y nos mostrara tambien un objeto, su espacio de memoria y los datos que le asignemos
            
            """
            #print(conexion)

            #CREAMOS UN CURSOR

            """
            Un cursor es un objeto que nos va a permitir ejecutar sentencias SQL en posgres
             
             En este caso recuperaremos registros que mas adelante convertiremos en objetos de python
             
            """
            #cursor = conexion.cursor() al usar with nos ahorramos este paso, asignandole ya el nombre
            #creamos una sentencia a la que se le asigna la sentencia que queremos enviar
            sentencia = 'SELECT * FROM persona where id_persona = %s' # %s == Placeholder
            #Placeholder
            """
            Un placeholder en el uso de bases de datos SQL en Python es un valor o marcador de posición utilizado en una 
            consulta SQL para representar un valor desconocido o variable que será proporcionado posteriormente. 
            Se utiliza para evitar problemas de seguridad como la inyección de código SQL y para permitir consultas parametrizadas.
            
            En Python, los marcadores de posición se representan generalmente con signos de interrogación (?) o 
            con formato de nombre (:nombre). Estos marcadores se utilizan en la consulta SQL y luego se vinculan con los 
            valores reales mediante métodos proporcionados por las bibliotecas de acceso a bases de datos, como el método execute().
            """
            id_persona = input('Digite un numero para el id_persona: ') #asignamos el valor el cual dejamos pendiente con el placeholder

            #execute es el metodo que nos permite ejecutar la sentecia
            cursor.execute(sentencia, (id_persona,)) # de esta manera ejecutamos la sentencia
            #le enviamos los parametros del placeholder en forma de tupla, si es un valor no olvidar la coma luego para que se
            #considere como una tupla

            #recuperamos todos los registros
            #metodo fetchall, este metodo nos permite recuperar todos los registros de la sentencia que se a ejecutado
            #los mostrara en una lista de tuplas
            #registros = cursor.fetchall()
            #metodo fetchall

            #el metodo fetchone() mostrara solo un registro por lo que solo mostrara la tupla que pedimos
            registros = cursor.fetchone()
            #mostramos los registros y deberia mostrarnos los registros creados en posgret en la base de persona
            print(registros)
            """
            Esto nos mostrara los datos en una lista, pero cada objeto/elemento/persona
            estara dentro de una tupla con todos sus respectivos datos correspondientes
            """
except Exception as e:
    print(f'Ocurrio un error: {e}')
finally:
    #CERRAR LA CONEXION A LA BASE DE DATOS PORQUE TENEMOS ABIERTO UN OBJETO DE TIPO CURSOR
    #mas adelante veremos que no hace falta hacer esto de forma manual
    #cursor.close() prescindimos de cierre manual gracias al blo que with
    conexion.close()

# https://www.psycopg.org/dovs/usage.html