
#PROGRAMAMOS LOS METODOS PARA context Manager
"""
No necesita extender de ninguna otra clase en particular
sin embargo si debe implementar los metodos __enter__ y __exit__
"""
class ManejoArchivos:
    def __init__(self, nombre):
        self.nombre = nombre

    def __enter__(self):
        print('Obtenemos el recurso'.center(50, '-'))
        self.nombre = open(self.nombre, 'r', encoding='utf8') # Encapsulamos el codigo dentro del metodo
        return self.nombre

    def __exit__(self, tipo_exception, valor_exception, traza_error):
        """
        El metodo exit nos pedira parametros necesarios, no es necesario que se quede con los nombres
        por default
        estos parametros son: 1-tipo de excepcion, 2- valor de la excepcion y 3- taza/truck back es decir todo el texto del
        error, toda la lista de errores.

        No es obligarorio utilizar todos los valores pero si debemos ponerlos como parametros para cumplir con la firma de
        __exit__
        """
        print('cerramos el recurso'.center(50, '-'))
        if self.nombre:
            """
            si self.nombre == verdadero (es decir esta abierto) entonces se cierra
            """
            self.nombre.close()
