import sqlite3
import hashlib
import tkinter as tk
from tkinter import messagebox

# ---------- Base de datos ----------
DB_NAME = "usuarios.db"
# Crear la tabla de usuarios si no existe
def crear_tabla():
    conn = sqlite3.connect(DB_NAME)
    cur = conn.cursor()
    cur.execute("""
        CREATE TABLE IF NOT EXISTS usuarios (
            id INTEGER PRIMARY KEY AUTOINCREMENT,
            username TEXT UNIQUE NOT NULL,
            password_hash TEXT NOT NULL
        )
    """)
    
    conn.commit()
    conn.close()
# Función para hashear la contraseña
def hash_password(password: str) -> str:
    return hashlib.sha256(password.encode("utf-8")).hexdigest()
# Función para guardar un nuevo usuario
def guardar_usuario():
    username = entry_user.get().strip()
    password = entry_pass.get()
# Validar campos si están vacíos
    if not username or not password:
        messagebox.showwarning("Datos incompletos", "Por favor, rellena usuario y contraseña.")
        return
# Hashear la contraseña para seguridad
    pwd_hash = hash_password(password)
#Intentamos guardar el usuario en la base de datos 
    try:
        conn = sqlite3.connect(DB_NAME)
        cur = conn.cursor()
        cur.execute("INSERT INTO usuarios (username, password_hash) VALUES (?, ?)", (username, pwd_hash))
        conn.commit()
        conn.close()
        messagebox.showinfo("Éxito", f"Usuario '{username}' registrado.")
        # Limpiamos los campos para un nuevo registro si es exitoso
        entry_user.delete(0, tk.END)
        entry_pass.delete(0, tk.END)
    except sqlite3.IntegrityError:
        messagebox.showerror("Error", f"El usuario '{username}' ya existe.")
    except Exception as e:
        messagebox.showerror("Error", f"Ocurrió un problema: {e}")

# ---------- Interfaz ----------
root = tk.Tk()
root.title("Registro de usuarios")
root.geometry("300x200")

crear_tabla()

label_title = tk.Label(root, text="Crear cuenta", font=("Arial", 14, "bold"))
label_title.pack(pady=10)

label_user = tk.Label(root, text="Usuario:")
label_user.pack()
entry_user = tk.Entry(root, width=30)
entry_user.pack(pady=5)

label_pass = tk.Label(root, text="Contraseña:")
label_pass.pack()
entry_pass = tk.Entry(root, width=30, show="*")
entry_pass.pack(pady=5)

btn_save = tk.Button(root, text="Guardar usuario", command=guardar_usuario)
btn_save.pack(pady=10)

root.mainloop()
