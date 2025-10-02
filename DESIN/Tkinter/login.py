import tkinter as tkin
import sqlite3 as sql
import hashlib as hash
from tkinter import messagebox


#Creamos la base de datos
DB_NAME = "usuarios.db"

#Creamos la funcion de iniciar sesion
def iniciar_sesion():
    #Obtenemos los usuarios y contraseñas de los textbox
    usuario=entradausuario.get()
    contraseña=entradacontraseña.get()
    #Validamos que los campos no esten vacios
    if not usuario or not contraseña:
        messagebox.showerror("Error", "Por favor, ingrese usuario y contraseña")
        return
    #Hasheamos la contraseña
    hashed_password = hash.sha256(contraseña.encode()).hexdigest()
    #Conectamos a la base de datos
    conect=sql.connect(DB_NAME)
    #Creamos el cursor (el cursosr es el que nos permite ejecutar las consultas)
    cursor=conect.cursor()
    #Creamos una query para buscar el usuario y la contraseña
    cursor.execute("SELECT * FROM usuarios WHERE username=? AND password_hash=?", (usuario, hashed_password))
    #Guardamos el resultado de la query en una variable
    query_guardada=cursor.fetchone()
    #Cerramos la conexion
    conect.close()
    #Comprobamos si el usuario y la contraseña son correctos
    if query_guardada:
        messagebox.showinfo("Exito", "Inicio de sesion correcto")
    else:
        messagebox.showerror("Error", "Usuario o contraseña incorrectos")
        
        
#Creamos la funcion hasheada para la contraseña
def hash_contraseña(contraseña):
    #Hasheamos la contraseña
    return hash.sha256(contraseña.encode()).hexdigest()

# Crear la ventana principal
ventana = tkin.Tk()
# Ponemos el título y el tamaño de la ventana
ventana.title("Login")
ventana.geometry("400x600")
# Creamos las etiquetas y textbox para el login
login = tkin.Label(ventana, text="Login", font=("Arial", 30))
login.pack(pady=5)
# Creamos la etiqueta del usuario
usuario = tkin.Label(ventana, text="Usuario: ")
usuario.pack(pady=5)
# Creamos el textbox para el usuario
entradausuario = tkin.Entry(ventana, width=30)
entradausuario.pack(pady=10)
# Creamos el textbox para la contraseña
contraseña = tkin.Label(ventana, text="Contraseña: ")
contraseña.pack(pady=5)
# Creamos el textbox para la contraseña
entradacontraseña = tkin.Entry(ventana, width=30, show="*")
entradacontraseña.pack(pady=15)
# Creamos un boton para Guardar sesion
sesion = tkin.Button(ventana, text="Guardar Sesion",command=iniciar_sesion)
sesion.pack(pady=20)
# Activamos la ventana
ventana.mainloop()
