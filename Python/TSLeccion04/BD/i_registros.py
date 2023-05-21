#insertar registros

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


            # cursor = conexion.cursor() al usar with nos ahorramos este paso, asignandole ya el nombre
            # creamos una sentencia a la que se le asigna la sentencia que queremos enviar
            sentencia = 'INSERT INTO persona (nombre, apellido, email)VALUES (%s, %s, %s)' #sentencia para insertar
            #insetamos en tabla persona, (columnas) valor (los valores que quedan como placeholder en este caso)
            #estos seran valores nuevos, no ocuparan ningun lugar ya existentes

            valores = ('Carlos', 'Lara', 'clara@gmail.com') # Es una tupla
            #conexion.commit() esta sentencia la hace with de manera automatica, por lo que no es necesario utilizarla
            #esta funcion se utiliza para guardar los cambios en la base de datos
            #with tambien hara roll back en caso de errores.
            #un roll back significa que se da marcha atras a la insercion de datos si uno de los registros falla
            # es decir ninguno de los registros se guardara en la base de datos


            cursor.execute(sentencia, valores)  # de esta manera ejecutamos la sentencia


            registros_insertados = cursor.rowcount
            #la funcion .rowcount()
            """
            La función cursor.rowcount en Python se utiliza en el contexto de trabajar con bases de datos SQL para obtener
             el número de filas afectadas por la última operación SQL ejecutada a través del cursor.
            """
            print(f'Los registros insertados son: {registros_insertados}')


except Exception as e:
    print(f'Ocurrio un error: {e}')
finally:
    # CERRAR LA CONEXION A LA BASE DE DATOS PORQUE TENEMOS ABIERTO UN OBJETO DE TIPO CURSOR
    # mas adelante veremos que no hace falta hacer esto de forma manual
    # cursor.close() prescindimos de cierre manual gracias al blo que with
    conexion.close()