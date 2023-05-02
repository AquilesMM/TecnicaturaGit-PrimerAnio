class MiClase:
    # vamos a crear variables de clase, por lo que van fuera de __init__
    # este atributo dara a cada objeto el mismo valor que le asignemos
    variable_clase = "Esta es una variable de clase"
    """
    Podemos asociar variables de clase en cualquier momento, como en python a su vez todas las clases son objetos, en cualquier momento
    podemos asociar una nueva variable a la clase
    """

    #IMPORTANTE, LAS CLASES NO SE CARGAN EN MEMORIA HASTA QUE NO SE CREA UN OBJETO
    def __init__(self, variable_instacia):  # variable de instancia
        self.variable_instancia = variable_instacia

    """METODOS ESTATICOS
    Asi como tenemos variables de clase, tambien tenemos metodos de clase
    Tipos de Metodos que se pueden asociar a una clase
    
    
    
    Contexto dinamico: Es la accion a partir de una creacion de una instancia y con ellas trabaja Ej: __init__ ya que este esta creado
    para la instancia de objetos
    El contexto dinamico no puede acceder al estatico hasta que no se haya creado una instancia, hasta entonces no podra acceder
    
    Contexto Estatico: Creacion de metodos o variables que se asocian a la clase y no al objeto: variable de clase
    El Estatico no puede acceder al contexto dinamico
    
    1- Metodos Estaticos: Estos metodos se asocian a la clase, para ejecutarlo o utilizarlo,
    sera a travez de la case y luego llamando al metodo estatico. Para utilizarlo usamos el decorador @staticsmethod
    Este decorador lo que hace es modificar el metodo para asociarlo a la clase y no al objeto
    al hacer este metodo, desaparecera el self que suele ir entre parentesis, el metodo no recibiera esta palabra 
    ya que la palabra self referencia al objeto. Y no debemos olvidar que el estatico no puede acceder al dinamico.
    Tampoco pueude acceder a los atributos. Por ello no necesita self, ya que esta creado para asiganar, cambiar el valor de variables
    de objetos, o asignar distintos valores a los atributos que recibe por parametro para cada instancia
    LLamar metodo Estatico: se lo llama a travez de la clase.
    Los metodos estaticos no reciben informacion de la clase en si misma, por lo que se dice que un metodo estatico no tiene informacion
    relacionada directamente con la clase, podemos sustituir este tipo de metodo con cualquier otro creado dentro de este archivo
    como una funcion, pero el metodo estatico sirve para asosciar de manera logica algun otro metodo que no tenga nada que ver
    con los atributos de nuestra clase, sino que sirva por alguna cuestion de logica. Asociar el tipo de metodo que no tenga que 
    trabajar con las variables de instancias directamente
    
    

    2- Metodos de Clase: A diferencia de un metodo estatico, el metodo de clase si recibe contexto de clase
    Para utilizar este tipo de metods utilizamos el decorador @classmethod
    al crear este tipo de metodo notamos que entre parentecis recurre al parametro cls. Este cls es similar  a parametro self pero
    la diferencia es que cls es una referencia a la clase en si misma, tambien podemos utilizar otra palabra ejemplo: (ppalabraAleatoria)
    pero la documentacion de python recomienda utilizar el cls para saber que es el parametro de clase en si mismo, puede tener mas parametros
    y trabajar igual a la instacia, como se trabaja con el self, sin tener que llamar a travez de la misma clase
    Es decir con cls podemos hacer referencia, o llamar a otros metodos o atriibutos de la clase, usando cls y operador de punto
    DIFERENCIA DE SELF Y CLS MAS CLARA
    self lo utilizamos para apuntar al atributo y esto sirve para la instancia es decir la cracion de un objeto, es decir es para
    referenciar el operador al espacio de memoria donde se encuentra el atributo y entonces a travez del parametro se ajustan los valores 
    del atributo y asi trabaja el objeto y el atributo dentro del mismo espacio de memoria
   
    cls es un operador que trabaja apuntando ya no hacia lo que es un atributo sino hacia lo que es la clase en si
    de no tener el cls deberiamos usar el nombre de la clase
    Ejemplo, en este caso para trabajar dentro del metodo de clase, de no tener cls usariamos la clase de la siguiente manera
    MiClase.variable_clase
    con cls seria
    cls.variable_clase
    lo que hace es facilitar el trabajo dentro del mismo metodo
    """
    @staticmethod
    def metodo_estatico(): #Metodo estatico, se asocia a la clase
        print(MiClase.variable_clase)

    @classmethod
    def metodo_clase(cls):
        print(cls.variable_clase)

    def metodo_instancia(self):
        self.metodo_clase()
        self.metodo_estatico()
        print(self.variable_clase)
        print(self.variable_instancia)

# Diferencias entre variable de instancia y de clase
"""
La variable de clase tiene su valor asociado a la clase, por lo cual no sera cambiado por objetos cuando a estos se le asignen este valor
(se accede a travez de clase o objeto) y todos los objetos tendran el mismo valor

En cambio la variable de instancia esta ligada al objeto, y cada objeto a pesar de tener la misma variable, podra poseer valor 
(se accede a travez de objeto)
"""

# DATO: LA CLASE SE CARGA EN MEMORIA, Una vez cargada podemos crear objetos
# una vez el objeto creado podemos acceder a la varible de clase a travez de objeto

# Acceder a variable de clase
"""
La unica manera de acceder a la variable de clase, es justamente a travez de la clase
"""
print(MiClase.variable_clase)

miClase1 = MiClase('Esta es una variable de instancia')
print(miClase1.variable_instancia)
print(miClase1.variable_instancia)
miClase2 = MiClase('Esta es otra prueba de ariable de instancia')
print(miClase2.variable_instancia)
print(miClase2.variable_instancia)

"""Creacion de variable de clase en cualquier lugar (DEMOSTRACION DEL DINAMISMO DE PYTHON)
(POCO COMUN)
como dijimos, podemos asignarle nuevas variables a la clase en cualquier momento del codigo, esto lo hacemos a travez de la clase
Al crear la variable en esta parte del codigo, si o si debemos asignarle un valor

Para acceder a ella podemos acceder desde la clase, o tambien desde los objetos, aunque en estos ultimos hay una diferencia
y es que al tratar de acceder, el autocompletado NO mostrara la variable de clase como posibilidad, pero podemos escribirla a mano
esto sucede ya que esta variable fue creada dentro del codigo y por ello el operador de punto no la reconoce para el autocompletado
pero funciona de igual manera. Es decir no fue definida como parte de la plantilla sino que se definio despues
"""
MiClase.variable_clase2 = "Valor de variable de clase 2"
print(MiClase.variable_clase2) #Accedemos a la variable nueva a travez de la calse
print(miClase1.variable_clase2)
print(miClase2.variable_clase2)

MiClase.metodo_estatico() #LLamamos al metodo Estatico

MiClase.metodo_clase()
miObjeto1 = MiClase('Variable de instancia')
miObjeto1.metodo_clase()
miObjeto1.metodo_instancia()


