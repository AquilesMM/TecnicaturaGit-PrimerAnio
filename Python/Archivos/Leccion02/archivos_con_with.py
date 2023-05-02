# buenas practicas

"""
siempre debemos abrir un archivo con el metodo open y cerrarlo con close
de no cerrarlo python lo hara de manera automatica, pero una buena practica es cerrarlos

los archvos deben trabajarse con try/catch y deben tener su finally

"""


#Manejo de contexto with o context manager o administrador de recursos
from Leccion02.manejo_archivos import ManejoArchivos

"""
esta es una sintaxis simplificada que de manera automatica cierra el archivo

lo que hacemos en este contexto primero abrirlo con todas las caracteristicas deseadas, luego se lo asignamos a una variable 
la funcion open, regresa un flujo, es decir el archivo. La ventaja de esta sintaxis es que de manera automatica
abre y cierra el archivo.

En este contexto no es necesario ni el try ni el finally  
en el contexto de with lo que se ejecuta de manera automatica son diversos metodos:
__enter__ : en este metodo es donde se abre el archivo
__exit__ : este metodo es el que cierra el archivo
"""
#with open('prueba.txt', 'r', encoding='utf8') as archivo:
    #print(archivo.read())

with ManejoArchivos('prueba.txt') as archivo:
    print(archivo.read())
