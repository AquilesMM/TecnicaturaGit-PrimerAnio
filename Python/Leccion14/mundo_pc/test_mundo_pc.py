from Python.Leccion14.mundo_pc.computadora import Computadora
from Python.Leccion14.mundo_pc.monitor import Monitor
from Python.Leccion14.mundo_pc.orden import Orden
from Python.Leccion14.mundo_pc.raton import Raton
from Python.Leccion14.mundo_pc.teclado import Teclado

teclado1 = Teclado('HP', 'USB')
monitor1 = Monitor('HP', '15 Pulgadas')
raton1 = Raton('Hp', 'USB')
computadora1 = Computadora('Hp', monitor1, teclado1, raton1)

teclado2 = Teclado('Acer', 'Bluetooth')
monitor2 = Monitor('Acer', '27 Pulgadas')
raton2 = Raton('Acer', 'Bluetooth')
computadora2 = Computadora('Acer', monitor2, teclado2, raton2)

computadoras1 = [computadora1, computadora2]
orden1 = Orden(computadoras1)
print(orden1)

teclado1 = Teclado('HP', 'USB')
monitor1 = Monitor('HP', '15 Pulgadas')
raton1 = Raton('Hp', 'USB')
computadora1 = Computadora('Hp', monitor1, teclado1, raton1)

teclado2 = Teclado('Acer', 'Bluetooth')
monitor2 = Monitor('Acer', '27 Pulgadas')
raton2 = Raton('Acer', 'Bluetooth')
computadora2 = Computadora('Acer', monitor2, teclado2, raton2)

computadoras1 = [computadora1, computadora2]
orden1 = Orden(computadoras1)
print(orden1)