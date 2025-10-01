import pandas as panda

#cargamos el archivo CSV
df=panda.read_csv('ADT/Tarea/ventas_ecommerce.csv')


#1. Filtros básicos
#Filtramos los pedidos de la ciudad de Madrid
    #print(df[df["ciudad"]=="Madrid"])

#Filtramos las compras de categoria Electrónica
    #print(df[df["categoria"]=="Electrónica"])

#Obtén todos los pedidos cuyo precio unitario sea mayor a 500
    #print(df[df["precio_unitario"]>500])

#Muestra los pedidos en los que el cliente haya comprado más de 3 unidades
    #print(df[df["cantidad"]>3])
    
    
    
#2. Filtros Combinados
#Muestra los pedidos de la ciudad de Barcelona en la categoría de Ropa
    #print(df[(df["ciudad"]=="Barcelona") & (df["categoria"]=="Ropa")])

#Encuentra los pedidos de Electrónica con precio mayor a 1000
    #print(df[(df["categoria"]=="Electrónica") & (df["precio_unitario"]>1000)])


#3. Filtros con fechas



