


#bool contiene valores de true y false
#cuando trabajamos con booleanos y tipos numericos el 0 equivale a false, y el resto de valores son true

valor = 0
resultado = bool(valor) # revisamos con el constructor bool si es true o false 0=f >0=true
print(f'valor: {valor}, Resultado: {resultado}')

valor = 15
resultado = bool(valor) # revisamos con el constructor bool si es true o false 0=f 0<=true 0>=true
print(f'valor: {valor}, Resultado: {resultado}')

valor = -1
resultado = bool(valor) # revisamos con el constructor bool si es true o false 0=f >0=true 0>=true
print(f'valor: {valor}, Resultado: {resultado}')


# Tipo string -> False '' (cadena vacia), true -> demás valores
valor = ''
resultado = bool(valor)
print(f'valor: {valor}, Resultado: {resultado}')

valor = 'ejemplo'
resultado = bool(valor)
print(f'valor: {valor}, Resultado: {resultado}')


#Tipo colecciones -> False para colecciones vacias
#Tipo colecciones -> True para todas las demas
#Lista
valor = []
resultado = bool(valor)
print(f'valor de una lista vacia: {valor}, Resultado: {resultado}')

valor = [2, 3, 4]
resultado = bool(valor)
print(f'valor de una lista: {valor}, Resultado: {resultado}')


#Tuplas
valor = ()
resultado = bool(valor)
print(f'valor de una tupla vacia: {valor}, Resultado: {resultado}')

valor = (2, )#la coma lo identifica como tupla
resultado = bool(valor)
print(f'valor de una tupla: {valor}, Resultado: {resultado}')

#Diccionario
valor = {}
resultado = bool(valor)
print(f'valor de un diccionario vacio: {valor}, Resultado: {resultado}')

valor = {'Nombre': 'Juan',
         'Apellido': 'Perez'}
resultado = bool(valor)
print(f'valor de un diccionario : {valor}, Resultado: {resultado}')

# Sentencias de control con bool

if 's':
    print('Regresa verdadero')
    # Un tipo string con comillas vacias representa un false, por lo que si el string del if, esta vacio, saltara al
    # else, y de contener algo, se ejecutara el if
    #esta comprobacion se puede hacer con cualquier tipo de ejemplo que vimos, en la que un 0 o algo vacio
    #representa falso, por lo que podemos usar if, con colecciones, str, valores numericos, etc
else:
    print('Regresa falso')


#ciclos
variable = 3 #podemos cambiarlo por 0 para que el while pase al else
while variable:
    #mientras variable sea verdadero, es decir tenga un valor distinto a 0
    print('regresa verdadero')
    break
else:
    print('regresa falso')
