# Guía Completa de Programación en Python para Principiantes

## Introducción

Python es un lenguaje de programación de alto nivel, interpretado y de propósito general. Es conocido por su sintaxis clara y legible, lo que lo hace ideal para principiantes. Esta guía te ayudará a comprender los conceptos fundamentales para comenzar a programar en Python.

---

## 1. Tipos de Datos Básicos

Python tiene varios tipos de datos incorporados que no requieren declaración explícita del tipo.

### Tipos principales:

- **int**: Números enteros (sin decimales)
- **float**: Números con decimales
- **bool**: Valores lógicos (True o False)
- **str**: Cadenas de texto
- **NoneType**: Representa la ausencia de valor (None)

### Ejemplo:

```python
# Números enteros
edad = 25
año = 2025
poblacion_mundial = 8000000000

# Números decimales
precio = 19.99
temperatura = 36.5
pi = 3.14159

# Valores booleanos (True/False con mayúscula inicial)
es_estudiante = True
es_mayor_de_edad = False

# Cadenas de texto (strings)
nombre = "Juan"
apellido = 'Pérez'  # Se pueden usar comillas simples o dobles
mensaje = """Este es un texto
que ocupa múltiples
líneas"""

# None (ausencia de valor)
valor_nulo = None

# Ver el tipo de dato con type()
print(type(edad))           # <class 'int'>
print(type(precio))         # <class 'float'>
print(type(es_estudiante))  # <class 'bool'>
print(type(nombre))         # <class 'str'>

# Imprimir valores
print("Edad:", edad)
print("Precio:", precio)
print("Es estudiante:", es_estudiante)
print("Nombre:", nombre)
```

### Conversión de tipos (Type Casting):

```python
# Convertir entre tipos de datos

# String a número
texto = "25"
numero = int(texto)        # Convierte "25" a 25
decimal = float("3.14")    # Convierte "3.14" a 3.14

# Número a string
edad = 25
texto_edad = str(edad)     # Convierte 25 a "25"

# Número a booleano
valor = bool(0)            # False (0 es False, cualquier otro número es True)
valor2 = bool(5)           # True

# Float a int (elimina decimales)
precio = 19.99
precio_entero = int(precio)  # 19 (no redondea, solo elimina decimales)

print(f"Texto convertido a número: {numero}")
print(f"Edad como texto: '{texto_edad}'")
print(f"Precio entero: {precio_entero}")
```

---

## 2. Variables y Constantes

En Python, las variables son dinámicas y no requieren declaración de tipo. Las constantes son por convención, no forzadas por el lenguaje.

### Variables

```python
# Declaración de variables (no necesitas especificar el tipo)
nombre = "Ana"
edad = 30
altura = 1.65
es_activo = True

# Puedes cambiar el valor y el tipo de una variable
x = 10        # x es un entero
x = "Hola"    # Ahora x es un string (Python lo permite)
x = 3.14      # Ahora x es un float

# Asignación múltiple
a, b, c = 1, 2, 3
print(f"a={a}, b={b}, c={c}")

# Asignar el mismo valor a múltiples variables
x = y = z = 0

# Intercambiar valores (muy fácil en Python)
a = 5
b = 10
a, b = b, a  # Ahora a=10 y b=5
print(f"Después del intercambio: a={a}, b={b}")

# Reglas para nombres de variables:
# ✓ Pueden contener letras, números y guiones bajos
# ✓ Deben comenzar con letra o guión bajo
# ✓ Son sensibles a mayúsculas (edad ≠ Edad)
# ✗ No pueden ser palabras reservadas (if, for, while, etc.)

nombre_completo = "Juan Pérez"    # ✓ Correcto (snake_case recomendado)
nombreCompleto = "Juan Pérez"     # ✓ Correcto pero menos común en Python
_variable_privada = 10            # ✓ Convención para variables "privadas"
```

### Constantes (Convención)

```python
# En Python no hay constantes reales, pero por convención
# se escriben en MAYÚSCULAS para indicar que no deben cambiar
PI = 3.14159
DIAS_SEMANA = 7
VELOCIDAD_LUZ = 299792458  # m/s
NOMBRE_EMPRESA = "TechCorp"

# Técnicamente puedes cambiarlas (Python no lo impide)
# pero no deberías hacerlo
print(f"El valor de PI es: {PI}")
print(f"Días de la semana: {DIAS_SEMANA}")
```

---

## 3. Operadores Básicos

### 3.1 Operadores Aritméticos

```python
# Operadores matemáticos básicos
a = 10
b = 3

# Suma
suma = a + b          # 13

# Resta
resta = a - b         # 7

# Multiplicación
multiplicacion = a * b  # 30

# División (siempre retorna float)
division = a / b      # 3.333...

# División entera (descarta decimales)
division_entera = a // b  # 3

# Módulo (resto de la división)
modulo = a % b        # 1 (10 dividido entre 3 da resto 1)

# Potencia
potencia = a ** b     # 1000 (10 elevado a la 3)

# Raíz cuadrada (usando potencia)
raiz_cuadrada = 16 ** 0.5  # 4.0

print(f"Suma: {suma}")
print(f"División: {division}")
print(f"División entera: {division_entera}")
print(f"Módulo: {modulo}")
print(f"Potencia: {potencia}")

# Operadores de asignación compuestos
contador = 5
contador += 1   # contador = contador + 1 → 6
contador -= 2   # contador = contador - 2 → 4
contador *= 3   # contador = contador * 3 → 12
contador /= 4   # contador = contador / 4 → 3.0
contador //= 2  # contador = contador // 2 → 1.0
contador **= 2  # contador = contador ** 2 → 1.0

print(f"Contador final: {contador}")
```

### 3.2 Operadores Relacionales

```python
# Comparaciones que retornan True o False
x = 10
y = 20

# Igual a
igual = (x == y)        # False

# Diferente de
diferente = (x != y)    # True

# Mayor que
mayor = (x > y)         # False

# Menor que
menor = (x < y)         # True

# Mayor o igual que
mayor_igual = (x >= 10) # True

# Menor o igual que
menor_igual = (y <= 15) # False

print(f"¿x es igual a y? {igual}")
print(f"¿x es menor que y? {menor}")
print(f"¿x es mayor o igual a 10? {mayor_igual}")

# Comparaciones encadenadas (característica única de Python)
edad = 25
es_adulto_joven = 18 <= edad <= 30  # True
print(f"¿Es adulto joven? {es_adulto_joven}")

# Equivale a: (18 <= edad) and (edad <= 30)
```

### 3.3 Operadores Lógicos

```python
# Operadores para combinar expresiones booleanas
tiene_licencia = True
es_mayor_de_edad = True
tiene_experiencia = False

# AND (and) - Ambas condiciones deben ser verdaderas
puede_conducir = tiene_licencia and es_mayor_de_edad  # True

# OR (or) - Al menos una condición debe ser verdadera
puede_postular = tiene_experiencia or es_mayor_de_edad  # True

# NOT (not) - Invierte el valor booleano
es_menor_de_edad = not es_mayor_de_edad  # False

# Combinación de operadores
elegible = (tiene_licencia and es_mayor_de_edad) or tiene_experiencia

print(f"¿Puede conducir? {puede_conducir}")
print(f"¿Puede postular? {puede_postular}")
print(f"¿Es menor de edad? {es_menor_de_edad}")
print(f"¿Es elegible? {elegible}")

# Operadores de identidad
a = [1, 2, 3]
b = [1, 2, 3]
c = a

print(a is c)      # True (mismo objeto en memoria)
print(a is b)      # False (diferentes objetos aunque sean iguales)
print(a == b)      # True (mismo contenido)

# Operadores de pertenencia
lista = [1, 2, 3, 4, 5]
print(3 in lista)      # True
print(10 not in lista) # True
```

---

## 4. Estructuras de Control

### 4.1 Condicionales (if, elif, else)

```python
# Sintaxis básica (nota: Python usa indentación, no llaves)
edad = 18

# If simple
if edad >= 18:
    print("Eres mayor de edad")

# If-else
if edad >= 18:
    print("Puedes votar")
else:
    print("No puedes votar aún")

# If-elif-else (múltiples condiciones)
nota = 85

if nota >= 90:
    print("Calificación: A - Excelente")
elif nota >= 80:
    print("Calificación: B - Muy bueno")
elif nota >= 70:
    print("Calificación: C - Bueno")
elif nota >= 60:
    print("Calificación: D - Aprobado")
else:
    print("Calificación: F - Reprobado")

# Condicionales anidadas
tiene_dinero = True
tienda_abierta = True

if tiene_dinero:
    if tienda_abierta:
        print("Puedes comprar")
    else:
        print("La tienda está cerrada")
else:
    print("No tienes dinero")

# Expresión condicional (operador ternario)
edad = 20
mensaje = "Mayor de edad" if edad >= 18 else "Menor de edad"
print(mensaje)

# Equivale a:
# if edad >= 18:
#     mensaje = "Mayor de edad"
# else:
#     mensaje = "Menor de edad"

# Múltiples condiciones en una línea
x = 15
if 10 < x < 20:  # Python permite esto (muy útil)
    print("x está entre 10 y 20")
```

### 4.2 Match-Case (Python 3.10+)

Estructura similar al switch de otros lenguajes.

```python
# Match-case (disponible desde Python 3.10)
dia_semana = 3

match dia_semana:
    case 1:
        nombre_dia = "Lunes"
    case 2:
        nombre_dia = "Martes"
    case 3:
        nombre_dia = "Miércoles"
    case 4:
        nombre_dia = "Jueves"
    case 5:
        nombre_dia = "Viernes"
    case 6:
        nombre_dia = "Sábado"
    case 7:
        nombre_dia = "Domingo"
    case _:  # Default (cualquier otro valor)
        nombre_dia = "Día inválido"

print(f"El día {dia_semana} es: {nombre_dia}")

# Match con múltiples valores
calificacion = 'B'

match calificacion:
    case 'A':
        print("Excelente trabajo")
    case 'B':
        print("Buen trabajo")
    case 'C':
        print("Trabajo aceptable")
    case 'D':
        print("Necesitas mejorar")
    case 'F':
        print("Reprobado")
    case _:
        print("Calificación no válida")

# Nota: Si usas Python 3.9 o anterior, usa if-elif en su lugar
```

---

## 5. Bucles (Loops)

### 5.1 Bucle for

```python
# For en Python es más flexible que en otros lenguajes
# Se usa principalmente con rangos y secuencias

# Iterar con range() - del 0 al 4
for i in range(5):
    print(f"Número: {i}")

# range(inicio, fin) - del 1 al 5
for i in range(1, 6):
    print(f"Número: {i}")

# range(inicio, fin, paso) - de 2 en 2
for i in range(0, 11, 2):
    print(f"Número par: {i}")

# Contar hacia atrás
for i in range(10, 0, -1):
    print(f"Cuenta regresiva: {i}")

# Iterar sobre una lista
frutas = ["manzana", "banana", "naranja"]
for fruta in frutas:
    print(f"Me gusta la {fruta}")

# Iterar con índice usando enumerate()
for indice, fruta in enumerate(frutas):
    print(f"{indice + 1}. {fruta}")

# Calcular la suma de los primeros 10 números
suma = 0
for i in range(1, 11):
    suma += i
print(f"Suma total: {suma}")  # 55

# Tabla de multiplicar
numero = 5
for i in range(1, 11):
    print(f"{numero} x {i} = {numero * i}")

# List comprehension (forma compacta de crear listas)
cuadrados = [x**2 for x in range(1, 6)]
print(f"Cuadrados: {cuadrados}")  # [1, 4, 9, 16, 25]

# Con condicional
pares = [x for x in range(10) if x % 2 == 0]
print(f"Pares: {pares}")  # [0, 2, 4, 6, 8]
```

### 5.2 Bucle while

```python
# While se ejecuta mientras la condición sea verdadera

# Contar del 1 al 5
contador = 1
while contador <= 5:
    print(f"Contador: {contador}")
    contador += 1

# Ejemplo: encontrar el primer número mayor a 100
numero = 1
while numero <= 100:
    numero = numero * 2
print(f"Primer número mayor a 100: {numero}")

# Bucle infinito con break
while True:
    respuesta = "n"  # En la realidad, esto vendría del usuario
    if respuesta.lower() == "s":
        print("Continuando...")
        break  # Sale del bucle
    else:
        print("Terminando programa")
        break

# Continue - salta a la siguiente iteración
contador = 0
while contador < 10:
    contador += 1
    if contador % 2 == 0:  # Si es par
        continue  # Salta el print
    print(f"Número impar: {contador}")

# Ejemplo práctico: validación de entrada
intentos = 0
password = "1234"
max_intentos = 3

while intentos < max_intentos:
    # En un programa real, aquí leerías la entrada del usuario
    intento = "1111"  # Simulación
    intentos += 1
    
    if intento == password:
        print("¡Acceso concedido!")
        break
    else:
        print(f"Contraseña incorrecta. Intentos restantes: {max_intentos - intentos}")
else:
    # El else del while se ejecuta si el bucle termina normalmente (sin break)
    print("Demasiados intentos. Acceso denegado.")
```

### 5.3 Control de bucles (break, continue, pass)

```python
# break - termina el bucle inmediatamente
for i in range(10):
    if i == 5:
        break  # Sale del bucle cuando i es 5
    print(i)
# Imprime: 0, 1, 2, 3, 4

# continue - salta a la siguiente iteración
for i in range(10):
    if i % 2 == 0:
        continue  # Salta los números pares
    print(i)
# Imprime: 1, 3, 5, 7, 9

# pass - no hace nada (placeholder)
for i in range(5):
    if i == 2:
        pass  # Todavía no implementado
    print(i)
# Imprime: 0, 1, 2, 3, 4

# Bucles anidados
for i in range(3):
    for j in range(3):
        print(f"i={i}, j={j}")
```

---

## 6. Listas, Tuplas y Diccionarios

### 6.1 Listas (Arrays dinámicos)

```python
# Las listas son mutables (se pueden modificar)
# Se definen con corchetes []

# Crear listas
numeros = [1, 2, 3, 4, 5]
frutas = ["manzana", "banana", "naranja"]
mixta = [1, "dos", 3.0, True]  # Pueden tener diferentes tipos
vacia = []

# Acceder a elementos (índice empieza en 0)
print(frutas[0])      # "manzana"
print(frutas[2])      # "naranja"
print(frutas[-1])     # "naranja" (último elemento)
print(frutas[-2])     # "banana" (penúltimo)

# Modificar elementos
frutas[1] = "pera"
print(frutas)  # ["manzana", "pera", "naranja"]

# Slicing (rebanadas)
numeros = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
print(numeros[2:5])    # [2, 3, 4] (desde índice 2 hasta 4)
print(numeros[:3])     # [0, 1, 2] (desde el inicio hasta 2)
print(numeros[7:])     # [7, 8, 9] (desde 7 hasta el final)
print(numeros[::2])    # [0, 2, 4, 6, 8] (cada 2 elementos)
print(numeros[::-1])   # [9, 8, 7, ...] (invertir lista)

# Métodos de listas
frutas = ["manzana", "banana"]

# Agregar elementos
frutas.append("naranja")        # Agrega al final
frutas.insert(1, "pera")        # Inserta en posición 1
frutas.extend(["uva", "kiwi"])  # Agrega múltiples elementos

# Eliminar elementos
frutas.remove("banana")         # Elimina por valor
elemento = frutas.pop()         # Elimina y retorna el último
elemento = frutas.pop(0)        # Elimina y retorna el índice 0
del frutas[0]                   # Elimina por índice
frutas.clear()                  # Vacía la lista

# Otras operaciones
numeros = [3, 1, 4, 1, 5, 9, 2]
print(len(numeros))             # 7 (longitud)
print(numeros.count(1))         # 2 (cuenta cuántos 1 hay)
print(numeros.index(4))         # 2 (índice del primer 4)
numeros.sort()                  # Ordena la lista
numeros.reverse()               # Invierte el orden

# Verificar pertenencia
print("manzana" in frutas)      # True o False

# Copiar listas
original = [1, 2, 3]
copia = original.copy()         # o copia = original[:]
copia[0] = 999
print(original)  # [1, 2, 3] (no se modifica)
print(copia)     # [999, 2, 3]

# List comprehension con condicionales
numeros = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
pares = [x for x in numeros if x % 2 == 0]
cuadrados = [x**2 for x in numeros]
print(pares)      # [2, 4, 6, 8, 10]
print(cuadrados)  # [1, 4, 9, 16, 25, 36, 49, 64, 81, 100]
```

### 6.2 Tuplas (Inmutables)

```python
# Las tuplas son inmutables (no se pueden modificar)
# Se definen con paréntesis ()

# Crear tuplas
coordenadas = (10, 20)
persona = ("Juan", 25, "Madrid")
un_elemento = (5,)  # Nota: la coma es necesaria para una tupla de 1 elemento
vacia = ()

# Acceder a elementos (igual que listas)
print(coordenadas[0])  # 10
print(persona[-1])     # "Madrid"

# Las tuplas NO se pueden modificar
# persona[1] = 26  # Error! TypeError

# Desempaquetado de tuplas
x, y = coordenadas
print(f"x: {x}, y: {y}")

nombre, edad, ciudad = persona
print(f"{nombre} tiene {edad} años y vive en {ciudad}")

# Métodos de tuplas (solo 2)
numeros = (1, 2, 3, 2, 2, 4)
print(numeros.count(2))   # 3 (cuenta cuántos 2 hay)
print(numeros.index(3))   # 2 (índice del primer 3)

# Ventajas de las tuplas:
# 1. Son más rápidas que las listas
# 2. Protegen datos que no deben cambiar
# 3. Se pueden usar como claves de diccionarios
```

### 6.3 Diccionarios (Mapas clave-valor)

```python
# Los diccionarios almacenan pares clave-valor
# Se definen con llaves {}

# Crear diccionarios
persona = {
    "nombre": "Ana",
    "edad": 25,
    "ciudad": "Madrid"
}

# Diccionario vacío
vacio = {}
# o también: vacio = dict()

# Acceder a valores
print(persona["nombre"])        # "Ana"
print(persona.get("edad"))      # 25
print(persona.get("telefono"))  # None (no existe la clave)
print(persona.get("telefono", "No disponible"))  # Valor por defecto

# Modificar y agregar elementos
persona["edad"] = 26            # Modifica
persona["telefono"] = "123456"  # Agrega nuevo par

# Eliminar elementos
del persona["ciudad"]           # Elimina la clave "ciudad"
telefono = persona.pop("telefono")  # Elimina y retorna el valor

# Métodos de diccionarios
persona = {"nombre": "Ana", "edad": 25, "ciudad": "Madrid"}

# Obtener todas las claves, valores o pares
print(persona.keys())    # dict_keys(['nombre', 'edad', 'ciudad'])
print(persona.values())  # dict_values(['Ana', 25, 'Madrid'])
print(persona.items())   # dict_items([('nombre', 'Ana'), ...])

# Verificar si existe una clave
print("nombre" in persona)  # True
print("telefono" in persona)  # False

# Iterar sobre diccionarios
for clave in persona:
    print(f"{clave}: {persona[clave]}")

# Mejor forma: iterar sobre items
for clave, valor in persona.items():
    print(f"{clave}: {valor}")

# Actualizar diccionario con otro
persona.update({"edad": 26, "profesion": "Ingeniera"})

# Copiar diccionarios
copia = persona.copy()

# Diccionario con valores por defecto
from collections import defaultdict
contador = defaultdict(int)  # Valores por defecto: 0
contador["a"] += 1
print(contador["a"])  # 1
print(contador["b"])  # 0 (no da error)

# Dictionary comprehension
cuadrados = {x: x**2 for x in range(1, 6)}
print(cuadrados)  # {1: 1, 2: 4, 3: 9, 4: 16, 5: 25}
```

### 6.4 Conjuntos (Sets)

```python
# Los sets son colecciones no ordenadas de elementos únicos
# Se definen con llaves {} o set()

# Crear conjuntos
numeros = {1, 2, 3, 4, 5}
frutas = {"manzana", "banana", "naranja"}
vacio = set()  # Nota: {} crea un diccionario vacío, no un set

# Los sets NO permiten duplicados
numeros = {1, 2, 2, 3, 3, 3, 4}
print(numeros)  # {1, 2, 3, 4}

# Agregar y eliminar elementos
frutas.add("pera")
frutas.remove("banana")     # Error si no existe
frutas.discard("kiwi")      # No da error si no existe

# Operaciones de conjuntos
a = {1, 2, 3, 4, 5}
b = {4, 5, 6, 7, 8}

union = a | b              # {1, 2, 3, 4, 5, 6, 7, 8}
interseccion = a & b       # {4, 5}
diferencia = a - b         # {1, 2, 3}
dif_simetrica = a ^ b      # {1, 2, 3, 6, 7, 8}

# Verificar pertenencia (muy rápido)
print(3 in a)  # True

# Set comprehension
pares = {x for x in range(10) if x % 2 == 0}
print(pares)  # {0, 2, 4, 6, 8}
```

---

## 7. Entrada y Salida

### 7.1 Salida con print()

```python
# Print básico
print("Hola, mundo")

# Print de múltiples valores
nombre = "Juan"
edad = 25
print("Nombre:", nombre, "Edad:", edad)

# Separador personalizado
print("A", "B", "C", sep="-")  # A-B-C

# Fin de línea personalizado
print("Hola", end=" ")
print("mundo")  # Hola mundo (en la misma línea)

# Formateo de strings - Método 1: f-strings (recomendado)
nombre = "Ana"
edad = 25
print(f"Me llamo {nombre} y tengo {edad} años")

# Expresiones dentro de f-strings
x = 10
y = 20
print(f"La suma de {x} y {y} es {x + y}")

# Formateo de números
pi = 3.14159265359
print(f"Pi con 2 decimales: {pi:.2f}")  # 3.14
print(f"Pi con 4 decimales: {pi:.4f}")  # 3.1416

numero = 1234.5678
print(f"Con separador de miles: {numero:,.2f}")  # 1,234.57

# Alineación
print(f"{'Izquierda':<15}|")   # Alinea a la izquierda
print(f"{'Centro':^15}|")      # Centra
print(f"{'Derecha':>15}|")     # Alinea a la derecha

# Método 2: format()
print("Me llamo {} y tengo {} años".format(nombre, edad))
print("Suma: {0} + {1} = {2}".format(x, y, x + y))

# Método 3: % (antiguo, estilo C)
print("Me llamo %s y tengo %d años" % (nombre, edad))

# Imprimir estructuras de datos
lista = [1, 2, 3, 4, 5]
diccionario = {"a": 1, "b": 2}
print(f"Lista: {lista}")
print(f"Diccionario: {diccionario}")
```

### 7.2 Entrada con input()

```python
# input() siempre retorna un string
nombre = input("Ingresa tu nombre: ")
print(f"Hola, {nombre}!")

# Convertir a número
edad_texto = input("Ingresa tu edad: ")
edad = int(edad_texto)  # Convertir a entero
print(f"El próximo año tendrás {edad + 1} años")

# Forma más directa
edad = int(input("Ingresa tu edad: "))

# Leer float
altura = float(input("Ingresa tu altura en metros: "))
print(f"Tu altura es {altura} m")

# Validación de entrada
while True:
    try:
        edad = int(input("Ingresa tu edad: "))
        if edad < 0 or edad > 120:
            print("Edad no válida")
            continue
        break
    except ValueError:
        print("Por favor ingresa un número válido")

print(f"Tu edad es: {edad}")

# Leer múltiples valores en una línea
numeros = input("Ingresa 3 números separados por espacios: ").split()
a, b, c = map(int, numeros)  # Convierte cada uno a int
print(f"Suma: {a + b + c}")

# Ejemplo práctico: calculadora
print("=== CALCULADORA ===")
num1 = float(input("Primer número: "))
operacion = input("Operación (+, -, *, /): ")
num2 = float(input("Segundo número: "))

if operacion == "+":
    resultado = num1 + num2
elif operacion == "-":
    resultado = num1 - num2
elif operacion == "*":
    resultado = num1 * num2
elif operacion == "/":
    if num2 != 0:
        resultado = num1 / num2
    else:
        resultado = "Error: división por cero"
else:
    resultado = "Operación no válida"

print(f"Resultado: {resultado}")
```

---

## 8. Funciones

Las funciones son bloques de código reutilizables que realizan una tarea específica.

### 8.1 Definición Básica

```python
# Función sin parámetros y sin retorno
def saludar():
    print("¡Hola! Bienvenido")

# Llamar a la función
saludar()

# Función con parámetros
def saludar_persona(nombre):
    print(f"¡Hola, {nombre}!")

saludar_persona("Ana")

# Función con múltiples parámetros
def sumar(a, b):
    resultado = a + b
    return resultado  # Retorna un valor

# Usar el valor retornado
suma = sumar(5, 3)
print(f"La suma es: {suma}")

# Llamar directamente
print(f"10 + 20 = {sumar(10, 20)}")
```

### 8.2 Parámetros y Argumentos

```python
# Parámetros con valores por defecto
def saludar(nombre="amigo", saludo="Hola"):
    print(f"{saludo}, {nombre}!")

saludar()                        # Hola, amigo!
saludar("Ana")                   # Hola, Ana!
saludar("Carlos", "Buenos días") # Buenos días, Carlos!

# Argumentos nombrados (keyword arguments)
saludar(saludo="Hey", nombre="Luis")

# Función con retorno múltiple
def operaciones(a, b):
    suma = a + b
    resta = a - b
    multiplicacion = a * b
    division = a / b if b != 0 else None
    return suma, resta, multiplicacion, division

# Desempaquetar los valores retornados
s, r, m, d = operaciones(10, 5)
print(f"Suma: {s}, Resta: {r}, Multi: {m}, Div: {d}")

# *args - número variable de argumentos posicionales
def sumar_todos(*numeros):
    total = 0
    for num in numeros:
        total += num
    return total

print(sumar_todos(1, 2, 3))           # 6
print(sumar_todos(1, 2, 3, 4, 5, 6))  # 21

# **kwargs - número variable de argumentos nombrados
def mostrar_info(**datos):
    for clave, valor in datos.items():
        print(f"{clave}: {valor}")

mostrar_info(nombre="Ana", edad=25, ciudad="Madrid")

# Combinación de todos los tipos de parámetros
def funcion_completa(posicional, *args, por_defecto="valor", **kwargs):
    print(f"Posicional: {posicional}")
    print(f"Args: {args}")
    print(f"Por defecto: {por_defecto}")
    print(f"Kwargs: {kwargs}")

funcion_completa(1, 2, 3, por_defecto="otro", extra="info")
```

### 8.3 Ejemplos Prácticos de Funciones

```python
# Función que calcula el área de un rectángulo
def calcular_area_rectangulo(base, altura):
    """
    Calcula el área de un rectángulo.
    
    Args:
        base: Base del rectángulo
        altura: Altura del rectángulo
    
    Returns:
        El área del rectángulo
    """
    return base * altura

area = calcular_area_rectangulo(5, 3)
print(f"Área: {area}")

# Función que verifica si un número es par
def es_par(numero):
    return numero % 2 == 0

print(es_par(8))   # True
print(es_par(7))   # False

# Función que encuentra el mayor de tres números
def encontrar_mayor(a, b, c):
    mayor = a
    if b > mayor:
        mayor = b
    if c > mayor:
        mayor = c
    return mayor

# O más simple usando max()
def encontrar_mayor_v2(a, b, c):
    return max(a, b, c)

print(encontrar_mayor(15, 23, 8))  # 23

# Función que calcula el factorial
def factorial(n):
    if n <= 1:
        return 1
    resultado = 1
    for i in range(2, n + 1):
        resultado *= i
    return resultado

print(f"Factorial de 5: {factorial(5)}")  # 120

# Función recursiva (se llama a sí misma)
def factorial_recursivo(n):
    if n <= 1:
        return 1
    return n * factorial_recursivo(n - 1)

print(f"Factorial recursivo de 5: {factorial_recursivo(5)}")  # 120

# Función que verifica si un número es primo
def es_primo(numero):
    if numero < 2:
        return False
    for i in range(2, int(numero ** 0.5) + 1):
        if numero % i == 0:
            return False
    return True

print(f"¿7 es primo? {es_primo(7)}")    # True
print(f"¿10 es primo? {es_primo(10)}")  # False

# Función que invierte una cadena
def invertir_cadena(texto):
    return texto[::-1]

print(invertir_cadena("Hola"))  # "aloH"

# Función que cuenta vocales
def contar_vocales(texto):
    vocales = "aeiouAEIOU"
    contador = 0
    for letra in texto:
        if letra in vocales:
            contador += 1
    return contador

# O más simple con list comprehension
def contar_vocales_v2(texto):
    return sum(1 for letra in texto if letra in "aeiouAEIOU")

print(f"Vocales en 'Hola Mundo': {contar_vocales('Hola Mundo')}")  # 4
```

### 8.4 Funciones Lambda (Anónimas)

```python
# Lambda: funciones pequeñas de una línea
# Sintaxis: lambda argumentos: expresión

# Función normal
def cuadrado(x):
    return x ** 2

# Equivalente con lambda
cuadrado_lambda = lambda x: x ** 2

print(cuadrado(5))         # 25
print(cuadrado_lambda(5))  # 25

# Lambda con múltiples argumentos
suma = lambda a, b: a + b
print(suma(3, 4))  # 7

# Uso común: con funciones como map(), filter(), sorted()

# map() - aplica una función a cada elemento
numeros = [1, 2, 3, 4, 5]
cuadrados = list(map(lambda x: x ** 2, numeros))
print(cuadrados)  # [1, 4, 9, 16, 25]

# filter() - filtra elementos según una condición
pares = list(filter(lambda x: x % 2 == 0, numeros))
print(pares)  # [2, 4]

# sorted() - ordena con una clave personalizada
personas = [
    {"nombre": "Ana", "edad": 25},
    {"nombre": "Luis", "edad": 30},
    {"nombre": "Carlos", "edad": 20}
]
ordenadas = sorted(personas, key=lambda p: p["edad"])
print(ordenadas)  # Ordenadas por edad
```

---

## 9. Clases y Objetos (Programación Orientada a Objetos)

### 9.1 Conceptos Básicos

```python
# Definición de una clase
class Persona:
    # Constructor - se ejecuta al crear un objeto
    def __init__(self, nombre, edad, altura):
        # Atributos de instancia
        self.nombre = nombre
        self.edad = edad
        self.altura = altura
    
    # Métodos de instancia
    def presentarse(self):
        print(f"Hola, me llamo {self.nombre} y tengo {self.edad} años")
    
    def caminar(self):
        print(f"{self.nombre} está caminando")
    
    def es_mayor_de_edad(self):
        return self.edad >= 18
    
    def cumplir_años(self):
        self.edad += 1
        print(f"¡Feliz cumpleaños! Ahora tienes {self.edad} años")

# Crear objetos (instanciar la clase)
persona1 = Persona("Ana", 25, 1.65)
persona2 = Persona("Carlos", 17, 1.80)

# Acceder a atributos
print(f"Nombre: {persona1.nombre}")
print(f"Edad: {persona1.edad}")

# Llamar a métodos
persona1.presentarse()
persona2.presentarse()
persona1.caminar()

# Usar métodos que retornan valores
if persona1.es_mayor_de_edad():
    print(f"{persona1.nombre} es mayor de edad")

if not persona2.es_mayor_de_edad():
    print(f"{persona2.nombre} es menor de edad")

# Modificar atributos directamente
persona1.edad = 26
persona1.presentarse()

# Llamar a método que modifica el objeto
persona2.cumplir_años()
```

### 9.2 Ejemplo Práctico: Clase CuentaBancaria

```python
class CuentaBancaria:
    # Atributo de clase (compartido por todas las instancias)
    banco = "Banco Nacional"
    
    def __init__(self, titular, numero_cuenta, saldo_inicial=0):
        # Atributos de instancia
        self.titular = titular
        self.numero_cuenta = numero_cuenta
        self.saldo = saldo_inicial
        self.movimientos = []  # Historial de movimientos
    
    def depositar(self, cantidad):
        if cantidad > 0:
            self.saldo += cantidad
            self.movimientos.append(f"Depósito: +${cantidad}")
            print(f"Depósito exitoso. Nuevo saldo: ${self.saldo}")
        else:
            print("La cantidad debe ser positiva")
    
    def retirar(self, cantidad):
        if cantidad > 0:
            if cantidad <= self.saldo:
                self.saldo -= cantidad
                self.movimientos.append(f"Retiro: -${cantidad}")
                print(f"Retiro exitoso. Nuevo saldo: ${self.saldo}")
            else:
                print("Saldo insuficiente")
        else:
            print("La cantidad debe ser positiva")
    
    def consultar_saldo(self):
        print(f"Saldo actual: ${self.saldo}")
        return self.saldo
    
    def mostrar_informacion(self):
        print("=" * 40)
        print(f"Banco: {self.banco}")
        print(f"Titular: {self.titular}")
        print(f"Número de cuenta: {self.numero_cuenta}")
        print(f"Saldo: ${self.saldo}")
        print("=" * 40)
    
    def mostrar_movimientos(self):
        print("\n--- Historial de Movimientos ---")
        if self.movimientos:
            for movimiento in self.movimientos:
                print(movimiento)
        else:
            print("No hay movimientos registrados")
    
    # Método especial para representación en string
    def __str__(self):
        return f"Cuenta de {self.titular}: ${self.saldo}"

# Usar la clase
cuenta = CuentaBancaria("Juan Pérez", "123456789", 1000)
cuenta.mostrar_informacion()

cuenta.depositar(500)
cuenta.retirar(200)
cuenta.consultar_saldo()

# Usar el método __str__
print(cuenta)  # Llama automáticamente a __str__

cuenta.mostrar_movimientos()
```

### 9.3 Herencia (Conceptos Avanzados Básicos)

```python
# Clase base (padre)
class Animal:
    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad
    
    def hacer_sonido(self):
        print("El animal hace un sonido")
    
    def info(self):
        print(f"Nombre: {self.nombre}, Edad: {self.edad}")

# Clase derivada (hija) - hereda de Animal
class Perro(Animal):
    def __init__(self, nombre, edad, raza):
        super().__init__(nombre, edad)  # Llama al constructor del padre
        self.raza = raza
    
    # Sobrescribir método
    def hacer_sonido(self):
        print("Guau guau!")
    
    # Método específico de Perro
    def traer_pelota(self):
        print(f"{self.nombre} trae la pelota")

class Gato(Animal):
    def hacer_sonido(self):
        print("Miau miau!")
    
    def trepar(self):
        print(f"{self.nombre} trepa al árbol")

# Usar las clases
perro = Perro("Rex", 3, "Labrador")
gato = Gato("Michi", 2)

perro.info()           # Heredado de Animal
perro.hacer_sonido()   # Sobrescrito en Perro
perro.traer_pelota()   # Específico de Perro

gato.info()
gato.hacer_sonido()
gato.trepar()
```

### 9.4 Atributos y Métodos Privados

```python
class CuentaBancaria:
    def __init__(self, titular, saldo_inicial):
        self.titular = titular
        # Atributo "privado" (por convención, con guión bajo)
        self.__saldo = saldo_inicial
    
    # Getter - obtener el valor
    def obtener_saldo(self):
        return self.__saldo
    
    # Setter - modificar el valor con validación
    def depositar(self, cantidad):
        if cantidad > 0:
            self.__saldo += cantidad
        else:
            print("Cantidad inválida")
    
    def retirar(self, cantidad):
        if 0 < cantidad <= self.__saldo:
            self.__saldo -= cantidad
        else:
            print("Operación inválida")

cuenta = CuentaBancaria("Ana", 1000)
# cuenta.__saldo  # No se puede acceder directamente (name mangling)
print(cuenta.obtener_saldo())  # Usar el getter
cuenta.depositar(500)
print(cuenta.obtener_saldo())

# Property decorator (forma pythónica)
class Rectangulo:
    def __init__(self, ancho, alto):
        self._ancho = ancho
        self._alto = alto
    
    @property
    def area(self):
        return self._ancho * self._alto
    
    @property
    def ancho(self):
        return self._ancho
    
    @ancho.setter
    def ancho(self, valor):
        if valor > 0:
            self._ancho = valor
        else:
            print("El ancho debe ser positivo")

rect = Rectangulo(5, 3)
print(rect.area)      # Se usa como atributo, pero es un método
rect.ancho = 10       # Usa el setter automáticamente
print(rect.area)
```

---

## 10. Manejo de Archivos

### 10.1 Leer Archivos

```python
# Abrir y leer un archivo de texto
# Forma básica (debes cerrar el archivo manualmente)
archivo = open("datos.txt", "r")  # "r" = read (lectura)
contenido = archivo.read()
print(contenido)
archivo.close()

# Forma recomendada: with (cierra automáticamente)
with open("datos.txt", "r") as archivo:
    contenido = archivo.read()
    print(contenido)
# El archivo se cierra automáticamente al salir del bloque with

# Leer línea por línea
with open("datos.txt", "r") as archivo:
    for linea in archivo:
        print(linea.strip())  # strip() elimina espacios y saltos de línea

# Leer todas las líneas en una lista
with open("datos.txt", "r") as archivo:
    lineas = archivo.readlines()
    print(lineas)

# Leer un número específico de caracteres
with open("datos.txt", "r") as archivo:
    primeros_10 = archivo.read(10)
    print(primeros_10)

# Manejo de errores al leer archivos
try:
    with open("archivo_inexistente.txt", "r") as archivo:
        contenido = archivo.read()
except FileNotFoundError:
    print("El archivo no existe")
except PermissionError:
    print("No tienes permiso para leer el archivo")
```

### 10.2 Escribir Archivos

```python
# Escribir en un archivo (sobreescribe si existe)
with open("salida.txt", "w") as archivo:  # "w" = write
    archivo.write("Hola, mundo!\n")
    archivo.write("Esta es otra línea\n")

# Agregar al final del archivo (no sobreescribe)
with open("salida.txt", "a") as archivo:  # "a" = append
    archivo.write("Esta línea se agrega al final\n")

# Escribir múltiples líneas
lineas = ["Primera línea\n", "Segunda línea\n", "Tercera línea\n"]
with open("salida.txt", "w") as archivo:
    archivo.writelines(lineas)

# Ejemplo práctico: guardar una lista
nombres = ["Ana", "Luis", "Carlos", "María"]
with open("nombres.txt", "w") as archivo:
    for nombre in nombres:
        archivo.write(nombre + "\n")

# Leer la lista guardada
with open("nombres.txt", "r") as archivo:
    nombres_leidos = [linea.strip() for linea in archivo]
print(nombres_leidos)
```

### 10.3 Trabajar con CSV

```python
import csv

# Escribir un archivo CSV
datos = [
    ["Nombre", "Edad", "Ciudad"],
    ["Ana", "25", "Madrid"],
    ["Luis", "30", "Barcelona"],
    ["Carlos", "28", "Valencia"]
]

with open("personas.csv", "w", newline="") as archivo:
    escritor = csv.writer(archivo)
    escritor.writerows(datos)

# Leer un archivo CSV
with open("personas.csv", "r") as archivo:
    lector = csv.reader(archivo)
    for fila in lector:
        print(fila)

# Leer CSV como diccionarios
with open("personas.csv", "r") as archivo:
    lector = csv.DictReader(archivo)
    for fila in lector:
        print(f"Nombre: {fila['Nombre']}, Edad: {fila['Edad']}")

# Escribir CSV con diccionarios
datos_dict = [
    {"nombre": "Ana", "edad": 25, "ciudad": "Madrid"},
    {"nombre": "Luis", "edad": 30, "ciudad": "Barcelona"}
]

with open("personas2.csv", "w", newline="") as archivo:
    campos = ["nombre", "edad", "ciudad"]
    escritor = csv.DictWriter(archivo, fieldnames=campos)
    escritor.writeheader()
    escritor.writerows(datos_dict)
```

---

## 11. Manejo de Excepciones

```python
# Try-except básico
try:
    numero = int(input("Ingresa un número: "))
    resultado = 10 / numero
    print(f"Resultado: {resultado}")
except ValueError:
    print("Error: Debes ingresar un número válido")
except ZeroDivisionError:
    print("Error: No se puede dividir por cero")

# Capturar cualquier excepción
try:
    # Código que puede fallar
    resultado = 10 / 0
except Exception as e:
    print(f"Ocurrió un error: {e}")

# Try-except-else-finally
try:
    archivo = open("datos.txt", "r")
    contenido = archivo.read()
except FileNotFoundError:
    print("El archivo no existe")
else:
    # Se ejecuta si NO hay excepciones
    print("Archivo leído correctamente")
finally:
    # Se ejecuta SIEMPRE (haya o no excepción)
    print("Finalizando operación")
    try:
        archivo.close()
    except:
        pass

# Lanzar excepciones propias
def dividir(a, b):
    if b == 0:
        raise ValueError("El divisor no puede ser cero")
    return a / b

try:
    resultado = dividir(10, 0)
except ValueError as e:
    print(f"Error: {e}")

# Crear excepciones personalizadas
class SaldoInsuficienteError(Exception):
    pass

class CuentaBancaria:
    def __init__(self, saldo):
        self.saldo = saldo
    
    def retirar(self, cantidad):
        if cantidad > self.saldo:
            raise SaldoInsuficienteError(f"Saldo insuficiente. Saldo actual: ${self.saldo}")
        self.saldo -= cantidad

cuenta = CuentaBancaria(100)
try:
    cuenta.retirar(150)
except SaldoInsuficienteError as e:
    print(e)
```

---

## 12. Módulos e Importaciones

```python
# Importar módulos de la biblioteca estándar
import math

print(math.pi)           # 3.141592653589793
print(math.sqrt(16))     # 4.0
print(math.ceil(4.3))    # 5 (redondea hacia arriba)
print(math.floor(4.9))   # 4 (redondea hacia abajo)

# Importar funciones específicas
from math import pi, sqrt, pow

print(pi)
print(sqrt(25))
print(pow(2, 3))  # 2 elevado a 3

# Importar con alias
import math as m
print(m.sin(m.pi / 2))

# Importar todo (no recomendado)
from math import *

# Módulos útiles de la biblioteca estándar
import random
print(random.randint(1, 10))        # Número aleatorio entre 1 y 10
print(random.choice([1, 2, 3, 4]))  # Elemento aleatorio de una lista
numeros = [1, 2, 3, 4, 5]
random.shuffle(numeros)              # Mezcla la lista
print(numeros)

import datetime
ahora = datetime.datetime.now()
print(f"Fecha y hora actual: {ahora}")
print(f"Año: {ahora.year}, Mes: {ahora.month}, Día: {ahora.day}")

import time
print("Esperando 2 segundos...")
time.sleep(2)
print("¡Listo!")

# Crear tu propio módulo
# Guarda este código en un archivo llamado "mi_modulo.py":
# def saludar(nombre):
#     return f"Hola, {nombre}!"
# 
# def sumar(a, b):
#     return a + b
# 
# PI = 3.14159

# Luego puedes importarlo:
# import mi_modulo
# print(mi_modulo.saludar("Ana"))
# print(mi_modulo.sumar(5, 3))
# print(mi_modulo.PI)
```

---

## 13. Proyecto Integrador: Sistema de Gestión de Estudiantes

```python
import json
from datetime import datetime

class Estudiante:
    def __init__(self, nombre, edad, materias=None):
        self.nombre = nombre
        self.edad = edad
        self.materias = materias if materias else {}
        self.fecha_registro = datetime.now().strftime("%Y-%m-%d %H:%M:%S")
    
    def agregar_calificacion(self, materia, calificacion):
        if 0 <= calificacion <= 10:
            if materia in self.materias:
                self.materias[materia].append(calificacion)
            else:
                self.materias[materia] = [calificacion]
            print(f"Calificación agregada: {materia} - {calificacion}")
        else:
            print("La calificación debe estar entre 0 y 10")
    
    def calcular_promedio_materia(self, materia):
        if materia in self.materias and self.materias[materia]:
            return sum(self.materias[materia]) / len(self.materias[materia])
        return 0
    
    def calcular_promedio_general(self):
        if not self.materias:
            return 0
        
        promedios = []
        for materia in self.materias:
            promedios.append(self.calcular_promedio_materia(materia))
        
        return sum(promedios) / len(promedios) if promedios else 0
    
    def mostrar_informacion(self):
        print("\n" + "=" * 50)
        print(f"INFORMACIÓN DEL ESTUDIANTE")
        print("=" * 50)
        print(f"Nombre: {self.nombre}")
        print(f"Edad: {self.edad} años")
        print(f"Fecha de registro: {self.fecha_registro}")
        print(f"\nCalificaciones por materia:")
        
        if self.materias:
            for materia, calificaciones in self.materias.items():
                promedio = self.calcular_promedio_materia(materia)
                print(f"  {materia}:")
                print(f"    Calificaciones: {calificaciones}")
                print(f"    Promedio: {promedio:.2f}")
        else:
            print("  No hay calificaciones registradas")
        
        promedio_general = self.calcular_promedio_general()
        print(f"\nPromedio General: {promedio_general:.2f}")
        
        if promedio_general >= 6:
            estado = "APROBADO"
        else:
            estado = "REPROBADO"
        print(f"Estado: {estado}")
        print("=" * 50)
    
    def to_dict(self):
        return {
            "nombre": self.nombre,
            "edad": self.edad,
            "materias": self.materias,
            "fecha_registro": self.fecha_registro
        }
    
    @staticmethod
    def from_dict(data):
        return Estudiante(
            data["nombre"],
            data["edad"],
            data["materias"]
        )


class SistemaEstudiantes:
    def __init__(self):
        self.estudiantes = []
        self.archivo = "estudiantes.json"
        self.cargar_datos()
    
    def agregar_estudiante(self, estudiante):
        self.estudiantes.append(estudiante)
        print(f"\nEstudiante {estudiante.nombre} agregado exitosamente")
        self.guardar_datos()
    
    def buscar_estudiante(self, nombre):
        for estudiante in self.estudiantes:
            if estudiante.nombre.lower() == nombre.lower():
                return estudiante
        return None
    
    def eliminar_estudiante(self, nombre):
        estudiante = self.buscar_estudiante(nombre)
        if estudiante:
            self.estudiantes.remove(estudiante)
            print(f"\nEstudiante {nombre} eliminado")
            self.guardar_datos()
        else:
            print(f"\nEstudiante {nombre} no encontrado")
    
    def listar_estudiantes(self):
        if not self.estudiantes:
            print("\nNo hay estudiantes registrados")
            return
        
        print("\n" + "=" * 50)
        print("LISTA DE ESTUDIANTES")
        print("=" * 50)
        for i, estudiante in enumerate(self.estudiantes, 1):
            promedio = estudiante.calcular_promedio_general()
            print(f"{i}. {estudiante.nombre} - Edad: {estudiante.edad} - Promedio: {promedio:.2f}")
        print("=" * 50)
    
    def guardar_datos(self):
        try:
            datos = [est.to_dict() for est in self.estudiantes]
            with open(self.archivo, "w") as f:
                json.dump(datos, f, indent=4)
        except Exception as e:
            print(f"Error al guardar datos: {e}")
    
    def cargar_datos(self):
        try:
            with open(self.archivo, "r") as f:
                datos = json.load(f)
                self.estudiantes = [Estudiante.from_dict(d) for d in datos]
        except FileNotFoundError:
            self.estudiantes = []
        except Exception as e:
            print(f"Error al cargar datos: {e}")
            self.estudiantes = []


def mostrar_menu():
    print("\n" + "=" * 50)
    print("SISTEMA DE GESTIÓN DE ESTUDIANTES")
    print("=" * 50)
    print("1. Agregar estudiante")
    print("2. Buscar estudiante")
    print("3. Agregar calificación")
    print("4. Mostrar información de estudiante")
    print("5. Listar todos los estudiantes")
    print("6. Eliminar estudiante")
    print("7. Salir")
    print("=" * 50)


def main():
    sistema = SistemaEstudiantes()
    
    while True:
        mostrar_menu()
        opcion = input("\nSelecciona una opción: ")
        
        if opcion == "1":
            nombre = input("Nombre del estudiante: ")
            try:
                edad = int(input("Edad: "))
                estudiante = Estudiante(nombre, edad)
                sistema.agregar_estudiante(estudiante)
            except ValueError:
                print("Error: Edad inválida")
        
        elif opcion == "2":
            nombre = input("Nombre del estudiante a buscar: ")
            estudiante = sistema.buscar_estudiante(nombre)
            if estudiante:
                print(f"\n¡
```