from logger_base import log


class Persona:
    def __init__(self, id_persona =None, nombre=None, apellido=None, email=None): #les asignamos valores por default
        self._id_persona = id_persona
        self._nombre = nombre
        self._apellido = apellido
        self._email = email


    def __str__(self):
        return f'''
            Id Persona: {self._id_persona}
            Nombre: {self._nombre}
            Apellido: {self._apellido}
            Email: {self._email}
        '''

    #Metodos Get y Set


    @property
    def id_persona(self):
        return self._id_persona

    @id_persona.setter
    def id_persona(self, id_persona):
        self._id_persona = id_persona

    @property
    def nombre(self):
        return self._nombre

    @nombre.setter
    def nombre(self, nombre):
        self._nombre = nombre

    @property
    def apellido(self):
        return self._apellido

    @apellido.setter
    def apellido(self, apellido):
        self._apellido = apellido

    @property
    def email(self):
        return self._email

    @email.setter
    def email(self, email):
        self._email = email

#Haremos la comprovacion, sobre si se esta ejecutando dentro de esta clase

if __name__ == '__main__':
    persona1 = Persona(1, 'Juan', 'Perez', 'jperez@gmail.com')
    #utilizamos modulo logger base
    #acccedemos a travez de log a la funcion debug, y le pasamos como argumento al objeto persona1
    #Nos mostrara la hora, el nivel de "error" (debug) El archivo y la linea donde se ejecuto el debug, es decir
    #este archivo donde ejecutamos log.debug(), y luego todos los atributos del objeto, tod0 esto tambien quedara
    #impreso en el archivo capa_datos
    log.debug(persona1)

    #AHORA VAMOS A VERIFICAR QUE SUCEDDE SI INGRESAMOS COSAS ERRORENAS
    persona2 = Persona(nombre='Jose', apellido='Lepez', email='ljose@gmail.com')

    #Ahora volveremos a llamar a log.debug, esta vez deberia dar error ya que falta pasar un argumento
    #para solucionar esto, podemos marcat un valor por default a los parametros, desde el constructor, luego ya no
    #ocurrira este error. Pero aun asi, el argumento que se detectara como faltante sera el de email, es por ello
    #que debemos especificar a que argumento se dirije cada  parametro a la hora de crear el objeto
    log.debug(persona2)
    #La siguiente linea eliminara todos los datos menos id_persona, que sera igual a 1
    persona1 = Persona(id_persona=1)
    log.debug(persona1)
