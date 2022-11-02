#HEREncIA MULTIPLE

from FiguraGeometrica import FiguraGeometrica
from Color import Color
"""
a la hora de importar, podemos hacerlo de manera manual escribiendolo, o poniendo de quien hereda la clase
y al precionar sobre los padres, nos dara la opcion de importar
"""

class Cuadrado(FiguraGeometrica, Color): #Las clases se separan con una coma
    # IMPORTANTE
    """
    A la hora de trabajar con herencia multiple, es muy importante el orden en que pongamos la herencia de los padres
    """
    #INICIALIZACION CORRECTA DE CLASE HIJA
    def __init__(self, lado, color):
        #super.__init__(lado) con herenciamultiple no usamos super, ya que produce una confucion y no sabe a que padre esta llamando
        #esto confunde tanto al programador como al compilador

        # La manera correctade inicializaar es llamando directamente a la clase padre, y DEBE IR SI O SI el self a la hora de inicializar

        FiguraGeometrica.__init__(self, lado, lado) #inicializamos lo que es el lado ancho y alto
        """
        Usamos dos veces lado en vec de alto y ancho ya que a la hora de crear un objeto con cuadrado, nosotros pasaremos como valores los atributos de
        lado y color que son los que inicializamos arriba, a partir de alli el metodo incializador, inicializara el resto de clases con los
        valores que este tiene es decir lado y color en este caso
        
        por ello al ser en este caso un cuadrado, se decide utilizar un solo atributo (lado) para inicilizar los atributos de la clase padre, alto y ancho
        es decir, el valor de lado ingresara dos veces para alto y ancho en la clase padre y este tomara esos valores y los usara para
        inicializar alto y ancho
        
        luego podremos trabajar con los valores alto y ancho a travez de self. habiendo estos sido inicializados ya con los valores lado lado
        
        Para enteder mejor algo que no habia entendido hasta ahora, el metodo inicializador, no solo incializa atributos, sino que a su vez
        como en este caso inicializara los atributos de clases padres a travez de los atributos que el METODO INCIALIZADOR PIDA, una vez este metodo
        le pase los valores a las clases padres, ESTAS RECIEN ALLI inicializaran sus propios atributos con los valores que pasa el metodo inicializador anterior
        y usara su propio metodo init para inicializar sus atributos
        
        El metodo inicializador inicializa, los atributos que va a utilizar Esta clase y a su vez INICIALIZA LOS ATRIBUTOS DE LAS OTRAS CLASES
        a travez de en este caso la clase. por ejemplo la clase FiguraGeometrica. esto antes lo hacia a travez de la clase SUPER
        es decir le pasara los datos inicializados y que pide esta clase, a las otras para que con esos datos inicialicen sus propios atributos
        aunque tambien este metodo podra inicializar atributos aparte a travez de self. 
        
        
        
        """

        Color.__init__(self, color) #inicializamos color



    def calcular_area(self):
        return self.alto * self.ancho

    def __str__(self):
        return f'{FiguraGeometrica.__str__(self)}, {Color.__str__(self)}'
