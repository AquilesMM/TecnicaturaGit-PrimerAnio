import math
from decimal import Decimal


# Manejo de valores infinitos
#teniendo en cuneta que el concepto de infinito no es posible de representar en numeros, existen diversos metodos
# para representar este concepto
#utilizar el constructor de la clase float
infinito_positivo = float('inf') #esta cadena representa el concepto de infinito positivo
print(f'Infinito positivo: {infinito_positivo}')
#en conosola, se vera como un valor de cadena inf, para poder comprobar si es un inifito positivo, podemos
#utilizar el modulo math
#esta comprobacion en realidad no nos dira si es positivo o negativo, solo si es infinito
print(f'Es infinito: {math.isinf(infinito_positivo)}')


infinito_negativo = float('-inf')
#comprobamos si es negativo o positivo
print(f'infinito negativo: {infinito_negativo}')
#comprobamos si es un inifinito
print(f'Es infinito? {math.isinf(infinito_negativo)}')


# Crearemos infinitos mediante el modulo math
infinito_positivo = math.inf #esta cadena representa el concepto de infinito positivo
print(f'Infinito positivo: {infinito_positivo}')
print(f'Es infinito: {math.isinf(infinito_positivo)}')

# infinito negativo con math
infinito_negativo = -math.inf
print(f'infinito negativo: {infinito_negativo}')
print(f'Es infinito? {math.isinf(infinito_negativo)}')

#Modulo decimal
infinito_positivo = Decimal('infinity') #esta cadena representa el concepto de infinito positivo
print(f'Infinito positivo: {infinito_positivo}')
print(f'Es infinito: {math.isinf(infinito_positivo)}')

#infinito negativo con decimal
infinito_negativo = Decimal('-infinity')
print(f'infinito negativo: {infinito_negativo}')
print(f'Es infinito? {math.isinf(infinito_negativo)}')