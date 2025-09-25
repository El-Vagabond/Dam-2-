import tkinter as tekin

ventana = tekin.Tk()

ventana.title("Primera ventana en Java")
ventana.geometry("500x500")

etiqueta1 = tekin.Label(ventana, text="Vamo a DARLE", font=("Arial", 20, "bold"))
etiqueta1.pack(pady=10)


def accion():
    print("Me has dado")


boton = tekin.Button(ventana, text="Click", command=accion)
boton.pack(pady=10)


ventana.mainloop()
