import tkinter as tekin


ventana = tekin.Tk()
ventana.title("Formulario de Registro")
ventana.geometry("400x400")

# Etiquetas
regristo_label = tekin.Label(ventana, text="Registro Rapido", font=("Arial", 20, "bold"))
regristo_label.pack(pady=5)  

#Etiqueta Nombre  y entrada
nombre_label=tekin.Label(ventana,text="Nombre:",anchor="w")
nombre_label.pack(pady=0)
nombre_entry=tekin.Entry(ventana)
nombre_entry.pack(pady=0)  
#Etiqueta Edad y entrada
edad_label=tekin.Label(ventana,text="Edad:",anchor="w")
edad_label.pack(pady=0)
edad_entry=tekin.Entry(ventana)
edad_entry.pack(pady=0)
#Checkbutton Terminos y condiciones
terminos_check=tekin.Checkbutton(ventana,text="Acepto  los terminos y condiciones")
terminos_check.pack(pady=10)


#Funcion opcion menu
def opcion1():
    print("Has seleccionado la opcion 1")
   
#Menu Contextual
menu_contextual = tekin.Menu(ventana, tearoff=0)
menu_contextual.add_command(label="Opción 1")
menu_contextual.add_command(label="Opción 2")

#Boton Enviar
enviar_boton=tekin.Button(ventana,text="Enviar")
enviar_boton.pack(pady=10)
#Etiqueta Limpiar
limpiar_boton=tekin.Button(ventana,text="Limpiar")
limpiar_boton.pack(pady=10)
  









ventana.mainloop()