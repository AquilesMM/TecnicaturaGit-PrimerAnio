import math
from decimal import Decimal

# NaN (Not a Number)

#LA CADENA DEBE SER TEXTUALMENTE ("NAN") no importa si es mayusculas, minusculas o mixta
a = float("nan") # creamos un float con un valor de NaN (no es sensible a mayusculas ni minusculas)
print(f'a: {a}')

#Modulo math
a = float('nan')
print(f'Es de tipo NaN(Not a Number)?: {math.isnan(a)}')

#Modulo decimal
a = Decimal('NaN')
print(f'Es de tipo NaN(Not a Number)?: {math.isnan(a)}')