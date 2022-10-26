class Persona2:
    def __init__(self, nombre, apellido, edad): #esta encapsulado
        self._nombre = nombre
        self._apellido = apellido
        self._edad = edad

    def mostrar_detalles(self):
        print(f"Los datos a mostrar son los siguientes: {self._nombre}, {self._apellido}, {self._edad}")

    #Al igual que en java cuando encapsulamos un atributo y luego queremos acceder a travez de set y get
    #Debemos crear metodos seter y geter para cada atributo, vease a continuacaion
    #esto aplica para atributos encapsulados con guion o doble guion bajo


    @property #decorador
    def nombre(self): #Metodo Getter
        print("Estamos usando el metodo Getter nombre")
        return self._nombre
        #de esta menera se crea un metodo getter
        #para poder acceder al metodo como si fuera un atributo y acceder de forma indirecta
        #se necesita lo que se denomina un decorador (esta arriba de def nombre)

    @nombre.setter #decorador setter
    def nombre(self, nombre): #metodo setter
        print("Estamos usando el metodo Setter nombre")
        self._nombre = nombre
        #asi queda creado el metodo setter

    @property
    def apellido(self):
        print("Estamos usando el metodo Getter apellido")
        return self._apellido

    @apellido.setter
    def apellido(self, apellido):
        print("Metodo setter apellido")
        self._apellido = apellido

    @property
    def edad(self):
        print("Metodo getter edad")
        return self._edad

    @edad.setter
    def edad(self, edad):
        print("Setter edad")
        self._edad = edad

    """
    Funcion para borrar objetos
    
    esto se utiliza ya que en ocaciones cuando creamos un objeto, al momento de terminar la tarea o programa
    necesitamos liberar recursos o espacio. Para garantizar esto, existe el concepto de destructor
    
    El metodo destructor se manda a llamar de manera automatica
    """
    def __del__(self): #Este es un metodo dunder ya que asi se le llama a todos aquellos de doble guion bajo
        print(f"Persona2: {self._nombre} {self._apellido} {self._edad}")
        #Con el print de arriba vemos los datos del objeto que estamos eliminando
if __name__ == "__main__":
    #ahora mostraremos y modificaremos a travez de set y get, no de manera directa como antes


    persona1 = Persona2("Aquiles", "Martinez", "19")

    #persona1._nombre  ESTO YA NO SE DEBE HACER DE ESTA MANERA.
    #SE PUEDE HACER YA QUE SU ENCAPSULAMIENTO ES DE UN SOLO GUION PERO NO SE DEBE HACER NUNCAAAAAA
    #DEMUESTRA NADA DE CONOCIMIENTO DE SITNAXIS PYTHON

    #print(persona1.nombre()) #LLAMAMOS AL METODO GETTER DE ESTA MENRA, NO HACEN FALTA LOS PARENTESIS INTERNOS
    #el decorador property nos permite acceder al metodo como si fuera un atributo y de manera indirecta, por lo que no es
    # necesario los parentesis internos como suele ser en general con los metodos
    #el compilador, gracias al decorador y poder acceder al metodo como atributo, al ver el persona1.nombre sabe que hablamos del metodo getter, por lo que no requiere parentesis internos
    #querdaria asi
    print(f"Nombre: {persona1.nombre}, Apellido: {persona1.apellido}, Edad: {persona1.edad}")

    #LLAMAMOS AL METODO SET
    persona1.nombre = "Milagros"
    # a pesar de llamarse de igual maera que el metodo get, al pasarle un dato, el compilador entendera que nos referimos al metodo set

    print(persona1.nombre)
    print(persona1.mostrar_detalles()) #llamamos al metodo mostrar detalles
    #aqui veremos que desde la clase el argumento cambio al nuevo valor

    #QUE PASA SI TRABAJAMOS CON SETER SI HABER CREADO UN METODO SETTER (comentamos set edad)
    """
    persona1.edad = 20
    print(persona1.edad)
    
    cuando no tenemos metodo set, lo que hacemos en convertir el atributo en un read only
    es decir que solo sirve para ser leida, ya que no hay manera de modificarla
    
    (si bien podemos acceder de manera directa, esto no se hace por lo que es un read only)
    """

    """
    TAREA. crear tres objetos mas utilizando los metodos getter and setter
    pera modificar y mostrar los cambios
    """

    persona2 = Persona2("Juan Cruz", "Molina", 12)
    print(persona2.mostrar_detalles())
    persona2.nombre = "Raul"
    persona2.apellido = "Martinez"
    persona2.edad = 42
    print(f"Datos Persona2: Nuevo nombre: {persona2.nombre}, nuevo apellido: {persona2.apellido}, nueva edad: {persona2.edad}")

    persona3 = Persona2("Gerardo", "Vega", 19)
    print(persona3.mostrar_detalles())
    persona3.nombre = "Pablo"
    persona3.apellido= "La Torre"
    persona3.edad = 20
    print(f"Nuevo nombre: {persona3.nombre}, nuevo apellido: {persona3.apellido}, nueva edad: {persona3.edad}")

    persona4 = Persona2("Lucas", "Beccerra", 19)
    print(persona4.mostrar_detalles())
    persona4.nombre = "Mily"
    persona4.apellido = "Funes"
    persona4.edad = 20
    print(f"Nuevo nombre: {persona4.nombre}, nuevo apellido: {persona4.apellido}, nueva edad: {persona4.edad}")


    #Comprobacion del modulo principal en ejecucion
    """
    Comprobacion del modulo principal en ejecucion
    esta es una herramienta que nos dice donde se esta ejecutando el codigo
    
    es decir, al ejecutarse esta herramienta, nos dice donde se esta ejecutando, por ejemplo si se pone al final de un archivo como en este caso
    cuando se ejecute, mostrara el nombre del archivo, y hasta ese punto se habra ejecutado este archivo, luego lo que continuara sera de otro archivo
    pero esto puede ponerse en cualquier parte del archivo, solo sirve para ver donde se ejecuta el codigo. 
    En el caso de que ejecutemos desde el mismo archivo donde pusimos esta herramienta, en vez de decirnos desde que archivo se ejecuta el 
    programa, nos dira que se ejecuta en el main, es decir, el mismo del que ejecutamos la prueba
    
    
    Esto sirve por ejemplo para que al importar una clase, como en este caso en prueba persona, para evitar que se muestre todo este
    proceso de objetos y demas con los que hemos trabajado. vemos un ejemplo de esto con la estructura if presentada sobre todo lo trabajado
    se puede hacer de la siguiente forma
    
    if __name__ == "__main__"
        todo el codigo que queremos que se ejecute solo cuando ejecutamos desde este main
    
    de esta forma no se ejecutara el codigo cuando exportemos la clase a otro archivo
    """
    print(__name__)
