

# Sobrecarga de operadores
"""
esto quiere decir que un mismo operador se puede usar de multiples maneras depende el contexto
en este caso veremos el operador de suma +
"""
#numeros
a = 3
b = 5
print(a + b) # Funcion del operador: Suma los dos numeros

#Strings
a = "Hola "
b = "mundo "
print(a + b) # Funcion del operador: Concatenar

#listas
a = [3, 4, 5]
b = [6, 7, 8, 9]
print(a + b) # Funcion de el operador: une listas (crea una a partir de las dos)

# miObjeto1 + miObjeto2 # si fuesen objetos no se podria hacer porque el operador en si de suma, necesitara una sobrecarga
# para poder realizar la operacion, para ello habra que sobreescribir el metodo heredado de la clase objecto osea el metodo asociado al operador
# en este caso sera __add__

