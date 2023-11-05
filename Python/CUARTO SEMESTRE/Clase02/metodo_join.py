


help(str.join )

tupla_str = (['Hola', 'alumnos', 'Tecnicatura', 'Universitaria'])

mensaje = ' '.join(tupla_str)
print(mensaje)

lista_cursos = ['Java', 'Python', 'Angular', 'Spring']

mensaje = ', '.joi(lista_cursos)
print(f"Mensaje: {mensaje}")

cadena = 'HolaMundo'
mensaje = '.'.join(cadena)
print(f'Mensaje: {mensaje}')

diccionario = {'Nombre': 'Juan',
               'apellido': 'Perez',
               'edad': '18'}
llaves = '-'.join(diccionario.keys())
valores = '-'.join(diccionario.values())
print(f'LLaves: {llaves}, type: {type(llaves)} ')
print(f'valores: {valores}, type: {type(valores)}')
