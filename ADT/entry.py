import tkinter as tekin

ventana=tekin.Tk()

ventana.title("Primera ventana en Java")
entrada=tekin.Entry(ventana,width=30)
entrada.pack(pady=10)

resultado=tekin.Label(ventana,text="")
resultado.pack(pady=10)

def mostrarTexto():
    texto_recogido=entrada.get()
    resultado.config(text=texto_recogido)
    
boton = tekin.Button(ventana,text="Click",command=mostrarTexto)
boton.pack(pady=10)



ventana.mainloop()