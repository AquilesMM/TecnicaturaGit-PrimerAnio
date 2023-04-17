#Trabajaremos sin try/ catch para simplificar la explicacion

# letras: 'r'/read,'a'/apend,'w'/write,'x'/crear un archivo,'t' texto o text,b/binarybinarios, imagenes,videos, pdf, etc
# w+/leer y escribir, r+/ leer y escribir, como w+ pero al revez

#Modo r/read
"""
dentro de los multiples modos de leer un archivo, este es el metodo por default
en este caso abre un archivo para lectura y en caso de no existir dara un error

a la hora de leer un archivo con caracteres especiales como las tildes, tambien es importante
agregar el juego de caracteres correspondientes

dentro de los parentesis del read, podemos por ejemplo poner la cantidad de caracteres que queramos que lea
es decir, si por ejemplo ponemos el numero 5 solo leera los 5 primeros caracteres
en el caso de poner dos print seguidos y especificar el numero de caracteres a leer, el segundo mostrara los caracteres
a partir de donde quedo el primero y asi sucesivamente, en el caso de no especificar en el segundo, mostrara todo el archivo
pero a partir de donde finalizo el primer read

readline: si no especificamos ninguna linea, leera la primera por default, si ponemos otro readline leera la siguiente
entre los parentesis tambien podemos especificar que numero de linea queremos que se lea

readlines: esto devolvera tod0 el texto separado linea por linea en una lista, para ello no hace falta utilizar un for como
se mostro en algun ejemplo. entre las parentesis podemos ingresar el numero de elementos que queremos que muestre
es decir que de poner el numero 1 mostrara el primer elemento de la lista, que en este caso seria la primera linea
"""
#Metodo a/apend
"""
este metodo sirve para anexar informacion que contiene ya cierta informacion, de esta manera
no se borrara la informacion anterior, sino que se agregara

en caso de no existir el archivo lo creara
"""

#Metodo x/
"""
Esta sirve para crear un archivo archivo especificado, pero regresara un error si ese archivo no existe
"""

archivo = open('prueba.txt', 'r', encoding='utf8')
#print(archivo.read())
#print(archivo.read(5))
#print(archivo.read(10))
#print(archivo.readline())

#Aclaracion
"""
al encontrarse el archivo txt en la misma carpeta que el codigo, no es necesario especificar la ruta de donde se encuentra 
el archivo
"""

#vamos a iterear el archivo
#for linea in archivo:
    #print(linea) #esto nos mostrara linea por linea todas las lineas del archivo

#print(archivo.readlines()) #este metodo devuelve una lista

#Anexamos informacion, copiamos a otro archivo
archivo2 = open('copia.txt', 'w', encoding='utf8')
archivo2.write(archivo.read())
archivo.close()#cerramos el primer archivo
archivo2.close() #cerramos el segundo archivo
"""
al utilizar apend cada vez que ejecutemos el codigo se copiara y agregara la informacion del otro archivo
sumandose una y otra vez. para evitar eso podemos cambiar la a por w y esto ya no ocurrira
"""
print('se ha terminado el proceso de leer y copiar archivos')





