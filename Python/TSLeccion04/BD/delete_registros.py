# eliminar varios registros

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

            sentencia = 'DELETE FROM persona WHERE id_persona IN %s'
            #IMPORTANTICIMO FILTRAR CON WHERE O SE BORRARAN TODOS LOS REGISTROS

            entrada = input('Digite los numeros de registros a eliminar (separados por coma): ')
            valores = (tuple(entrada.split(',')),) #tupla de tuplas

            cursor.execute(sentencia, valores)

            registros_eliminados = cursor.rowcount

            print(f'Registros eliminados: {registros_eliminados}')


except Exception as e:
    print(f'Ocurrio un error: {e}')
finally:
    # CERRAR LA CONEXION A LA BASE DE DATOS PORQUE TENEMOS ABIERTO UN OBJETO DE TIPO CURSOR
    # mas adelante veremos que no hace falta hacer esto de forma manual
    # cursor.close() prescindimos de cierre manual gracias al blo que with
    conexion.close()