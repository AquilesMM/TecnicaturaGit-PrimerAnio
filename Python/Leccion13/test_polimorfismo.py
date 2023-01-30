from Empleado import Empleado
from Gerente import Gerente

"""
Polimorfismo: multiples formas en tiempos de ejecución
diferentes formas de acceder atrevés de un objeto a la información
"""


def imprimir_detalles(objeto):
    # print(objeto)  # De manera indirecta llama al str de la clase Empleado o Gerente
    print(type(objeto))  # Esto es para saber el tipo de dato que recibe
    print(objeto.mostrar_detalle())  # Este método remplaza al print objeto, ya que mostrara el str
    # al igual que solo poner el objeto
    if isinstance(objeto, Gerente):
        """
        isinstance lo que hace es preguntar si un objeto o elemento esta instanciado en un lugar
        en este caso pregunta si objeto esta instanciando en gerente
        de esta forma cuando usemos esta función en un objeto de empleado, no usara el print departamento
        la pregunta que hace es:
        ¿es este objeto una instancia de la clase gerente, en caso de serlo el if sera verdadero?
        
        esto hace que este método se vuelva un método genérico, pudiéndose usar en cualquier objeto dentro de los usos 
        que le estamos dando
        
        Validar en python es para cuestiones especificas ya que se recomienda que el código quede lo mas genérico 
        posible 
        python en su naturaleza trabaja con tipos de datos dinámicos y eso se debe intentar preservar, haciendo el 
        código lo mas dinámico posible
        
        este tipo de validaciones son totalmente validos para trabajar en python
        
        polimorfismo: desde un mismo lugar podemos hacer multiples formas en el tiempo de ejecución
        """
        print(objeto.departamento)


empleado = Empleado('Aquiles', 50000.00)
imprimir_detalles(empleado)

gerente = Gerente('Mily', 70000.00, 'Recursos Humanos')
imprimir_detalles(gerente)
