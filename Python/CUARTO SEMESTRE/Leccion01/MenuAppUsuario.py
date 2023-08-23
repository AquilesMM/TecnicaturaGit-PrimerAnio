from UsuarioDao import UsuarioDao
from logger_base import log
from Usuario import Usuario

opcion = None

while (opcion != 5):
    print('''
        1- Listar usuarios
        2- Agregar usuario
        3- Actualizar usuario
        4- Eliminar usuario
        5- Salir
    ''')

    opcion = int(input('Ingrese un valor del 1 al 5: '))
    if opcion == 1:
        usuarios = UsuarioDao.seleccionar()
        for usuario in usuarios:
            log.info(usuario)
        print('')
    elif (opcion == 2):
        username_var = input("Ingrese el nombre del usuario: ")
        password_var = input('Ingrese la contraseña del usuario: ')
        valores = Usuario(username=username_var, password=password_var)
        usuario_insertado = UsuarioDao.insertar(valores)
        log.info(f'Usuario insertado = {usuario_insertado}')
        print('')
    elif (opcion == 3):
        id_usuario_var = int(input('Digite el id del usuario a modificar: '))
        username_var = input('Digite el nuevo nombre del usuario de usuario: ')
        password_var = input('Digite la nueva contraseña del usuario: ')
        usuario = Usuario(id_usuario=id_usuario_var, username=username_var, password=password_var)
        usuario_actualizado = UsuarioDao.actualizar(usuario)
        log.info(f'Usuario actualizado: {usuario_actualizado}')

        print('')
    elif (opcion == 4):
        id_usuario_var = input(f'Digite el id del usuario a eliminar: ')
        usuario = Usuario(id_usuario=id_usuario_var)
        usuario_eliminado = UsuarioDao.eliminar(usuario)
        log.info(f'El usuario eliminado es: {usuario_eliminado}')
        print('')
    elif (opcion == 5):
        print('')
        print('gracias por utilizar el sistema')
        print('')
    else:
        print('opcion incorrecta, ingrese un valor admsible')

