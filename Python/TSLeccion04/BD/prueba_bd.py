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
cursor = conexion.cursor()
#creamos una sentencia a la que se le asigna la sentencia que queremos enviar
sentencia = 'SELECT * FROM persona'
#execute es el metodo que nos permite ejecutar la sentecia
cursor.execute(sentencia) # de esta manera ejecutamos la sentencia

#recuperamos todos los registros
#metodo fetchall, este metodo nos permite recuperar todos los registros de la sentencia que se a ejecutado
registros = cursor.fetchall()
#mostramos los registros y deberia mostrarnos los registros creados en posgret en la base de persona
print(registros)
"""
ESto nos mostrara los datos en una lista, pero cada objeto/elemento/persona
estara dentro de una tupla con todos sus respectivos datos correspondientes
"""

#CERRAR LA CONEXION A LA BASE DE DATOS PORQUE TENEMOS ABIERTO UN OBJETO DE TIPO CURSOR
#mas adelante veremos que no hace falta hacer esto de forma manual
cursor.close()
conexion.close()

