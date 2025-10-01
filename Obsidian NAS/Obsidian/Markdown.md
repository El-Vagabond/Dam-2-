# 📒 Chuleta de Obsidian & Markdown  


--- 

## ✍️ Sintaxis básica de Markdown  

### Encabezados  

```md

# H1  

## H2  

### H3  

#### H4  

```


### Énfasis  

```md

*itálica*   → *itálica*  

**negrita** → **negrita**  

==resaltado== → ==resaltado==  

```


### Listas  

```md

- Elemento 1  

- Elemento 2  

  - Sub-elemento  

  

1. Elemento  

2. Otro elemento  

```

  

### Listas de tareas  

```md

- [ ] Tarea pendiente  

- [x] Tarea completada  

```

  

### Citas  

```md

> Esto es una cita  

>> Cita anidada  

```

  

### Código  

```md

`código inline`  

  

```python

print("Bloque de código")

```  

```

  

### Tablas  

```md

| Columna 1 | Columna 2 |

|-----------|-----------|

| Dato A    | Dato B    |

| Dato C    | Dato D    |

```

  

### Separadores  

```md

---

```

  

---

  

## 🔗 Funcionalidades de Obsidian  

  

### Enlaces internos  

```md

[[Nombre de la nota]]  

[[Nombre de la nota#Encabezado]]  

```

  

### Enlaces a encabezados  

```md

[[Esta Nota#📒 Chuleta de Obsidian & Markdown]]  

```

  

### Imágenes locales  

```md

![[imagen.png]]  

```

  

### Resaltados  

```md

==Texto resaltado==  

```

  

### Callouts  

```md

> [!note]  

> Esto es una nota.  

  

> [!tip]  

> Consejo útil aquí.  

  

> [!warning]  

> ¡Cuidado con esto!  

  

> [!example]  

> Ejemplo práctico.  

```

  

---

  

## 🏷️ Etiquetas y Front Matter  

  

### Etiquetas  

```md

#proyecto  

#idea/borrador  

#lectura/libro  

```

  

### Front Matter (YAML)  

```yaml

---

title: "Mi Nota Ejemplo"

date: 2025-10-01

tags: [proyecto, lectura/libro]

aliases: ["Nota Alternativa", "Atajo"]

---

```

  

---