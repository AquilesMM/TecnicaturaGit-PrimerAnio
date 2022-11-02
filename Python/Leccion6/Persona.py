class Persona:  # Creamos una clase

    def __init__(self, nombre, apellido, dni, edad, *args, **kwargs):  # Se lo llama método Init Dunder
        #el *args hace referencia a argumentos variables (en forma de tupla en este caso)
        #tambien sirve para diccionarios (**args), primero se pone siempre la tupla y luego el diccionario
        self.nombre = nombre
        self.apellido = apellido
        self._dni = dni #atributo encapsulado de una manera sugerida
        self.edad = edad
        self.args = args #agregamos los argumentos variables
        self.kwargs = kwargs


    def mostrar_detalle(self): #self: su sintaxis y uso, es identica a la palabra usada en Java this.
                                #No es obligatorio que se llame self, pero deberiamos cambiar el nombre
                                #en el atributo y el resto de usos dentro deel metodo, siempre el primer parametro es la de self,
                                #o su respecivo sustituto
                                #pero se recomienda utilizar esta palabra
        print(f'La clase Persona tiene los siguientes datos: {self.nombre} {self.apellido} {self.edad} {self._dni}, la direccion es: {self.args}, los datos importantes son: {self.kwargs}')


persona1 = Persona('Ariel', 'Betancud', 44439081, 40)  # Necesitamos enviar argumentos
# print(persona1.nombre) # Tarea: Hacer el print igual que con el objeto 2
# print(persona1.apellido)
# print(persona1.edad)
print(f'El objeto1 de la clase persona: {persona1.nombre} {persona1.apellido} Su edad es: {persona1.edad}')
persona2 = Persona('Osvaldo', 'Giordanini', 300522054, 45)
print(f'El objeto2 de la clase persona: {persona2.nombre} {persona2.apellido} Su edad es: {persona2.edad}')

persona1.nombre = 'Liliana'
persona1.apellido = 'Buccella'
persona1.edad = 40
print(f'El objeto1 modificado de la clase persona: {persona1.nombre} {persona1.apellido} Su edad es: {persona1.edad}')

# Los atributos son: caracteristicas
# Los métodos son: el comportamiento que van a tener los objetos (acciones)
persona1.mostrar_detalle()
persona2.mostrar_detalle()

#otra manera de llamar al metodo

#utilizamos directamente la clase   POCO UTILIZADO NO ES EFICAZ de VERLO CAMBIARLO
#pero cuando se hace de esta manera y no a travez de un objeto como vimos anteriormente
#en este caso SI o SI necesitaremos enviarle una referencia, en el caso de objetos la referencia se pasa de manera automatica

Persona.mostrar_detalle(persona1)#no tuilizamos self porque este esta dentro de los metodos
#podemos pasarle como referencia un objeto, de no poner nada dara error, nos dira que requerira posicionar un argumento para el self


"""
Los objetos son variables a los caules les damos el poder de acceder a calases mediante el operador de punto
"""

#Atributos desde un objeto  (NO ES MUY USADO PERO ES NECESARIO CONOCERLO) (hoy en dia es MUY OBSOLETO, NO SE HACE) (OPTIMIZABLE)
#podemos agregar atributos al objeto sin necesidad  de que estos esten cargados en el metodo init o en la inicialziacion de el metodo

#podemos hacerlo, ejemplo con objeto persona1
#al usar el operador de punto, en vez de utilizar algun atributo o metodo lo crearemos
#este es un atributo superficial, no se compartiran con los demas objeto, solo para persona1, persona2 no podra hacer uso de este
persona1.telefono = "44455555289"
print(f"este es el telefono de {persona1.nombre}: {persona1.telefono}")#ya hemos creado este atributo.

#si quisieramos acceder a este atributo desde otro objeto, ej persona2
#persona2.telefono
#esto daria un error ya que el resto de objetos no pueden acceder a estos atributos "superficiales"
#saldra un arror de tipo atributo diciendo que este objeto no posee tal atributo

#vamos a crear dos objetos mas
persona3 = Persona ("Rogelio", "Romero", 15445567, 22, "Telefono", "262546587", "Calle Lopez", 823, "Manzana", 77, "Casa", 18, Altura=1.83, Peso=105, Cfavorto="azul", Auto="Citroen", Modelo=2021)

#los primeros tres datos corresponden a los parametros vistos anteriormente asignados en clase
#a partir de alli empieza una tupla hasta llegar a altura, hasta antes de ella se asignan a args
#a partir de altura empiezan los diccionarios que se asignana kwargs


#llamaremos a metodo mostrar detalle para ver lo comentado antes y ver todos los datos
print(persona3.mostrar_detalle())

#
"""
Encapsulamiento en Python, como hemos visto hasta ahora, todos los datos que hemos trabajado hasta ahora han sido de manera

publica, el encapsulamiento es totalmente publico, python NO tiene modificadores de acceso, todos los atributos son de tipo publico

por asi decirlo, su modificador de acceso es publico, aunque en realidad ni siquiera existe tal cosa

por ello hemos podido trabajar con los atributos de la clase desde fuera de esta, podemos acceder y modificar los atributoos

desde las instancias/objetos ya que ellos son publicos

Pero aun asi podemos modificar el encapsulamiento para evitar que los atributos se accedan fuera de la clase, y tambien podemos luego volver a hacerlos publicos

EN PYTHON EL ENCAPSULAMIENTO QUE VAMOS A VER ES EL MAS UTILIZADO

ESTE ENCAPSULAMIENTO ES SIMPLEMENTE UNA SUGERENCIA, NO HAY RESTRICCIONES REALES, Y NO HAY FORMA DE QUE QUEDE REALMENTE ENCAPSULADO

ESTO ES UNA SUGERENCIA PARA EL PROGRAMADOR PARA AQUELLOS QUE SABEN MANEJAR PYTHON, YA QUE QUIENES NO, VERAN QUE PUEDEN TRABAJAR IGUAL CON LOS ATRIBUTOS

este metodo de encapsulamiento consiste basica y unicamente en poner un guion bajo al principio del nombre del atribuot

Usamos de ejemplo el atrbuto dni dentro de la clase, y solo le ponemos un guion bajjo al principio de  nombre 

quedando de esta manera self._dni    PERO ESTO NO IMPIDE QUE SE UTILICE 

PODEMOS UTILIZAR ESTE ATRIBUTO EN OTROS METODOS DENTRO DE LA CLASE, COMO EN MOSTRAR_DETALLE PERO FUERA NO DEBERIAMOS UTILIZARLO
"""


#Acceder a atributo encapsulado
#esto no se hara como se a venido haciendo con todos los demas ya que no esta ben hacerlo de la misma manera

#ahora accederemos a travez de un metodo, en este caso el metodo mostrar_detalle

persona3.mostrar_detalle()

#print(persona3.)
#Al hacer eso, el operador de punto nunca nos dara la opcion de autocompletar con el atributo encapsulado
#si bien es posible acceder, python no lo dara como una opcion. NO SE DEBE ACCEDER ASI A ATRIBUTOS ENCAPSULADOS
#usar esto de esta manera, demuestra una inexperiencia en el lenguaje

"""
SEGUNDO METODO DE ENCAPSULAMIENTO (MENOS UTILIZADO)

doble guion bajo en atributo __dni ejemplo

Esto SI EVITA QUE SEA MODIFICADO. Podemos acceder desde metodos pero no fuera de la clase

esto hace que este totalmente ecapsulado. al tratar de acceder al atributo desde fuera de la clase:

nos dara error y nos dira que no exite el atributo para ese objeto

(tampoco se puede llamar desde el tipo de llamado con clase visto antes ej:

NombreClase.metodo 

ya que esta forma solo permite acceder a metodos, no a a tributos)

ESTA ES LA UNICA FORMA DE ENCAPSULARO ESTRICTAMENTE

PERO SIEMPRE ES ACCEQUIBLE MEDIANTE METODOS

CUANDO UN ATRIBUTO ESTA ENCAPSULADO DE ESTA MANERA TAMPOCO ACEPTA NINGUN TIPO DE CAMBIO

MEDIANTE METODOS SE PUEDEN MODIFICAR LOS ATRIBUTOS ENCAPSULADOS DE ESTA FORMA

"""



