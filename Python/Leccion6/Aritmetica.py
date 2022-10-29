class Aritmetica:
    """
    El nombre de este tipo de comentario es: DocString
    esto es documentacion de la clase en python
    para esto se utilizan generalmente las comillas, ya que los comentarios de claseson de varias lineas
    Vamos a hacer en esta clase algunas operaciones: suma, resta, multiplicacion y mas
    """
    def __init__(self, operandoA, operandoB): #agregamos dos operadores
         #creamos los atributos
        self.operandoA = operandoA
        self.operandoB = operandoB

    def sumar(self):
         return self.operandoA + self.operandoB #utilizamos los operadores inicializados anteriormente

    def resta(self):
         return  self.operandoA - self.operandoB

    def multiplicar(self):
        return self.operandoA * self.operandoB


    def dividir(self):
         return self.operandoA / self.operandoB


aritmetica1 = Aritmetica(7, 9) #le pasamos los argumentos para los operandos
print(f"suma: {aritmetica1.sumar()}")
#de la manera en que lo estamos haciendo no hace falta pasarle ninguna referencia

print(f"restar: {aritmetica1.resta()}")
print(f"multiplicar: {aritmetica1.multiplicar()}")
print(f"dividir: {aritmetica1.dividir():.2f}")
