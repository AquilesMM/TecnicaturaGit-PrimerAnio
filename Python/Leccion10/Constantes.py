# Concepto constante Parte 1
"""
Parte 1
No es exactamente el mismo concepto de constante que en otros lenguajes de programacion, sino que en pyhon
simplemente es una convencion, ya que realmente no existe el concepto de constantes en Python tal cual.

El concepto de constante tiene que ver con definir una variable y que no podamos modificar su valor,
una vez que le hemos asignado el valor a esta variable. Ese concepto tal cual no existe en python

Asi que en python a cualquier variable podemos volver a asignar un valor.

Sin embargo, existe una convencion para trabajar el concepto de constantes y poder simular este concepto en Python.

El nombre de la variable debe escribirse en mayusculas,
esto es parte de la convencion
Asi que una constante para poder identificarla, en primer lugar, definimos el nombre de la variable.

Por ejemplo, en este caso usaremos: MI_CONSTANTE.

y si el nombre de la variable tiene mas de una palabra, entonces, por ejemplo, si tenemos MI_CONSTANTE, vamos a separar cada palabra por guion bajo, Esto
es parte de la convencion para definir el nombre de una constante
"""
# Concepto constante Parte 2
"""
Parte 2
Ahora se acostumbra a que estas variables, que son constantes, se definan en un archivo, en un módulo
por separado y se utilicen fuera de este modulo

"""


class Matematicas:
    PI = 3.1416  # Esta es una variable de clase constante


MI_CONSTANTE = 'Esta es una variable constante'
