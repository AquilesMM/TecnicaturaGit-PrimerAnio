import os  # importamos para sistema operativo


# importamos desde el sistema operativo, la idea es que desde aqui utilicemos el metodo remove


class CatalogoPeliculas():
    ruta_archivo = 'peliculas.txt'

    @classmethod  # este metodo puede acceder directamente a los atributos de clase
    def agregar_peliculas(cls, pelicula):
        with open(cls.ruta_archivo, 'a', encoding='utf8') as archivo:
            archivo.write(f'{pelicula.nombre}\n')

    @classmethod
    def listar_peliculas(cls):
        with open(cls.ruta_archivo, 'r', encoding='utf8') as archivo:
            print(f'catalogo de peliculas'.center(50, '-'))
            print(archivo.read())

    @classmethod
    def eliminar_peliculas(cls):
        os.remove(cls.ruta_archivo)
        print(f'archivo eliminado: {cls.ruta_archivo}')
