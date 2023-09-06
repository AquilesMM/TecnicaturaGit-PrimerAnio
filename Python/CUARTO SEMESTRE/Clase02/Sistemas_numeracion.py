# Profundizando en los sistemas de numeracion


# SISTEMA DECIMAL
# Al definir una variable y asignarle un valor numerico, trabajamos por defult en el sistema decimal

a = 10

print(f"a decimal: {a}")

# SISTEMA VINARIO
# Asignaremos el valor de 10 a la literal

a = 0b1010 # la 0b indica que lo que le sigue es binario

print(f"a binario: {a}")

#SISTEMA OCTAL

a = 0o12 #0o indica que lo que le sigue esta determinado en el sistema octal

print(f"a octal: {a}")

# SISTEMA HEXADECIMAL
a = 0xA # 0x indica que lo que le sigue esta en codigo hexadecimal

print(f"a hexadecimal: {a}")


# Conversion de valores y/o sistemas de numeracion

# utilizaremos un constructor de clase, en este caso de clase int
# En este constructor podemos especificar la base sobre la que estamos trabajando, por lo que dependiendo del
# sistema de numeracion cambiara la base. Por ejemplo en el sistema binario la base es dos, en el octal la base es 8
#el constructor int convertira el numero segun sea su base a una base 10
#base decimal
a = int('23', 10) #Indica que el valor 23 esta en un sistema de base 10
print(f"a decimal: {a}")

# base binario
a = int('10111', 2)
print(f"a = base binario: {a}")

#base octal
a = int("27", 8) #indica que el numero 12 esta en sistema base 8 por lo que equivale a un 10 en decimal
print(f"a = base octal: {a}")

#base hexadecimal
a = int('17', 16)
print(f'a = base hexadecimal: {a}')

# Base 5 (0 a 4)
a = int('34', 5)
print(f'a = base 5: {a}')