#convertiremos esta case padre en una clase abstracta, para ello importamos la siguiente clase:
from abc import ABC, abstractmethod #abc significa: Abstract Base Class, convierte una clase en abstracta
#la coma es para importar mas  de un elemento

#IMPORTANTE, NO SE PUEDEN HACER INSTANCIAS DE CLASES ABSTRACTAS ES DECIR NO SE PUEDEN HACER OBJETOS

class FiguraGeometrica(ABC):  #ahora FiguraGeometrica sera hija de ABC (clase abstracta) sigue siendo tambien hija de object
    def __init__(self, ancho, alto):
        #VALIDACIONES   MUY BUENA PRACTICA
        #condicionamos las respuestas, haciendo que el programa se ejecute como nosotros queremos
        # es decir es un ejemplo de como utilizar diferentes elementos dentro de la inicializacion de clases
        #sirve para que no se salga de rangos que queremos, o que el programa se ejecute bajo condiciones especificas
        if self._validar_valores(ancho):
            self._ancho = ancho
        else:
            self._ancho = 0
            print(f'Valor erroneo para ancho: {ancho}')
        if self._validar_valores(alto):
            self._alto = alto
        else:
            self._alto = 0
            print(f'Valor erroneo para alto: {alto}')

    @property
    def ancho(self):
        return self._ancho

    @ancho.setter
    def ancho(self, ancho):
        if self._validar_valores(ancho):
            self._ancho = ancho
        print(f'valor erroneo ancho: {ancho}')

    @property
    def alto(self):
        return self._alto

    @alto.setter
    def alto(self, alto):
        if self._validar_valores(alto):
            self._alto = alto
        else:
            print(f'valor erroneo ancho: {alto}')


    @abstractmethod
    def calcular_area(self):
        pass
        """
        lo que hacemos es crear el metodo de calcular area de manera abstracta
        como tenemos previsto que el metodo abstracto no se implemente en la clase padre, simplemente ponemos pass
        
        El crear un metodo abstracto hace que sea obligatorio para las clases hijas, tener el metodo
        
        De no crearse el metodo en las clases hijas, la clase padre convertira a las clases hijas en clases abstractas
        haciendo que no se puedan crear instancias de las clases hijas, por ello es obvligaorio implementar
        los metodos abstractos
        """


    def __str__(self):
        return f'alto = {self._alto}, ancho = {self._ancho}'

    #METODO ENCAPSULADO
    #para ello utilizamos el guion bajo
    """
    este metodo no debe ser utilizado fuera de esta clase, unicamente sera usado de manera interna de la clase padre
    utilizaremos este metodo para validar si los valores ingresados desde test, son acordes a los que queremos
    utilizando el parametro que ingresa al metodo, como el valor que se le asignaria al atributo, para asi ver si es acorde
    antes de asignar dicho valor al atributo
    
    Tambien lo utilizaremos en metodos setters
    """
    def _validar_valores(self, valor):
        return True if 0 < valor < 10 else False