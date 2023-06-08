import psycopg2 as bd

conexion = bd.connect(
    user="postgres", #ponemos el usuario de la base de datos
    password="Aquiles2710",
    host='127.0.0.1', #Este generalmente es el mismo
    port='5432',
    database='test_bd'
)

try:

    conexion.autocommit = False #inicia la transaccion

    cursor = conexion.cursor()
    sentencia = 'INSERT INTO persona(nombre, apellido, email)VALUES(%s, %s, %s)'
    valores = ('Jorge', 'Prol', 'jprol@gmail.com')
    cursor.execute(sentencia, valores)

    #Agregamos otros querys, ya que una transaccion puede manejar mas de una sentencia

    sentencia = 'UPDATE persona SET nombre=%s, apellido=%s, email=%s WHERE id_persona=%s'
    valores = ('Juan Carlos', 'Perez', 'jcperez@gmail.gmail.com', 1)
    cursor.execute(sentencia, valores)

    conexion.commit() #se cierra la transaccion

    print('Termina la transaccion')

except Exception as e:
    conexion.rollback()
    print(f'Ocurrio un error, se hizo un rollback: {e}')
finally:
    conexion.close()

