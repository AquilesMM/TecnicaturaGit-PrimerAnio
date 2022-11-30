class Persona:
    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad

    # sobreescribimos un metodo para el operador de summa
    # el parametro other puede recibir otro nombre
    def __add__(self, other):
        "return self.nombre + other.nombre"
        return f'{self.nombre} {other.nombre}' # ya no hace falta poner el mas, lo hace de manera automatica

    def __sub__(self, otro):
        return self.edad - otro.edad


    """
    si creamos un objeto (objeto1) y luego otro (objeto2): el objeto principal va a ser el primero y el other(otro) sera el objeto 2
    persona1 = Persona("Aquiles", 20)
    persona2 = Persona("Martinez", 10)

    persona1.__add__(persona2)
    esta es la sintaxis automatica o interna que sucede al poner un objeto frente a otro con operador de suma en el medio. aunque no se suele utilizar asi
    
    en lo real la sintaxis se realiza asi, ejemplo con print:
    print(persona1 + persona2)
    el primero objeto llama a __add__ y el otro sera quien se ponga entre parentesis
    """
persona1 = Persona("Aquiles", 30)
persona2 = Persona("Martinez", 10)
print(persona1 + persona2)
print(persona1 - persona2) #restamos las edades