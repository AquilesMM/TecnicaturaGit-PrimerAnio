#insertar varios registros

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

            valores = (
                ('Carlos', 'Lara', 'clara@gmail.com'),
                ('Marcos', 'Canto', 'mcanto@gmail.com'),
                ('Marcelo', 'Cuenca', 'cuencaM@gmail.com')
            ) # Es una tupla de tuplas

            cursor.executemany(sentencia, valores)  # de esta manera ejecutamos la sentencia
            #diferencia entre execute y executemany
            """
            existen dos métodos relacionados pero con diferencias importantes: execute() y executemany(). 
            Ambos métodos son utilizados para ejecutar sentencias SQL en una base de datos, pero tienen diferentes propósitos 
            y formas de uso:
            
            execute(): Este método se utiliza para ejecutar una única sentencia SQL que puede o no tener parámetros. 
            Se utiliza cuando se desea ejecutar una consulta o una operación que afecte a una sola fila de la base de datos.
            
            executemany(): Este método se utiliza cuando se desea ejecutar una sentencia SQL múltiples veces con 
            diferentes conjuntos de parámetros. Es útil cuando se quiere insertar, actualizar o eliminar múltiples filas 
            en una sola operación.
            """

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