# Declaramos una variable
# METODO OPEN
"""
sirve para abrir un archivo existente o inexistente (crearlo)
primero le asignamos el nombre del archivo a abrir, en caso de este no existir lo creara
este por default se creara y guardara en la misma carpeta de archivo de donde se este ejecutando el codigo
la 'w' a continuacion quiere decir write, esto es lo que nos permite que luego podamos escribir en el archivo

es importante aclarar que para este punto no se pueden agregar palabras con tildes
es decir, estas se agregran pero seran tomados como caracteres desconocidos y remplazandolos por el caracter
por default del signo de pregunta ? en un rombo, y nos dira que tiene un error de encoding

para poder agregar palabras con tildes hacemos lo siguiente: encoding='utf8'
encoding utf8 es el juego de caracteres que soporta las tildes

este metodo puede llegar a arrojar una excepcion, por lo que suele estar dentro de un try
"""
try:
    archivo = open('prueba.txt', 'w', encoding='utf8')
    """
    El metodo write es obviamente para escribir en el archivo 
    """
    archivo.write('Programamos con diferentes tipos de archivos, ahora en txt.\n')
    archivo.write('Los acentos sin importantes para las palabras\n')
    archivo.write('como por ejemplo: acción y producción\n')
    archivo.write('letras: r/read,\n a/apend,\n w/write,\n x/crea un archivo\n ')
    archivo.write('t/texto o text sirve para especificar el tipo de archivo, \n ')
    archivo.write('b/ binary para archivos binarios, imagenes,videos, pdf, etc \n ')
    archivo.write('w+/ esto es un modo combinado para leer y escribir \n ')
    archivo.write('r+/ leer y escribir, como w+ pero al revez\n ')
    archivo.write('Saludos a todos los alumnos de la tecnicatura')
    archivo.write('Con esto terminamos.')
except Exception as e:
    print(e)
finally:  # siempre se ejecuta
    """
    asi como abrimos el archivo es importate cerrarlo
    para ello utilizamos el siguiente metodo: .close
    
    al utilizar este metodo en finally lo que hacemos es cerrar el archivo haya o no arrojado un error
    si queremos hacer alguna modificacion o usar cualquier metodo o manipular el archivo de alguna forma luego de cerrarlo
    este dara error.
    """
    archivo.close()  # con esto se debe cerrar el archivo

#Aclaracion
"""
al encontrarse el archivo txt en la misma carpeta que el codigo, no es necesario especificar la ruta de donde se encuentra 
el archivo
"""

