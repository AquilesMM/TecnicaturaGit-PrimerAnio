import psycopg2 as bd
"""
TRANSACCIONES

Una transaccion es cuando queremos ejecutar varias consultas sobre lo que es la base de datos. 
Estas consultas van a modificar el estado de la base de datos, podemos ejecutar un INSERT, UPDATE, un queary de tipo DELETE, etc

Tambien pueden existir sentencias de tipo select (no modifica la base de datos), estas pueden participar en las transacciones, 
pero no es necesario que por si mismas abran una transaccion ni que termine una transaccion

El concepto de transaccion es que se ejecutan todos los querys de manera correcta, o ninguno de ellos a causa de un error,
es decir, en las transacciones todos los querys deben ejecutarse correctamente, de lo contrario ninguno de ellos se guarda 
en lo que es la base de datos. Si podemos observar que todos los quearys se ejecutan de manera exitosa, entonces podemos 
hacer commit de la transaccion. (commit = guardar cambios en BD)

SOLO SE GUARDARAN CUANDO TODOS LOS CAMBIOS DE TODAS LAS SENTENCIAS HAYAN SIDO EXITOSOS

SI CUALQUIERA FALLA, NO SE GUARDA NINGUN CAMBIO  --- SE HACE UN ROLL BACK --- 
(dar marcha atras a todo posible cambio que se haya podido dar)




"""
conexion = bd.connect(
    user="postgres", #ponemos el usuario de la base de datos
    password="Aquiles2710",
    host='127.0.0.1', #Este generalmente es el mismo
    port='5432',
    database='test_bd'
)

try:
    # No usaremos with ya que si bien este cierra automaticamenta la conexion y hace roll back automatico en caso de errores
    #En este caso o haremos tod0 de manera manual
    #Para poder comprobar el concepto de transacciones en primer lugar, vamos a utilizar el concepto con el objeto conexion y
    #autocomit
    conexion.autoctommit = False
    #Esto se hace para que no se guarde de manera automatica, con False le indicamos que el autocommit no suceda
    #Esto quiere decir que si no hacemos commit al finalizar la sentencia, entonces no se guardaran los cambios

    cursor = conexion.cursor()
    sentencia = 'INSERT INTO persona(nombre, apellido, email)VALUES(%s, %s, %s)'
    valores = ('Maria', 'Esparza', 'mesparza@gmail.com')
    cursor.execute(sentencia, valores)
    #Para que la transaccion se realice correctamente, debemos hacer un commit, caso contrario no se guardaran los cambios
    conexion.commit() #Hacemos el commit manualmente
    #Cabe recalcar que si ponemos como valor True a autocommit podemos dar el mismo resultado y ya no hara falta hacer el commit
    #SIN EMBARGO ESTO NO ES UNA BUENA PRACTICA
    #otra forma de hacerlo es borrar la linea de autocommit, y mantener la linea del commit al final de la transaccion
    #no es mala practica hacerlo

    print('Termina la transaccion')

except Exception as e:
    #En la parte de except (catch) agregaremos el rollback, para que en caso de detectarse un error, y alguna sentencia
    #no se ejecute correctamente, se haga un rollback de cualquier posible cambio efectuado
    conexion.rollback()
    print(f'Ocurrio un error, se hizo un rollback: {e}')
finally:
    conexion.close()

