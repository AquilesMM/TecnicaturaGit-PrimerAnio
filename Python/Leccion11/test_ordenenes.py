from Orden import Orden
from Producto import Producto


producto1 = Producto('Camiseta', 100.00)
producto2 = Producto('Pantalon', 150.00)
producto3 = Producto('Short', 200.00)
producto4 = Producto('Camisa', 250.00)
producto5 = Producto('Sweter', 95.00)
producto6 = Producto('Blusa', 75.00)
productos1 = [producto1, producto2]  # lista de productos
productos2 = [producto3, producto4]
orden1 = Orden(productos1)  # Primer objeto orden pasando la lista de productos
print(orden1)
print(f'Total de la orden1: ${orden1.calcular_total()}')
orden1.agregar_producto(producto5)
orden1.agregar_producto(producto3)
orden2 = Orden(productos1 + productos2)
orden2.agregar_producto(producto6)
orden2.agregar_producto(producto2)
print(orden2)
print(f'Total de la orden2: ${orden2.calcular_total()}')

