# actualizar/modificar varios registros

import psycopg2  # Esto es para poder conectarnos a Postre

conexion = psycopg2.connect(
    user="postgres",  # ponemos el usuario de la base de datos
    password="Aquiles2710",
    host='127.0.0.1',  # Este generalmente es el mismo
    port='5432',
    database='test_bd'
)
try:
    with conexion:  # este objeto/base de datos no se cerrara automaticamente
        with conexion.cursor() as cursor:  # abrimos nuestro cursor y ponemos el nombre de la varible que usaremos como cursor
            # Este bloque with cerrara automaticamente el cursor por lo que presindiremos del cierre manual mas adelante


            sentencia = 'UPDATE persona SET nombre=%s, apellido=%s, email=%s WHERE id_persona=%s'
            #IMPORTANTICIMO FILTRAR CON WHERE PARA QUE NO SE CAMBIEN TODOS LOS VALORES
            #para actualizar varios registros mantenemos la misma sentencia

            valores =(
                ('Juan Carlos', 'Roldan', 'rcarlos@gmail.com', 4),
                ('Romina', 'Ayala', 'ayalar@gmai.com', 5)
            ) # Es una tupla de tuplas
            #lo que cambiamos es que en vez de ser una tupla, sera una tupla de tuplas con los valores que queramos actualizar
            #tambien pasa de ser execute a executemany
            cursor.executemany(sentencia, valores)

            registros_actualizados = cursor.rowcount

            print(f'Los registros actualizados: {registros_actualizados}')


except Exception as e:
    print(f'Ocurrio un error: {e}')
finally:
    # CERRAR LA CONEXION A LA BASE DE DATOS PORQUE TENEMOS ABIERTO UN OBJETO DE TIPO CURSOR
    # mas adelante veremos que no hace falta hacer esto de forma manual
    # cursor.close() prescindimos de cierre manual gracias al blo que with
    conexion.close()