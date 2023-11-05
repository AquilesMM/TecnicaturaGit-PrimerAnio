#help(str.split)

cursos = 'Java Javascript Node Python Diseno'

lista_cursos = cursos.split()
print(f'Lista de cursos: {lista_cursos}')
print(type(lista_cursos))

cursos_separados_coma = 'java,Python,Node,Javascript,Spring'
lista_cursos = cursos_separados_coma.split(',', 2) #solo separara dos veces
print(len(lista_cursos))



