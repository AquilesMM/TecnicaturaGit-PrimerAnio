#SOBRE ESCRITURA METODO DUNDER STR

#Importamos la clase persona y empleado ya que trabajaremos con ella

from Persona import * #importamos todas las clases, o todo el modulo de la clase persona

persona1 = Persona("Raul", 43)
print(persona1)
"""
si el metodo __str__ no esta sobreescrito al igual que en java, cuando llamemos al objeto este nos mostrara el espacio de memoria
sobreescribimos __str__ para que en lugar de hacer eso nos de una descripcion de los atributos que tiene guardados

Con el metodo dunder str al llamarlo ahora veremos los datos que almacena, aunque todos seran tipo sring/cadena
"""

empleado3 = Empleado("Mily", 20, 80000)
print(empleado3)