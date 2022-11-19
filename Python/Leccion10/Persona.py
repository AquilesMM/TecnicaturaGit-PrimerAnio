class Persona:
    contador_personas = 0  # Variable de clase

    @classmethod
    def generar_siguiente_valor(cls):
        cls.contador_personas += 1#  Vamos incrementando de uno en uno
        return cls.contador_personas

    def __init__(self, nombre, edad):
        self.id_persona = Persona.generar_siguiente_valor()
        self.nombre = nombre
        self.edad = edad

    def __str__(self):
        return f'Persona [id = {self.id_persona}, nombre= {self.nombre}, edad = {self.edad}'


persona1 = Persona('Aquiles', 20)
print(persona1)
persona2 = Persona('Mily', 20)
print(persona2)
persona3 = Persona('Juan', 12)
print(persona3)
Persona.generar_siguiente_valor()
Persona4 = Persona('Pablo', 20)
print(Persona4)
print(f'Valor contador personas: {Persona.contador_personas}')
