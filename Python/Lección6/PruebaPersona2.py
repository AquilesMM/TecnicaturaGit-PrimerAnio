#Vamos a importar la clase persona2
#es lo mismo que importar clase/archivo/modulo

from Persona2 import Persona2   #De esta manera quedaria importada la clase Persona2 del modulo Persona2
"""
El modulo podria tener muchas clases y podriamos importar mas de una clase

si queremos importar todas agregamos un  asterisco, de esta manera:
from Persona2 import *
esto importaria todo lo que hay en ese modulo
"""
print("Creacion de objetos".center(50, "-"))
if __name__ == "__main__":
    persona5 = Persona2("Lionel", "Messi", 35)
    persona5.mostrar_detalles()
    """
    Esto nos mostrara lo que hemos echo en este archivo, pero al llamar a la clase persona2 tambien ejecutara
    todos los objetos y cosas que hayamos echo en ese archivo, por lo que no usaremos persona1 como objeto ya que existe
    dicho objeto en la clase
    """
    print(__name__)

#Destructor de objetos
"""
NADA QUE VER CON LA DESTRUCCION DE OBJETOS

Funcion center, esta es de tipo string
y requiere los siguientes parametros:
self, se le asigna autimatico, no se necesita ponerlo
__width: un numero
__fillchar: necesita un char

esta funcion centra el texto en un rango de caraacteres de el numero que pongamos
y el char/simbolo/caracter que pongamos se pondra al rededor de el texto
"""
print("Eliminacion de Objetos".center(50, "-"))


"""
ya creamos el metodo para eliminar objetos en el archivo y clase Persona2
ahora lo mandaremos a llamar de la siguiente manera

Esto es algo que no se suele ver porque existe el concepto de recolector de basura en python
esto hace que todo se elimine al terminar la ejecucion o cuando una variable deja de apuntar a el objeto se elimina

"""
del persona5