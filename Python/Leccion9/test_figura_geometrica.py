from Cuadrado import Cuadrado
from Rectangulo import Rectangulo

cuadrado1 = Cuadrado(5, 'Azul')
cuadrado1.alto = -10
# IMPORTACIA DE LA VALIDACION EN SETTER Y CREACION DE OBJETO
"""En este caso, como pusimos una validacion en los setters
al no cumplir la condicion igresada en el metodo de validacion, el setter no asignara el valor
al atributo, manteniendo de esta manera el valor anterior.

hicimos esto tanto en el setter como en la asignacion de creacion de objeto, ya que de no hacerse en el setter, aunque pasara
el filtro de creacion original, si se reasignaba un valor erroneo lo permitiria
en cambio si solo estuviera seter, en la creacion se podria guardar un valor erroneo, pero no se podria reasignar un valor erroneo
en este caso, de esta manera, sera imposible asignar un valor erroneo
"""

print(cuadrado1.ancho)
print(cuadrado1.alto)
print(f'Calculo del area del Cuadrado: {cuadrado1.calcular_area()}')



print("Creacion de objeto clase Cuadrado".center(50, "_"))

#METODO MRO

"""
MRO = Method Resolution Order

Al trabajar con herencia multiple es importante saber  el orden en que se van llamando las clases padres

Este metodo nos permite conocer las gerarquias de las clases frente a la clase actual (la que se estamos llamando al metodo)
MRO ayuda a solucionar conflictos, ya que nos muestra que clases se estan solucionando y podria ayudarnos a detectar los conflictos

Ejemplo: si queremos saber el orden en que se llaman o devuelven los metodos, nosotros usaremos MRO
"""
print(Cuadrado.mro()) #esto nos dara la informacon del orden en que se ejecutaran los metodos segun la erarquia de clase que ya hemos definido
#el orden en que se mostrara es la clase en la que estamos, luego la primera clase que usara (FigGeo), luego la tercera (color), y por ultimo que todas heredan
#De object
#es decir que mostrara en el orden que se usan desde el mas reciente hasta el ultimo
print(cuadrado1)

#Ejercicio Rectangulo
print("Creacion del objeto Clase Rectangulo".center(50, "_"))

rectangulo1 = Rectangulo(8, 5, "Negro")
rectangulo1.ancho = 15

# IMPORTACIA DE LA VALIDACION EN SETTER Y CREACION DE OBJETO
"""En este caso, como pusimos una validacion en los setters
al no cumplir la condicion igresada en el metodo de validacion, el setter no asignara el valor
al atributo, manteniendo de esta manera el valor anterior.

hicimos esto tanto en el setter como en la asignacion de creacion de objeto, ya que de no hacerse en el setter, aunque pasara
el filtro de creacion original, si se reasignaba un valor erroneo lo permitiria
en cambio si solo estuviera seter, en la creacion se podria guardar un valor erroneo, pero no se podria reasignar un valor erroneo
en este caso, de esta manera, sera imposible asignar un valor erroneo
"""


print(f'alto = {rectangulo1.alto}')
print(f'ancho = {rectangulo1.ancho}')
print(f'color = {rectangulo1.color}')
print(f'area rectangulo = {rectangulo1.calcular_area()}')
print(rectangulo1)
#figura1 = FiguraGeometrica() No se puede instanciasr. Es abstracta

print(Cuadrado.mro()) #ahora mro luego de los ambios echos nos mostrara las clases abc.ABC

