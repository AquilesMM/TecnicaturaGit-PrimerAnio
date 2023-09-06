# Profundizando en el tipo float
#toda operacion / calculo que se realice con un float tendra como resultado un float


a = 3.0 #esto ya seria de tipo float

print(f'a: {a:.2f}')#con :.2f indicamos que queremos que muestre dos numeros luego del punto y que es de tipo float

# Constructor de tipo float -> puede recibir enteros y de tipo string

a = float(10) # Le pasamos un tipo entero(int)

print(f'a: {a:.2f}') # mostrara el entero como tipo float

a = float('10') # Le pasamos un tipo string(str)

print(f'a: {a:.2f}') # mostrara el str como tipo float


#Notacion exponencial (valores positivos o negativos)
#permite simplificar los numeros con demaciados ceros seguidos, en casos demaciados grandes el id, no mostrara todos los ceros
#sino que tambien mostrara el numero en notracion exponencial

a = 3e5 #le agregamos 5 ceros detras = 5 * 10e5
print(f'a: {a:.2f}') #nos mostrara los dos ceros luego de la coma si se lo pedimos

#con numeros negativos

a = 3e-5
print(f'a: {a:.5f}')


#cualquier calculo que incluye un float, da como resultado un float

a = 4.0 + 5
print(a)
print(type(a))
