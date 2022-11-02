from Cuadrado import Cuadrado
from Rectangulo import Rectangulo

cuadrado1 = Cuadrado(5, 'Azul')
print(cuadrado1.ancho)
print(cuadrado1.alto)
print(f'Calculo del area del Cuadrado: {cuadrado1.calcular_area()}')


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

rectangulo1 = Rectangulo(10, 5, "Negro")
print(f'alto = {rectangulo1.alto}')
print(f'ancho = {rectangulo1.ancho}')
print(f'color = {rectangulo1.color}')
print(f'area rectangulo = {rectangulo1.area_rectangulo()}')
print(rectangulo1)