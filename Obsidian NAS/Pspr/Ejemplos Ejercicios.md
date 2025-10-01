1- Cuando una clase **extiende `Thread`**, se convierte directamente en un hilo. Esto significa que ya no necesitamos envolverla en otro objeto `Thread` — ¡ella misma _es_ el hilo!

En nuestro ejemplo, la clase `hilos1` define su comportamiento dentro del método `run()`. Al crear una instancia (`pumba = new hilos1();`) y llamar a `.start()`, estamos iniciando un **nuevo hilo de ejecución** paralelo al hilo principal (el que ejecuta `main`).
![[Pasted image 20250930202612.png]]
En el método `main`, además de iniciar el hilo secundario (`pumba.start()`), también ejecutamos un bucle **en el hilo principal** (el que imprime “Ejecucion fuera de tarea…”). Esto nos permite ver cómo **dos flujos de ejecución corren simultáneamente**:

- Uno en el hilo secundario (`pumba`)
- Otro en el hilo principal (el `for` dentro de `main`)

![[Pasted image 20250930202713.png]]

La salida muestra mensajes entremezclados porque **los hilos compiten por tiempo de CPU**. El sistema operativo decide cuándo darle turno a cada hilo, y eso depende de muchos factores: prioridad, carga del sistema, planificador, etc.

![[Pasted image 20250930202757.png]]




2-Cuando implementamos la interfaz `Runnable`, estamos diciendo: _“Este objeto tiene una tarea que puede ejecutarse en paralelo”_, pero **no es un hilo en sí mismo**. Es decir, `Runnable` define _qué hacer_, pero no _cómo ejecutarlo_.

Por eso, al crear una instancia de nuestra clase `hilos2` (que implementa `Runnable`), **necesitamos envolverla dentro de un objeto `Thread`** para poder iniciar su ejecución con `.start()`. El objeto `Thread` es quien realmente gestiona el hilo del sistema operativo.
![[Pasted image 20250930202852.png]]

En el segundo fragmento de código, vemos cómo:

1. Creamos una instancia de `hilos2` → esto es nuestro “trabajo a realizar”.
2. La pasamos como argumento al constructor de `Thread` → le decimos: _“Ejecuta este trabajo en un hilo nuevo”_.
3. Llamamos a `.start()` → ¡aquí sí se crea el hilo y comienza la ejecución concurrente!

Además, en el mismo método `main`, también ejecutamos un bucle fuera de cualquier hilo (en el hilo principal), lo que nos permite ver cómo se entremezclan las ejecuciones:

- Las líneas con “Timon” vienen del hilo secundario.
- Las líneas con “ttimon” vienen del hilo principal.

![[Pasted image 20250930203026.png]]

La salida muestra que **los hilos se ejecutan de forma concurrente**, pero **no necesariamente en orden**. El planificador del sistema decide cuándo dar tiempo a cada hilo, por lo que verás mensajes entrelazados. Esto es normal y esperado en programación multihilo.
![[Pasted image 20250930203113.png]]


3- Creacion  de proceso para hacer ping y mostrarlo por la pantalla 

![[Pasted image 20250930205400.png]]
Este código en Java permite ejecutar un comando del sistema operativo (`ping`) desde dentro de una aplicación Java, mostrar su salida en tiempo real en la consola y verificar si se completó correctamente.

Primero, se crea un objeto `ProcessBuilder` que configura el comando a ejecutar. En este caso, se usa `"ping"` con los argumentos `"-n"`, `"2"` y `"ww.google.es"`. El parámetro `"-n"` es específico de Windows e indica el número de paquetes ICMP a enviar (en Linux o macOS se usaría `"-c"` en su lugar). Aunque la URL contiene un pequeño error (`ww.google.es` en lugar de `www.google.es`), el sistema DNS generalmente lo resuelve sin problemas.

Luego, se inicia el proceso con el método `.start()`, que lanza el comando en segundo plano y devuelve un objeto `Process`. Este objeto representa el proceso externo en ejecución y nos permite interactuar con él.

Para ver la salida del `ping` (es decir, los mensajes que normalmente aparecen en la terminal), se obtiene el flujo de salida estándar del proceso mediante `.getInputStream()`. Este flujo de bytes se convierte en texto legible usando un `InputStreamReader`, y luego se envuelve en un `BufferedReader` para poder leerlo cómodamente línea por línea. A continuación, un bucle `while` lee cada línea mientras el proceso esté generando salida, y la imprime inmediatamente en la consola. Esto permite ver el progreso del `ping` en tiempo real, tal como si se hubiera ejecutado directamente en la terminal.

Una vez que se ha mostrado toda la salida, se espera a que el proceso termine completamente usando `.waitFor()`. Este método bloquea la ejecución del hilo principal hasta que el proceso externo finaliza, y devuelve un **código de salida**: `0` indica que el proceso se completó con éxito, mientras que cualquier otro valor señala un error (por ejemplo, host inaccesible o fallo de red). El código verifica este valor y muestra un mensaje apropiado al usuario.

Todo este flujo está protegido por un bloque `try-catch` que maneja dos tipos de excepciones:

- `IOException`: ocurre si hay un problema al crear o leer el proceso (por ejemplo, si el comando no existe).
- `InterruptedException`: se lanza si el hilo actual es interrumpido mientras espera a que termine el proceso.


4-