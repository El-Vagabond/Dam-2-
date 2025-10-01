
# PSPR - Tema 1: Resumen para Examen

## 1. PROCESOS - Conceptos Fundamentales

### Definiciones Clave
- **Programa**: Conjunto de instrucciones, código compilado. Unidad **pasiva/estática**
- **Ejecutable**: Fichero con código binario o interpretado
  - Windows: `.exe`, `.bat`, `.msi`, `.com`
  - Linux: `.sh`, `.deb`, `.rpm`, `.bin`
  - iOS: `.ipa` | Android: `.apk`
- **Proceso**: Ejecución de un programa. Entidad **activa**
  - Múltiples procesos pueden relacionarse con el mismo programa

### Componentes de un Proceso
1. Código ejecutable
2. Datos (variables y almacenamiento)
3. Pila y puntero de pila
4. Valores de registros del procesador
5. Contador de programa (PC)
6. Memoria asignada
7. **PID** (identificación única)
8. Info de gestión del SO

### PCB (Process Control Block)
Guarda el estado del proceso cuando se suspende:
- PID, Estado, PC, Registros CPU
- Propietario, Prioridad, Permisos
- Espacio de memoria
- Estadísticas (tiempo CPU, etc.)

### Estados de un Proceso
1. **Activo/En ejecución**: Usando recursos del procesador
2. **Bloqueado**: Necesita recurso ocupado, espera evento externo
3. **Preparado/Listo**: Parado temporalmente, listo para ejecutarse

### Conceptos de Planificación
- **Tiempo de espera**: Tiempo en cola de ejecución
- **Tiempo de retorno**: Desde lanzamiento hasta finalización
- **Tiempo de respuesta**: Proceso bloqueado hasta entrar en ejecución
- **Productividad**: Procesos finalizados por unidad de tiempo

### Algoritmos de Planificación ⚠️
- **FIFO** (First In First Out): El que llegó primero
- **LIFO** (Last In First Out): El que llegó último
- **SJF** (Short Job First): Proceso más corto (puede haber inanición)
- **SRTF** (Short Remaining Time First): Menos tiempo restante
- **RR** (Round Robin): Quantum de tiempo, turnos rotativos
- **Por prioridad**: Según prioridades asignadas
- **Múltiples colas**: Colas por prioridad, cada una con RR

### Servicios
- Tipo especial de procesos
- Se cargan al arrancar el SO
- Ejecutan en **segundo plano**
- No se pueden cerrar, solo detener/reiniciar
- Los inicia el **SO**, no el usuario

---

````markdown
## 2. JAVA - ProcessBuilder y Process

### ProcessBuilder
```java
new ProcessBuilder("comando", "arg1", "arg2", ...)
````

**Métodos importantes**:

- `List<String> command()`: Devuelve argumentos
- `Map<String, String> environment()`: Variables de entorno
- `redirectError(File file)`: Redirige salida de error
- `redirectInput(File file)`: Redirige entrada
- `redirectOutput(File file)`: Redirige salida
- `directory(File dir)`: Establece directorio de trabajo
- `start()`: Crea instancia de Process

### Process

**Métodos importantes**:

- `InputStream getInputStream()`: Lee salida del subproceso
- `int waitFor()`: Espera finalización (devuelve 0 si OK)
- `InputStream getErrorStream()`: Lee salida de error
- `OutputStream getOutputStream()`: Envía datos al subproceso
- `void destroy()`: Elimina el subproceso
- `int exitValue()`: Valor de salida
- `boolean isAlive()`: Comprueba si está vivo

### Redirect

- `Redirect.INHERIT`: Usa los del padre
- `Redirect.to(File)`: Redirige salida a fichero
- `Redirect.from(File)`: Redirige entrada desde fichero

---

## 3. PROGRAMACIÓN CONCURRENTE

### Definición

- Varios procesos en ejecución **simultánea**
- En monoprocesador: intercalando instrucciones
- En multiprocesador: ejecución real simultánea = **Programación Paralela**
- **Toda programación paralela es concurrente, pero NO al revés**

### Diferencia Concurrente vs Paralela

- **Concurrente**: Procesar varias tareas al mismo tiempo (genérico)
- **Paralela**: Múltiples procesos simultáneos resuelven partes de una tarea, luego se unen resultados

### Necesidades

- Procesos que **colaboren** o **compitan** por recursos
- **Mecanismos de comunicación**
- **Mecanismos de sincronización**

### Beneficios

- Mejor aprovechamiento CPU (I/O vs procesamiento)
- Mejora velocidad de ejecución
- Soluciones a problemas concurrentes (control en tiempo real, servidores web, GUIs)

### Arquitecturas

- **Fuertemente acoplados**: Procesadores comparten memoria
- **Débilmente acoplados**: Procesadores con memoria independiente

---

## 4. CONDICIONES DE BERNSTEIN ⚠️

Para que dos procesos se ejecuten en paralelo:

**Conjuntos**:

- L(I): Conjunto de lectura de instrucción I
- E(I): Conjunto de escritura de instrucción I

**Condiciones** (todas deben ser ∅):

1. L(I1) ∩ E(I2) = ∅
2. E(I1) ∩ L(I2) = ∅
3. E(I1) ∩ E(I2) = ∅

Si no se cumplen → **NO pueden ejecutarse concurrentemente**

---

## 5. PROBLEMAS DE CONCURRENCIA

### Exclusión Mutua

- Dos procesos acceden a misma variable compartida
- Crear **región crítica**: solo un proceso puede ejecutarla
- Resto debe esperar

### Condición de Sincronización

- Proceso A espera que proceso B termine o llegue a cierto punto
- Usar **mecanismos de sincronización**

---

## 6. HILOS (THREADS) EN JAVA

### Definición

- Subprocesos independientes
- **Procesos ligeros**
- Comparten memoria y recursos del proceso
- **No pueden existir independientemente de un proceso**

### Diferencias Proceso vs Hilo

- **Hilos**: Comparten espacio de memoria
- **Procesos**: Memoria independiente
- Cambios de estado más costosos en procesos
- Crear/terminar hilos es más rápido
- Comunicación entre procesos requiere núcleo del SO

### Implementación en Java (2 formas) ⚠️

**Opción 1**: Heredar de Thread

```java
class MiHilo extends Thread {
    public void run() {
        // código del hilo
    }
}

```

**Opción 2**: Implementar Runnable

```java
class MiHilo implements Runnable {
    public void run() {
        // código del hilo
    }
}
```

## 7. PROGRAMACIÓN PARALELA Y DISTRIBUIDA

### Programación Paralela

- Diseñada para sistemas **multiprocesador**
- Divide problema en partes pequeñas
- Intercambia información entre ellas

### Modelos de Intercambio

- **Fuertemente acoplados**: Memoria compartida
- **Débilmente acoplados**: Paso de mensajes

### Ventajas Paralela

- Ejecución simultánea real
- Disminuye tiempo total de ejecución
- Resuelve problemas complejos
- Disminución de costos

### Desventajas Paralela

- Más difíciles de crear
- Mayor consumo de energía
- Mayor complejidad en acceso a datos
- Comunicación y sincronización complejas

---

## 8. SISTEMAS DISTRIBUIDOS

### Definición

- Componentes en diferentes computadores
- Unidos por red
- Comunicación por **paso de mensajes**
- **Clústeres**: Conjunto de ordenadores funcionando como uno solo

### Problemas Comunes

- **Concurrencia**: Coordinación compleja
- **Inexistencia de reloj global**: Relojes no sincronizados
- **Fallos independientes**: Un fallo no debe detener todo

### Ventajas Distribuida

- Compartir recursos y datos
- Crecimiento incremental
- Distribución de carga de trabajo
- Mayor disponibilidad y flexibilidad

### Desventajas Distribuida

- Mayor complejidad
- Problemas de red (pérdida mensajes, saturación)
- Problemas de seguridad

---
