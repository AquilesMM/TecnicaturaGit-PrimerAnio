from CursorDelPool import CursorDelPool
from logger_base import log
from Usuario import Usuario

class UsuarioDao:
    _SELECCIONAR = 'SELECT * FROM usuario ORDER BY id_usuario'
    _INSERTAR = 'INSERT INTO usuario(username, password) VALUES (%s, %s)'
    _ACTUALIZAR = 'UPDATE usuario SET username=%s, password=%s WHERE id_usuario=%s'
    _ELIMINAR = 'DELETE FROM usuario WHERE id_usuario=%s'

    @classmethod
    def seleccionar(cls):
        with CursorDelPool() as cursor:
            log.debug('Seleccionar usuarios')
            cursor.execute(cls._SELECCIONAR)
            registros = cursor.fetchall()
            usuarios = []
            for registro in registros:

                usuario = Usuario(registro[0], registro[1], registro[2])
                usuarios.append(usuario)
            return usuarios

    @classmethod
    def insertar(cls, usuario):
        with CursorDelPool() as cursor:
            log.debug(f'Usuario a insertar: {usuario}')
            valores = (usuario.username, usuario.password)
            cursor.execute(cls._INSERTAR, valores)
            return cursor.rowcount

    @classmethod
    def actualizar(cls, usuario):
        with CursorDelPool() as cursor:
            valores = (usuario.username, usuario.password, usuario.id_usuario)
            cursor.execute(cls._ACTUALIZAR, valores)
            log.debug(f'Usuario Actualizado: {usuario}')
            return cursor.rowcount

    @classmethod
    def eliminar(cls, usuario):
        with CursorDelPool() as cursor:
            valores = (usuario.id_usuario,)
            cursor.execute(cls._ELIMINAR, valores)
            log.debug(f'Los usuarios eliminados son: {usuario}')
            return cursor.rowcount

if __name__ == '__main__':
    # Listar
    usuarios = UsuarioDao.seleccionar()
    for usuario in usuarios:
        log.debug(usuario)

    # Insertar Usuario
    #usuario = Usuario(id_usuario=3, username='kely', password='321')
    #usuario_insertado = UsuarioDao.insertar(usuario)
    #log.debug(f'Usuario insertado: {usuario_insertado}')

    #Actualizar Usuario
    #usuario = Usuario(id_usuario=3, username='quely', password='1455')
    #usuario_actualizado = UsuarioDao.actualizar(usuario)
    #log.debug(f'Usuario actualizado {usuario}')

    #Eliminar Usuario
    #usuario = Usuario(id_usuario=3)
    #usuario_eliminado = UsuarioDao.eliminar(usuario)
    #log.debug(f'usuario eliminado: {usuario_eliminado}')