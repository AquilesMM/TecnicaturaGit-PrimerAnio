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

            """
            utilizamos un print para ver si se logro la conexion
            y nos mostrara tambien un objeto, su espacio de memoria y los datos que le asignemos

            """
            # print(conexion)


            # cursor = conexion.cursor() al usar with nos ahorramos este paso, asignandole ya el nombre
            # creamos una sentencia a la que se le asigna la sentencia que queremos enviar
            sentencia = 'SELECT * FROM persona where id_persona IN %s'
            entrada = input('Digite los id_persona a buscar (separados por coma): ')
            llaves_primarias = (tuple(entrada.split(', ')), ) #convertimos la entrada a una tupla y separamos los valores por las comas
            #la funcion eliminara las comas dejando solo los numeros, y estos seran transformados en una tupla
            # execute es el metodo que nos permite ejecutar la sentecia
            cursor.execute(sentencia, llaves_primarias)  # de esta manera ejecutamos la sentencia
            # le enviamos los parametros del placeholder en forma de tupla, si es un valor no olvidar la coma luego para que se
            # considere como una tupla

            # recuperamos todos los registros
            # metodo fetchall, este metodo nos permite recuperar todos los registros de la sentencia que se a ejecutado
            # los mostrara en una lista de tuplas
            # registros = cursor.fetchall()
            # metodo fetchall

            # el metodo fetchone() mostrara solo un registro por lo que solo mostrara la tupla que pedimos
            registros = cursor.fetchall()
            # mostramos los registros y deberia mostrarnos los registros creados en posgret en la base de persona
            for registro in registros:
                #SOLO MOSTRARA REGISTROS EXISTENTES AUNQUE PONGAMOS PARA VER MAS EN ID DE SENTENCIA
                #mostramos todas las listas de manera iterada
                print(registro)

            """
            Esto nos mostrara los datos en una lista, pero cada objeto/elemento/persona
            estara dentro de una tupla con todos sus respectivos datos correspondientes
            """
except Exception as e:
    print(f'Ocurrio un error: {e}')
finally:
    # CERRAR LA CONEXION A LA BASE DE DATOS PORQUE TENEMOS ABIERTO UN OBJETO DE TIPO CURSOR
    # mas adelante veremos que no hace falta hacer esto de forma manual
    # cursor.close() prescindimos de cierre manual gracias al blo que with
    conexion.close()
