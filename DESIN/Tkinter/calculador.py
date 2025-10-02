import tkinter as tkin
# Crear la ventana principal
ventana = tkin.Tk()
#Ponemos el título y el tamaño de la ventana
ventana.title("Calculadora")
ventana.geometry("300x400")
#Creamos las etiquetas y  textbox par crear una calculadora
num1=tkin.Label(ventana,text="Primer numero: ")
num1.pack()
#Creamos el textbox para el primer numero
entradanum1=tkin.Entry(ventana)
entradanum1.pack()
#Creamos la etiqueta del segundo numero
num2=tkin.Label(ventana,text="Segundo numero: ")
num2.pack()
#Creamos el textbox para el segundo numero
entradanum2=tkin.Entry(ventana)
entradanum2.pack()

#Creamos un boton para calcular la suma
sumar=tkin.Button(ventana,text="Sumar")
sumar.pack()
#Creamos un boton para calcular la resta
restar=tkin.Button(ventana,text="Restar")
restar.pack()

#Creamos un label vacio para mostrar el resultado
resultados=tkin.Label(ventana,text="")
resultados.pack(pady=10)

#Creamos la funcion para sumar
def suma():
    #Guardamos los valores de los textbox en variables
    numero1=entradanum1.get()
    numero2=entradanum2.get()
    #Sumamos los dos numeros
    sumado=numero1+numero2
    #Mostramos el resultado en la ventana
    resultados.config(text="La suma es: "+sumado)

    #lo aplicamos al boton sumar
sumar.config(command=suma)

#Creamos la funcion para restar
def resta():
    #Guardamos los valores de los textbox en variables
    numero1=entradanum1.get()
    numero2=entradanum2.get()
    #Restamos los dos numeros
    restado=numero1-numero2
    #Mostramos el resultado en la ventana
    resultados.config(text="La resta es: "+restado)

    #lo aplicamos al boton restar
restar.config(command=resta)

#Activamos la ventana 
ventana.mainloop()