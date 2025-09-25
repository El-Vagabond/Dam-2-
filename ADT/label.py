import tkinter as tekin

ventana = tekin.Tk()

ventana.title("Primera ventana en Java")

ventana.geometry("500x500")


etiqueta1 = tekin.Label(ventana, text="Hola Mundo", font=("Arial", 20, "bold"))
etiqueta1.pack(pady=10)
etiqueta2 = tekin.Label(
    ventana, text="Adios Mundo", bg="orange", font=("Courier", 15, "italic")
)
etiqueta2.pack(padx=10, pady=10)
ventana.mainloop()
