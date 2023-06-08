import psycopg2 as bd

conexion = bd.connect(
    user="postgres", #ponemos el usuario de la base de datos
    password="Aquiles2710",
    host='127.0.0.1', #Este generalmente es el mismo
    port='5432',
    database='test_bd'
)

try:
    with conexion:
        with conexion.cursor() as cursor:
            #al trabajar con with, tanto el autocommit, como el commit, no son necesarios
            #ya que esto se hace de manera automatica
            #tampoco es necesaria la sentencia cursor = conexion.cursor

            sentencia = 'INSERT INTO persona(nombre, apellido, email)VALUES(%s, %s, %s)'
            valores = ('Alex', 'Rojas', 'arojas@gmail.com')
            cursor.execute(sentencia, valores)

            #Agregamos otros querys, ya que una transaccion puede manejar mas de una sentencia

            sentencia = 'UPDATE persona SET nombre=%s, apellido=%s, email=%s WHERE id_persona=%s'
            valores = ('Juan Carlos', 'Roldan', 'jcroldan@gmail.gmail.com', 1)
            cursor.execute(sentencia, valores)




except Exception as e:
    #tampoco es necesario el roll back ya que tambien se hace de manera automatica con with
    print(f'Ocurrio un error, se hizo un rollback: {e}')
finally:
    conexion.close()
print('Termina la transaccion')

