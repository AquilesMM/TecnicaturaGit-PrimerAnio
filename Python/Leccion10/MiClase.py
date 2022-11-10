class MiClase:
    # vamos a crear variables de clase, por lo que van fuera de __init__
    # este atributo dara a cada objeto el mismo valor que le asignemos
    variable_clase = "Esta es una variable de clase"

    def __init__(self, variable_instacia):  # variable de instancia
        self.variable_instancia = variable_instacia


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
