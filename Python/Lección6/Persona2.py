class Persona2:
    def __int__(self, nombre, apellido, edad): #esta encapsulado
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
        print("Estamos usando el metodo Getter")
        return self._nombre
        #de esta menera se crea un metodo getter
        #para poder acceder al metodo como si fuera un atributo y acceder de forma indirecta
        #se necesita lo que se denomina un decorador (esta arriba de def nombre)

    @nombre.setter #decorador setter
    def nombre(self, nombre): #metodo setter
        print("Estamos usando el metodo Setter")
        self._nombre = nombre
        #asi queda creado el metodo setter


#ahora mostraremos y modificaremos a travez de st y get, no de manera directa como antes

persona1 = Persona2("Aquiles", "Martinez", 19)

#persona1._nombre  ESTO YA NO SE DEBE HACER DE ESTA MANERA.
#SE PUEDE HACER YA QUE SU ENCAPSULAMIENTO ES DE UN SOLO GUION PERO NO SE DEBE HACER NUNCAAAAAA
#DEMUESTRA NADA DE CONOCIMIENTO DE SITNAXIS PYTHON

#print(persona1.nombre()) #LLAMAMOS AL METODO GETTER DE ESTA MENRA, NO HACEN FALTA LOS PARENTESIS INTERNOS
#el decorador property nos permite acceder al metodo como si fuera un atributo y de manera indirecta, por lo que no es
# necesario los parentesis internos como suele ser en general con los metodos
#el compilador, gracias al decorador y poder acceder al metodo como atributo, al ver el persona1.nombre sabe que hablamos del metodo getter, por lo que no requiere parentesis internos
#querdaria asi
print(persona1.nombre)