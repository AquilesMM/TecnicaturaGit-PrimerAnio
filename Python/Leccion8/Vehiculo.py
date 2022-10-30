class Vehiculo:
    '''
    Definir una clase padre llamada vehiculo y dos clases hijas llamadas
    Auto y Bicicleta, las cuales heredan de la clase padre vehiculo. La clase padre
    debe tener los siguiente atributos y metodos:
    Vehiculo (clase padre)
    -Atributos(color,ruedas)
    -Metodos(__init__(color, ruedas) y __str__())

    Auto(clase hija de vehiculo)
    -Atributo(velocidad (km/hr))
    -Metodos(__init__(color, ruedas, velocidad) y __str__())

    Bicicleta(Clase hija de Vehiculo
    -Atributos(tipo(urbana/montaña/etc.)
    -Metodos(__init__(color, ruedas, tipo) y __str__()

    Crear un objeto de cada clase (padre, auto, bicicleta)
    '''

    def __init__(self, color, ruedas):
        self._color = color
        self._ruedas = ruedas

    @property
    def color(self):
        return self._color

    @color.setter
    def color(self, color):
        self._color = color

    @property
    def ruedas(self):
        return self._ruedas

    @ruedas.setter
    def ruedas(self, ruedas):
        self._ruedas = ruedas

    def __str__(self):
        return f'cantidad de ruedas: {self._ruedas}, color del vehiculo: {self._color}'


class Auto(Vehiculo):
    def __init__(self, color, ruedas, velocidad):
        super().__init__(color, ruedas)
        self._velocidad = velocidad

    @property
    def velocidad(self):
        return self._velocidad

    @velocidad.setter
    def velocidad(self, velocidad):
        self._velocidad = velocidad

    def __str__(self):
        return f'{super().__str__()},Velocidad: {self._velocidad}'


class Bicicleta(Vehiculo):
    def __init__(self, color, ruedas, tipo):
        super().__init__(color, ruedas)
        self._tipo = tipo

    @property
    def tipo(self):
        return self._tipo

    @tipo.setter
    def tipo(self, tipo):
        self._tipo = tipo

    def __str__(self):
        return f'{super().__str__()}, tipo: {self._tipo}'


vehiculo1 = Vehiculo("Negro", 2)
print(vehiculo1)
print(f'El color del vehiculo1 es: {vehiculo1.color} y tiene: {vehiculo1.ruedas} ruedas')

auto1 = Auto("Gris", 4, "200 km/hr")
print(auto1)
print(f'El color del auto es: {auto1.color}, tiene: {auto1.ruedas} ruedas y alcanza: {auto1.velocidad}')
bicicleta1 = Bicicleta("Blanca", 2, "todo Terreno")
print(bicicleta1)
print(f'La bicicleta es {bicicleta1.color}, tiene {bicicleta1.ruedas} ruedas y es de tipo: {bicicleta1.tipo}')
