import pandas as panda

#DataFRAME EJEMPLO

#cargamos el archivo CSV
df=panda.read_csv('ADT/CSV/ejemplos_datos.csv')

#mostramos el dataframe con  la condicion de que

print(df[df["salario"]<500])

    